<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<c:if test="${empty listProductCarts}">
	<c:redirect url="http://localhost:8080/mycart"/>
</c:if>
<div class="ctdhmesage"></div>
<main>
	<div class="container margin_60_35">
		<div class="checkout-page">

			<ul class="default-links">
				<li style="color: #fff;">Đặt hàng bằng tài khoản khác? <a
					href="#">Nhấn vào đây để đăng nhập </a></li>
			</ul>

			<div class="row">
				<div class="col-md-7 col-sm-12 col-xs-12">

					<div class="billing-details">
						<div class="shop-form">
							<form id="data">
								<div class="default-title text-center" >
									<b><h3 style="color:#fff;">CHI TIẾT ĐƠN HÀNG</h3></b>
								</div>
								<div class="row"  >
									<div class="form-group col-md-12 col-sm-12 col-xs-12">
										<label>Họ và Tên<sup>*</sup></label> <input type="text" style="color:#fff;"
											name="hoVaTen" value="<c:out value="${NGUOIDUNGMODEL.hoVaTen }"/>" placeholder=" Họ và tên" id="hvt"
											class="form-control">
									</div>
																
									<div class="form-group col-md-6 col-sm-6 col-xs-12">
										<label>Email <sup>*</sup></label> <input type="email" style="color:#fff;"
											name="email" value="<c:out value="${NGUOIDUNGMODEL.email }"/>" placeholder="jhon@gmail.com" id="eml"
											class="form-control" required="required">
									</div>
									<div class="form-group col-md-6 col-sm-6 col-xs-12">
										<label>Số điện thoại <sup>*</sup></label> <input type="text" style="color:#fff;"
											name="soDienThoai" value="<c:out value="${NGUOIDUNGMODEL.soDienThoai }"/>" placeholder="0912345678" id="ph"
											class="form-control">
									</div>
									<div class="form-group col-md-12 col-sm-12 col-xs-12">
										<label>Địa chỉ nhận <sup>*</sup></label> <input type="text" id="dc" style="color:#fff;"
											name="diaChi" value="<c:out value="${NGUOIDUNGMODEL.diaChi }"/>" placeholder="Địa chỉ"
											class="form-control">
									</div>
									<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
									<c:if test="${empty NGUOIDUNGMODEL }">
									<div class="check-box">
											<input type="checkbox" id="createaccount"
												onclick="createAccountFunction()" name="createcheck">
											&ensp; <label for="account-option">Tạo tài khoản mới</label>
										</div>
										<script type="text/javascript">
										function createAccountFunction() {
											var checkBox = document
													.getElementById("createaccount");
											var text1 = document
													.getElementById("textJS");

											if (checkBox.checked == true) {
												$("#textJS").html('<label style="color: #fff;">Tài khoản:<sup>*</sup></label> <input style="color:#fff;" type="text" name="tenDangNhap" value="" placeholder=" tên đăng nhập" class="form-control input-checkout"> <br> <label style="color: #fff;">Mật khẩu:<sup>*</sup></label> <input style="color:#fff;" type="password" name="matKhau" value="" placeholder=" Mật khẩu đăng nhập" class="form-control input-checkout"> <input style="color:#fff;" type="password" name="matKhauagain" value="" placeholder=" Nhập lại Mật khẩu" class="form-control input-checkout">');
												
											} else {
												$("#textJS").html('');
											}
										}
									</script>
									</c:if>
									</div>

									<div class="form-group col-md-6 col-sm-6 col-xs-12 "
										id="textJS">
										
									</div>
									<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<label>Ghi chú</label>
										<textarea name="ghiChu" style="color:#fff;"
											placeholder="Những lời bạn muốn gửi đến nhân viên của cửa hàng vd: chỉ giao hàng lúc trưa hoặc tối..."
											class="form-control"></textarea>
									</div>
								</div>
							</form>
							
						</div>
					</div>
					<!--End Billing Details-->
				</div>
				<!--End Col-->

				<div class="col-md-5 col-sm-12 col-xs-12">
					<div class="your-order">
						<div class="default-title">
							<h4>Đơn hàng của bạn</h4>
						</div>
						<ul class="orders-table">
							<li class="table-header clearfix">
								<div class="col">
									<h5>
										<strong>Tên Sản Phẩm</strong>
									</h5>
								</div>
								<div class="col">
									<h6>
										<strong>Giá</strong>
									</h6>
								</div>
								<div class="col">
									<h6>
										<strong>số lượng</strong>
									</h6>
								</div>
								<div class="col">
									<h6>
										<strong>thành tiền</strong>
									</h6>
								</div>
							</li>
							<c:forEach var="itemCarts" items="${listProductCarts }">
								<li class="clearfix">
									<div class="col" style="text-transform: none;">
										<img style="float: left;"
											src="template/web/img/products/<c:out value="${itemCarts.images}" />"
											width="50" height="50" alt="">
										<c:out value="${itemCarts.ten_SanPham}" />

									</div>
									<div class="col second">
										<fmt:formatNumber value="${itemCarts.gia_Ban}"
											groupingUsed="true" />

									</div>
									<div class="col second">
										<c:out value="${ itemCarts.quantityProduct}" />

									</div>
									<div class="col second">
										<fmt:formatNumber
											value="${itemCarts.gia_Ban*itemCarts.quantityProduct}"
											groupingUsed="true" />

									</div>
								</li>
							</c:forEach>
							<li class="table-header clearfix">

								<div class="col" style="text-transform: none;">
									<h5>
										<strong>Tổng tiền:</strong>
									</h5>
								</div>
								<div class="col">
									<h6>
										<strong></strong>
									</h6>
								</div>
								<div class="col">
									<h6>
										<strong></strong>
									</h6>
								</div> <c:set var="total" scope="session" value="0" /> <c:forEach
									items="${listProductCarts }" var="itemCarts">
									<c:set var="total" scope="session"
										value="${total + (itemCarts.gia_Ban * itemCarts.quantityProduct)}" />

								</c:forEach>
								<div class="col">
									<h6>
										<strong><fmt:formatNumber value="${total}"
														groupingUsed="true" /> vnđ</strong>
									</h6>
								</div>

							</li>
						</ul>
						<div class="coupon-code">
							<div class="form-group">
								<div class="field-group">
									<input type="text" name="code" value=""
										placeholder="Mã Giảm Giá" class="form-control">
								</div>
								<div class="field-group btn-field">
									<button type="submit" class="btn_cart_outine">Sử dụng</button>
								</div>
							</div>
						</div>
					</div>
					<!--End Your Order-->

					<div class="place-order">
						<div class="default-title">
							<h2>Phương thức thanh toán</h2>
						</div>
						<form id="phuongthucthanhtoan">
						<div class="payment-options">
							<ul>
								<li>
									<div class="radio-option">
										<input type="radio" name="phuongThucThanhToan" id="payment-1" value="thanhtoankhinhanhang"
											checked> <label for="payment-1">Thanh toán
											khi nhận hàng<span class="small-text">Vui lòng chuẩn
												bị khoảng tiền trên và thanh toán cho nhân viên giao hàng
												khi bạn nhận được sản phẩm.</span>
										</label>
									</div>
								</li>
								<li>
									<div class="radio-option">
										<input type="radio" name="phuongThucThanhToan" id="payment-2" value="chuyenkhoang">
										<label for="payment-2">Chuyển khoảng<span
											class="small-text">Vui lòng chuyển số tiền thanh toán
												vào tài khoản bên dưới và <span style="color: #DD9009;">kèm
													theo mã đơn hàng của bạn</span><br> số tài khoản:
												19048384837337<br>ngân hàng: TechcomBank chi nhánh Hải
												Châu<br>chủ thẻ: Trương Quang Nhân.
										</span></label>
									</div>
								</li>
								<li>
									<div class="radio-option">
										<input type="radio" disabled="disabled" name="phuongThucThanhToan" id="payment-3" value="paypal">
										<label for="payment-3">Paypal<img
											src="template/web/img/credit-card-icon.png" alt=""></label>
									</div>
								</li>
							</ul>
						</div>
						</form>
						<div class="megase" id="megaseError" style="color:red;font-weight: bold;"></div>
						<button type="button" id="dathang" class="btn_full disabled">
							ĐẶT HÀNG<i class="icon-left"></i>
						</button>
					</div>
					<!--End Place Order-->

				</div>
			</div>
		</div>
	</div>
	<!--/container-->
</main>
<!--/main-->
						<script type="text/javascript">
								$('#dathang').click(function (e) {
									//document.getElementById("dathang").style.display = "none";
								e.preventDefault();
								var data = {};
								var formData = $('#data').serializeArray();
								var formData2 = $('#phuongthucthanhtoan').serializeArray();
								var strings = "";
								
								if (document.getElementById("hvt").value == "" || document.getElementById("eml").value == "" || document.getElementById("dc").value == "" || document.getElementById("hvt").value == "ph") {
									$("#megaseError").html("Vui lòng điền đầy đủ thông tin!");
									}else{
										$("#megaseError").html("");
										$.each(formData,function(idex,vlue){
											console.log(vlue.name+' = '+ vlue.value);
											data[""+vlue.name+""] = vlue.value;
										});
										$.each(formData2,function(idex,vlue){
											console.log(vlue.name+' = '+ vlue.value);
											data[""+vlue.name+""] = vlue.value;
										});
										var checkBox = document.getElementById("createaccount");
										if(checkBox != null){
											if (checkBox.checked == true) {
												if (data['matKhauagain'] != data['matKhau']) {
													$("#megaseError").html("Mật khẩu nhập lại không đúng!");
												}else{
													loadAPIDatHang(data);
												}
											} else{
												loadAPIDatHang(data);
											}
										}else{
											loadAPIDatHang(data);
										}
									}
								
								});
								// API
								function loadAPIDatHang(data) {
								$.ajax({
											// URL gửi data
											url:'http://localhost:8080/api-donhang-dathang',
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
												console.log("success");
												console.log(result);
												if (result.ma_DonHang != 0) {
													document.getElementById("dathang").style.display = "none";
													setTimeout(function(){
														window.location.href = "detailOrder?timkiem="+ result.ma_DonHang;
													}, 25000);
													result.mesage = result.mesage + 'Hệ thống sẽ tự động chuyển trang sau 20 giây<br><a href="detailOrder?timkiem='+result.ma_DonHang+'">Hoặc nhấn vào đây để theo dõi đơn hàng</a>';
												}
												$(".ctdhmesage").html('<div class="card-header" style="position: absolute;right:0vh;top:10vh;z-index: 10000;"><div class="alert '+ result.mesage_BG +' alert-dismissible text-center"role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"> <span aria-hidden="true">&times;</span> </button> <strong>Oop!</strong> '+result.mesage +'</div> </div>');
													  $("html, body").animate({ scrollTop: 0 }, "slow");
												
													
											},
											// thất bại sẽ chạy cái này:check error
											error : function(error) {
												console.log(error);
												$(".ctdhmesage").html('<div class="card-header" style="position: absolute;right:0vh;top:10vh;z-index: 10000;"><div class="alert alert-danger alert-dismissible text-center"role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"> <span aria-hidden="true">&times;</span> </button> <strong>Oop!</strong> Lỗi hệ thống vui lòng thử lại sau!</div> </div>');
												  $("html, body").animate({ scrollTop: 0 }, "slow");
												  
											}
										});
							}
							</script>