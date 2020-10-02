package com.quangnhan.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.BaiVietModel;
import com.quangnhan.service.IBaiVietService;

/**
 * Servlet implementation class BaiVietController
 */
@WebServlet(urlPatterns = {"/admin-table-danhsach-baiviet","/quanly-table-danhsach-baiviet"})
public class BaiVietController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IBaiVietService baiVietService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BaiVietModel baiVietModel = new BaiVietModel();
		baiVietModel.setListResult(baiVietService.findAll());
		request.setAttribute(SystemConstant.MODEL, baiVietModel);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/quanlydanhsachbaiviet.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
