package com.quangnhan.controller.manager;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.SanPhamService;
import com.quangnhan.utils.FormUtil;
import com.quangnhan.utils.MesageUtil;

@WebServlet(urlPatterns = {"/quanly-sanpham" })
public class SanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null) {
			// action != null
			if (action.equals("delete")) {
				try {
					int ma_SanPham = Integer.parseInt(request.getParameter("ma_SanPham"));
					sanPhamService.deleteByMaSanPham(ma_SanPham);
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true",
							"Mã sản phẩm [" + ma_SanPham + "] được xóa thành công!");
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
							"Mã sản phẩm không hợp lệ!");
				}
			} else if (action.equals("edit")) {
				try {
					int ma_SanPham = Integer.parseInt(request.getParameter("ma_SanPham"));
					request.setAttribute("sanPham", sanPhamService.findById(ma_SanPham));
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
							"Mã sản phẩm không hợp lệ!");
				}
				request.getRequestDispatcher("/views/manager/manager-add-product.jsp").forward(request, response);
			}else if(action.equals("hidden")){
				try {
					int ma_SanPham = Integer.parseInt(request.getParameter("ma_SanPham"));
					String value = request.getParameter("value");
					if (value != null) {
						int isUpdate = sanPhamService.updateTrangThai(value, ma_SanPham);
						MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true",
								"Update sản phẩm thành công");
					}
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
							"Update sản phẩm thất bại");
				}
				request.getRequestDispatcher("quanly-view-list-product").forward(request, response);
			}
		} else {
			// action == null
		}

		request.getRequestDispatcher("quanly-view-list-product").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null) {
			if (action.equals("add")) {
				SanPhamModel sanPhamModel = FormUtil.toModel(SanPhamModel.class, request);
				int isSave = sanPhamService.save(sanPhamModel);
				if (isSave != -1) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true",
							"Thêm sản phẩm mới thành công mã sản phẩm [" + isSave + "].");
				} else {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
							"Thêm sản phẩm mới không thành công!");
				}
			} else if (action.equals("update")) {
				try {
					int ma_SanPham = Integer.parseInt(request.getParameter("ma_SanPham"));
					SanPhamModel sanPham = FormUtil.toModel(SanPhamModel.class, request);
					int isUpdate = sanPhamService.update(sanPham);
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_SUCCESS, "true",
							"Cập Nhập thành công!");
					request.setAttribute("sanPham", sanPhamService.findById(ma_SanPham));
				} catch (Exception e) {
					MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
							"Mã sản phẩm không hợp lệ!");
				}

				request.getRequestDispatcher("/views/manager/manager-add-product.jsp").forward(request, response);
			}
		} else {
			MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true",
					"No action request");
		}
		request.getRequestDispatcher("/views/manager/manager-add-product.jsp").forward(request, response);
	}

}
