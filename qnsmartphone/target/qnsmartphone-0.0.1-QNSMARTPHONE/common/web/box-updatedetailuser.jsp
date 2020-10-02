<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
	<c:if test="${not empty NGUOIDUNGMODEL}">
<!-- Modal -->
<div class="modal fade" id="exampleModalScrollable" tabindex="-1"
	role="dialog" aria-labelledby="exampleModalScrollableTitle"
	aria-hidden="true">
	<div class="modal-dialog modal-dialog-scrollable" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalScrollableTitle">Cập nhập thông tin</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form action="logform" method="POST">
			<div class="modal-body">
				<h4>Xin chào <c:out value="${NGUOIDUNGMODEL.hoVaTen}" /> </h4>
				<p>Dưới đây là thông tin cá nhân hiện tại của bạn để thay đổi vui lòng chỉnh sửa là nhấn [save change] để lưu thay đổi</p>
					<input type="hidden" name="action" value="<c:out value="updateuser" />">
					<div class="form-group">
						<label for="f-hovaten">Họ và tên:</label> <input type="text"
							class="form-control" id="f-hovaten" placeholder="Full Name"
							name="hoVaTen" value="<c:out value="${NGUOIDUNGMODEL.hoVaTen}" />">
					</div>
					<div class="form-group">
						<label for="f-email">Email:</label> <input type="email"
							class="form-control" id="f-email" placeholder="Enter Email"
							name="email" value="<c:out value="${NGUOIDUNGMODEL.email}" />">
					</div>
					<div class="form-group">
						<label for="f-sodienthoai">Phone:</label> <input type="text"
							class="form-control" id="f-sodienthoai" placeholder="Enter Your Phone"
							name="soDienThoai" value="<c:out value="${NGUOIDUNGMODEL.soDienThoai}" />">
					</div>
					<div class="form-group">
						<label for="f-diachi">Adress:</label> <input type="text"
							class="form-control" id="f-diachi" placeholder="Enter Adress"
							name="diaChi" value="<c:out value="${NGUOIDUNGMODEL.diaChi}" />">
					</div>
					<div class="form-group">
						<label for="f-socmnd">CMND Number:</label> <input type="number"
							class="form-control" id="f-socmnd" placeholder="Enter CMND Number"
							name="soCMND" value="<c:out value="${NGUOIDUNGMODEL.soCMND}" />">
					</div>
					<div class="form-group">
						<label for="f-image">Ảnh nền:</label> <input type="file"
							class="form-control" id="f-image" placeholder="Choose File" 
							name="image" >
					</div>
					
				
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<button type="submit" class="btn btn-primary ">Save change</button>
			</div>
			</form>
		</div>
	</div>
</div>
<script>
	$('#myModal').on('shown.bs.modal', function() {
		$('#myInput').trigger('focus')
	})
</script>
</c:if>