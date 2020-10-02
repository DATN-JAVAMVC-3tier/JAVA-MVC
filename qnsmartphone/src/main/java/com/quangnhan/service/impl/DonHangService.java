package com.quangnhan.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.dao.impl.ChiTietDonHangDAO;
import com.quangnhan.dao.impl.DonHangDAO;
import com.quangnhan.dao.impl.TrangThaiDonHangDAO;
import com.quangnhan.model.ChiTietDonHangModel;
import com.quangnhan.model.DetailOrderModel;
import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.ResultMesageModel;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.model.TrangThaiDonHangModel;
import com.quangnhan.service.IDonHangService;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;

public class DonHangService implements IDonHangService {
	@Inject
	NguoiDungService nguoiDungService;
	@Inject
	SanPhamService sanPhamService;
	@Inject
	ChiTietDonHangService chiTietDonHangService;
	@Inject
	DonHangDAO donHangDao;
	@Override
	public ResultMesageModel createOrder(DetailOrderModel detailOrder, List<SanPhamModel> listSanPhamOrder,int ma_KhachHang) {
		double amount = 0;
		int isSaveDonHang = -1;
		boolean conHang = true;
		ResultMesageModel rsMesage = new ResultMesageModel();
		rsMesage.setMESAGE(" ");
		StringBuilder mesage = new StringBuilder();
		// [0] kiểm tra số lượng hàng còn đủ bán không
		for (SanPhamModel sanPhamModel : listSanPhamOrder) {
			if (sanPhamService.findById(sanPhamModel.getMa_SanPham()).getSoLuongCon() < sanPhamModel
					.getQuantityProduct()) {
				conHang = false;
				rsMesage.setMESAGE(rsMesage.getMESAGE() + "Sản phẩm [" + sanPhamModel.getTen_SanPham() + "] còn ["
						+ sanPhamModel.getSoLuongCon()
						+ "] sản phẩm trong kho vui lòng đặt lại đúng số lượng ở giỏ hàng <br> ");
			}
			amount = amount + sanPhamModel.getGia_Ban() * sanPhamModel.getQuantityProduct();
		}

		if (conHang) {
			// [0] nếu còn đủ số lượng sản phẩm
			DonHangModel donHang = new DonHangModel();
			donHang.setPhuongThucMua("online");
			donHang.setMa_TrangThai(3);
			donHang.setPhuongThucThanhToan(detailOrder.getPhuongThucThanhToan());
			donHang.setGhiChu(detailOrder.getGhiChu());
			donHang.setTenNguoiNhan(detailOrder.getHoVaTen());
			donHang.setDiaChi(detailOrder.getDiaChi());
			donHang.setEmail(detailOrder.getEmail());
			donHang.setSoDienThoai(detailOrder.getSoDienThoai());
			donHang.setTongTien(amount);
			// format time 
			LocalDateTime getTime = LocalDateTime.now();
			DateTimeFormatter ObjFormat = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
			String afterFormatTime = getTime.format(ObjFormat);
			donHang.setTinhTrang_DonHang("["+ afterFormatTime +"] đã tiếp nhận đơn hàng|");
			// [1] kiểm tra khách hàng có tạo tài khoản không
			if (detailOrder.getTenDangNhap() != null && detailOrder.getMatKhau() != null) {
				// [2] có thì set vào đối tượng
				NguoiDungModel nguoiDungModel = new NguoiDungModel();
				nguoiDungModel.setTenDangNhap(detailOrder.getTenDangNhap());
				nguoiDungModel.setMatKhau(detailOrder.getMatKhau());
				nguoiDungModel.setHoVaTen(detailOrder.getHoVaTen());
				nguoiDungModel.setEmail(detailOrder.getEmail());
				nguoiDungModel.setSoDienThoai(detailOrder.getSoDienThoai());
				nguoiDungModel.setDiaChi(detailOrder.getDiaChi());
				int ma_NguoiDung = nguoiDungService.saveReturnInt(nguoiDungModel);
				NguoiDungModel saveNguoiDung = nguoiDungService.findById(ma_NguoiDung);
				// [3]check tạo tài khoản có thành công không
				if (saveNguoiDung != null) {
					// [4] nếu có thì set ID khách hàng vào đơn hàng
					rsMesage.setMESAGE(rsMesage.getMESAGE() + "Tạo tài khoản " + nguoiDungModel.getTenDangNhap()
							+ " thành công<br>");
					donHang.setMa_KhachHang(saveNguoiDung.getMa_NguoiDung());
				} else {
					// [4] không thì thông báo mesage
					rsMesage.setMESAGE(rsMesage.getMESAGE() + "Tạo tài khoản " + nguoiDungModel.getTenDangNhap()
							+ " thất bại để tra cứu thông tin đơn hàng vui lòng nhập mã đơn hàng ở phần tìm kiếm! <br>");
				}
				// [5] lưu đơn hàng
				isSaveDonHang = new DonHangDAO().saveDonHang(donHang);
			} else {
				// [2] không tạo tài khoản thì chỉ save save đơn hàng
				if (ma_KhachHang != -1) {
					donHang.setMa_KhachHang(ma_KhachHang);
				}
				isSaveDonHang = new DonHangDAO().saveDonHang(donHang);
				rsMesage.setMESAGE(rsMesage.getMESAGE()
						+ "Để tra cứu thông tin đơn hàng vui lòng nhập mã đơn hàng ở phần tìm kiếm! <br>");
			}
			// [6] nếu lưu đơn hàng thành công tiến hành tạo chi tiết đơn và trừ sản phẩm
			if (isSaveDonHang != -1) {
				for (SanPhamModel sanPhamModel : listSanPhamOrder) {
					ChiTietDonHangModel cTDH = new ChiTietDonHangModel();
					cTDH.setMa_DonHang(isSaveDonHang);
					cTDH.setMa_SanPham(sanPhamModel.getMa_SanPham());
					cTDH.setSoLuong(sanPhamModel.getQuantityProduct());
					cTDH.setGiaTien(sanPhamModel.getGia_Ban());
					// [7] trừ số lượng sản phẩm
					chiTietDonHangService.updateSoLuongCon(cTDH);
					// [7] save chi tiết đơn hàng
					chiTietDonHangService.save(cTDH);
				}
				rsMesage.setMESAGE(rsMesage.getMESAGE() + "Đặc hàng thành công!<br>");
				rsMesage.setMa_DonHang(isSaveDonHang);
			} else {
				// [6] đơn hàng thất bại xuất mesage
				rsMesage.setMESAGE(rsMesage.getMESAGE() + "Đặc hàng không thành công!<br>");
				rsMesage.setMa_DonHang(-1);
			}
			return rsMesage;
		} else {
			// [0] hết hàng
			rsMesage.setACTION("hethang");
			return rsMesage;
		}
	}

	@Override
	public int saveDonHang(DonHangModel donHang) {

		return 0;
	}

	@Override
	public DonHangModel findByMaHang(int maDonHang) {
		DonHangModel donHangModel = new DonHangDAO().findByMaHang(maDonHang);
		if (donHangModel.getMa_Shipper() != 0) {
			donHangModel.setTenShipper(nguoiDungService.findById(donHangModel.getMa_Shipper()).getHoVaTen());
		}else {
			donHangModel.setTenShipper("unknow");
		}
		return donHangModel;
	}

	@Override
	public List<DonHangModel> findDetailDonHangByIdOrPhone(String keyWord) {
		List<DonHangModel> listDH = new ArrayList<DonHangModel>();
		List<DonHangModel> listDHReturn = new ArrayList<DonHangModel>();
		keyWord = keyWord.trim();
		String flag = "unknow";
		for (int i = 0; i < keyWord.length(); i++) {
			if (keyWord.charAt(i) == '@') {
				flag = "email";
			}
		}
		if (flag.equals("unknow")) {
			if (keyWord.charAt(0) == '0') {
				flag = "phone";
			} else {
				try {
					int keyToInt = Integer.parseInt(keyWord);
					flag = "madonhang";
				} catch (Exception e) {
					flag = "unknow";
				}
			}
		}
		if (flag.equals("madonhang")) {
			int keyToInt = Integer.parseInt(keyWord);
			listDH = new DonHangDAO().findByParameter(keyToInt);
		} else if (flag.equals("phone") || flag.equals("email")) {
			listDH = new DonHangDAO().findByParameter(keyWord);
		}
		
		if (!listDH.isEmpty()) {
			for (DonHangModel donHangModel : listDH) {
				donHangModel.setListChiTietDonHang(new ChiTietDonHangDAO().findByIdDonHang(donHangModel.getMa_DonHang()));
				//xử lý phone and email
				StringBuilder phone = new StringBuilder();
				phone.append(donHangModel.getSoDienThoai());
				StringBuilder email = new StringBuilder();
				email.append(donHangModel.getEmail());
				donHangModel.setSoDienThoai(replaceChar(phone));
				donHangModel.setEmail(replaceChar(email));
				// xử lý tình trạng đơn hàng
				TrangThaiDonHangModel trangThaiDonHangModel = new TrangThaiDonHangModel();
				trangThaiDonHangModel = new TrangThaiDonHangDAO().findByMaTrangThai(donHangModel.getMa_TrangThai());
				if (donHangModel.getPhuongThucThanhToan().equals("thanhtoankhinhanhang")) {
					donHangModel.setPhuongThucThanhToan("Thanh toán khi nhận hàng.");
				}
				donHangModel.setTrangThaiDonHangModel(trangThaiDonHangModel);
				listDHReturn.add(donHangModel);
			}
			return listDHReturn;
		} else {
			return null;
		}
	}
	public static String replaceChar(StringBuilder strRpl) {
		StringBuilder charRPL =new StringBuilder();
		int charEmail = 0;
		String flag = "phone";
		for (int i = 0; i < strRpl.length(); i++) {
			if (strRpl.charAt(i) == '@') {
				flag = "email";
				charEmail = i;
				break;
			}
		}
		if (flag.equals("phone")) {
			for (int i = 0; i < strRpl.length()/2; i++) {
				charRPL.append("*");
			}
			return strRpl.replace(0, strRpl.length()/2,charRPL.toString()).toString();
		}else {
			for (int i = 0; i < charEmail/2; i++) {
				charRPL.append("*");
			}
			return strRpl.replace(0, charEmail/2,charRPL.toString()).toString();
		}
		
	}

	@Override
	public List<DonHangModel> findDetailDonHangByMa_NguoiDung(int ma_NguoiDung) {
		List<DonHangModel> listDH = new ArrayList<DonHangModel>();
		List<DonHangModel> listDHReturn = new ArrayList<DonHangModel>();
		listDH = new DonHangDAO().findByMa_NguoiDung(ma_NguoiDung);
		if (!listDH.isEmpty()) {
			for (DonHangModel donHangModel : listDH) {
				donHangModel.setListChiTietDonHang(new ChiTietDonHangDAO().findByIdDonHang(donHangModel.getMa_DonHang()));
				//xử lý phone and email
				StringBuilder phone = new StringBuilder();
				phone.append(donHangModel.getSoDienThoai());
				StringBuilder email = new StringBuilder();
				email.append(donHangModel.getEmail());
				donHangModel.setSoDienThoai(replaceChar(phone));
				donHangModel.setEmail(replaceChar(email));
				// xử lý tình trạng đơn hàng
				TrangThaiDonHangModel trangThaiDonHangModel = new TrangThaiDonHangModel();
				trangThaiDonHangModel = new TrangThaiDonHangDAO().findByMaTrangThai(donHangModel.getMa_TrangThai());
				if (donHangModel.getPhuongThucThanhToan().equals("thanhtoankhinhanhang")) {
					donHangModel.setPhuongThucThanhToan("Thanh toán khi nhận hàng.");
				}
				donHangModel.setTrangThaiDonHangModel(trangThaiDonHangModel);
				listDHReturn.add(donHangModel);
			}
			return listDHReturn;
		} else {
			return null;
		}
	}

	@Override
	public List<DonHangModel> findByTrangThai(int trangThai1, int trangThai2, int trangThai3, int trangThai4) {
		List<DonHangModel> listDH = new ArrayList<DonHangModel>();
		List<DonHangModel> listDHAfter = new ArrayList<DonHangModel>();
		listDH = donHangDao.findDonHangByTrangThai(trangThai1, trangThai2, trangThai3, trangThai4);
		for (DonHangModel donHangModel : listDH) {
			if (donHangModel.getMa_Shipper() != 0) {
				donHangModel.setTenShipper(nguoiDungService.findById(donHangModel.getMa_Shipper()).getHoVaTen());
			}else {
				donHangModel.setTenShipper("unknow");
			}
			// trạng thái đơn hàng
			TrangThaiDonHangModel trangThaiDonHangModel = new TrangThaiDonHangModel();
			trangThaiDonHangModel = new TrangThaiDonHangDAO().findByMaTrangThai(donHangModel.getMa_TrangThai());
			donHangModel.setTrangThaiDonHangModel(trangThaiDonHangModel);
			listDHAfter.add(donHangModel);
		}
		return listDHAfter;
	}

	@Override
	public void updateMa_Shipper(int ma_Shipper, int ma_DonHang) {
		donHangDao.updateMa_Shipper(ma_Shipper, ma_DonHang);
		
	}

	@Override
	public void updateMa_TrangThai(int ma_TrangThai, int ma_DonHang) {
		List<ChiTietDonHangModel> listCTDH = new ArrayList<ChiTietDonHangModel>();
		if (ma_TrangThai == 8 || ma_TrangThai == 9 || ma_TrangThai == 10) {
			listCTDH = chiTietDonHangService.findByIdDonHang(ma_DonHang);
			for (ChiTietDonHangModel ctdh : listCTDH) {
				sanPhamService.updateSoluong(ctdh.getMa_SanPham(), ctdh.getSoLuong());
			}
			
		}
		
		donHangDao.updateMa_TrangThai(ma_TrangThai, ma_DonHang);
		
	}

	@Override
	public void updateMa_Shipper(HttpServletRequest request) {
		try {
			int ma_DonHang = Integer.parseInt(request.getParameter("ma_donhang"));
			NguoiDungModel nguoiDung = (NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL");
			if (nguoiDung.getMa_NguoiDung() != 0 && nguoiDung.getMa_VaiTro().equals("shipper")) {
				DonHangModel dhModel = donHangDao.findByMaHang(ma_DonHang);
				int temp = 0;
				temp = dhModel.getMa_Shipper();
				 if (temp ==0) {
					donHangDao.updateMa_Shipper(nguoiDung.getMa_NguoiDung(), ma_DonHang);
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true", "Chúc mừng bạn đã nhận giao đơn hàng["+ma_DonHang+"] thành công");
				}else {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Đơn hàng đã có shipper giao. Vui lòng reload và nhận đơn hàng khác.");
				}
			}else {
				MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Mã người dùng hoặc vai trò account không hợp lệ");
			}
		} catch (Exception e) {
			MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Mã Khách hàng không hợp lệ");
		}
		
	}

	@Override
	public List<DonHangModel> findByMa_ShipperAndTrangThai(int ma_Shipper, int trangThai1, int trangThai2,
			int trangThai3, int trangThai4) {
		
		return donHangDao.findByMa_ShipperAndTrangThai(ma_Shipper, trangThai1, trangThai2, trangThai3, trangThai4);
	}

	@Override
	public DonHangModel findByMa_DonHangAndMa_Shipper(int ma_DonHang, int ma_Shipper) {
		DonHangModel donHangModel =donHangDao.findByMa_DonHangAndMa_Shipper(ma_DonHang, ma_Shipper);
		if (donHangModel.getMa_Shipper() != 0) {
			donHangModel.setTenShipper(nguoiDungService.findById(donHangModel.getMa_Shipper()).getHoVaTen());
		}else {
			donHangModel.setTenShipper("unknow");
		}
		donHangModel.setTinhTrang_DonHang(donHangModel.getTinhTrang_DonHang().trim());
		return donHangModel;
	}

	@Override
	public void updateTinhTrangAndTrangThai(int ma_DonHang, String tinhtrangselect, String tinhtranginput) {
	donHangDao.updateTinhTrangAndTrangThai(ma_DonHang, tinhtrangselect, tinhtranginput);
	}

}
