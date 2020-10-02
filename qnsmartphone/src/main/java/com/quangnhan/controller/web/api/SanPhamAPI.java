package com.quangnhan.controller.web.api;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.paging.Paging;
import com.quangnhan.service.impl.SanPhamService;
import com.quangnhan.utils.HttpUtil;

@WebServlet(urlPatterns = { "/api-get-sanpham"})
public class SanPhamAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private SanPhamService sanPhamService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// convert JSON to String to baiVietModel
		Paging paging = HttpUtil.of(request.getReader()).toModel(Paging.class);
		mapper.writeValue(response.getOutputStream(), sanPhamService.findAllAndLimit(paging.getCurrentItem(), paging.getSelectItem()) );
		*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// get data json roi chuyen sang Object paging
		Paging paging = HttpUtil.of(request.getReader()).toModel(Paging.class);
		// mapper.writeValue(response.getOutputStream(), truyền danh sách đối tượng query tử database vào đây vd listSanPham);
		List<SanPhamModel> listSP = sanPhamService.findAllAndLimit(paging.getCurrentItem(), paging.getSelectItem());
		mapper.writeValue(response.getOutputStream(),  listSP);
	}

}
