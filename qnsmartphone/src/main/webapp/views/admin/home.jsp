<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp"%>
 <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">QN-SmartPhone</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Thống kê</li>
                        </ol>
                        <div class="row">
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-primary text-white mb-4">
                                    <div class="card-body">Thống kê</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" href="#">View Details</a>
                                        <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-warning text-white mb-4">
                                    <div class="card-body">Warning Card</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" href="#">View Details</a>
                                        <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-success text-white mb-4">
                                    <div class="card-body">Success Card</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" href="#">View Details</a>
                                        <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-danger text-white mb-4">
                                    <div class="card-body">Danger Card</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" href="#">View Details</a>
                                        <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xl-6">
                                <div class="card mb-4">
                                    <div class="card-header"><i class="fas fa-chart-area mr-1"></i>Thống kê doanh số bán theo tháng</div>
                                    <div class="card-body"><canvas id="myAreaChart" width="100%" height="40"></canvas></div>
                                </div>
                            </div>
                            <div class="col-xl-6">
                                <div class="card mb-4">
                                    <div class="card-header"><i class="fas fa-chart-bar mr-1"></i>Thống kê doanh thu theo tháng</div>
                                    <div class="card-body"><canvas id="myBarChart" width="100%" height="40"></canvas></div>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-header"><i class="fas fa-table mr-1"></i>Danh sách sản phẩm bán chạy nhất tháng</div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
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
                                                <th>THƯƠNG HIỆU</th>
                                                <th>TRẠNG THÁI</th>
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:if test="${not empty listSanPham}">
                                        <c:forEach var="sanPham" items="${listSanPham}">
                                        
                                            <tr>
                                                <td><c:out value="${sanPham.ma_SanPham }"/></td>
                                                <td><c:out value="${sanPham.ten_SanPham }"/></td>
                                                <td><c:out value="${sanPham.soLuongCon }"/></td>
                                                <td><c:out value="${sanPham.soLuongNhap }"/></td>
                                                <td><c:out value="${sanPham.soLuongDaBan }"/></td>
                                                <td><fmt:formatNumber value="${sanPham.gia_Ban }"
														groupingUsed="true" /><sup>vnđ</sup></td>
                                                <td><c:out value="${sanPham.diemDanhGia }"/></td>
                                                <td><c:out value="${sanPham.thuongHieu }"/></td>
                                                <td><c:out value="${sanPham.trangThai }"/></td>
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
               
                