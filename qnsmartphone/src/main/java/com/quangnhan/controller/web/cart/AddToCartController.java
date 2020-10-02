package com.quangnhan.controller.web.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.SanPhamService;

@WebServlet("/AddCart")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ma_SanPham = Integer.parseInt(request.getParameter("productCode"));
		SanPhamModel sanPhamModel = new SanPhamModel();
		sanPhamModel = sanPhamService.findById(ma_SanPham);
		if (request.getParameter("quantity") != null) {
			sanPhamModel.setQuantityProduct(Integer.parseInt(request.getParameter("quantity")));
		}else {
			sanPhamModel.setQuantityProduct(1);
		}
		request.setAttribute("action", "add");
		request.setAttribute("productCart", sanPhamModel);
		request.getRequestDispatcher("mycart").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
