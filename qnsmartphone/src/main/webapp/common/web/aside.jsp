<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<aside class="sidebar">
	<div class="widget">
		<div id="custom-search-input-shop">
		<form role="search" action="trang-chu" id="searchform" method="get">
			<div class="input-group col-md-12">
			
				<input value="search" name="action" hidden/>
				<input type="search" class="form-control input-lg" style="color: #da7227;"
					placeholder="Search" name="keyword" /> <span class="input-group-btn">
					<button class="btn btn-info btn-lg" type="submit">
						<i class="icon-search-1"></i>
					</button>
				</span>
			
			</div></form>
		</div>
	</div>
	<!-- End Search -->
	<hr>
	<div class="widget" id="cat_shop">
		<h4 style="background: #00dbdb; padding: 8px;">Danh mục</h4>
		<ul>
			<li><a href="#">Sản phẩm mới ra mắt</a></li>
			<li><a href="#">Sản phẩm cũ</a></li>
			<li><a href="trang-chu?action=thuonghieu&keyword=Vsmart">Vsmart</a></li>
			<li><a href="trang-chu?action=thuonghieu&keyword=Bphone">Bphone</a></li>
		</ul>
	</div>
	<!-- End widget -->
	<hr>

	<div class="widget related-products">
		<h4 style="background: #00dbdb; padding: 8px;">Xem nhiều</h4>
		<c:if test="${not empty sameTagProduct }">
			<c:forEach var="product" items="${sameTagProduct }">
				<div class="post">
					<figure class="post-thumb">
						<a
							href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><img
							src="template/web/img/products/<c:out value="${product.images}" />"
							alt=""></a>
					</figure>
					<h5>
						<a
							href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
								value="${product.ten_SanPham}" /></a>
					</h5>
					<div class="rating">
						<i class="icon-star voted"></i><i class="icon-star voted"></i><i
							class="icon-star voted"></i><i class="icon-star voted"></i><i
							class="icon-star-empty"></i>
					</div>
					<div class="price">
						<fmt:formatNumber
							value="${(product.gia_Ban + product.gia_Ban*10/100)}"
							groupingUsed="true" />
						<sup>đ</sup>
					</div>
				</div>
			</c:forEach>
		</c:if>

	</div>
</aside>