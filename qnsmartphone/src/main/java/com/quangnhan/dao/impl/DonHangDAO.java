package com.quangnhan.dao.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.quangnhan.dao.IDonHangDAO;
import com.quangnhan.mapper.DonHangMapper;
import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.TrangThaiDonHangModel;

public class DonHangDAO extends AbstractDAO<DonHangModel> implements IDonHangDAO {

	@Override
	public int saveDonHang(DonHangModel donHang) {
		StringBuilder sql = new StringBuilder();
		if (donHang.getMa_KhachHang() != 0 && donHang.getMa_KhachHang() != -1) {
			sql.append(
					"insert into tbl_donhang(ma_khachhang,phuongthucthanhtoan,phuongthucmua,tongtien,ghichu,tennguoinhan,diachi,email,sodienthoai,tinhtrang_donhang,ma_trangthai)");
			sql.append(" values(?,?,?,?,?,?,?,?,?,?,?);");
			return insert(sql.toString(), donHang.getMa_KhachHang(), donHang.getPhuongThucThanhToan(),
					donHang.getPhuongThucMua(), donHang.getTongTien(), donHang.getGhiChu(), donHang.getTenNguoiNhan(),
					donHang.getDiaChi(), donHang.getEmail(), donHang.getSoDienThoai(), donHang.getTinhTrang_DonHang(),
					donHang.getMa_TrangThai());
		} else {
			sql.append(
					"insert into tbl_donhang(phuongthucthanhtoan,phuongthucmua,tongtien,ghichu,tennguoinhan,diachi,email,sodienthoai,tinhtrang_donhang,ma_trangthai)");
			sql.append(" values(?,?,?,?,?,?,?,?,?,?);");
			return insert(sql.toString(), donHang.getPhuongThucThanhToan(), donHang.getPhuongThucMua(),
					donHang.getTongTien(), donHang.getGhiChu(), donHang.getTenNguoiNhan(), donHang.getDiaChi(),
					donHang.getEmail(), donHang.getSoDienThoai(), donHang.getTinhTrang_DonHang(),
					donHang.getMa_TrangThai());
		}

	}

	@Override
	public DonHangModel findByMaHang(int ma_DonHang) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_donhang where ma_donhang = ? ;");
		List<DonHangModel> donHang = new ArrayList<>();
		donHang = query(sql.toString(), new DonHangMapper(), ma_DonHang);
		return donHang.isEmpty() ? null : donHang.get(0);
	}

	@Override
	public List<DonHangModel> findBySoDienThoai(int soDienThoai) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_donhang where sodienthoai = ? ;");
		List<DonHangModel> donHang = new ArrayList<>();
		return query(sql.toString(), new DonHangMapper(), soDienThoai);
	}

	@Override
	public List<DonHangModel> findByParameter(Object... parameters) {
		Object parameter = parameters[0];
		StringBuilder sql = new StringBuilder();
		List<DonHangModel> donHang = new ArrayList<>();
		if (parameter instanceof String) {
			sql.append("select * from tbl_donhang where sodienthoai = ? or email = ?  order by thoigianlap desc;");
			donHang = query(sql.toString(), new DonHangMapper(), parameter, parameter);
		} else if (parameter instanceof Integer) {
			sql.append("select * from tbl_donhang where ma_donhang = ?  order by thoigianlap desc;");
			donHang = query(sql.toString(), new DonHangMapper(), parameter, parameter);
		}
		return donHang;
	}

	@Override
	public List<DonHangModel> findByMa_NguoiDung(int ma_NguoiDung) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_donhang where ma_khachhang = ? ;");
		return query(sql.toString(), new DonHangMapper(), ma_NguoiDung);
	}

	@Override
	public List<DonHangModel> findDonHangByTrangThai(int trangThai1, int trangThai2, int trangThai3, int trangThai4) {
		StringBuilder sql = new StringBuilder();
		sql.append(
				"select * from tbl_donhang where ma_trangthai = ? or ma_trangthai = ? or ma_trangthai = ? or ma_trangthai = ? ;");
		return query(sql.toString(), new DonHangMapper(), trangThai1, trangThai2, trangThai3, trangThai4);
	}

	@Override
	public void updateMa_Shipper(int ma_Shipper, int ma_DonHang) {
		StringBuilder sql = new StringBuilder();
		sql.append("update tbl_donhang set ma_shiper = ? where ma_donhang = ? ;");
		update(sql.toString(), ma_Shipper, ma_DonHang);
	}

	@Override
	public void updateMa_TrangThai(int ma_TrangThai, int ma_DonHang) {

		StringBuilder sql = new StringBuilder();
		sql.append("update tbl_donhang set ma_trangthai = ? where ma_donhang = ? ;");
		update(sql.toString(), ma_TrangThai, ma_DonHang);
	}

	@Override
	public List<DonHangModel> findByMa_ShipperAndTrangThai(int ma_Shipper, int trangThai1, int trangThai2,
			int trangThai3, int trangThai4) {
		StringBuilder sql = new StringBuilder();
		sql.append(
				"select * from tbl_donhang where ( ma_trangthai = ? or ma_trangthai = ? or ma_trangthai = ? or ma_trangthai = ? ) and ma_shiper = ?;");
		return query(sql.toString(), new DonHangMapper(), trangThai1, trangThai2, trangThai3, trangThai4, ma_Shipper);
	}

	@Override
	public DonHangModel findByMa_DonHangAndMa_Shipper(int ma_DonHang, int ma_Shipper) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_donhang where ma_donhang = ? and ma_shiper = ? ;");
		List<DonHangModel> donHang = new ArrayList<>();
		donHang = query(sql.toString(), new DonHangMapper(), ma_DonHang, ma_Shipper);
		return donHang.isEmpty() ? null : donHang.get(0);
	}

	@Override
	public void updateTinhTrangAndTrangThai(int ma_DonHang, String tinhtrangselect, String tinhtranginput) {
		StringBuilder sql = new StringBuilder();
		sql.append("update tbl_donhang set tinhtrang_donhang = concat(tinhtrang_donhang,?) where ma_donhang = ? ;");
		StringBuilder tinhtrang = new StringBuilder();
		LocalDateTime getTime = LocalDateTime.now();
		DateTimeFormatter ObjFormat = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
		String afterFormatTime = getTime.format(ObjFormat);
		// DonHangModel dhModel = new DonHangDAO().findByMaHang(ma_DonHang);
		// tinhtrang.append(dhModel.getTinhTrang_DonHang()+"<br>");
		if (tinhtranginput != "" && tinhtrangselect != "") {
			tinhtrang.append("[" + afterFormatTime + "] " + tinhtrangselect + "|" + tinhtranginput + "|");
		} else if (tinhtranginput != "") {
			tinhtrang.append("[" + afterFormatTime + "] " + tinhtranginput + "|");
		} else if (tinhtrangselect != "") {
			tinhtrang.append("[" + afterFormatTime + "] " + tinhtrangselect + "|");
		}
		if (tinhtrang.toString() != null && tinhtrang.toString() != "") {
			update(sql.toString(), tinhtrang.toString(), ma_DonHang);
		}
	}

}
