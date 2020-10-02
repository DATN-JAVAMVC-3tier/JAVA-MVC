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
<title><dec:title default="QNSmart-phone Log-page" /></title>
	<%@ include file="/common/web/log-style.jsp"%>
</head>
<body class="bg-primary">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <dec:body/>
            </div>
            <div id="layoutAuthentication_footer">
                <%@ include file="/common/web/log-footer.jsp" %>
            </div>
        </div>
        <%@ include file="/common/web/log-js.jsp"%>
    </body>
	
</html>