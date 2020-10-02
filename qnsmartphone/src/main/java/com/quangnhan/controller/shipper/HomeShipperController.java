package com.quangnhan.controller.shipper;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.service.impl.DonHangService;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;

 
@WebServlet(urlPatterns = {"/ship-home"})
public class HomeShipperController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	DonHangService donHangService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null) {

		}
		try {
			int ma_NguoiDung =((NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL")).getMa_NguoiDung();
			request.setAttribute("donHangShipper", donHangService.findByMa_ShipperAndTrangThai(ma_NguoiDung, 3, 4, 5, 5));
		} catch (Exception e) {
			MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Lỗi hệ thống");
		}
		
		request.setAttribute("donHangManager", donHangService.findByTrangThai(3, 4, 5, 5));
		 request.getRequestDispatcher("/views/shipper/home.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
