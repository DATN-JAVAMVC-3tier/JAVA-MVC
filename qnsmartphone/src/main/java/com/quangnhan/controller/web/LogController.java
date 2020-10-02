package com.quangnhan.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.paging.Paging;
import com.quangnhan.service.IBaiVietByTagService;
import com.quangnhan.service.INguoiDungService;
import com.quangnhan.service.impl.NguoiDungService;
import com.quangnhan.utils.FormUtil;
import com.quangnhan.utils.HttpUtil;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;

@WebServlet("/logform")
public class LogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private INguoiDungService nguoiDungService;
	@Inject
	private IBaiVietByTagService baiVietByTagService;
	ResourceBundle mesageBundle = ResourceBundle.getBundle("mesage");

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null || action.equals(SystemConstant.LOG_LOGIN)) {
			request.getRequestDispatcher("/views/web/web-log-login.jsp").forward(request, response);
		} else if (action.equals(SystemConstant.LOG_REGISTER)) {
			request.getRequestDispatcher("/views/web/web-log-register.jsp").forward(request, response);
		} else if (action.equals(SystemConstant.LOG_FORGOTPASS)) {
			request.getRequestDispatcher("/views/web/web-log-forgotpassword.jsp").forward(request, response);
		} else if (action.equals(SystemConstant.LOG_OUT)) {
			SessionUtil.getInstance().removeValue(request, "NGUOIDUNGMODEL");
			SessionUtil.getInstance().removeValue(request, "listProductCarts");
			response.sendRedirect("/trang-chu");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals(SystemConstant.LOG_LOGIN)) {
			// get user với pass thông qua tên biến trả về
			NguoiDungModel nguoiDungModel = FormUtil.toModel(NguoiDungModel.class, request);
			nguoiDungModel = nguoiDungService.findByTenDangNhapAndMatKhau(nguoiDungModel.getTenDangNhap(),
					nguoiDungModel.getMatKhau());
			if (nguoiDungModel != null) {
				if (nguoiDungModel.getTrangThaiNguoiDung().getMa_TrangThai().equals("hoatdong")) {
					SessionUtil.getInstance().putValue(request, "NGUOIDUNGMODEL", nguoiDungModel);
					if (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals("admin")) {
						response.sendRedirect(request.getContextPath() + "/admin-home");
					} else if (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals("quanly")) {
						response.sendRedirect(request.getContextPath() + "/quanly");
					} else if (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals("nhanvienkho")) {
						response.sendRedirect(request.getContextPath() + "/kho-home");
					} else if (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals("shipper")) {
						response.sendRedirect(request.getContextPath() + "/ship-home");
					} else if (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals("kythuat")) {
						response.sendRedirect(request.getContextPath() + "/kythuat-home");
					} else if (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals("khachhang")) {
						response.sendRedirect(request.getContextPath() + "/trang-chu");
					}
				} else {
					// tai khoan bi khoa lien he admin
					response.sendRedirect("/trang-chu?action=userblockedLogControllerToHomeController");
				}
			} else {
				// tai khoan khong ton tai
				response.sendRedirect("/trang-chu?action=invalidloginLogControllerToHomeController");
			}
		} else if (action != null && action.equals(SystemConstant.LOG_UPDATEUSER)) {
			// cập nhập user
			try {
				NguoiDungModel nguoiDungModel = (NguoiDungModel) SessionUtil.getInstance().getValue(request,
						"NGUOIDUNGMODEL");
				//Paging paging = HttpUtil.of(request.getReader()).toModel(Paging.class);
				NguoiDungModel nguoiDungModelUpdate = FormUtil.toModel(NguoiDungModel.class, request);
				nguoiDungModelUpdate.setMa_NguoiDung(nguoiDungModel.getMa_NguoiDung());
				// set image default
				nguoiDungModelUpdate.setImage("user-default1.png");
				nguoiDungService.updateNguoiDung(nguoiDungModelUpdate);
				
			} catch (Exception e) {
				response.sendRedirect("/trang-chu?action=anunknownerror");
			}
			response.sendRedirect("/trang-chu?action=susscess");
		} else if (action != null && action.equals(SystemConstant.LOG_REGISTER)) {
			NguoiDungModel nguoiDungModelOnForm = FormUtil.toModel(NguoiDungModel.class, request);
			if (!nguoiDungModelOnForm.getMatKhau().equalsIgnoreCase(request.getParameter("confirm-matKhau"))) {
				response.sendRedirect("/trang-chu?action=notConfirmPassword");
			} else if (nguoiDungService.isExistTenDangNhap(nguoiDungModelOnForm.getTenDangNhap())) {
				response.sendRedirect("/trang-chu?action=usernameExists");
			} else {
				int statusSave = nguoiDungService.saveReturnInt(nguoiDungModelOnForm);
				if (statusSave <= 0) {
					response.sendRedirect("/trang-chu?action=registerFail");
				} else {
					response.sendRedirect("/trang-chu?action=registerSuccess");
				}
			}
		} else {
			response.sendRedirect(request.getContextPath() + "/log?action=login");
		}
	}

}
