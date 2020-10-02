<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Xuất hóa đơn</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<link rel="stylesheet" href="">
	<style type="text/css" media="screen">
	*{
		margin: 0;
		padding: 0;
	}	
	</style>
</head>
<body style="font-family: time">
	<div class="container">
		<div class="col-lg-8 offset-lg-2 col-10 offset-1 p-2 mt-5" style="border: solid 1px #000;">
			<div class="row">
				<div class="col-2 offset-1"><img src="http://localhost:8080/template/web/img/logo_2x.png" style="width: 190px; height:48px; margin-top:20px; " alt="QN-SMARTPHONE"></div>
				<div class="col-5 offset-4"><h5 class="mt-2">ĐH:<c:out value="${dh.ma_DonHang }"/><br>Kí hiệu: G1AAA42</h5><p>Ngày....tháng....năm......</p></div>
			</div>
			<div class="row ">
				<div class="col-12"><p class="text-center" style="font-size: 20px;"><b>CÔNG TY TNHH & TM QN-SMARTPHONE</b></p></div>
			</div>
			<div class="row ">
				<div class="col-12"><h2 class="mt-2 text-center" style="text-align: center;"><b onclick="window.print()">HÓA ĐƠN MUA HÀNG</b></h2></div>
			</div>
			<div class="row">
				<div class="col-11 offset-1">
					<p>Đơn vị bán hàng: Công ty TNHH & TM QN-SMARTPHONE<br>Địa chỉ: 02 Thanh Sơn, Hải Châu, Thành Phố Đà Nẵng<br>Điện thoại: 0962293731<br>Số tài khoản: 10204101040405</p>
					<p>Họ tên người mua hàng: <c:out value="${dh.tenNguoiNhan }"/><br>Địa chỉ: <c:out value="${dh.diaChi }"/><br>Điện thoại: <c:out value="${dh.soDienThoai }"/><br>Hình thức mua hàng: <c:out value="${dh.phuongThucMua }"/></p>
				</div>
				<div class="col-12">
					<table class="table table-bordered">
					  <thead>
					    <tr>
					      <th scope="col">STT</th>
					      <th scope="col">Tên Sản Phẩm</th>
					      <th scope="col">Đơn vị tính</th>
					      <th scope="col">Số lượng</th>
					      <th scope="col">Đơn giá</th>
					      <th scope="col">Thành tiền</th>
					    </tr>
					  </thead>
					  <tbody>
					  <c:forEach var="ctdh" items="${dh.listChiTietDonHang}">
					  
					  
					 
					    <tr>
					      <th scope="row">1</th>
					      <td><c:out value="${ctdh.tenSP }"/></td>
					      <td><c:out value="chiếc"/></td>
					      <td><c:out value="${ctdh.soLuong }"/></td>
					      <td><fmt:formatNumber value="${ctdh.giaTien}"
														groupingUsed="true" /> VNĐ</td>
					      <td><fmt:formatNumber value="${ctdh.giaTien*ctdh.soLuong}"
														groupingUsed="true" /> VNĐ</td>
					    </tr>
					    
					     </c:forEach>
					    <tr>
					      <td colspan="6"><p><b>Tổng tiền: <fmt:formatNumber value="${dh.tongTien}"
														groupingUsed="true" /> VNĐ</b></p></td>
					    </tr>
					    <tr>
					      <td colspan="6">
					      	<div class="row pb-5">
					      		<div class="col-3 offset-2"><p>Người mua hàng<br>(kí, ghi rõ họ tên)</p></div>
					      		<div class="col-3 offset-3">Người bán hàng<br>(kí, ghi rõ họ tên)<p></p></div>
					      	</div>
					      	<p class="mt-5">(Cần kiểm tra, đối chiếu khi lập, giao, nhận hóa đơn)</p>
					    </tr>
					  </tbody>
					</table>

				</div>
			</div>
		</div>
	</div>



<script type="text/javascript">

window.print();
</script>
















	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>