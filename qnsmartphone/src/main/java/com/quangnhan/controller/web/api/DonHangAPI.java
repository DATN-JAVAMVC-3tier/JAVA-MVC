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
import com.quangnhan.model.DetailOrderModel;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.model.ResultMesageModel;
import com.quangnhan.model.SanPhamModel;
import com.quangnhan.service.impl.DonHangService;
import com.quangnhan.service.impl.SanPhamService;
import com.quangnhan.utils.HttpUtil;
import com.quangnhan.utils.SessionUtil;

@WebServlet(urlPatterns = { "/api-donhang-dathang" })
public class DonHangAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	DonHangService donHangService;
	@Inject
	SanPhamService sanPhamService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		HttpSession session = request.getSession();
		boolean checkQuantity = true;
		int ma_DonHang = -1;
		int ma_KhachHang = -1;
		String MESAGE = "";
		ResultMesageModel rsMD = new ResultMesageModel();
		List<SanPhamModel> listProductCart = new ArrayList<>();
		response.setContentType("application/json");
		// convert JSON to String to baiVietModel
		DetailOrderModel detailOrder = HttpUtil.of(request.getReader()).toModel(DetailOrderModel.class);
		// kiểm tra giỏ hàng có tồn tại
		if ((List<SanPhamModel>) session.getAttribute("listProductCarts") != null) {
			NguoiDungModel nguoiDungModel = (NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL");
			listProductCart = (List<SanPhamModel>) session.getAttribute("listProductCarts");
			if (nguoiDungModel != null) {
				ma_KhachHang = nguoiDungModel.getMa_NguoiDung();
			}
			rsMD = donHangService.createOrder(detailOrder, listProductCart,ma_KhachHang);	
			if (rsMD.getACTION() != null) {
				if (rsMD.getACTION().equals("hethang")) {
					rsMD.setMESAGE_BG(SystemConstant.MESAGE_BG_WARNING);
				}
			}
		} else {
			rsMD.setMESAGE("Giỏ hàng trống vui lòng thêm sản phẩm vào giỏ hàng để thực hiện chức năng này!");
		}
		if (rsMD.getMa_DonHang() != -1) {
			rsMD.setMESAGE_BG(SystemConstant.MESAGE_BG_SUCCESS);
			session.removeAttribute("listProductCarts");
		} else {
			rsMD.setMESAGE_BG(SystemConstant.MESAGE_BG_DANGER);
		}
		mapper.writeValue(response.getOutputStream(), rsMD);

	}

}
