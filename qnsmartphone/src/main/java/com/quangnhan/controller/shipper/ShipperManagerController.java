package com.quangnhan.controller.shipper;

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
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.TrangThaiDonHangModel;
import com.quangnhan.service.impl.ChiTietDonHangService;
import com.quangnhan.service.impl.DonHangService;
import com.quangnhan.service.impl.NguoiDungService;
import com.quangnhan.service.impl.TrangThaiDonHangService;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;

 
@WebServlet("/shipper-manager")
public class ShipperManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    DonHangService donHangService;
    @Inject
	ChiTietDonHangService ctdhService;
	@Inject
	NguoiDungService nguoiDungService;
	@Inject
	TrangThaiDonHangService trangThaiDonHangService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("action");
		 if (action!=null) {
			 if (action.equals("set")) {
				 donHangService.updateMa_Shipper(request);
			}else if(action.equals("get")) {
				// view detail order
				try {
					int ma_DonHang = Integer.parseInt(request.getParameter("ma_donhang"));
					NguoiDungModel nguoiDung = (NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL");
					DonHangModel donHangModel = donHangService.findByMa_DonHangAndMa_Shipper(ma_DonHang, nguoiDung.getMa_NguoiDung()) ;
					List<ChiTietDonHangModel> listCTDHModel = new ArrayList<>();
					listCTDHModel = ctdhService.findByIdDonHang(ma_DonHang);
					donHangModel.setListChiTietDonHang(listCTDHModel);
					TrangThaiDonHangModel trangThaiDonHangModel = new TrangThaiDonHangModel();
					trangThaiDonHangModel = trangThaiDonHangService.findByMaTrangThai(donHangModel.getMa_TrangThai());
					donHangModel.setTrangThaiDonHangModel(trangThaiDonHangModel);
					request.setAttribute("listTrangThai", trangThaiDonHangService.findAll());
					request.setAttribute("listShipper", nguoiDungService.findByMa_VaiTro("shipper"));
					request.setAttribute("donHangManager", donHangModel);
					 request.getRequestDispatcher("/views/shipper/detailordermanager.jsp").forward(request, response);
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Lỗi hệ thống");
					 request.getRequestDispatcher("ship-home").forward(request, response);
				}
			}
			
		}
		 request.getRequestDispatcher("ship-home").forward(request, response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String redirect = "";
		if (action!=null) {
			int ma_DonHang = 0;
			try {
				ma_DonHang = Integer.parseInt(request.getParameter("ma_donhang"));
			} catch (Exception e) {
				redirect = "ship-home";
			}
			if (action.equals("trangthaidonhang")) {
				int ma_TrangThai = Integer.parseInt(request.getParameter("trangthaidonhang"));
				donHangService.updateMa_TrangThai(ma_TrangThai, ma_DonHang);
			}else if (action.equals("tinhtrangdonhang")) {
				String tinhtrangselect = request.getParameter("tinhtrangselect");
				String tinhtranginput = request.getParameter("tinhtranginput");
				donHangService.updateTinhTrangAndTrangThai(ma_DonHang, tinhtrangselect, tinhtranginput);
			}
			redirect = "shipper-manager?action=get&ma_donhang=" + ma_DonHang;
		}else {
			redirect = "ship-home";
		}
		
		response.sendRedirect(redirect);
	}

}
