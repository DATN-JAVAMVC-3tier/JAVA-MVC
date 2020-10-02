package com.quangnhan.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.DonHangModel;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.service.impl.DonHangService;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;
 
@WebServlet("/detailOrder")
public class DetailOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	DonHangService donHangService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<DonHangModel> listDH = new ArrayList<DonHangModel>();
		String action = request.getParameter("action");
		if (action!= null) {
			if (action.equals("history")) {
				try {
					NguoiDungModel nguoiDungModel = (NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL");
					request.setAttribute("listChiTietDonHang", donHangService.findDetailDonHangByMa_NguoiDung(nguoiDungModel.getMa_NguoiDung()));
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true","Vui lòng đăng nhập để thực hiện chức năng này. Hoặc có thể tìm kiếm theo mã đơn hàng");
				}
			}
		}else {
			String search = request.getParameter("timkiem");
			if (search != null) {
				listDH =donHangService.findDetailDonHangByIdOrPhone(search);
				if (listDH == null) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Không tìm thấy đơn hàng nào phù hợp với từ khóa: ["+search+"]");
				}else {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true", "Tìm thấy ["+listDH.size()+"] đơn hàng phù hợp với từ khóa ["+search+"]");
					request.setAttribute("listChiTietDonHang", donHangService.findDetailDonHangByIdOrPhone(search));
				}
			}
		}
		
		request.getRequestDispatcher("/views/web/detailOrder.jsp").forward(request, response);
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
