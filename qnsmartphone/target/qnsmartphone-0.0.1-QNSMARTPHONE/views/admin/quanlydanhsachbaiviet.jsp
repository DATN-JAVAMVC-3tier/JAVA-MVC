

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container-fluid">
		<h1 class="mt-4">Tables</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
			<li class="breadcrumb-item active">Tables</li>
		</ol>
		<div class="card mb-4">
			<div class="card-body">Để xem chi tiết bài viết vui lòng nhấn
				vào tiêu đề bài viết muốn xem</div>
		</div>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table mr-1"></i>Dữ liệu Bài Viết
			</div>
			<div class="card-body ">
				<div class="table-responsive  ">
					<table class="table table-bordered  small" id="dataTable" width="100%"
						cellspacing="0">

						<thead class="text-center bg-dark text-white">
							<tr>
								<th scope="col" >Mã Bài Viết</th>
								<th scope="col" >Tiêu Đề</th>
								<th scope="col">Tag</th>
								<th scope="col">Tác Giả</th>
								<th scope="col">Ngày Tạo</th>
								<th scope="col">Tác Động</th>
							</tr>
						</thead>
						<tfoot class="text-center bg-dark text-white">
							<tr>
								<th scope="col">Mã Bài Viết</th>
								<th scope="col">Tiêu Đề</th>
								<th scope="col">Tag</th>
								<th scope="col">Tác Giả</th>
								<th scope="col">Ngày Tạo</th>
								<th scope="col">Tác Động</th>
							</tr>
						</tfoot>
						<tbody>
							<c:forEach var="baiViet" items="${model.listResult}">
								<tr>
									<td><c:out value="${baiViet.ma_BaiViet}" /></td>
									<td><a href="?getdetail=<c:out value="${baiViet.tieuDe }" />"><c:out value="${baiViet.tieuDe }" /></a></td>
									<td><c:out value="${baiViet.tag }" /></td>
									<td><c:out value="${baiViet.nguoiTao }" /></td>
									<td><c:out value="${baiViet.thoiGianTao}" /></td>
									<td class="row">
									<div class="hidden-sm hidden-xs btn-group">
															<button class="btn btn-sm btn-success" onclick="hrefFunction('admin-baiviet-controller?action=edit&ma_baiviet=<c:out value="${baiViet.ma_BaiViet}" />')">
																<i>edit</i>
															</button>
															<button class="btn btn-sm btn-warning" onclick="hrefFunction('admin-baiviet-controller?action=hidden&ma_baiviet=<c:out value="${baiViet.ma_BaiViet}" />')">
																<i>hidden</i>
															</button>
														</div>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</main>
<script>
function hrefFunction(data) {
	window.location.href = data;
}
</script>