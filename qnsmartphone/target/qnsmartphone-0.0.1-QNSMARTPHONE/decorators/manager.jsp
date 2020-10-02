<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title><dec:title default="Manager-page" /></title>
<%@ include file="/common/admin/styles.jsp"%>
</head>
<body>

	<%@ include file="/common/manager/nav.jsp"%>
	<%@ include file="/common/web/mesage.jsp"%>
	<div id="layoutSidenav">
		<%@ include file="/common/manager/menu-left.jsp"%>
		<div id="layoutSidenav_content">
			<dec:body />
			<%@ include file="/common/manager/footer.jsp"%>
		</div>
	</div>
		<%@ include file="/common/manager/js-statistical.jsp"%>
</body>
</html>