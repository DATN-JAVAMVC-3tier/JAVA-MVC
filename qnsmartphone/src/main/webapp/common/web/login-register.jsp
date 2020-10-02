<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<aside id="aside_panel">
	<a class="aside-panel-bt" href="#0"><i class="icon_close"></i></a>
	<c:if test="${not empty NGUOIDUNGMODEL}">
		<p class="text-center">
			<img src="template/web/img/user/user-default1.png" width="60"
				height="60" alt="" data-retina="true">
		</p>
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-12">
						<a href="#" class="active" id="login-form-link">Xin chào! <c:out
								value="${NGUOIDUNGMODEL.hoVaTen}" /></a>
					</div>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						<table class="table  table-borderless table-responsive-lg">
							<thead>
								<tr>
									<th scope="col">THÔNG TIN CÁ NHÂN</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Họ và tên: <c:out value="${NGUOIDUNGMODEL.hoVaTen}" /></td>
								</tr>
								<tr>
									<td>Email: <c:out value="${NGUOIDUNGMODEL.email}" /></td>
								</tr>
								<tr>
									<td>Địa chỉ: <c:out value="${NGUOIDUNGMODEL.diaChi}" /></td>
								</tr>
								<tr>

									<td>Số điện thoại: <c:out
											value="${NGUOIDUNGMODEL.soDienThoai}" /></td>
								</tr>
							</tbody>
							<tfoot>
								<tr>
									<td><a href='<c:url value="logform?action=logout"/>'
										class="link btn-sm btn-warning"><i class="icon-logout-3"></i>
											Đăng xuất</a></td>

								</tr>
								<tr>
									<td>
										<button type="button"
											class="btn-sm btn-primary aside-panel-bt" data-toggle="modal"
											data-target="#exampleModalScrollable">Cập nhập thông
											tin cá nhân</button>
									</td>
								</tr>
							</tfoot>
						</table>
					</div>
				</div>
			</div>
		</div>
	</c:if>

	<c:if test="${empty NGUOIDUNGMODEL}">
		<p class="text-center">
			<img src="template/web/img/aside_logo_2x.png" width="190" height="48"
				alt="" data-retina="true">
		</p>
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<a href="#" class="active" id="login-form-link">Đăng Nhập</a>
					</div>
					<div class="col-xs-6">
						<a href="#" id="register-form-link">Đăng kí</a>
					</div>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						<form action="<c:url value="logform" />" method="POST"
							id="login-form">
							<input type="hidden" name="action" value="login">
							<div class="form-group">
								<input type="text" name="tenDangNhap" id="username" tabindex="1"
									class="form-control" placeholder="Username" value=""
									required="required">
							</div>
							<div class="form-group">
								<input type="password" name="matKhau" id="password" tabindex="2"
									class="form-control" placeholder="Password" required="required">
							</div>
							<div class="checkbox">
								<label><input type="checkbox" name="remember">
									Remember me</label>
							</div>
							<div class="row">
								<div class="col-xs-6">
									<input type="submit" name="login-submit" id="login-submit"
										tabindex="4" class="btn_1" value="Log In">
								</div>
								<div class="col-xs-6">
									<a href="#" tabindex="5" class="forgot-password">Forgot
										Password?</a>
								</div>
							</div>
						</form>
						<form action="<c:url value="logform" />" method="POST"
							id="register-form">
							<input type="hidden" name="action" value="register">
							<div class="form-group">
								<input type="text" name="tenDangNhap" id="username_2"
									tabindex="1" class="form-control" placeholder="Username"
									value="">
							</div>
							<div class="form-group">
								<input type="email" name="email" id="email_2" tabindex="2"
									class="form-control" placeholder="Email Address" value="">
							</div>
							<div class="form-group">
								<input type="password" name="matKhau" id="password_2"
									tabindex="3" class="form-control" placeholder="Password">
							</div>
							<div class="form-group">
								<input type="password" name="confirm-matKhau"
									id="confirm-password_2" tabindex="4" class="form-control"
									placeholder="Confirm Password">
							</div>
							<div class="form-group">
								<input type="text" name="hoVaTen" id="hoVaTen" tabindex="5"
									class="form-control" placeholder="Họ và tên" value="">
							</div>
							<div class="form-group">
								<input type="text" name="diaChi" id="diaChi" tabindex="6"
									class="form-control" placeholder="Địa chỉ" value="">
							</div>
							<div class="form-group">
								<input type="text" name="soDienThoai" id="soDienThoai"
									tabindex="7" class="form-control" placeholder="Số điện thoại"
									value="">
							</div>
							<div class="form-group">
								<h5 class="form-control">Ảnh nền:</h5>
								<input type="file" name="image" id="image" tabindex="8"
									class="form-control" placeholder="Ảnh nền" value=""
									accept=".jpg,.png">
							</div>
							<input type="submit" name="register-submit" id="register-submit"
								tabindex="8" class="btn_1" value="Register Now">
						</form>
					</div>
				</div>
			</div>
		</div>
	</c:if>
</aside>
<!-- End aside panel -->
