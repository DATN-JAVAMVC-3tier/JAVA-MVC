<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<script type="text/javascript" charset="utf-8" async defer>
 function addCard(ma_SanPham){
	 $.ajax({
			// URL gửi data
			url:'http://localhost:8080/AddCartAPI?productCode=' + ma_SanPham,
			// type phương thức gửi get POST DELETE PUT
			type: 'GET',
			// Dữ liệu chuyển kiểu JSON
			//contentType: 'application/json',
			// đang là scriptObject phải có bộ chuyển sang json như này
			//data: JSON.stringify(data),
			//server trả về 1 json cho clien
			//dataType: 'json',
			// thành công sẽ chạy cái này: check result
			success : function(result) {
				if(result == 0){
					$(".ctdhmesage").html('<div class="card-header" style="position: absolute;right:0vh;top:10vh;z-index: 10000;"><div class="alert alert-warning alert-dismissible text-center"role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"> <span aria-hidden="true">&times;</span> </button> <strong>Oop!</strong> Sản phẩm đã có trong giỏ hàng hoặc đã quá số lượng giỏ hàng</div> </div>');
					  $("html, body").animate({ scrollTop: 0 }, "slow");
				}else{
					$("#setcartcount").html(result);
					$(".ctdhmesage").html('<div class="card-header" style="position: absolute;right:0vh;top:10vh;z-index: 10000;"><div class="alert alert-success alert-dismissible text-center"role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"> <span aria-hidden="true">&times;</span> </button> <strong>Success!</strong> Thêm sản phẩm thành công nhấn vào giỏ hàng để xem chi tiết</div> </div>');
					  $("html, body").animate({ scrollTop: 0 }, "slow");
				}
				console.log(result);
			},
			// thất bại sẽ chạy cái này:check error
			error : function(error) {
				$(".ctdhmesage").html('<div class="card-header" style="position: absolute;right:0vh;top:10vh;z-index: 10000;"><div class="alert alert-warning alert-dismissible text-center"role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"> <span aria-hidden="true">&times;</span> </button> <strong>Oop!</strong> Thêm sản phẩm thất bại</div> </div>');
				  $("html, body").animate({ scrollTop: 0 }, "slow");
				console.log(error);
			}
		});
 }
</script>