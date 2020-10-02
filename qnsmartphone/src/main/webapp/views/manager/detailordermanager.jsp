<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<main>
	<div class="container-fluid">
		<h1 class="mt-4">QN-SmartPhone</h1>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table mr-1"></i>Thông tin chi tiết đơn hàng
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered table-sm" id="dataTable"
						width="100%" cellspacing="0">
						<thead>
							<tr>
								<th colspan="2">Thông tin chi tiết mã đơn hàng: <c:out value="${donHangManager.ma_DonHang }" /></th>
							</tr>
						</thead>
						<tfoot>
							<tr>
							<th></th>
								<th><a href="quanly-detailOrder?action=updatetrangthai&ma_trangthai=7&ma_donhang=<c:out value="${donHangManager.ma_DonHang }" />" class="btn btn-sm btn-success">Xát nhận đã nhận tiền từ shipper</a></th>
							</tr>
						</tfoot>
						<tbody>
							<c:if test="${not empty donHangManager}">
								<tr>
									<td>Mã đơn hàng:</td>
									<td><c:out value="${donHangManager.ma_DonHang }" /></td>
								</tr>
								<tr>
									<td>Phương thức thanh toán:</td>
									<td><c:out value="${donHangManager.phuongThucThanhToan }" /></td>
								</tr>
								<tr>
									<td>Phương thức mua:</td>
									<td><c:out value="${donHangManager.phuongThucMua }" /></td>
								</tr>
								<tr>
									<td>Tổng tiền:</td>
									<td><fmt:formatNumber value="${donHangManager.tongTien }"
											groupingUsed="true" /><sup>vnđ</sup></td>
								</tr>
								<tr>
									<td>Thời gian đặc hàng:</td>
									<td><c:out value="${donHangManager.thoiGianLap }" /></td>
								</tr>
								<tr>
									<td>Tên Người Nhận:</td>
									<td><c:out value="${donHangManager.tenNguoiNhan }" /></td>
								</tr>
								<tr>
									<td>Địa Chỉ:</td>
									<td><c:out value="${donHangManager.diaChi }" /></td>
								</tr>
								<tr>
									<td>Số điện thoại:</td>
									<td><c:out value="${donHangManager.soDienThoai }" /></td>
								</tr>
								<tr>
									<td>Email:</td>
									<td><c:out value="${donHangManager.email }" /></td>
								</tr>
								<tr>
									<td>Khách hàng thành viên:</td>
									<td><c:out value="${donHangManager.ma_KhachHang }" /></td>
								</tr>
								<tr>
									<td>Người giao hàng:</td>
									<c:if test="${donHangManager.tenShipper != 'unknow'}">
									<td><c:out value="${donHangManager.tenShipper }" /></td>
									</c:if>
									<c:if test="${donHangManager.tenShipper == 'unknow'}">
									<td>
									<form action="quanly-detailOrder" method="Post">
									<input type="hidden" name="action" value="updateShipper">
									<input type="hidden" name="ma_DonHang" value="<c:out value="${donHangManager.ma_DonHang }" />">
									 	<select class=" " name="ma_Shiper">
									        <option selected>Choose...</option>
									        <c:forEach items="${listShipper }" var="shiper">
									         <option value='<c:out value="${shiper.ma_NguoiDung }"/>'><c:out value="shipper[${shiper.hoVaTen }]"/></option>
									        </c:forEach>
									       
									      </select>
									      <input class="btn-sm btn btn-warning" type="submit" value="update">
									</form>
									
									
									</td>
									</c:if>
								</tr>
								<tr>
									<td>Trạng thái đơn hàng:</td>
									<td><c:out value="${donHangManager.trangThaiDonHangModel.thongTin_TrangThai }" /></td>
								</tr>
								<tr>
									<td>Tình trạng đơn hàng:</td>
									<td>
									<c:forTokens items="${donHangManager.tinhTrang_DonHang  }" delims="|" var="itemtt">
										<c:out value="${itemtt }"/><br>
									</c:forTokens>
									</td>
								</tr>
								<tr>
									<td>Ghi chú:</td>
									<td><c:out value="${donHangManager.ghiChu }" /></td>
								</tr>
								<tr><th colspan="2">Sản phẩm mua:</th></tr>
								<c:forEach items="${donHangManager.listChiTietDonHang }" var="item">
								<tr>
									<td>Sản Phẩm: [<c:out value="${item.ma_SanPham }" />]</td>
									<td>
										- Mã sản phẩm: <c:out value="[${item.ma_SanPham }]" /><br>
										- Số lượng: <c:out value="${item.soLuong }" /><br>
										- Giá bán: <fmt:formatNumber value="${item.giaTien }"
											groupingUsed="true" /><sup>vnđ</sup><br>
										- Thành tiền: <fmt:formatNumber value="${item.soLuong*item.giaTien }"
											groupingUsed="true" /><sup>vnđ</sup><br>
										- Ngày bắt đầu bảo hành: <c:out value="${item.ngayBatDau_BaoHanh }" /><br>
										- Ngày kết thúc bảo hành: <c:out value="${item.ngayKetThuc_BaoHanh }" /><br>
									</td>
								</tr>
								</c:forEach>
								<tr>
									<th>Tổng tiền: </th>
									<th><fmt:formatNumber value="${donHangManager.tongTien }"
											groupingUsed="true" /><sup>vnđ</sup></th>
								</tr>
								
							</c:if>
							<c:if test="${empty donHangManager}">
								<tr>
									<td colspan="2"><c:out
											value="Không có dữ liệu để hiển thị..." /></td>

								</tr>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</main>

