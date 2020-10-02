<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp"%>
 <main>
		<div class="container margin_60_35">
			<%@include file="/common/web/searchdonhang.jsp" %>
			<div class="cart-section">
				<form id="updatecart">
				<table class="table text-white cart-list shopping-cart">
					<thead>
						<tr style="color:#fff;">
							<th>
								Product
							</th>
							<th>
								Price
							</th>
							<th>
								Quantity
							</th>
							<th>
								Total
							</th>
							<th>
								Remove
							</th>
						</tr>
					</thead>
					<tbody style="color: #333;">
					<c:if test="${not empty listProductCarts}">
					<c:set var="i" scope="session"  value="0"/>
					<c:forEach items="${listProductCarts }" var="itemCarts">
					<tr>
							<td>
								<div class="thumb_cart">
									<a href="#"><img src="template/web/img/products/<c:out value="${itemCarts.images}" />" alt="">
									</a>
								</div>
								<strong class="item_cart"><c:out value="${itemCarts.ten_SanPham }"/></strong>
							</td>
							<td>
								<strong><fmt:formatNumber value="${itemCarts.gia_Ban}"
														groupingUsed="true" /><sup>đ</sup></strong>
							</td>
							<td>
								<div class="numbers-row">
									<input type="text" value="<c:out value="${itemCarts.quantityProduct }"/>" min="1" max="5" required="required" id="quantity_1" class="qty2 form-control" name="${i}">
								</div>
							</td>
							<td>
								<strong><fmt:formatNumber value="${itemCarts.gia_Ban}"
														groupingUsed="true" /><sup>đ</sup></strong>
							</td>
							<td class="options">
								<a href="DeleteItem?productCode=<c:out value="${itemCarts.ma_SanPham }"/>"><i class=" icon-trash"></i></a>
							</td>
						</tr>
						<c:set var="i" scope="session"  value="${i+1}"/>
					</c:forEach>
					</c:if>
					<c:if test="${empty listProductCarts}">	
					
						<tr style="text-align: center;">
							<td colspan="5">
								<span style="color:#da7227;text-align: center;"><i>Bạn chưa có sản phẩm nào trong giỏ hàng</i></span>
							</td>
						</tr>
						</c:if>
					</tbody>
				</table>
				<c:if test="${not empty listProductCarts}">	
				<div class="cart-options clearfix">
					<div class="pull-left">
						<div class="apply-coupon">
							<div class="form-group">
								<input type="text"   value="" placeholder="Nhập Mã giảm giá" class="form-control">
							</div>
							<div class="form-group">
								<button type="button" class="btn_cart_outine">Sử dụng mã giảm giá</button>
							</div>
						</div>
					</div>
					<div class="pull-right fix_mobile">
						<button type="button" class="btn_cart_outine" id="btnupdatecart">Update Cart</button>
					</div>
				</div>
				</form>
				<script type="text/javascript">
					$('#btnupdatecart').click(function (e) {
					e.preventDefault();
					var formData = $('#updatecart').serializeArray();
					var strings = "";
					var i = 0;
					$.each(formData,function(idex,vlue){
						if(i==0)
						strings = strings + vlue.name +'='+vlue.value ;
						else
							strings = strings +'&'+ vlue.name +'='+vlue.value ;	
						i++;
					});
					window.location.replace('UpdateCart?'+strings);
					console.log(strings);
					});
				</script>
				<div class="row">
					<div class="column pull-right col-md-4 col-sm-6 col-xs-12">
						<ul class="totals-table">
						<c:set var="total" scope="session"  value="0"/>
						<c:forEach items="${listProductCarts }" var="itemCarts">
							<c:set var="total" scope="session"  value="${total + (itemCarts.gia_Ban * itemCarts.quantityProduct)}"/>
							
						</c:forEach>
						
							<li class="clearfix"><span class="col">Sub Total</span><span class="col"><fmt:formatNumber value="${(total + total *10/100)}"
														groupingUsed="true" /><sup>đ</sup></span>
							</li>
							<li class="clearfix total"><span class="col">Order Total</span><span class="col"><fmt:formatNumber value="${total}"
														groupingUsed="true" /><sup>đ</sup></span>
							</li>
						
						</ul>
						<a href="CheckOut" class="btn_full">Proceed to Checkout <i class="icon-left"></i></a>
					</div>
				</div>
				</c:if>
			</div>
		
		</div><!--/container-->
	</main><!--/main-->
	