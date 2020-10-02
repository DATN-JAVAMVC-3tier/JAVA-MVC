<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<header>
	<a href='#top' id="top"></a>
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header-wp">
				<div class="navbar-header">
					<a class="cmn-toggle-switch cmn-toggle-switch__htx"
						href="javascript:void(0);" data-toggle="collapse"
						data-target="#navbar"><span>Menu mobile</span></a>
					<div id="logo_home">
						<h1>
							<a href="trang-chu" title="Trang Chủ">QN-Smart phone</a>
						</h1>
					</div>
					<div id="top_nav">
						<ul>

							<c:if test="${not empty NGUOIDUNGMODEL}">
								<!-- user icon https://i.imgur.com/UdTz6QR.png  <i
										class="icon-user"></i>-->
								<li><a href="#0" class="aside-panel-bt "><img
										class="nav-img-user"
										src="template/web/img/user/user-default1.png" /></a></li>
								<!-- my cart 
								<li><a href="mycart" class="cart_anchor"><i
										class="icon_bag_alt"></i><span class="cart_count">3</span></a></li>
								
								<li><a href="#0" class="search-overlay-menu-btn"><i
										class="icon_search"></i></a></li>
								-->
							</c:if>

							<c:if test="${empty NGUOIDUNGMODEL}">
								<!-- login icon -->
								<li><a href="#0" class="aside-panel-bt"><i
										class="icon_lock_alt"></i></a></li>
							</c:if>
							<!-- my cart -->
							<li><a href="mycart" class="cart_anchor" ><i
									class="icon_bag_alt"></i><span class="cart_count" id = "setcartcount"> <c:if
											test="${not empty listProductCarts }">
											<c:out value="${listProductCarts.size() }" />
										</c:if> <c:if test="${empty listProductCarts }">
											<c:out value="0" />
										</c:if>
								</span></a></li>
							<!-- anotation -->
							<li><a href="#0" class="" title="Không có thông báo mới"><i
									class=" icon-bell"></i><span class="cart_count">0</span></a></li>
							<!-- search -->
							<li><a href="#0" class="search-overlay-menu-btn"><i
									class="icon_search"></i></a></li>
						</ul>
					</div>
					<!--/top_nav-->
				</div>
				<!--/navbar-header-->
			</div>
			<!--/navbar-header-wp-->

			<div class="collapse navbar-collapse navbar-right" id="navbar">
				<ul class="nav navbar-nav">
					<li class="dropdown mega "><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">ĐIỆN THOẠI</a>
						<ul class="dropdown-menu">
							<li class="container">
								<div class="row">
									<div class="col-md-3">
										<h5>THƯƠNG HIỆU</h5>
										<ul class="list">
											<li><a href="trang-chu?action=thuonghieu&keyword=Google">GOOGLE
													PIXEL</a></li>
											<li><a href="trang-chu?action=thuonghieu&keyword=Samsung">SAMSUNG</a></li>
											<li><a href="trang-chu?action=thuonghieu&keyword=Apple">APPLE</a></li>
											<li><a href="trang-chu?action=thuonghieu&keyword=Xiaomi">XIAOMI</a></li>
											<li><a href="trang-chu?action=thuonghieu&keyword=Sony">SONY</a></li>
											<li><a href="trang-chu?action=thuonghieu&keyword=Vsmart">VSMART</a></li>
											<li><a href="trang-chu?action=thuonghieu&keyword=Bphone">BKAV</a></li>
										</ul>
									</div>
									<div class="col-md-3">
										<h5>GIÁ BÁN</h5>
										<ul class="list">
											<li><a href="trang-chu?action=giaban&tu=0&den=1">Từ 0 - 1
													triệu</a></li>
											<li><a href="trang-chu?action=giaban&tu=1&den=3">Từ 1 - 3
													triệu</a></li>
											<li><a href="trang-chu?action=giaban&tu=3&den=5">Từ 3 - 5
													triệu</a></li>
											<li><a href="trang-chu?action=giaban&tu=5&den=7">Từ 5 - 7
													triệu</a></li>
											<li><a href="trang-chu?action=giaban&tu=7&den=10">Từ 7 - 10
													triệu</a></li>
											<li><a href="trang-chu?action=giaban&tu=10&den=1000">&gt; 10
													triệu</a></li>
										</ul>
									</div>
									<div class="col-md-3">
										<h5>LOẠI MÁY</h5>
										<ul class="list">
											<li><a href="#">Máy cũ</a></li>
											<li><a href="#">Like new</a></li>
											<li><a href="#">Máy lock</a></li>
											<li><a href="#">Máy xách tay</a></li>
											<li><a href="#">New 100% fullbox</a></li>
										</ul>
									</div>
									<div class="col-md-3">
										<h5>Nhu cầu</h5>
										<ul class="list no-divider">
											<li><a href="#">Chụp ảnh</a></li>
											<li><a href="#">Chơi game</a></li>
											<li><a href="#">Bảo mật</a></li>
										</ul>
									</div>
								</div>
							</li>
						</ul></li>
					<li><a href="trang-chu?action=thuonghieu&keyword=Vsmart">VSMART</a></li>
					<li><a href="trang-chu?action=thuonghieu&keyword=Bphone">BPHONE</a></li>
					<li><a href="trang-chu?action=thuonghieu&keyword=Apple">APPLE</a></li>
					<li><a href="trang-chu?action=thuonghieu&keyword=Samsung">SAMSUNG</a></li>
					<li><a href="trang-chu?action=thuonghieu&keyword=Xiaomi">XIAOMI</a></li>
					<li><a href="about.html">BẢO HÀNH</a></li>
					<li class="dropdown mega"><a>THÔNG TIN KHÁC
							<ul class="dropdown-menu">
								<li class="container">
									<div class="row">
										<div class="col-md-8">
											<h5>TRA CỨU ĐƠN HÀNG</h5>
											<ul class="list">
												<li>
													<form action="detailOrder" method="GET">
														<div class="row">
															<div class="col-md-8 col-sm-8">
																<div class="form-group">
																	<label>Mã đơn hàng: <i>vd: mã đơn hàng, số
																			điện thoại hoặc email đặt hàng</i></label> <input type="text"
																		class="form-control styled" name="timkiem"
																		style="color: #fff;"
																		placeholder=" Nhập mã đơn hàng, số điện thoại hoặc email đặt hàng">
																</div>
															</div>
															<div class="col-md-4 col-sm-4">
																<div class="form-group">
																	<input type="submit" class="btn_1" value="Tra cứu"
																		id="submit-contact">
																</div>
															</div>
														</div>
													</form>
												</li>

											</ul>
										</div>
										<div class="col-md-4">
											<h5>KHÁC</h5>
											<ul class="list">
												<li><a href="detailOrder?action=history">Lịch sử mua hàng</a></li>
												<li><a href="contacts">Thông tin liên hệ</a></li>
												<li><a href="#">Hướng dẫn mua hàng</a></li>
												<li><a href="contacts">Phản hồi, đóng góp ý kiến</a></li>

											</ul>
										</div>
									</div>
								</li>
							</ul>
					</a></li>
				</ul>

			</div>
		</div>

	</nav>
	<!-- /Nav -->

</header>
<!-- /Header -->
