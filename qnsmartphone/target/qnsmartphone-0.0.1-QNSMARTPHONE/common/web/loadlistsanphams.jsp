<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!-- Vsmart -->
<c:if test="${not empty Vsmarts}">
	<div class="row" >

		<div class="col-lg-12 col-md-12 col-sm-12">
			<h3 class="main_title_left">
				<em></em>
				<c:out value="${Vsmarts[0].thuongHieu }" />
				<span>Các sản phẩm mới nhất của <c:out
						value="${Vsmarts[0].thuongHieu }" /></span>
			</h3>
		</div>
		<c:forEach items="${Vsmarts}" var="product">
			<!-- item -->
			<div class="shop-item col-lg-3 col-md-6 col-sm-6">
				<div class="inner-box">
					<div class="image-box">
						<figure class="image">
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
								src="template/web/img/products/<c:out value="${product.images}" />"
								alt=""></a>
						</figure>
						<div class="item-options clearfix">
							<c:if test="${product.soLuongCon <=0}">
								<a
									href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
							</c:if>
							<c:if test="${product.soLuongCon >0}">
								<a
									href="<c:out value="AddCart?productCode=${product.ma_SanPham }"/>
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Thêm vào giỏ</div> </a>
							</c:if>
							<a href="#" class="btn_shop"><span class="icon-heart-8"></span>
								<div class="tool-tip">Add to Fav</div> </a> <a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"
								class="btn_shop"><span class="icon-eye"></span>
								<div class="tool-tip">View</div> </a>
						</div>
					</div>
					<div class="product_description">
						<div class="rating">
							<i class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star-empty"></i>
						</div>
						<h3>
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
									value="${product.ten_SanPham}" /></a>
						</h3>
						<div class="price">
							<span class="offer"><fmt:formatNumber
									value="${(product.gia_Ban + product.gia_Ban*10/100)}"
									groupingUsed="true" /><sup>đ</sup></span>
							<fmt:formatNumber value="${product.gia_Ban}" groupingUsed="true" />
							<sup>đ</sup>
						</div>
					</div>
				</div>
			</div>

			<!--End Item-->
		</c:forEach>

	</div>
	<hr>
</c:if><!-- end Vsmart -->
<!-- Bphones -->
<c:if test="${not empty Bphones}">
	<div class="row" id="productlist">

		<div class="col-lg-12 col-md-12 col-sm-12">
			<h3 class="main_title_left">
				<em></em>
				<c:out value="${Bphones[0].thuongHieu }" />
				<span>Các sản phẩm mới nhất của <c:out
						value="${Bphones[0].thuongHieu }" /></span>
			</h3>
		</div>
		<c:forEach items="${Bphones}" var="product">
			<!-- item -->
			<div class="shop-item col-lg-3 col-md-6 col-sm-6">
				<div class="inner-box">
					<div class="image-box">
						<figure class="image">
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
								src="template/web/img/products/<c:out value="${product.images}" />"
								alt=""></a>
						</figure>
						<div class="item-options clearfix">
							<c:if test="${product.soLuongCon <=0}">
								<a
									href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
							</c:if>
							<c:if test="${product.soLuongCon >0}">
								<a
									href="<c:out value="AddCart?productCode=${product.ma_SanPham }"/>
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Thêm vào giỏ</div> </a>
							</c:if>
							<a href="#" class="btn_shop"><span class="icon-heart-8"></span>
								<div class="tool-tip">Add to Fav</div> </a> <a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"
								class="btn_shop"><span class="icon-eye"></span>
								<div class="tool-tip">View</div> </a>
						</div>
					</div>
					<div class="product_description">
						<div class="rating">
							<i class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star-empty"></i>
						</div>
						<h3>
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
									value="${product.ten_SanPham}" /></a>
						</h3>
						<div class="price">
							<span class="offer"><fmt:formatNumber
									value="${(product.gia_Ban + product.gia_Ban*10/100)}"
									groupingUsed="true" /><sup>đ</sup></span>
							<fmt:formatNumber value="${product.gia_Ban}" groupingUsed="true" />
							<sup>đ</sup>
						</div>
					</div>
				</div>
			</div>

			<!--End Item-->
		</c:forEach>

	</div>
	<hr>
</c:if><!-- end BKav -->
<!-- Google -->
<c:if test="${not empty Googles}">
	<div class="row" id="productlist">

		<div class="col-lg-12 col-md-12 col-sm-12">
			<h3 class="main_title_left">
				<em></em>
				<c:out value="${Googles[0].thuongHieu }" />
				<span>Các sản phẩm mới nhất của <c:out
						value="${Googles[0].thuongHieu }" /></span>
			</h3>
		</div>
		<c:forEach items="${Googles}" var="product">
			<!-- item -->
			<div class="shop-item col-lg-3 col-md-6 col-sm-6">
				<div class="inner-box">
					<div class="image-box">
						<figure class="image">
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
								src="template/web/img/products/<c:out value="${product.images}" />"
								alt=""></a>
						</figure>
						<div class="item-options clearfix">
							<c:if test="${product.soLuongCon <=0}">
								<a
									href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
							</c:if>
							<c:if test="${product.soLuongCon >0}">
								<a
									href="<c:out value="AddCart?productCode=${product.ma_SanPham }"/>
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Thêm vào giỏ</div> </a>
							</c:if>
							<a href="#" class="btn_shop"><span class="icon-heart-8"></span>
								<div class="tool-tip">Add to Fav</div> </a> <a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"
								class="btn_shop"><span class="icon-eye"></span>
								<div class="tool-tip">View</div> </a>
						</div>
					</div>
					<div class="product_description">
						<div class="rating">
							<i class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star-empty"></i>
						</div>
						<h3>
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
									value="${product.ten_SanPham}" /></a>
						</h3>
						<div class="price">
							<span class="offer"><fmt:formatNumber
									value="${(product.gia_Ban + product.gia_Ban*10/100)}"
									groupingUsed="true" /><sup>đ</sup></span>
							<fmt:formatNumber value="${product.gia_Ban}" groupingUsed="true" />
							<sup>đ</sup>
						</div>
					</div>
				</div>
			</div>

			<!--End Item-->
		</c:forEach>

	</div>
	<hr>
</c:if>
<!-- end google -->
<!-- Apples -->
<c:if test="${not empty Apples}">
	<div class="row" id="productlist">

		<div class="col-lg-12 col-md-12 col-sm-12">
			<h3 class="main_title_left">
				<em></em>
				<c:out value="${Apples[0].thuongHieu }" />
				<span>Các sản phẩm mới nhất của <c:out
						value="${Apples[0].thuongHieu }" /></span>
			</h3>
		</div>
		<c:forEach items="${Apples}" var="product">
			<!-- item -->
			<div class="shop-item col-lg-3 col-md-6 col-sm-6">
				<div class="inner-box">
					<div class="image-box">
						<figure class="image">
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
								src="template/web/img/products/<c:out value="${product.images}" />"
								alt=""></a>
						</figure>
						<div class="item-options clearfix">
							<c:if test="${product.soLuongCon <=0}">
								<a
									href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
							</c:if>
							<c:if test="${product.soLuongCon >0}">
								<a
									href="<c:out value="AddCart?productCode=${product.ma_SanPham }"/>
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Thêm vào giỏ</div> </a>
							</c:if>
							<a href="#" class="btn_shop"><span class="icon-heart-8"></span>
								<div class="tool-tip">Add to Fav</div> </a> <a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"
								class="btn_shop"><span class="icon-eye"></span>
								<div class="tool-tip">View</div> </a>
						</div>
					</div>
					<div class="product_description">
						<div class="rating">
							<i class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star-empty"></i>
						</div>
						<h3>
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
									value="${product.ten_SanPham}" /></a>
						</h3>
						<div class="price">
							<span class="offer"><fmt:formatNumber
									value="${(product.gia_Ban + product.gia_Ban*10/100)}"
									groupingUsed="true" /><sup>đ</sup></span>
							<fmt:formatNumber value="${product.gia_Ban}" groupingUsed="true" />
							<sup>đ</sup>
						</div>
					</div>
				</div>
			</div>

			<!--End Item-->
		</c:forEach>

	</div>
	<hr>
</c:if>
<!-- end apple -->
<!-- Samsungs -->
<c:if test="${not empty Samsungs}">
	<div class="row" id="productlist">
		<div class="col-lg-12 col-md-12 col-sm-12">
			<h3 class="main_title_left">
				<em></em>
				<c:out value="${Samsungs[0].thuongHieu }" />
				<span>Các sản phẩm mới nhất của <c:out
						value="${Samsungs[0].thuongHieu }" /></span>
			</h3>
		</div>
		<c:forEach items="${Samsungs}" var="product">
			<!-- item -->
			<div class="shop-item col-lg-3 col-md-6 col-sm-6">
				<div class="inner-box">
					<div class="image-box">
						<figure class="image">
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
								src="template/web/img/products/<c:out value="${product.images}" />"
								alt=""></a>
						</figure>
						<div class="item-options clearfix">
							<c:if test="${product.soLuongCon <=0}">
								<a
									href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
							</c:if>
							<c:if test="${product.soLuongCon >0}">
								<a
									href="<c:out value="AddCart?productCode=${product.ma_SanPham }"/>
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Thêm vào giỏ</div> </a>
							</c:if>
							<a href="#" class="btn_shop"><span class="icon-heart-8"></span>
								<div class="tool-tip">Add to Fav</div> </a> <a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"
								class="btn_shop"><span class="icon-eye"></span>
								<div class="tool-tip">View</div> </a>
						</div>
					</div>
					<div class="product_description">
						<div class="rating">
							<i class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star-empty"></i>
						</div>
						<h3>
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
									value="${product.ten_SanPham}" /></a>
						</h3>
						<div class="price">
							<span class="offer"><fmt:formatNumber
									value="${(product.gia_Ban + product.gia_Ban*10/100)}"
									groupingUsed="true" /><sup>đ</sup></span>
							<fmt:formatNumber value="${product.gia_Ban}" groupingUsed="true" />
							<sup>đ</sup>
						</div>
					</div>
				</div>
			</div>

			<!--End Item-->
		</c:forEach>

	</div>
	<hr>
</c:if>
<!-- end samsung -->
<!-- Xiaomis -->
<c:if test="${not empty Xiaomis}">
	<div class="row" id="productlist">

		<div class="col-lg-12 col-md-12 col-sm-12">
			<h3 class="main_title_left">
				<em></em>
				<c:out value="${Xiaomis[0].thuongHieu }" />
				<span>Các sản phẩm mới nhất của <c:out
						value="${Xiaomis[0].thuongHieu }" /></span>
			</h3>
		</div>
		<c:forEach items="${Xiaomis}" var="product">
			<!-- item -->
			<div class="shop-item col-lg-3 col-md-6 col-sm-6">
				<div class="inner-box">
					<div class="image-box">
						<figure class="image">
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
								src="template/web/img/products/<c:out value="${product.images}" />"
								alt=""></a>
						</figure>
						<div class="item-options clearfix">
							<c:if test="${product.soLuongCon <=0}">
								<a
									href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
							</c:if>
							<c:if test="${product.soLuongCon >0}">
								<a
									href="<c:out value="AddCart?productCode=${product.ma_SanPham }"/>
													"
									class="btn_shop"><span class="icon-basket"></span>
									<div class="tool-tip">Thêm vào giỏ</div> </a>
							</c:if>
							<a href="#" class="btn_shop"><span class="icon-heart-8"></span>
								<div class="tool-tip">Add to Fav</div> </a> <a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"
								class="btn_shop"><span class="icon-eye"></span>
								<div class="tool-tip">View</div> </a>
						</div>
					</div>
					<div class="product_description">
						<div class="rating">
							<i class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star voted"></i><i class="icon-star voted"></i><i
								class="icon-star-empty"></i>
						</div>
						<h3>
							<a
								href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
									value="${product.ten_SanPham}" /></a>
						</h3>
						<div class="price">
							<span class="offer"><fmt:formatNumber
									value="${(product.gia_Ban + product.gia_Ban*10/100)}"
									groupingUsed="true" /><sup>đ</sup></span>
							<fmt:formatNumber value="${product.gia_Ban}" groupingUsed="true" />
							<sup>đ</sup>
						</div>
					</div>
				</div>
			</div>

			<!--End Item-->
		</c:forEach>

	</div>
	<hr>
</c:if>
<!-- end xiaomi -->
