
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="layoutSidenav_nav">
	<nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
		<div class="sb-sidenav-menu">
			<div class="nav">
				<div class="sb-sidenav-menu-heading">MENU</div>
				<a class="nav-link" href="quanly"><div
						class="sb-nav-link-icon">
						<i class="fas fa-tachometer-alt"></i>
					</div> Manager Home</a>
				<div class="sb-sidenav-menu-heading">Manager</div>
				<a class="nav-link collapsed" href="#" data-toggle="collapse"
					data-target="#collapseLayouts" aria-expanded="false"
					aria-controls="collapseLayouts"><div
						class="sb-nav-link-icon">
						<i class="fas fa-columns"></i>
					</div> Quản Lý Nội Dung
					<div class="sb-sidenav-collapse-arrow">
						<i class="fas fa-angle-down"></i>
					</div></a>
				<div class="collapse" id="collapseLayouts"
					aria-labelledby="headingOne" data-parent="#sidenavAccordion">
					<nav class="sb-sidenav-menu-nested nav">
						<a class="nav-link" href="quanly-table-danhsach-baiviet">Bài
							Viết</a>
					</nav>
				</div>
				<!-- sản phẩm  -->
				<a class="nav-link collapsed" href="#" data-toggle="collapse"
					data-target="#collapsePages" aria-expanded="false"
					aria-controls="collapsePages"><div
						class="sb-nav-link-icon">
						<i class="fas fa-book-open"></i>
					</div> Sản phẩm và Đơn hàng
					<div class="sb-sidenav-collapse-arrow">
						<i class="fas fa-angle-down"></i>
					</div></a>
				<div class="collapse" id="collapsePages"
					aria-labelledby="headingTwo" data-parent="#sidenavAccordion">
					<nav class="sb-sidenav-menu-nested nav accordion"
						id="sidenavAccordionPages">
						<a class="nav-link collapsed" href="#" data-toggle="collapse"
							data-target="#pagesCollapseAuth" aria-expanded="false"
							aria-controls="pagesCollapseAuth">SẢN PHẨM
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="pagesCollapseAuth"
							aria-labelledby="headingOne" data-parent="#sidenavAccordionPages">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href="http://localhost:8080/quanly-view-list-product">QUẢN LÝ SẢN PHẨM</a><a
									class="nav-link" href="#">QUẢN LÝ BẢO HÀNH</a><a
									class="nav-link" href="#">SẢN PHẨM CHỜ</a>
							</nav>
						</div>
						<a class="nav-link collapsed" href="#" data-toggle="collapse"
							data-target="#pagesCollapseError" aria-expanded="false"
							aria-controls="pagesCollapseError">QUẢN LÝ ĐƠN HÀNG
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="pagesCollapseError"
							aria-labelledby="headingOne" data-parent="#sidenavAccordionPages">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href="quanly">ĐANG CHỜ DUYỆT</a><a
									class="nav-link" href="quanly">QUẢN LÝ CHUNG</a><a
									class="nav-link" href="quanly">ĐƠN HÀNG TREO</a>
							</nav>
						</div>
					</nav>
				</div>
			</div>
		</div>
		<div class="sb-sidenav-footer">
			<div class="small">Quyền hạn cho:</div>
			Quản lý<br>
			 <a class="btn btn-sm btn-info" href="<c:url value="logform?action=logout"/>">Logout</a>
		</div>
	</nav>
</div>