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

import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.SanPhamService;

/**
 * Servlet implementation class UpdateCartController
 */
@WebServlet("/UpdateCart")
public class UpdateCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SanPhamService sanPhamService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<SanPhamModel> listProductCart = new ArrayList<>();
		List<SanPhamModel> listProductCart2 = new ArrayList<>();
		HttpSession session = request.getSession();
		if ((List<SanPhamModel>) session.getAttribute("listProductCarts") != null) {
			listProductCart = (List<SanPhamModel>) session.getAttribute("listProductCarts");
		}
		int i = 0;
		for (SanPhamModel sanPhamModel : listProductCart) {
			
			if (request.getParameter("" + i) != null) {
				sanPhamModel.setQuantityProduct(Integer.parseInt(request.getParameter("" + i)));
			}
			listProductCart2.add(sanPhamModel);
			i++;
		}
		request.setAttribute("action", "update");
		request.setAttribute("productCart", listProductCart2);
		request.getRequestDispatcher("mycart").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
