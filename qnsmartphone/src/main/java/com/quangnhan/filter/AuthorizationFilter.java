package com.quangnhan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quangnhan.Constant.SystemConstant;
import com.quangnhan.model.NguoiDungModel;
import com.quangnhan.utils.SessionUtil;

public class AuthorizationFilter implements Filter {
	private ServletContext contex;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.contex = filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse respont = (HttpServletResponse) servletResponse;
		String url = request.getRequestURI();
		boolean isGoToHomePage = false;
		NguoiDungModel nguoiDungModel = (NguoiDungModel) SessionUtil.getInstance().getValue(request, "NGUOIDUNGMODEL");
		boolean isLogin = false;
		if (nguoiDungModel != null) {
			isLogin = true;
			
		}
		
		if (url.startsWith("/admin")) {
			if ( isLogin && nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals(SystemConstant.ADMIN_ROLE)) {
				filterChain.doFilter(servletRequest, servletResponse);
			} else {
				isGoToHomePage = true;
			}
		} else if (url.startsWith("/quanly")) {
			if ( isLogin && (nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals(SystemConstant.QUANLY_ROLE)
					|| nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals(SystemConstant.ADMIN_ROLE))) {
				filterChain.doFilter(servletRequest, servletResponse);
			} else {
				isGoToHomePage = true;
			}
		} else if (url.startsWith("/ship")) {
			if ( isLogin && nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals(SystemConstant.SHIPER_ROLE)) {
				filterChain.doFilter(servletRequest, servletResponse);
			} else {
				isGoToHomePage = true;
			}
		} else if (url.startsWith("/kho")) {
			if ( isLogin && nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals(SystemConstant.KHO_ROLE)) {
				filterChain.doFilter(servletRequest, servletResponse);
			} else {
				isGoToHomePage = true;
			}
		} else if (url.startsWith("/kythuat")) {
			if ( isLogin && nguoiDungModel.getVaiTroNguoiDung().getMa_VaiTro().equals(SystemConstant.KYTHUAT_ROLE)) {
				filterChain.doFilter(servletRequest, servletResponse);
			} else {
				isGoToHomePage = true;
			}
		}else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
		if (isGoToHomePage == true) {
			respont.sendRedirect(request.getContextPath() + "/trang-chu?action=notAdminRole");
		}
		// ngoại trừ các tiền tố URL trên thì được vào bình thường
		// phát hiện chưa đăng nhập thì trỏ về trang home
		//filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {

	}

}
