
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="template/admin/js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
 <script type="text/javascript">
             // Set new default font family and font color to mimic Bootstrap's default styling
                Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
                Chart.defaults.global.defaultFontColor = '#292b2c';

                // Area Chart Example
                var ctx = document.getElementById("myAreaChart");
                var data1 = [10000, 30162, 26263, 18394, 18287, 28682, 31274, 33259, 25849, 24159, 32651, 31984, 38451];
                var data2 = ["Mar 1", "Mar 2", "Mar 3", "Mar 4", "Mar 5", "Mar 6", "Mar 7", "Mar 8", "Mar 9", "Mar 10", "Mar 11", "Mar 12", "Mar 14"];
                var maxheigth = Math.max.apply(Math,data1) + Math.max.apply(Math,data1)*20/100;
                maxheigth = Math.round(maxheigth);
                var myLineChart = new Chart(ctx, {
                  type: 'line',
                  data: {
                    labels: data2 ,
                    datasets: [{
                      label: "Sessions",
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

				</script>		
        <script src="template/admin/assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
        <script src="template/admin/assets/demo/datatables-demo.js"></script>
<!--         <script src="template/admin/assets/demo/chart-area-demo.js"></script>-->
