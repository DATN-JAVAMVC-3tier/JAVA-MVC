<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Tin tức công nghệ" /></title>
<%@ include file="/common/web/posts-css.jsp"%>
</head>
<body>
	<%@ include file="/common/web/splash.jsp"%>
	<%@ include file="/common/web/header-menu.jsp"%>
	<%@ include file="/common/web/posts-banner.jsp"%>
	
		<!-- biến định nghĩa body !-->
		<dec:body />
	
	<!--  include footer -->
<%@ include file="/common/web/footer.jsp" %>
<!--  end include footer -->
<%@ include file="/common/web/box-updatedetailuser.jsp" %>
<%@ include file="/common/web/login-register.jsp" %>
<%@ include file="/common/web/search.jsp" %>
<%@ include file="/common/web/posts-js.jsp" %>
</body>
</html>