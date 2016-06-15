<%@ page language="java" import="java.util.*,com.bethinking.model.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>BeThinking</title>

		<!-- head-start -->
		<jsp:include page="/common/head.jsp"></jsp:include>
		<!-- head-end -->

	</head>
	<body>
		<div id="wrapper">
			<!-- recommend-start -->
			<jsp:include page="/common/recommend.jsp"></jsp:include>
			<!-- recommend-end -->

			<!-- navigation top-start -->
			<jsp:include page="/common/nav-top.jsp"></jsp:include>
			<!-- navigation top-end -->

			<!-- /. NAV SIDE  -->
			<div id="page-wrapper" style="font-family: 微软雅黑">
				<div id="page-inner">
					<div class="row">
						<div class="col-md-12">
							<h1 class="page-head-line">
								房贷计算
							</h1>
							<h1 class="page-subhead-line">
								以下为央行2015年最新公布的存款基准利率，活期存款利率为：${demandInterestRate }%
							</h1>
						</div>
					</div>

					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading" >
								商业贷款
							</div>
							<div class="panel-body">
								<div class="tab-content">
									<form method="post" action="">
										<table class="table table-bordered"
											style=" text-align: left; vertical-align: middle; border-collapse: 50%">
											<tr>
												<td>
													<font style="font-weight:bold;font-size: 18px;">每月月供参考（元）</font>
												</td>
												<td>
													<input id="monthlyAmount" name="monthlyAmount" class="form-control" type="text" disabled="disabled" />
												</td>
											</tr>
											</table>
										<table class="table table-bordered"
											style="text-align: left; vertical-align: middle; border-collapse: 50%">
						
											<tr>
												<td width="50%">
													<font style="font-weight:bold;font-size: 18px;">支付利息(元)</font>
												</td>
												<td width="50%">
													<font style="font-weight:bold;font-size: 18px;">还款总额(元)</font>
												</td>
											</tr>
											<tr>
												<td width="50%">
													<input id="interestPayment" name="interestPayment"  class="form-control" type="text" disabled="disabled"/>
												</td>
												<td width="50%">
													<input id="totalDueAmount" name="totalDueAmount" class="form-control" type="text" disabled="disabled"/>
												</td>
											</tr>
										</table>
										<!-- 上边为显示 -->
										<table class="table table-bordered"
											style="text-align: center;">
											<tr>
												<td style="font-size: 120%" width="20%">
													贷款类型 :
												</td>
												<td>
													<select class="form-control" id="loanType"
														name="loanType" value="">
															<option value="0">
																商业贷款
															</option>
															<option value="1">
																公积金贷款
															</option>
													</select>
												</td>
											</tr>
											<tr>
												<td style="font-size: 120%" width="20%">
													贷款金额(万) :
												</td>
												<td>
													<input id="loanMoney" name="loanMoney" class="form-control" type="text" placeholder="输入金额"/>
												</td>
											</tr>
											<tr>
												<td style="font-size: 120%">
													期限(年) :
												</td>
												<td>
													<select class="form-control" id="loanTime"
														name="loanTime" value="">
															<option value="5">5</option>
															<option value="10">10</option>
															<option value="15">15</option>
															<option value="20">20</option>
															<option value="25">25</option>
															<option value="30">30</option>
													</select>
												</td>
											</tr>
										</table>
										<span id="sumbitButton" class="form-control btn btn-success"
											onclick="onclickSubmit()" >查询</span >
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->
		<!-- /. WRAPPER  -->

		<!-- footer-start -->
		<jsp:include page="/common/footer.jsp"></jsp:include>
		<!-- footer-end -->

		<script type="text/javascript">
	function onclickSubmit() {

		var loanTime_value = document.getElementById("loanTime").value;
		var loanMoney_value = document.getElementById("loanMoney").value;
		var loanType_value = document.getElementById("loanType").value;
		
		var loanMoney_val = $("#loanMoney").val();
		//终值、本金、年利率 : 正数、支持小数
		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;

		if (loanMoney_val.trim() == "") {
			alert("请输入贷款金额");
			return;
		}else if (loanMoney_val != "" && !loanMoney_val.match(regm2)) {
			alert("贷款金额应为正数，检查后重新输入！");
			return ;
		}
		
		$.ajax({
			type : "post",
			url : "LoanRateAction!calculate.action",
			data : {
				'loanTime' : loanTime_value,
				'loanMoney' : loanMoney_value,
				'loanType' : loanType_value
			},
			success : function(data) {
 				var arr = new Array();
				arr = data.toString().split(",");
				document.getElementById("monthlyAmount").value = arr[0];
				document.getElementById("interestPayment").value = arr[1]; 
				document.getElementById("totalDueAmount").value = arr[2]; 
			}
		});
		return false;
	}
</script>
	</body>
</html>
