package com.quangnhan.utils;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class MesageUtil {
	ResourceBundle mesageBundle = ResourceBundle.getBundle("mesage");
	private static MesageUtil mesageUtil= null;
	public static MesageUtil getInstance() {
		if (mesageUtil == null) {
			mesageUtil = new MesageUtil();
		}
		return mesageUtil;
	}
	public void putMesage(HttpServletRequest request, String color, String isMesage , String mesageInBundle) {
		request.setAttribute("color", color);
		request.setAttribute("ismesage", isMesage);
		request.setAttribute("mesage",mesageBundle.getString(mesageInBundle));
	}
	public void putMesageByUser(HttpServletRequest request, String color, String isMesage , String mesage) {
		request.setAttribute("color", color);
		request.setAttribute("ismesage", isMesage);
		request.setAttribute("mesage",mesage);
	}
	public void getAndputMesageByUser(HttpServletRequest request, String color, String isMesage , String mesage) {
		String mesager = (String) request.getAttribute("mesage");
		if (mesager != null) {
			MesageUtil.getInstance().putMesageByUser(request,(String)request.getAttribute("color") ,(String)request.getAttribute("ismesage"),
					(String)request.getAttribute("mesage"));
		}
	}
}
