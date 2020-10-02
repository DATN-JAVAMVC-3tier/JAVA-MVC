package com.quangnhan.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.service.impl.SanPhamService;
@WebServlet(urlPatterns = {"/admin-home","/admin-trangchu","/admin"})
public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("listSanPham", sanPhamService.findAllByAdmin());
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
