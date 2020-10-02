package com.quangnhan.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.SanPhamService;

@WebServlet("/detail-product")
public class DetailProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SanPhamService sanPhamService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("productCode") != null) {

			try {
				int ma_SanPham = Integer.parseInt(request.getParameter("productCode"));
				SanPhamModel sanPhamModel = new SanPhamModel();
				sanPhamModel = sanPhamService.findById(ma_SanPham);
				if (sanPhamModel.getMa_SanPham() == ma_SanPham) {
					request.setAttribute("sameCategoryProduct", sanPhamService.findByThuongHieu(sanPhamModel.getThuongHieu()));
					//
					String[] tagList = sanPhamModel.getTag().split("/");
					Random random = new Random();
					int randomTag = random.nextInt(tagList.length);
					//
					request.setAttribute("sameTagProduct", sanPhamService.findByTag(tagList[randomTag]));
					request.setAttribute("detailProduct", sanPhamModel);
				} else {
					response.sendRedirect("trang-chu?action=anunknownProductCode");
				}

			} catch (Exception e) {
				response.sendRedirect("trang-chu?action=anunknownProductCode");
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/detailproduct.jsp");
			rd.forward(request, response);

		} else {
			response.sendRedirect("trang-chu?action=anunknownProductCode");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
