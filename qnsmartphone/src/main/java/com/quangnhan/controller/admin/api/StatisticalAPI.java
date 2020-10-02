package com.quangnhan.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.StatisticalModel;
import com.quangnhan.paging.Paging;
import com.quangnhan.service.impl.StatisticalService;
import com.quangnhan.utils.HttpUtil;
import com.quangnhan.utils.MesageUtil;
 
@WebServlet("/api-admin-statistical")
public class StatisticalAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
   @Inject
   StatisticalService statisticalService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// convert JSON to String to baiVietModel
		StatisticalModel statisticalRP = HttpUtil.of(request.getReader()).toModel(StatisticalModel.class);
		String action = statisticalRP.getAction();
		if (action != null) {
			StatisticalModel statistical = new StatisticalModel();
			if (action.equals("doanhsobanra")) {
				 statistical = statisticalService.findDoanhSoBanRaByMa_TrangThaiOrMa_TrangThaiAndYear(6,7, 2020);
				
			}else if(action.equals("doanhthu")){
				statistical = statisticalService.findDoanhThuByMa_TrangThaiOrMa_TrangThaiAndYear(6,7, 2020);
				mapper.writeValue(response.getOutputStream(), statistical);
			}
			mapper.writeValue(response.getOutputStream(), statistical);
		}else {
			MesageUtil.getInstance().putMesageByUser(request, SystemConstant.MESAGE_BG_DANGER, "true", "Lỗi API");
			mapper.writeValue(response.getOutputStream(), "{}");
		}
		
	}

}
