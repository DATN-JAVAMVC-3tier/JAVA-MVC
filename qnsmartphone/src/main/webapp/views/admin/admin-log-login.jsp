<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-lg-5">
				<div class="card shadow-lg border-0 rounded-lg mt-5">
					<div class="card-header">
						<h3 class="text-center font-weight-light my-4">Login</h3>
					</div>
					<div class="card-body">
						<form action="login" method="POST">
							<div class="form-group">
								<label class="small mb-1" for="inputUserName">Email</label><input
									class="form-control py-4" name="tenDangNhap" id="inputUserName"
									type="text" placeholder="Enter user name" />
							</div>
							<div class="form-group">
								<label class="small mb-1" for="inputPassword">Password</label><input
									class="form-control py-4" name="matKhau" id="inputPassword"
									type="password" placeholder="Enter password" />
							</div>
							<div class="form-group">
								<div class="custom-control custom-checkbox">
									<input class="custom-control-input" id="rememberPasswordCheck"
										type="checkbox" /><label class="custom-control-label"
										for="rememberPasswordCheck">Remember password</label>
								</div>
							</div>
							<div
								class="form-group d-flex align-items-center justify-content-between mt-4 mb-0">
								<a class="small" href="password.html">Forgot Password?</a><a
									class="btn btn-primary" href="index.html">Login</a>
							</div>
						</form>
					</div>
					<div class="card-footer text-center">
						<div class="small">
							<a href='<c:url value="admin-log-"/>'>Need an account? Sign up!</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</main>