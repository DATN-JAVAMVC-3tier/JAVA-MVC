<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container p-5">
		<form action="quanly-sanpham" method="POST" class="needs-validation" novalidate>
		<c:if test="${not empty sanPham}">
				<input  type="hidden" name="ma_SanPham" class="form-control" value="<c:out value="${sanPham.ma_SanPham}"/>">
				<input  type="hidden" name="action" class="form-control" value="update">
		</c:if>
		<c:if test="${ empty sanPham}">
		<input  type="hidden" name="action" class="form-control" value="add">
			</c:if>
			<div class="form-row">
				<div class="col-md-4 mb-3">
					<label for="validationCustom01">Tên sản phẩm</label> <input
						type="text" name="ten_SanPham" class="form-control" id="validationCustom01"
						placeholder="Tên sản phẩm" value="<c:out value="${sanPham.ten_SanPham}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom02">Loại sản phẩm</label> <input
						type="text" name="loai_SanPham" class="form-control" id="validationCustom02"
						placeholder="Tên sản phẩm" value="<c:out value="${sanPham.loai_SanPham}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustomUsername">tag</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" id="inputGroupPrepend">phân
								cách [/]</span>
						</div>
						<input type="text" name="tag" class="form-control"
							id="validationCustomUsername" placeholder="Tag"
							aria-describedby="inputGroupPrepend" value="<c:out value="${sanPham.tag}"/>" required>
						<div class="invalid-feedback">Vui lòng để 1 tag</div>
					</div>
				</div>
			</div>
			<div class="form-row">
				<div class="col-md-6 mb-3">
					<label for="validationCustom03">Màu sắc</label>
					<input type="text" name="mauSac"
						class="form-control" id="validationCustom03" placeholder="Yellow"
						value="<c:out value="${sanPham.mauSac}"/>" required>
					<div class="invalid-feedback">Màu sắc không được để trống</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom04">Hệ điều hành</label> <input
						type="text" name="heDieuHanh" class="form-control" id="validationCustom04"
						placeholder="Hệ điều hành" value="<c:out value="${sanPham.heDieuHanh}"/>" required>
					<div class="invalid-feedback">Không được để trống trường này</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom5">Phiên bản</label> <input
						type="text" name="phienBan" class="form-control" id="validationCustom05"
						placeholder="Phiên bản" value="<c:out value="${sanPham.phienBan}"/>" required>
					<div class="invalid-feedback">Không được để trống trường này</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom6">Kích thước màn hình</label> <input
						type="text" name="kichThuoc_ManHinh" class="form-control" id="validationCustom06"
						placeholder="Kích thước màn hình" value="<c:out value="${sanPham.kichThuoc_ManHinh}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<!-- -->
				<div class="col-md-4 mb-3">
					<label for="validationCustom7">Loại màn hình</label> <input
						type="text" name="loai_ManHinh" class="form-control" id="validationCustom07"
						placeholder="Loại màn hình" value="<c:out value="${sanPham.loai_ManHinh}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom8">Camera trước</label> <input
						type="text" name="camera_Truoc" class="form-control" id="validationCustom08"
						placeholder="Camera trước" value="<c:out value="${sanPham.camera_Truoc}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom9">Camera sau</label> <input
						type="text" name="camera_Sau" class="form-control" id="validationCustom09"
						placeholder="Camera sau" value="<c:out value="${sanPham.camera_Sau}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom10">Kết nối</label>
					<input type="text" name="ketNoi"
						class="form-control" id="validationCustom10" placeholder="Kết nối"
						value="<c:out value="${sanPham.ketNoi}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom11">Sim</label>
					 <input type="text"  name="sim"
						class="form-control" id="validationCustom11" placeholder="Sim"
						value="<c:out value="${sanPham.sim}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom12">Wifi</label> 
					<input type="text" name="wifi"
						class="form-control" id="validationCustom12" placeholder="Wifi"
						value="<c:out value="${sanPham.wifi}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom13">GPS</label> 
				<input type="text"  name="gps"
						class="form-control" id="validationCusto13" placeholder="GPS"
						value="<c:out value="${sanPham.gps}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom14">Bluetooth</label> <input
						type="text" name="bluetooth" class="form-control" id="validationCustom14"
						placeholder="Bluetooth" value="<c:out value="${sanPham.bluetooth}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom15">Cổng kết nối</label> <input
						type="text" name="cong_KetNoi" class="form-control" id="validationCustom15"
						placeholder="Cổng kết nối" value="<c:out value="${sanPham.cong_KetNoi}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom16">Loại pin</label>
					 <input type="text" name="loai_Pin"
						class="form-control" id="validationCustom16"
						placeholder="Loại pin" value="<c:out value="${sanPham.loai_Pin}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom17">Bảo mật</label>
					 <input type="text" name="baoMat"
						class="form-control" id="validationCustom17" placeholder="Bảo mật"
						value="<c:out value="${sanPham.baoMat}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom18">Ram</label>
					 <input type="text" name="ram"
						class="form-control" id="validationCustom18" placeholder="Ram"
						value="<c:out value="${sanPham.ram}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom19">Bộ nhớ trong</label> <input
						type="text" name="boNhoTrong" class="form-control" id="boNhoTrong"
						placeholder="Bộ nhớ trong" value="<c:out value="${sanPham.loai_SanPham}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				
				<div class="col-md-4 mb-3">
					<label for="validationCustom20">Giá bán</label> 
					<input type="text" name="gia_Ban"
						class="form-control" id="validationCustom21" placeholder="Giá bán" value="<c:out value="${sanPham.gia_Ban}"/>"
						required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom21">Số lượng nhập</label> 
					<input type="text" name="soLuongNhap" class="form-control" id="validationCustom22"
						placeholder="Số lượng đã nhập" value="<c:out value="${sanPham.soLuongNhap}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom22">Số lượng còn</label> <input
						type="text" name="soLuongCon" class="form-control" id="validationCustom23"
						placeholder="Số lượng còn" value="<c:out value="${sanPham.soLuongCon}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom23">Giảm giá[%]</label> <input
						type="text" name="giamGia" class="form-control" id="validationCustom24"
						placeholder="" value="<c:out value="${sanPham.giamGia}"/>">
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom24">Thông tin thêm</label>
					<textarea name="thongTinThem" class="form-control" id="validationCustom20"
						placeholder="Thông tin thêm"  rows="" cols="">
						<c:out value="${sanPham.thongTinThem}"/></textarea>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom25">Mô tả sản phẩm</label>
					<textarea name="moTa_SanPham" class="form-control" id="validationCustom25"
						placeholder="Mô tả sản phẩm"  rows="" cols="">
						<c:out value="${sanPham.moTa_SanPham}"/>
						</textarea>					
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom26">Thương hiệu</label> <input
						type="text" name="thuongHieu" class="form-control" id="validationCustom26"
						placeholder="Thương hiệu" value="<c:out value="${sanPham.thuongHieu}"/>" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom27">Hình ảnh</label> <input
						 name="images" type="file" class="form-control" id="validationCustom27"
						placeholder="upload image">
					<div class="valid-feedback">Tạm thời được chấp nhận!</div>
				</div>
			</div>
			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="notactive" name="trangThai"
						id="invalidCheck"> <label class="form-check-label"
						for="invalidCheck">Chưa bán sản phẩm này trên website.</label>
				</div>
			</div>
			<button class="btn btn-primary" type="submit">
			<c:if test="${not empty sanPham}">
				Cập nhập
			</c:if>
			<c:if test="${empty sanPham}">
				Thêm Sản Phẩm
			</c:if>
			</button>
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