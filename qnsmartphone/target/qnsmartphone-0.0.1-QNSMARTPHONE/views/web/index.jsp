<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title><dec:title default="QN-SmartPhone" />QN-SmartPhone</title>
</head>
<body>

	<div id="position">
		<div class="container">
			<ul>
				<li><a href="#">Trang chủ</a></li>
				<li><a href="#">Sản phẩm</a></li>
			</ul>
		</div>
	</div>
	<!-- /position -->
<div class="ctdhmesage"></div>
	<main>
		<div class="container margin_60_35">
			<div class="row">
				<div class="col-md-9">
					<div class="shop-section">
						<div class="items-sorting">
							<div class="row nav-sort">
								<div class="col-xs-6">
									<div class="results_shop" id="showresults"></div>
								</div>
								<form action="trang-chu" method="POST" class="col-xs-6">
								<input type="hidden" name="action" value="sort">
									<div class="form-group">
										<input style=" background-color: #f2f2f2; color: #da7227; height: 34px; box-sizing: border-box;" type="submit" value="Áp dụng"/>
									</div>
									<div class="form-group">
										<select name="sort-by-gia" style=" background-color: #fff; color: #da7227; ">
											<option value="0-3" <c:if test="${ choosegia == '0-3'}">selected</c:if>>3triệu
											<option value="3-6" <c:if test="${ choosegia == '3-6'}">selected</c:if>>từ 3-6 triệu</option>
											<option value="6-10" <c:if test="${ choosegia == '6-10'}">selected</c:if>>từ 6-10 triệu</option>
											<option value="10-1000" <c:if test="${ choosegia == '10-1000'}">selected</c:if>>trên 10 triệu</option>
										</select>
									</div>
									<div class="form-group">
										<select name="sort-by-orderby" style=" background-color: #fff; color: #da7227; ">
											<option value="asc" <c:if test="${ chooseorderby == 'asc'}">selected</c:if>>tăng dần</option>
											<option value="desc" <c:if test="${ chooseorderby == 'desc'}">selected</c:if>>giảm dần</option>
										</select>
									</div>
								</form>
							</div>
						</div>
						<!--End Sort By-->
						<!-- load list san pham -->
						<%@include file="/common/web/loadlistsanphamsort.jsp" %>
						<%@include file="/common/web/loadlistsanphamssearchinput.jsp" %>
						<%@include file="/common/web/loadlistsanphamssearch.jsp" %>
						<%@include file="/common/web/loadlistsanpham.jsp" %>
						<%@include file="/common/web/loadlistsanphams.jsp" %>
						<!-- End pagination-->
					</div>
					<!-- End row -->
				</div>
				<!-- End col -->

				<!--Sidebar-->
				<div class="col-md-3">
					<%@ include file="/common/web/aside.jsp"%>
				</div>
				<!--/Sidebar-->
			</div>
			<!--/row-->
		</div>
		<!--/container-->
	</main>
	<!--/main-->
	<main>
		<div class="container margin_60_35">
			<h3 class="main_title_left " style="border-top: solid 2px red;  ">
				<em></em>Tin Tức Khuyến Mãi<span>Giảm giá cực sốc</span>
			</h3>
			<div class="owl-carousel owl-theme case_studies add_bottom_30">

				<div>
					<a href="project-detail.html" title="Social Media Promotion">
						<figure>
							<img src="template/web/img/khuyenmai/km-ss.png" alt="">
						</figure>
						<h4>Tháng vàng Samsung không lo về giá</h4>
						<p>Giảm đến 1.200.000<sup>đ</sup></p>
					</a>
				</div>

				<div>
					<a href="project-detail.html" title="Project Conversion">
						<figure>
							<img src="template/web/img/khuyenmai/km-daidienbai-viet-chinhanh-và-note-10_optimized-1-2.png" alt="">
						</figure>
						<h4>Xã hàng cực sốc</h4>
						<p>Giảm đến 300k</p>
					</a>
				</div>

				<div>
					<a href="project-detail.html" title="Project Marketing">
						<figure>
							<img src="template/web/img/khuyenmai/km-sanhangsieure.png" alt="">
						</figure>
						<h4>[Giờ vàng]Săn hàng siêu rẻ</h4>
						<p>từ 14h-17h30 các ngày trong tuần</p>
					</a>
				</div>

				<div>
					<a href="project-detail.html" title="Project Marketing">
						<figure>
							<img src="template/web/img/khuyenmai/km-Xa-hang-gia-tot-2.png" alt="">
						</figure>
						<h4>Hàng cũ giá tốt</h4>
						<p>tiếp kiện lên đến 40%</p>
					</a>
				</div>

				<div>
					<a href="project-detail.html" title="Project Pay Per Click">
						<figure>
							<img src="template/web/img/khuyenmai/km-Xa-hang-gia-tot-1.png" alt="">
						</figure>
						<h4>Thấp nhất thị trường</h4>
						<p>Các sản phẩm được hạ giá cực nhiều</p>
					</a>
				</div>

			</div>
			<!--/case_studies -->
		</div>
		<!--/container-->

		<div class="bg_white">
			<div class="container margin_60_0">
				<div class="row">
					<div class="col-md-5">
						<h3 class="main_title_left">
							<em></em>QN-SMARTPHONE<span>#</span>
						</h3>
						<p class="lead styled">QN-SMARTPHONE là hệ thống kinh doanh nhượng quyền bán lẻ Smartphone, Phụ kiện chính hãng và sửa chữa dịch vụ, là đối tác của các hãng điện thoại chính hãng lớn tại Việt Nam như: Apple, Samsung, Oppo, Realme, Vivo, VSmart, Xiaomi, Asus…</p>
						<ul class="list_ok">
							<li>
								<h4>Sứ mệnh:</h4>
								<p>Chúng tôi lấy khách hàng làm trung tâm, lấy tổ chức chức chuyên nghiệp làm sức mạnh cạnh tranh, không ngừng nỗ lực cung cấp những sản phẩm, dịch vụ giá trị mới, chất lượng cao với giá hợp lý để đóng góp vào mục tiêu nâng cao chất lượng cuộc sống thông tin.</p>
							</li>
							<li>
								<h4>Tầm nhìn:</h4>
								<p>Trở thành một công ty hàng đầu cung cấp sản phẩm, dịch vụ các thế hệ Di Động Thông Minh trong đó lấy chất lượng phục vụ khách hàng làm sự phát triển bền vững.</p>
							</li>
							<li>
								<h4>Giá trị doanh nghiệp nằm ở khách hàng </h4>
								<p>Giá trị doanh nghiệp nằm ở khách hàng, kết nối khách hàng thành một xã hội và phục vụ xã hội này với những năng lực, tư duy luôn đổi mới. Mỗi khách hàng là một hạt nhân quan trọng trên bước đường cóp nhặt thành công của công ty. Toàn thể từ lãnh đạo đến nhân viên trước khách hàng luôn phải thể hiện trong vai trò người phục vụ: tận tụy, lắng nghe và đưa ra giải pháp tốt nhất.</p>
							</li>
						</ul>
					</div>
					<div class="col-md-6 col-md-offset-1 hidden-sm hidden-xs">
						<img src="template/web/img/QN-team.jpg" alt="QNSMARTPHONE TEAM" class="img-responsive">
					</div>
				</div>
				<!--/row-->
			</div>
			<!--/container-->
		</div>
		<!--/bg_white-->
	</main>
	<!--/main-->







<%@include file="/common/web/js-add-to-cart.jsp" %>








</body>
</html>