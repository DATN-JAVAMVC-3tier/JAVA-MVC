<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container margin_60_35">
		<div class="row">

			<div class="col-md-9 ">
				<h3 style="background-color: green;padding: 10px;color: #fff;"><b>Tra cứu vận đơn</b></h3>
				<%@include file="/common/web/searchdonhang.jsp" %>
				
				<div>
					<div id="message-contact"></div>
					<div class="row">
					<c:if test="${not empty listChiTietDonHang }">
					<c:forEach var="items" items="${listChiTietDonHang }">
						<table class="table table-bordered">
							<thead>
								<tr>
									<th colspan="2" style="text-align: center; background-color: green"><h4 style="color: #fff;">Thông tin vận đơn: <c:out value="${items.ma_DonHang }"/></h4></th>
								</tr>
								<tr>
									<td>Thông tin người nhận:</td>
									<td>
									Tên người nhận: <c:out value="${items.tenNguoiNhan}"/><br>
									Địa chỉ nhận hàng: <c:out value="${items.diaChi }"/><br>
									Email: <c:out value="${items.email }"/><br>
									Số điện thoại: <c:out value="${items.soDienThoai }"/>
									</td>
								</tr>
								<tr>
									<td>Thông tin người gửi:</td>
									<td>
									Shop: QN-SmartPhone<br>
									Địa chỉ: 02 Thanh Sơn Thanh Bình Hải Châu Đà Nẵng Việt Nam.<br>
									Email: qnsmartphone@quangnhan.com<br>
									Số điện thoại: 0962293731
									</td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Thông tin đơn hàng:</td>
									<td>
									Mã đơn hàng: <c:out value="${items.ma_DonHang }"/><br>
									Phương thức thanh toán: <c:out value="${items.phuongThucThanhToan }"/><br>
									Phương thức mua: <c:out value="${items.phuongThucMua }"/><br>
									Thời gian đặt hàng: <c:out value="${items.thoiGianLap }"/><br>
									Tổng tiền: <fmt:formatNumber value="${items.tongTien}"
														groupingUsed="true" /> <sup>vnđ</sup><br>
									
									
									</td>

								</tr>
								<tr>
									<td>Trạng thái đơn hàng:</td>
									<td><c:out value="${items.trangThaiDonHangModel.thongTin_TrangThai }"/><br>
									</td>

								</tr>
								<tr>
									<td>Thông tin thêm:</td>
									<td></td>
								</tr>
								<tr>
									<td>Tình trạng đơn hàng:</td>
									
									<td>
									<c:forTokens items="${items.tinhTrang_DonHang }" delims="|" var="itemtt">
										<c:out value="${itemtt }"/><br>
									</c:forTokens>
									. . .
									</td>

								</tr>
									<td colspan="2"><a class="btn btn-warning" target="_blank" href='<c:url value="bill?DH=${items.ma_DonHang}"/>'>Xuất hóa đơn</a></td>
								<tr>
								</tr>
							</tbody>
						</table>
						</c:forEach>
						</c:if>
					</div>
				</div>
                	<div class="row">
                    	<div class="col-md-6 col-sm-6">
                        	<div class="box_style_2">
								  <h3><i class="icon_pushpin_alt"></i> Tôi cần chuẩn bị gì</h3>
                                  <ul>
                                    <li>Nếu bạn thanh toán khi nhận hàng cần chuẩn bị trước số tiền bằng với giá trị đơn hàng để thanh toán cho shipper. </li>
                                    <li>Nếu bạn thanh toán online vui lòng cung cấp lại <strong>số điện thoại đặc hàng</strong> để shiper kiểm tra.</li>
                                    <li>Vui lòng để ý và bắt máy khi có shipper giao hàng gọi.</li>
                                    <li>Shipper thường giao vào buổi trưa nếu bạn không note lại ở phần ghi chú.</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6">
                        	<div class="box_style_2">
                        		<h3><i class="icon_pushpin_alt"></i> Lời Cảm Ơn</h3>
                            	<ul>
                                    <li>Cảm ơn quý khách đã tin tưởng và mua hàng tại Di Động Thông Minh. Tuy nhiên thật không may, sản phẩm của bạn bị lỗi, hoặc trong quá trình sử dụng thấy sản phẩm không được như ý, không đúng với mục đích sử dụng quý khách hoàn toàn có quyền đổi, trả (hoàn tiền) sản phẩm theo chính sách dưới đây:. </li>
                             	</ul>
                        </div>
                       </div>
                    </div><!-- End row -->
                    <div class="row">
                    	<div class="col-md-6 col-sm-6">
                        	<div class="box_style_2">
                        		<h3><i class="icon_pushpin_alt"></i> Chính sách đổi trả</h3>
                               	<ul>
                                    <li>Đối với các sản phẩm chính hãng được phân phối tại Việt Nam sẽ theo quy định đổi trả sản phẩm của các hãng. </li>
                                    <li>Sản phẩm cần được giữ nguyên trạng như tình trạng xuất kho:<br>*  Sản phẩm không được có dấu hiệu vào nước, hóa chất.<br>*  Với máy cũ cần đúng tình trạng như mô tả trên phiếu bán hàng..</li>
                                    <li>Khách hàng cần xuất trình đầy đủ giấy tờ mua hàng kiêm phiếu bảo hành, sản phẩm phải còn nguyên tem của QN-SMARTPHONE. Với Samsung, iPhone các sản phẩm nguyên khối sẽ được dán tem ốc, với các sản phẩm tháo được nắp lưng sẽ được dán trên ốc..</li>
                                    <li>Khách hàng cần thoát các tài khoản bảo mật iCloud, Gooogle Acc… yêu cầu kĩ thuật viên sao lưu và xóa dữ liệu trước khi đổi trả..</li>
                                    <li>Sản phẩm không bị người dùng tự ý can thiệp phần mềm (up các bản rom không ổn định, unlock bootloader, jaibreak…) khác với các bản rom chuẩn được Kĩ thuật viên đã cài đặt..</li>

                                </ul>
                            </div>
                        </div>
                        
                        <div class="col-md-6 col-sm-6">
                        	<div class="box_style_2">
								<h3><i class="icon_pushpin_alt"></i> Bảo hành sản phẩm như thế nào?</h3>
                               	<ul>
                                    <li>Để được đổi mới trong thời hạn quý khách cần giữ gìn máy, phụ kiện không xước, móp, hộp không rách, dán băng keo. Tham khảo chính sách đổi trả. </li>
                                    <li>Máy trong thời hạn bảo hành, tem còn nguyên vẹn và hợp lệ, không có dấu hiệu tẩy xóa.. </li>
                                    <li>Công ty không chịu trách nhiệm về hình thức máy, thiếu phụ kiện, dính tài khoản icloud, google account sau khi khách rời cửa hàng.. </li>
                                    <li>Khách hàng muốn trả lại máy trong thời gian đổi trả sẽ bị chiết khấu từ 10-20% tùy sản phẩm, hỗ trợ nhập lại máy theo giá thỏa thuận để lên đời.. </li>
                                    <li>Nếu quá thời hạn mà không xử lý được, hoặc máy bị bảo hành lại quá 2 lần: Quý khách sẽ được đổi main hoặc đổi máy tương đương.. </li>
                                    <li>Không bảo hành các lỗi phát sinh do già hóa linh kiện: điểm chết, đốm sáng, sọc kẻ màn hình, ố vàng ngoài thời gian đổi mới quy định của từng gói bảo hành.. </li>
                                    <li>Không bảo hành với máy vào nước với cả sản phẩm có khả năng chống nước, vui lòng không lạm dụng tính năng này.. </li>
                                    <li>Không bảo hành đối với lỗi màn chảy mực. Dấu hiệu nhận biết màn chảy mực: có các vệt loang màu tím ở các góc, đốm đen màn, màn sọc đen hoặc tím, có loang dầu khi nhìn nghiêng.. </li>
                                    <li>Tại QN-SMARTPHONE với các sản phẩm nhập khẩu, hoặc các sản phẩm cũ khi khách hàng mua máy sẽ có chế độ bảo hành mặc định là 1 năm. . </li>
                                </ul>
                            </div>
                        </div>
                    </div><!-- End row -->
			</div>
			<!-- End col lg 9 -->
			<%@include file="/common/web/menu-left-contact.jsp" %>
			<!--End aside -->
		</div>
		<!-- End row -->
	</div>
	<!-- End container -->
	<!-- end map-->
</main>
<!--/main-->