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
								<!-- <th><a href="quanly-detailOrder?action=updatetrangthai&ma_trangthai=7&ma_donhang=<c:out value="${donHangManager.ma_DonHang }" />" class="btn btn-sm btn-success">Xát nhận đã nhận tiền từ shipper</a></th> -->
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
									<td class="bg-warning"><fmt:formatNumber value="${donHangManager.tongTien }"
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
									
									<td class="bg-info"><c:out value="${donHangManager.tenShipper }" /></td>
									
								</tr>
								<tr>
									<td>Trạng thái đơn hàng:</td>
									<td><form action="shipper-manager" method="POST">
									<input type="hidden" name="action" value="trangthaidonhang"> 
									<input type="hidden" name="ma_donhang" value="<c:out value="${donHangManager.ma_DonHang }" />">
									<select class=" bg-success p-1 text-white" name="trangthaidonhang" style="width: 50%">
									       
									        <c:forEach items="${listTrangThai }" var="trangthaidonhang">
									        <c:if test="${trangthaidonhang.ma_TrangThai != 7 && trangthaidonhang.ma_TrangThai >= 3}">
									         <option value='<c:out value="${trangthaidonhang.ma_TrangThai }"/>' <c:if test="${trangthaidonhang.ma_TrangThai == donHangManager.trangThaiDonHangModel.ma_TrangThai }">selected</c:if>><c:out value="[${trangthaidonhang.thongTin_TrangThai }]"/></option>
									        </c:if>
									        
									        </c:forEach>  
									      </select>
									      <input type="submit" value="cập nhập" style="width: 50%" class="btn btn-sm btn-success mt-2">
									      </form>
									</td>
								</tr>
								<tr>
									<td>Tình trạng đơn hàng:</td>
									<td>
									<c:forTokens items="${donHangManager.tinhTrang_DonHang }" delims="|" var="itemtt">
										<c:out value="${itemtt }"/><br>
									</c:forTokens>
									
									<form action="shipper-manager" method="POST">
									<input type="hidden" name="action" value="tinhtrangdonhang"> 
									<input type="hidden" name="ma_donhang" value="<c:out value="${donHangManager.ma_DonHang }"/>"> 
									<select class="bg-success p-1 text-white mt-3" name="tinhtrangselect" style="width: 50%">
									        <option value="" selected>Choose...</option>
									        <option value='Shipper đã tiếp nhận hàng từ kho.'>Shipper đã nhận hàng từ kho</option>
												<option value='Đang đi giao.'>Shipper đang đi giao hàng cho bạn</option>
												<option value='Shipper gọi khách hàng không nghe máy.'>Shipper gọi khách hàng không nghe máy</option>
												<option value='Khách hàng hẹn giao thời gian khác.'>Khách hàng hẹn giao thời gian khác</option>
												<option value='Shipper hẹn giao thời gian khác.'>Shipper hẹn giao thời gian khác</option>
												<option value='Khách hàng từ chối không nhận hàng.'>Khách hàng từ chối không nhận hàng</option>
												<option value='Đơn hàng bị hủy vì khách hàng không nhận hàng.'>Đơn hàng bị hủy vì khách hàng không nhận hàng.</option>
												<option value='Khách hàng đã nhận hàng.'>Khách hàng đã nhận hàng.</option>
											</select><br>
									<input  type="text" name="tinhtranginput" class="mt-2 " style="width: 50%">
									<br>
									<input type="submit" value="cập nhập" style="width: 50%" class="btn btn-sm btn-success mt-2">
									</form>
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

