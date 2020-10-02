<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp"%>
 <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">QN-SmartPhone</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Thống kê</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header"><i class="fas fa-table mr-1"></i>Danh sách đơn hàng chưa hoàn thành</div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-sm" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>TÊN KH</th>
                                                <th>ĐỊA CHỈ GIAO</th>
                                                <th>SỐ ĐIỆN THOẠI</th>
                                                <th>THANH TOÁN</th>
                                                <th>MUA HÀNG</th>
                                                <th>TỔNG TIỀN</th>
                                                <th>SHIPPER</th>
                                                <th>TRẠNG THÁI</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                              <th>ID</th>
                                                <th>TÊN KH</th>
                                                <th>ĐỊA CHỈ GIAO</th>
                                                <th>SỐ ĐIỆN THOẠI</th>
                                                <th>THANH TOÁN</th>
                                                <th>MUA HÀNG</th>
                                                <th>TỔNG TIỀN</th>
                                                <th>SHIPPER</th>
                                                <th>TRẠNG THÁI</th>
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:if test="${not empty donHangManager}">
                                        <c:forEach var="donHang" items="${donHangManager}">
                                        
                                            <tr>
                                                <td><a href="quanly-detailOrder?ma_donhang=<c:out value="${donHang.ma_DonHang }"/>"><c:out value="${donHang.ma_DonHang }"/></a></td>
                                                <td><c:out value="${donHang.tenNguoiNhan }"/></td>
                                                <td><c:out value="${donHang.diaChi }"/></td>
                                                <td><c:out value="${donHang.soDienThoai }"/></td>
                                                <td><c:out value="${donHang.phuongThucThanhToan }"/></td>
                                                <td><c:out value="${donHang.phuongThucMua }"/></td>
                                                <td><fmt:formatNumber value="${donHang.tongTien }"
														groupingUsed="true" /><sup>vnđ</sup></td>
                                                <td><c:out value="${donHang.tenShipper }"/></td>
                                                <td><c:out value="${donHang.trangThaiDonHangModel.thongTin_TrangThai }"/></td>
                                            </tr>
                                            </c:forEach>
                                            </c:if>
                                              <c:if test="${empty donHangManager}">
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
               
                