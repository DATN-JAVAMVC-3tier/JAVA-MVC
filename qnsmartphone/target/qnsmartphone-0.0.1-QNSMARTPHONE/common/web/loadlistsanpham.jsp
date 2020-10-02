<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

						<div class="row" id="productlist">
<c:if test="${not empty listProduct}">
							<div class="col-lg-12 col-md-12 col-sm-12">
								<h3 class="main_title_left">
									<em></em>Top sản phẩm bán chạy nhất<span>Sản phẩm bán
										chạy nhất trong tháng</span>
								</h3>
							</div>
							
								<c:forEach items="${listProduct}" var="product">
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
												<a href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />
													" class="btn_shop"><span
														class="icon-basket"></span>
														<div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>
												</c:if>
												<c:if test="${product.soLuongCon >0}">
												<!-- <c:out value="AddCart?productCode=${product.ma_SanPham }"/> -->
												<a  class="btn_shop" onclick="addCard(<c:out value="${product.ma_SanPham }"/>)"><span
														class="icon-basket"></span>
														<div class="tool-tip">Thêm vào giỏ</div> </a>
												</c:if>
													 <a
														href="#" class="btn_shop"><span
														class="icon-heart-8"></span>
														<div class="tool-tip">Add to Fav</div> </a> <a
														href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />" class="btn_shop"><span
														class="icon-eye"></span>
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
													<a href="<c:url value="detail-product?productCode=${product.ma_SanPham}" />"><c:out
															value="${product.ten_SanPham}" /></a>
												</h3>
												<div class="price">
													<span class="offer"><fmt:formatNumber
															value="${(product.gia_Ban + product.gia_Ban*10/100)}"
															groupingUsed="true" /><sup>đ</sup></span>
													<fmt:formatNumber value="${product.gia_Ban}"
														groupingUsed="true" />
													<sup>đ</sup>
												</div>
											</div>
										</div>
									</div>
								
									<!--End Item-->
								</c:forEach>
							</c:if>

						</div>
						<c:if test="${not empty listProduct}">
						<div class="text-center">
							<button class="btn btn-sm btn-warning" id="loadmoreproduct">xem
								thêm 20 sản phẩm</button>
						</div>
						</c:if>
						<c:url var="APIurl" value="/api-get-sanpham" />
						<c:if test="${not empty listProduct}">
						 <c:set var = "maxRowItem" scope = "session" value = "${maxRow}"/>
						<script type="text/javascript" charset="utf-8" async defer>
							var flag = true;
							var select = 12;
							var currentPage = 0;
							var maxRowItem = ${maxRowItem};
							document.getElementById("loadmoreproduct").innerHTML = "xem thêm "+  select +" sản phẩm";
							document.getElementById("showresults").innerHTML = "Showing 1–"+ select +" of "+maxRowItem+" results";
							$('#loadmoreproduct').click(function (e) {
								
								if(flag){
									currentPage = ${listProduct.size()};
									flag = false;
								}else{
									currentPage = currentPage + select;
									if((currentPage + select) > (maxRowItem- select)){
										document.getElementById("loadmoreproduct").innerHTML = "xem thêm "+ (maxRowItem - currentPage - select) +" sản phẩm";
									}else{
										document.getElementById("loadmoreproduct").innerHTML = "xem thêm "+  select +" sản phẩm";
									}
									if((maxRowItem - currentPage - select) < 0){
										document.getElementById("loadmoreproduct").style.display = "none";
									}
								}			
								e.preventDefault();
								var data = {};
								data["currentItem"] = currentPage;
								data["selectItem"] = select;
								loadAPIGetSanPham(data);
								document.getElementById("showresults").innerHTML = "Showing 1–"+ (currentPage + select) +" of "+maxRowItem+" results";
								
							});
							function loadAPIGetSanPham(data) {
								$.ajax({
											// URL gửi data
											url:'http://localhost:8080/api-get-sanpham',
											// type phương thức gửi get POST DELETE PUT
											type: 'POST',
											// Dữ liệu chuyển kiểu JSON
											contentType: 'application/json',
											// đang là scriptObject phải có bộ chuyển sang json như này
											data: JSON.stringify(data),
											//server trả về 1 json cho clien
											dataType: 'json',
											// thành công sẽ chạy cái này: check result
											success : function(result) {
												for (i = 0; i < result.length; i++) {
													var vote ="";
													for(j = 1; j <= 5; j++){
														if(result[i].diemDanhGia >= j){
															vote = vote + '<i class="icon-star voted"></i>';
														}else{
															vote = vote + '<i class="icon-star-empty"></i>';
														}
													}
													var addtocarttext = '';
													if (result[i].soLuongCon <=0) {
														addtocarttext = '<a href="detail-product?productCode='+result[i].ma_SanPham+'" class="btn_shop"><span class="icon-basket"></span><div class="tool-tip">Hết hàng. Xem sản phẩm</div> </a>'	
													}else{
														addtocarttext = '<a onclick="addCard('+result[i].ma_SanPham+')" class="btn_shop"><span class="icon-basket"></span><div class="tool-tip">Thêm vào giỏ</div> </a>'
													}
													
													$("#productlist").html(document.getElementById("productlist").innerHTML + '<!-- item --><div class="shop-item col-lg-3 col-md-6 col-sm-6"><div class="inner-box"><div class="image-box"><figure class="image"><a href="detail-product?productCode='+ result[i].ma_SanPham +'"><img src="template/web/img/products/'+ result[i].images +'" alt="'+ result[i].ten_SanPham +'"></a> </figure><div class="item-options clearfix">'+addtocarttext +' <a href="#" class="btn_shop"><span class="icon-heart-8"></span><div class="tool-tip">Add to Fav</div> </a> <a href="detail-product?productCode='+ result[i].ma_SanPham +'" class="btn_shop"><span class="icon-eye"></span><div class="tool-tip">View</div> </a></div></div><div class="product_description"><div class="rating">' + vote + '</div><h3><a href="detail-product?productCode='+ result[i].ma_SanPham +'">'+ result[i].ten_SanPham +'</a></h3><div class="price"><span class="offer">'+ result[i].gia_Ban.toLocaleString('it-IT') +'<sup>đ</sup></span><br>'+ result[i].gia_Ban.toLocaleString('it-IT') +'<sup>đ</sup></div></div></div></div><!--End Item-->');
												}
												console.log(result);
											},
											// thất bại sẽ chạy cái này:check error
											error : function(error) {
												console.log(error);
											}
										});
							}
						</script>
						<hr>
						</c:if>
						