package com.quangnhan.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.IBaiVietByTagService;
import com.quangnhan.service.INguoiDungService;
import com.quangnhan.service.ISanPhamService;
import com.quangnhan.service.ITableService;
import com.quangnhan.utils.FormUtil;
import com.quangnhan.utils.MesageUtil;
import com.quangnhan.utils.SessionUtil;

@WebServlet(urlPatterns = { "/trang-chu", "/home" })
public class HomeController extends HttpServlet {

	/**
	 * add warning
	 */
	@Inject
	private ITableService tableService;
	@Inject
	private ISanPhamService sanPhamService;
	@Inject
	private INguoiDungService nguoiDungService;
	@Inject
	private IBaiVietByTagService baiVietByTagService;
	ResourceBundle mesageBundle = ResourceBundle.getBundle("mesage");
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null) {
			if (action.equals("invalidloginLogControllerToHomeController")) {
				// set mesage khi tài khoản không tồn lại
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true", "invalidlogin");
			} else if (action.equals("userblockedLogControllerToHomeController")) {
				// set mesage khi tài khoản bị khóa
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true", "blockedUser");
			} else if (action.equals("notAdminRole")) {
				// set mesage khi tài khoản không có quyền admin
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true", "notAdminRole");
			} else if (action.equals("anunknownerror")) {
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true", "anunknownerror");
			} else if (action.equals("notConfirmPassword")) {
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true",
						"notConfirmPassword");
			} else if (action.equals("registerFail")) {
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true", "registerFail");
			} else if (action.equals("registerSuccess")) {
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_SUCCESS, "true",
						"registerSuccess");
			} else if (action.equals("usernameExists")) {
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true", "usernameExists");
			}else if (action.equals("susscess")) {
				MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true", "Success!");
				NguoiDungModel nguoiDungModel = (NguoiDungModel) SessionUtil.getInstance().getValue(request,
						"NGUOIDUNGMODEL");
				SessionUtil.getInstance().putValue(request, "NGUOIDUNGMODEL", nguoiDungService.findById(nguoiDungModel.getMa_NguoiDung()));
			} else if (action.equals("anunknownProductCode")) {
				MesageUtil.getInstance().putMesage(request, SystemConstant.MESAGE_BG_DANGER, "true",
						"anunknownProductCode");
			}else if (action.equals("search")) {
				String keyWord = request.getParameter("keyword");
				if (keyWord != null) {
					List<SanPhamModel> listSP = sanPhamService.findAllByTenSanPham(keyWord);
					request.setAttribute("searchKeyWordInput", listSP);
					request.setAttribute("keyWordInput", keyWord);
				}
			} else if (action.equals("thuonghieu")) {
				String keyWord = request.getParameter("keyword");
				if (keyWord != null) {
					List<SanPhamModel> listSanPhamByGia =sanPhamService.findAllByThuongHieuAndLimit(keyWord, 0,1000);
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true", "Tìm thấy "+listSanPhamByGia.size()+" sản phẩm phù hợp");
					request.setAttribute("searchKeyWord", listSanPhamByGia);
				}
			}else if (action.equals("giaban")) {
				try {
					int tu = Integer.parseInt(request.getParameter("tu"));
					int den = Integer.parseInt(request.getParameter("den"));
					List<SanPhamModel> listSanPhamByGia = sanPhamService.findAllByGiaAndOrderBy(tu*1000000, den*1000000, "asc");
					request.setAttribute("issort", "true");
					request.setAttribute("listsanphamsort", listSanPhamByGia);
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true", "Tìm thấy "+listSanPhamByGia.size()+" sản phẩm phù hợp");
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Từ khóa tìm kiếm không hợp lệ");
				}
			}else if (action.equals("sort")) {
				try {
					String sortByGia =  request.getParameter("sort-by-gia");
					String sortByOrderby = request.getParameter("sort-by-orderby");
					String[] arrGia =sortByGia.split("-");
					int tu = Integer.parseInt(arrGia[0])*1000000;
					int den = Integer.parseInt(arrGia[1])*1000000;
					request.setAttribute("searchKeyWord", sanPhamService.findAllByGiaAndOrderBy(tu, den, sortByOrderby));
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Tìm kiếm không hợp lệ");
				}
				String keyWord = request.getParameter("keyword");
				if (keyWord != null) {
					request.setAttribute("searchKeyWord", sanPhamService.findAllByThuongHieuAndLimit(keyWord, 0,1000));
				}
			}
		} else {
			request.setAttribute("sameTagProduct", sanPhamService.findByTag("google"));
			request.setAttribute("maxRow", tableService.countRow("tbl_sanpham", "trangthai", "active"));
			request.setAttribute("listProduct", sanPhamService.findAllAndLimit(0, 8));
			request.setAttribute("Vsmarts", sanPhamService.findAllByThuongHieuAndLimit("Vsmart", 0, 8));
			request.setAttribute("Googles", sanPhamService.findAllByThuongHieuAndLimit("Google", 0, 8));
			request.setAttribute("Apples", sanPhamService.findAllByThuongHieuAndLimit("Apple", 0, 8));
			request.setAttribute("Samsungs", sanPhamService.findAllByThuongHieuAndLimit("Samsung", 0, 8));
			request.setAttribute("Xiaomis", sanPhamService.findAllByThuongHieuAndLimit("Xiaomi", 0, 8));
			request.setAttribute("Bphones", sanPhamService.findAllByThuongHieuAndLimit("Bphone", 0, 8));
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("invalidloginLogControllerToHomeController")) {
			request.setAttribute("ismesage", "true");
			request.setAttribute("mesage", mesageBundle.getString("invalidlogin"));
		} else if (action.equals("userblockedLogControllerToHomeController")) {
			request.setAttribute("ismesage", "true");
			request.setAttribute("mesage", mesageBundle.getString("blockedUser"));
		}else if (action.equals("sort")) {
			try {
				String sortByGia =  request.getParameter("sort-by-gia");
				String sortByOrderby = request.getParameter("sort-by-orderby");
				String[] arrGia =sortByGia.split("-");
				int tu = Integer.parseInt(arrGia[0])*1000000;
				int den = Integer.parseInt(arrGia[1])*1000000;
				request.setAttribute("issort", "true");
				request.setAttribute("choosegia", sortByGia);
				request.setAttribute("chooseorderby", sortByOrderby);
				request.setAttribute("listsanphamsort", sanPhamService.findAllByGiaAndOrderBy(tu, den, sortByOrderby));
			} catch (Exception e) {
				MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Tìm kiếm không hợp lệ");
			}
		}
		request.setAttribute("sameTagProduct", sanPhamService.findByTag("google"));
		request.setAttribute("maxRow", tableService.countRow("tbl_sanpham", "trangthai", "active"));
		request.setAttribute("listProduct", sanPhamService.findAllAndLimit(0, 8));
		request.setAttribute("Vsmarts", sanPhamService.findAllByThuongHieuAndLimit("Vsmart", 0, 8));
		request.setAttribute("Googles", sanPhamService.findAllByThuongHieuAndLimit("Google", 0, 8));
		request.setAttribute("Apples", sanPhamService.findAllByThuongHieuAndLimit("Apple", 0, 8));
		request.setAttribute("Samsungs", sanPhamService.findAllByThuongHieuAndLimit("Samsung", 0, 8));
		request.setAttribute("Xiaomis", sanPhamService.findAllByThuongHieuAndLimit("Xiaomi", 0, 8));
		request.setAttribute("Bphones", sanPhamService.findAllByThuongHieuAndLimit("Bphone", 0, 8));
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/index.jsp");
		rd.forward(request, response);
	}
}
