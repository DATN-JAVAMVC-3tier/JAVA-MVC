package com.quangnhan.controller.web;

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
import com.quangnhan.model.ChiTietDonHangModel;
import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.ChiTietDonHangService;
import com.quangnhan.service.impl.DonHangService;
import com.quangnhan.service.impl.NguoiDungService;
import com.quangnhan.service.impl.SanPhamService;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;

/**
 * Servlet implementation class BillController
 */
@WebServlet("/bill")
public class BillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	DonHangService donHangService;
	@Inject
	NguoiDungService nguoiDungService;
	@Inject
	ChiTietDonHangService cTDHService;
	@Inject
	SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DonHangModel donHang = new DonHangModel();
		NguoiDungModel khachHang = new NguoiDungModel();
		SanPhamModel sPMD = new SanPhamModel();
		List<ChiTietDonHangModel> listCTDH = new ArrayList<ChiTietDonHangModel>();
		List<ChiTietDonHangModel> listCTDH2 = new ArrayList<ChiTietDonHangModel>();
		String ma_DH = request.getParameter("DH");
		try {
			int maDonHang = Integer.parseInt(ma_DH);
			donHang = donHangService.findByMaHang(maDonHang);
			listCTDH = cTDHService.findByIdDonHang(maDonHang);
			for (ChiTietDonHangModel cTDHModel : listCTDH) {
				sPMD = sanPhamService.findById(cTDHModel.getMa_SanPham());
				cTDHModel.setTenSP(sPMD.getTen_SanPham());
				listCTDH2.add(cTDHModel);
			}
			donHang.setListChiTietDonHang(listCTDH2);
			request.setAttribute("dh", donHang);
			//khachHang = nguoiDungService.findById(donHang.getMa_KhachHang());
			request.getRequestDispatcher("/views/web/bill.jsp").forward(request, response);
		} catch (Exception e) {
			MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Mã đơn hàng ["+ma_DH+"] không hợp lệ.");
			request.getRequestDispatcher("/views/web/bill.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
