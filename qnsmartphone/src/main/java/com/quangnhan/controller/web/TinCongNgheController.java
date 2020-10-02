package com.quangnhan.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.model.BaiVietModel;
import com.quangnhan.service.IBaiVietByTagService;
import com.quangnhan.service.IBaiVietService;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/posts-tin-tuc-cong-nghe", "/posts-tin-tuc" })

public class TinCongNgheController extends HttpServlet {
	@Inject
	private IBaiVietService baiVietService;
	@Inject
	private IBaiVietByTagService baiVietByTagService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		String tieuDe = "Google Pixel Mới Được thêm";
		String noiDung="Một chuyên trang về công nghệ dẫn giới thạo tin trong nước cho biết Pixel 4a đang được sản xuất tại Việt Nam.";
		String tag="google,googlepixel,googlevn";
		int nguoiTao =10007;
		BaiVietModel baiVietModel = new BaiVietModel();
		baiVietModel.setTieuDe(tieuDe);
		baiVietModel.setNoiDung(noiDung);
		baiVietModel.setTag(tag);
		baiVietModel.setNguoiTao(nguoiTao);
		baiVietService.save(baiVietModel);
		//request.setAttribute("baiViet",baiVietByTagService.findBaiVietByTag("%google%"));
		*/
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/tincongnghe.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
