
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="layoutSidenav_nav">
	<nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
		<div class="sb-sidenav-menu">
			<div class="nav">
				<div class="sb-sidenav-menu-heading">MENU</div>
				<a class="nav-link" href="ship-home"><div
						class="sb-nav-link-icon">
						<i class="fas fa-tachometer-alt"></i>
					</div> Shipper Home</a>
				<div class="sb-sidenav-menu-heading">Manager</div>
			</div>
		</div>
		<div class="sb-sidenav-footer">
			<div class="small">Quyền hạn cho:</div>
			Shipper<br>
			 <a class="btn btn-sm btn-info" href="<c:url value="logform?action=logout"/>">Logout</a>
		</div>
	</nav>
</div>