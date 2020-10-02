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
                            <div class="card-header bg-success text-white"><i class="fas fa-table mr-1"></i>Danh sách đơn hàng chưa có người giao. Bạn có thể chọn đơn hàng rồi giao hàng</div>
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
                                                <th></th>
                                            </tr>
                                        </thead>
                                       
                                        <tbody>
                                        <c:if test="${not empty donHangManager}">
                                        <c:forEach var="donHang" items="${donHangManager}">
                                        <c:if test="${donHang.tenShipper == 'unknow'}">
                                            <tr>
                                                <td><c:out value="${donHang.ma_DonHang }"/></td>
                                                <td><c:out value="${donHang.tenNguoiNhan }"/></td>
                                                <td><c:out value="${donHang.diaChi }"/></td>
                                                <td><c:out value="${donHang.soDienThoai }"/></td>
                                                <td><c:out value="${donHang.phuongThucThanhToan }"/></td>
                                                <td><c:out value="${donHang.phuongThucMua }"/></td>
                                                <td><fmt:formatNumber value="${donHang.tongTien }"
														groupingUsed="true" /><sup>vnđ</sup></td>
                                                <td><a class="btn btn-sm btn-success" href="shipper-manager?action=set&ma_donhang=<c:out value="${donHang.ma_DonHang }"/>">Nhận giao</a></td>
                                            </tr>
                                            </c:if>
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
                                <!-- đơn giao -->
                                <br>
                                 <div class="card mb-4">
                            <div class="card-header bg-success text-white"><i class="fas fa-table mr-1"></i>Danh sách đơn hàng chưa có người giao. Bạn có thể chọn đơn hàng rồi giao hàng</div>
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
                                            </tr>
                                        </thead>
                                       
                                        <tbody>
                                        <c:if test="${not empty donHangShipper}">
                                        <c:forEach var="donHangSP" items="${donHangShipper}">
                                        
                                            <tr>
                                                <td><a href="shipper-manager?action=get&ma_donhang=<c:out value="${donHangSP.ma_DonHang }"/>"><c:out value="${donHangSP.ma_DonHang }"/></a></td>
                                                <td><c:out value="${donHangSP.tenNguoiNhan }"/></td>
                                                <td><c:out value="${donHangSP.diaChi }"/></td>
                                                <td><c:out value="${donHangSP.soDienThoai }"/></td>
                                                <td><c:out value="${donHangSP.phuongThucThanhToan }"/></td>
                                                <td><c:out value="${donHangSP.phuongThucMua }"/></td>
                                                <td><fmt:formatNumber value="${donHangSP.tongTien }"
														groupingUsed="true" /><sup>vnđ</sup></td>
                                            </tr>
                                            </c:forEach>
                                            </c:if>
                                              <c:if test="${empty donHangShipper}">
                                               <tr>
                                                <td colspan="9"><c:out value="Trống... Vui lòng nhận đơn hàng để giao"/></td>
                                            </tr>
                                              </c:if>
                                        </tbody>
                                    </table>
                                </div>
                                </div>
                                </div>
                                <!-- đơn giao -->
                            </div>
                        </div>
                    </div>
                </main>
               
                