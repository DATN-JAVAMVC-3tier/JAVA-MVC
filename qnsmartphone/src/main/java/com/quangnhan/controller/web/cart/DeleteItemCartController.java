package com.quangnhan.controller.web.cart;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.SanPhamService;

/**
 * Servlet implementation class DeleteItemCartController
 */
@WebServlet("/DeleteItem")
public class DeleteItemCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ma_SanPham = 0;
		ma_SanPham = Integer.parseInt(request.getParameter("productCode"));
		request.setAttribute("action", "delete");
		request.setAttribute("productCodeDeleteCart", ma_SanPham);
		request.getRequestDispatcher("mycart").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
