
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="template/admin/js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
 <script type="text/javascript">
 				var dataChar1 = {};
 				dataChar1["action"] = 'doanhsobanra';
				
				
             // ajax
				function loadAPIStatisticalLine(data) {
								$.ajax({
											// URL gửi data
											url:'http://localhost:8080/api-admin-statistical',
											// type phương thức gửi get POST DELETE PUT
											type: 'POST',
											// Dữ liệu chuyển kiểu JSON
											contentType: 'application/json',
											// đang là scriptObject phải có bộ chuyển sang json như này
											data: JSON.stringify(data),
											//server trả về 1 json cho clien
											dataType: 'json',
											// thành công sẽ chạy cái này: check result
											success : function(result) {
												Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
								                Chart.defaults.global.defaultFontColor = '#292b2c';
								                var ctx = document.getElementById("myAreaChart");
												 var data1 = result.datasets;
												 var data2 = result.labels;
												 var maxheigth = Math.max.apply(Math,data1) + Math.max.apply(Math,data1)*20/100;
									                maxheigth = Math.round(maxheigth);
												

								                var myLineChart = new Chart(ctx, {
								                  type: 'line',
								                  data: {
								                    labels: data2 ,
								                    datasets: [{
								                      label: "Tổng sản phẩm",
								                      lineTension: 0.3,
								                      backgroundColor: "rgba(2,117,216,0.2)",
								                      borderColor: "rgba(2,117,216,1)",
								                      pointRadius: 5,
								                      pointBackgroundColor: "rgba(2,117,216,1)",
								                      pointBorderColor: "rgba(255,255,255,0.8)",
								                      pointHoverRadius: 5,
								                      pointHoverBackgroundColor: "rgba(2,117,216,1)",
								                      pointHitRadius: 50,
								                      pointBorderWidth: 2,
								                      data: data1,
								                    }],
								                  },
								                  options: {
								                    scales: {
								                      xAxes: [{
								                        time: {
								                          unit: 'date'
								                        },
								                        gridLines: {
								                          display: false
								                        },
								                        ticks: {
								                          maxTicksLimit: data2.length
								                        }
								                      }],
								                      yAxes: [{
								                        ticks: {
								                          min: 0,
								                          max: maxheigth,
								                          maxTicksLimit: 5
								                        },
								                        gridLines: {
								                          color: "rgba(0, 0, 0, .125)",
								                        }
								                      }],
								                    },
								                    legend: {
								                      display: false
								                    }
								                  }
								                });
											},
											// thất bại sẽ chạy cái này:check error
											error : function(error) {
												console.log(error);
											}
										});
							}
				// end ajax
				loadAPIStatisticalLine(dataChar1);
                // Area Chart Example
                

				</script>		
 <script type="text/javascript">
//Set new default font family and font color to mimic Bootstrap's default styling
 Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
 Chart.defaults.global.defaultFontColor = '#292b2c';
 var dataChar2 = {};
 dataChar2["action"] = 'doanhthu';
 // Bar Chart Example
 function loadAPIStatisticalBarChar(data) {
								$.ajax({
											// URL gửi data
											url:'http://localhost:8080/api-admin-statistical',
											// type phương thức gửi get POST DELETE PUT
											type: 'POST',
											// Dữ liệu chuyển kiểu JSON
											contentType: 'application/json',
											// đang là scriptObject phải có bộ chuyển sang json như này
											data: JSON.stringify(data),
											//server trả về 1 json cho clien
											dataType: 'json',
											// thành công sẽ chạy cái này: check result
											success : function(result) {
												console.log(result.datasets);
												var ctx = document.getElementById("myBarChart");
												var heightMax = result.datasets;
												 var maxheigth = Math.max.apply(Math,heightMax) + Math.max.apply(Math,heightMax)*20/100;
									                maxheigth = Math.round(maxheigth);
											 var myLineChart = new Chart(ctx, {
												   type: 'bar',
												   data: {
												     labels: result.labels,
												     datasets: [{
												       label: "Doanh thu",
												       backgroundColor: "rgba(2,117,216,1)",
												       borderColor: "rgba(2,117,216,1)",
												       data: result.datasets,
												     }],
												   },
												   options: {
												     scales: {
												       xAxes: [{
												         time: {
												           unit: 'month'
												         },
												         gridLines: {
												           display: false
												         },
												         ticks: {
												           maxTicksLimit: 6
												         }
												       }],
												       yAxes: [{
												         ticks: {
												           min: 0,
												           max: maxheigth,
												           maxTicksLimit: result.datasets.length
												         },
												         gridLines: {
												           display: true
												         }
												       }],
												     },
												     legend: {
												       display: false
												     }
												   }
												 });
											},
											// thất bại sẽ chạy cái này:check error
											error : function(error) {
												console.log(error);
											}
										});
							}
				// end ajax
 				loadAPIStatisticalBarChar(dataChar2);

 </script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
        <script src="template/admin/assets/demo/datatables-demo.js"></script>
<!--         <script src="template/admin/assets/demo/chart-area-demo.js"></script>-->
