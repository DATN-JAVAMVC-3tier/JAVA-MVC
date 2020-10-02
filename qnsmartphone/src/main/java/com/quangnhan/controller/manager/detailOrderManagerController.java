package com.quangnhan.controller.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.dao.impl.TrangThaiDonHangDAO;
import com.quangnhan.model.ChiTietDonHangModel;
import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.TrangThaiDonHangModel;
import com.quangnhan.service.impl.ChiTietDonHangService;
import com.quangnhan.service.impl.DonHangService;
import com.quangnhan.service.impl.NguoiDungService;
import com.quangnhan.utils.MesageUtil;

@WebServlet(urlPatterns = {"/quanly-detailOrder" })
public class detailOrderManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	DonHangService donHangService;
	@Inject
	ChiTietDonHangService ctdhService;
	@Inject
	NguoiDungService nguoiDungService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null) {
			 if (action.equals("updatetrangthai")) {
					try {
						int ma_TrangThai = Integer.parseInt(request.getParameter("ma_trangthai"));
						int ma_DonHang = Integer.parseInt(request.getParameter("ma_donhang"));
						donHangService.updateMa_TrangThai(ma_TrangThai, ma_DonHang);
						MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true",
								"Cập Nhập Thành Công");
					} catch (Exception e) {
						MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
								"Mã Trạng Thái không hợp lệ");
					}
				}
			 request.getRequestDispatcher("quanly").forward(request, response);
		}
		try {
			int ma_DonHang = Integer.parseInt(request.getParameter("ma_donhang"));
			DonHangModel donHangModel = donHangService.findByMaHang(ma_DonHang);
			List<ChiTietDonHangModel> listCTDHModel = new ArrayList<>();
			listCTDHModel = ctdhService.findByIdDonHang(ma_DonHang);
			donHangModel.setListChiTietDonHang(listCTDHModel);
			TrangThaiDonHangModel trangThaiDonHangModel = new TrangThaiDonHangModel();
			trangThaiDonHangModel = new TrangThaiDonHangDAO().findByMaTrangThai(donHangModel.getMa_TrangThai());
			donHangModel.setTrangThaiDonHangModel(trangThaiDonHangModel);
			request.setAttribute("listShipper", nguoiDungService.findByMa_VaiTro("shipper"));
			request.setAttribute("donHangManager", donHangModel);
		} catch (Exception e) {
			MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
					"Mã đơn hàng không hợp lệ");
			response.sendRedirect("quanly");
		}
		request.getRequestDispatcher("/views/manager/detailordermanager.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String redirect = "";
		if (action != null) {
			if (action.equals("updateShipper")) {
				try {
					int ma_Shipper = Integer.parseInt(request.getParameter("ma_Shiper"));
					int ma_DonHang = Integer.parseInt(request.getParameter("ma_DonHang"));
					donHangService.updateMa_Shipper(ma_Shipper, ma_DonHang);
					redirect = "quanly-detailOrder?ma_donhang=" + ma_DonHang;
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
							"Mã shipper không hợp lệ");
					redirect = "quanly";
				}

			} else{
				redirect = "quanly";
			}

		} else {
			redirect = "quanly";
		}
		response.sendRedirect(redirect.toString());

	}

}
