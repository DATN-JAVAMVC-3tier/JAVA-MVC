<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container margin_60_35">
		<div class="row">

			<div class="col-md-9">
				<h3>Contact us</h3>
				<p>
					Mussum ipsum cacilds, vidis litro abertis.
				</p>
				<div>
					<div id="message-contact"></div>
					<form method="post" action="assets/contact.php" id="contactform">
						<div class="row">
							<div class="col-md-6 col-sm-6">
								<div class="form-group">
									<label>First name:</label>
									<input type="text" class="form-control styled" id="name_contact" name="name_contact" placeholder="Jhon">
								</div>
							</div>
							<div class="col-md-6 col-sm-6">
								<div class="form-group">
									<label>Last name:</label>
									<input type="text" class="form-control styled" id="lastname_contact" name="lastname_contact" placeholder="Doe">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6 col-sm-6">
								<div class="form-group">
									<label>Email:</label>
									<input type="email" id="email_contact" name="email_contact" class="form-control styled" placeholder="jhon@email.com">
								</div>
							</div>
							<div class="col-md-6 col-sm-6">
								<div class="form-group">
									<label>Phone number:</label>
									<input type="text" id="phone_contact" name="phone_contact" class="form-control styled" placeholder="00 44 5435435">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label>Your message:</label>
									<textarea rows="5" id="message_contact" name="message_contact" class="form-control styled" style="height:100px;" placeholder="Hello world!"></textarea>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label>Are you human? 3 + 1 =</label>
									<input type="text" id="verify_contact" class=" form-control styled" placeholder=" 3 + 1 =">
								</div>
								<p><input type="submit" value="Submit" class="btn_1" id="submit-contact"></p>
							</div>
						</div>
					</form>
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