package com.quangnhan.controller.manager;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.service.impl.DonHangService;

/**
 * Servlet implementation class HomeManagerController
 */
@WebServlet(urlPatterns = {"/quanly" })
public class HomeManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	DonHangService donHangService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null) {

		}
		request.setAttribute("donHangManager", donHangService.findByTrangThai(3, 4, 5, 6));
		request.getRequestDispatcher("/views/manager/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
