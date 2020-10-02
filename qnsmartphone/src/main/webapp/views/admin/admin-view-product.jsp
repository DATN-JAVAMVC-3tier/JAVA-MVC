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
			<div class="card-body">
				<!-- nội dung truyền đạt -->
			</div>
		</div>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table mr-1"></i>Danh sách sản phẩm[active]
				<a href="http://localhost:8080/admin-add-product" class="btn bg-success btn-sm text-white">ADD NEW</a>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						 <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>SẢN PHẨM</th>
                                                <th>SL-CÒN</th>
                                                <th>TỔNG SL</th>
                                                <th>ĐÃ BÁN</th>
                                                <th>GIÁ BÁN</th>
                                                <th>ĐIỂM</th>
                                                <th>THƯƠNG HIỆU</th>
                                                <th>TRẠNG THÁI</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                              <th>ID</th>
                                                <th>SẢN PHẨM</th>
                                                <th>SL-CÒN</th>
                                                <th>TỔNG SL</th>
                                                <th>ĐÃ BÁN</th>
                                                <th>GIÁ BÁN</th>
                                                <th>ĐIỂM</th>
                                                <th>T.HIỆU</th>
                                                <th>T.THÁI</th>
                                                 <th></th>
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:if test="${not empty listSanPham}">
                                        <c:forEach var="sanPham" items="${listSanPham}">
                                        
                                            <tr>
                                                <td><c:out value="${sanPham.ma_SanPham }"/></td>
                                                <td><a href='<c:out value="detail-product?productCode=${sanPham.ma_SanPham}"/>'><c:out value="${sanPham.ten_SanPham }"/></a></td>
                                                <td><c:out value="${sanPham.soLuongCon }"/></td>
                                                <td><c:out value="${sanPham.soLuongNhap }"/></td>
                                                <td><c:out value="${sanPham.soLuongDaBan }"/></td>
                                                <td><fmt:formatNumber value="${sanPham.gia_Ban }"
														groupingUsed="true" /><sup>vnđ</sup></td>
                                                <td><c:out value="${sanPham.diemDanhGia }"/></td>
                                                <td><c:out value="${sanPham.thuongHieu }"/></td>
                                                <td><c:out value="${sanPham.trangThai }"/></td>
                                                <td>
                                                <div class="hidden-sm hidden-xs btn-group">
                                                <button class="btn btn-sm btn-success" onclick="hrefFunction('admin-sanpham?action=edit&ma_SanPham=<c:out value="${sanPham.ma_SanPham }"/>')">
																<i>edit</i>
															</button>
															<c:if test="${sanPham.trangThai == 'active'}">
															<button class="btn btn-sm btn-warning" onclick="hrefFunction('admin-sanpham?action=hidden&value=notactive&ma_SanPham=<c:out value="${sanPham.ma_SanPham }"/>')">
																<i>notactive</i>
															</button>
															</c:if>
															<c:if test="${sanPham.trangThai != 'active'}">
															<button class="btn btn-sm btn-info" onclick="hrefFunction('admin-sanpham?action=hidden&value=active&ma_SanPham=<c:out value="${sanPham.ma_SanPham }"/>')">
																<i>active</i>
															</button>
															</c:if>
															</div>
                                                </td>
                                            </tr>
                                            </c:forEach>
                                            </c:if>
                                              <c:if test="${empty listSanPham}">
                                               <tr>
                                                <td colspan="9"><c:out value="Không có dữ liệu để hiển thị..."/></td>
                                               
                                            </tr>
                                              </c:if>
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