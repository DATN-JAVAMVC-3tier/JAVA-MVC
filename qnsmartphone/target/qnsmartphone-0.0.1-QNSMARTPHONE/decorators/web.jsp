<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="QN-SmartPhone" /></title>
<%@ include file="/common/web/headcss.jsp"%>
<dec:head/>
</head>
<body>
	<%@ include file="/common/web/splash.jsp"%>
	<%@ include file="/common/web/mesage.jsp"%>
	<%@ include file="/common/web/header-menu.jsp"%>
	<%@ include file="/common/web/banner-slide.jsp"%>
	
		<!-- biến định nghĩa body !-->
		<dec:body />
	
	<!--  include footer -->
<%@ include file="/common/web/footer.jsp" %>
<!--  end include footer -->
<%@ include file="/common/web/box-updatedetailuser.jsp" %>
<%@ include file="/common/web/login-register.jsp" %>
<%@ include file="/common/web/search.jsp" %>
<%@ include file="/common/web/js.jsp" %>
<%@ include file="/common/web/gotohome.jsp" %>
</body>
</html>