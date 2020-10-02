package com.quangnhan.controller.web.api;

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
import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.SanPhamService;
import com.quangnhan.utils.MesageUtil;

/**
 * Servlet implementation class AddCartAPI
 */
@WebServlet("/AddCartAPI")
public class AddCartAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		boolean flag = false;
		HttpSession session = request.getSession();
		List<SanPhamModel> listProductCart = new ArrayList<>();
		int ma_SanPham = Integer.parseInt(request.getParameter("productCode"));
		SanPhamModel sanPhamModel = new SanPhamModel();
		sanPhamModel = sanPhamService.findById(ma_SanPham);
		if (request.getParameter("quantity") != null) {
			sanPhamModel.setQuantityProduct(Integer.parseInt(request.getParameter("quantity")));
		}else {
			sanPhamModel.setQuantityProduct(1);
		}
		//
		if ((List<SanPhamModel>) session.getAttribute("listProductCarts") != null) {
			listProductCart = (List<SanPhamModel>) session.getAttribute("listProductCarts");
		}

		if (sanPhamModel != null) {
			int i = 1;
			for (SanPhamModel item : listProductCart) {
				if (item.getMa_SanPham() == sanPhamModel.getMa_SanPham() || i>=10) {
					flag = true;
					break;
				}
				i++;
			}
			if (!flag) {
				listProductCart.add(sanPhamModel);
			}else {
				mapper.writeValue(response.getOutputStream(),  0);
			}
		}
		if (!listProductCart.isEmpty()) {
			session.setAttribute("listProductCarts",listProductCart );
		}else {
			mapper.writeValue(response.getOutputStream(),  0);
		}
		mapper.writeValue(response.getOutputStream(),  listProductCart.size());
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
