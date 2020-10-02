package com.quangnhan.controller.web.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quangnhan.model.SanPhamModel;

@WebServlet("/mycart")
public class ViewCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<SanPhamModel> listProductCart = new ArrayList<>();
		int codeProductDeleteCart = 0;
		boolean flag = false;
		String action =(String) request.getAttribute("action");
		if ((List<SanPhamModel>) session.getAttribute("listProductCarts") != null) {
			listProductCart = (List<SanPhamModel>) session.getAttribute("listProductCarts");
		}
		if (action != null) {
			if (action.equals("delete")) {
				// xoa san pham khoi gio hang
				if (request.getAttribute("productCodeDeleteCart") != null) {
					codeProductDeleteCart =(int) request.getAttribute("productCodeDeleteCart");
				}
				if (codeProductDeleteCart != 0) {
					for (SanPhamModel sanPhamModel : listProductCart) {
						if (sanPhamModel.getMa_SanPham() == codeProductDeleteCart) {
							listProductCart.remove(sanPhamModel);
							break;
						}
					}
				}
			}else if (action.equals("add")) {
				// them san pham vao gio
				SanPhamModel productCart = (SanPhamModel) request.getAttribute("productCart");
				if (productCart != null) {
					int i = 1;
					for (SanPhamModel sanPhamModel : listProductCart) {
						if (sanPhamModel.getMa_SanPham() == productCart.getMa_SanPham() || i>=10) {
							flag = true;
							break;
						}
						i++;
					}
					if (!flag) {
						listProductCart.add(productCart);
					}
				}
			}else if (action.equals("update")) {
				listProductCart = (List<SanPhamModel>) request.getAttribute("productCart");
			}
		}

		if (!listProductCart.isEmpty()) {
			session.setAttribute("listProductCarts",listProductCart );
		}
		
		request.getRequestDispatcher("/views/web/cart.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
