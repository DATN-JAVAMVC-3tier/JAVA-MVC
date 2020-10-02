<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container p-5">
		<form action="admin-add-phieunhap" method="POST" class="needs-validation " novalidate>
		<h3 class="text-center">Phiếu Nhập Hàng</h3>
		
				<div class="form-row">
					<div class="col-md-8 offset-md-2 mt-5">
						<label>Chọn nhà cung ứng hoặc tạo thông tin nhà cung ứng <a href="#" class="btn-sm btn-info">tại đây</a></label>
					<select class="bg-success form-control  text-white col-12 mt-2" name="nhacungung" >
				        <option value="" selected>Choose...</option>
				        <option value='Shipper đã tiếp nhận hàng từ kho.'>Shipper đã nhận hàng từ kho</option>
							<option value='Đang đi giao.'>Shipper đang đi giao hàng cho bạn</option>
							<option value='Shipper gọi khách hàng không nghe máy.'>Shipper gọi khách hàng không nghe máy</option>
							<option value='Khách hàng hẹn giao thời gian khác.'>Khách hàng hẹn giao thời gian khác</option>
							<option value='Shipper hẹn giao thời gian khác.'>Shipper hẹn giao thời gian khác</option>
							<option value='Khách hàng từ chối không nhận hàng.'>Khách hàng từ chối không nhận hàng</option>
							<option value='Đơn hàng bị hủy vì khách hàng không nhận hàng.'>Khách hàng từ chối không nhận hàng</option>
							<option value='Khách hàng đã nhận hàng.'>Khách hàng từ chối không nhận hàng</option>
						</select>
					</div>
				</div>	
				<div class="form-row " id="row1">
						<div class="col-md-3 offset-md-2 mt-2">
						<label>Mã sản phẩm</label>
						<input type="text" name="thuongHieu" class="form-control" id="validationCustom26"
						placeholder="Mã sản phẩm" value="" required>
						</div>
						<div class="col-md-2 mt-2">
						<label>Số lượng sản phẩm</label>
						<input type="number" name="thuongHieu" min="0" class="form-control" id="validationCustom26"
						placeholder="Số lượng" value="" required>
						</div>
						<div class="col-md-2 mt-2">
						<label>Giá nhập</label>
						<input type="number" name="thuongHieu" min="0" class="form-control" id="validationCustom26"
						placeholder="Giá nhập" value="" required>
						</div>
						<div class="col-md-1 mt-2">
						<label></label>
						<button class=" btn btn-danger col-12 mt-2" onclick="delete_input('row1')">hủy</button>
						</div>
				</div>
				<div id="inser_input">
				</div>
				<div class="form-row">
					<div class="col-md-2 offset-md-5 mt-3">
					<button class="btn btn-info col-12" onclick="insert_input()">Thêm</button>
					</div>
					<script type="text/javascript">
					var i = 1;
					function insert_input(){
						i++;
						$("#inser_input").html($("#inser_input").html() + '<div class="form-row" id="row'+i+'"> <div class="col-md-3 offset-md-2 mt-2"> <label>Mã sản phẩm</label> <input type="text" name="thuongHieu" class="form-control" id="validationCustom26" placeholder="Mã sản phẩm" value="" required> </div> <div class="col-md-2 mt-2"> <label>Số lượng sản phẩm</label> <input type="number" name="thuongHieu" min="0" class="form-control" id="validationCustom26" placeholder="Số lượng" value="" required> </div> <div class="col-md-2 mt-2"> <label>Giá nhập</label> <input type="number" name="thuongHieu" min="0" class="form-control" id="validationCustom26" placeholder="Giá nhập" value="" required> </div> <div class="col-md-1 mt-2"> <label></label> <button class=" btn btn-danger col-12 mt-2" onclick="delete_input(\'row'+i+'\')">hủy</button> </div> </div>');
							  
					}
					function delete_input(id){
						var converid = "#" + id;
						$(converid).html("");
					}
					</script>
				</div>	
				<div class="form-row">
				<div class="col-md-2 offset-md-5 mt-5">
					<input type="submit" value="Nhập hàng" class="btn btn-success col-12">
				</div>
				</div>									
		</form>

		<script>
			// Example starter JavaScript for disabling form submissions if there are invalid fields
			(function() {
				'use strict';
				window
						.addEventListener(
								'load',
								function() {
									// Fetch all the forms we want to apply custom Bootstrap validation styles to
									var forms = document
											.getElementsByClassName('needs-validation');
									// Loop over them and prevent submission
									var validation = Array.prototype.filter
											.call(
													forms,
													function(form) {
														form
																.addEventListener(
																		'submit',
																		function(
																				event) {
																			if (form
																					.checkValidity() === false) {
																				event
																						.preventDefault();
																				event
																						.stopPropagation();
																			}
																			form.classList
																					.add('was-validated');
																		},
																		false);
													});
								}, false);
			})();
		</script>
	</div>
</main>