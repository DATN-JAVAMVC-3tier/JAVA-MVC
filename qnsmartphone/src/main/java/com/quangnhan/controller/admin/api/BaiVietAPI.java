package com.quangnhan.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quangnhan.model.BaiVietModel;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.service.IBaiVietService;
import com.quangnhan.utils.HttpUtil;
import com.quangnhan.utils.SessionUtil;

@WebServlet(urlPatterns = { "/api-admin-baiviet" })
public class BaiVietAPI extends HttpServlet {

	/**
	 * 
	 * GET: query dữ liệu lên POST: thêm mới DELETE: dùng để xóa PUT: Dùng để cập
	 * nhập { "tieuDe": "Test API", "noiDung": "Day la noi dung de test api", "tag":
	 * "apple", "nguoiTao": 10007 }
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IBaiVietService baiVietService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// thêm bài viết ở đây BaiVietModel baiVietModel =
		// HttpUtil.of(request.getReader()).toModel(BaiVietModel.class);
		// lấy session user cập nhập để thêm vào người cập nhập 
		int ma_NguoiDung = ((NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL")).getMa_NguoiDung();
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// convert JSON to String to baiVietModel
		BaiVietModel baiVietModel = HttpUtil.of(request.getReader()).toModel(BaiVietModel.class);
		
		baiVietModel = baiVietService.save(baiVietModel);

		// chuyển String sang json thông qua ObjectMapper mapper
		mapper.writeValue(response.getOutputStream(), baiVietModel);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// convert JSON to String to baiVietModel
		BaiVietModel updateBaiViet = HttpUtil.of(request.getReader()).toModel(BaiVietModel.class);
		updateBaiViet = baiVietService.update(updateBaiViet);
		mapper.writeValue(response.getOutputStream(), updateBaiViet);
	}

	
	  protected void doDelete(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException {
		  ObjectMapper mapper = new ObjectMapper();
			request.setCharacterEncoding("UTF-8");
			response.setContentType("application/json");
			BaiVietModel baiVietModel = HttpUtil.of(request.getReader()).toModel(BaiVietModel.class);
			baiVietService.delete(baiVietModel.getListMa_BaiViet());
			// chỉ cần trả về mảng rỗng
			mapper.writeValue(response.getOutputStream(), "{}");
	  }

	
}
