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
								存款计算
							</h1>
							<h1 class="page-subhead-line">
								以下为央行2015年最新公布的存款基准利率
							</h1>
						</div>
					</div>

					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">
								定期存款
							</div>
							<div class="panel-body">
								<div class="tab-content">
									<form method="post" action="">
										<table class="table table-bordered"
											style="text-align: left; vertical-align: middle; border-collapse: 50%">
											<tr>
												<td width="50%">
													<font style="font-weight: bold; font-size: 18px;">利息(元)</font>
												</td>
												<td width="50%">
													<font style="font-weight: bold; font-size: 18px;">本息合计(元)</font>
												</td>
											</tr>
											<tr>
												<td width="50%">
													<input id="rate" name="rate" class="form-control"
														type="text" disabled="disabled" />
												</td>
												<td width="50%">
													<input id="total" name="total" class="form-control"
														type="text" disabled="disabled" />
												</td>
											</tr>
										</table>
										<!-- 上边为显示 -->
										<table class="table table-bordered"
											style="text-align: center;">
											<tr>
												<td style="font-size: 120%" width="20%">
													存款总额(元) :
												</td>
												<td>
													<input id="deposit" name="deposit" class="form-control"
														type="text" placeholder="输入存款总额" />
												</td>
											</tr>
											<tr>
												<td style="font-size: 120%">
													存款期限 :
												</td>
												<td>
													<select class="form-control" id="interestRateItem"
														name="interestRateItem" onchange="selectItemFun()">
														<s:iterator var="i" value="#session.interestRateList">
															<option
																value="<s:property value="#i.interestRate"/>,<s:property value="#i.depositTimeToYear"/>">
																<s:property value="#i.interestRateItem" />
															</option>
														</s:iterator>
													</select>
												</td>
											</tr>
											<tr>
												<td style="font-size: 120%">
													年利率(%) :
												</td>
												<td>
													<input id=interestRate name="interestRate"
														class="form-control" type="text"
														placeholder="请选择存款期限，默认为3个月定期存款(<s:property value="demandInterestRate"/>%)" />
												</td>
											</tr>
										</table>
										<span id="sumbitButton" class="form-control btn btn-success"
											onclick="onclickSubmit()">查询</span>
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
		var data = document.getElementById("interestRateItem").value;
		var arr = new Array();
		arr = data.toString().split(",");
		var interestRate = arr[0];
		var depositTimeToYear = arr[1];
		var deposit = document.getElementById("deposit").value;

		if (deposit.trim() == "") {
			alert("请输入存款数额");
			return;
		}

		var regm = /^[0-9]+(\.?[0-9]+)?$/;
		if (!deposit.match(regm)) {
			alert("请输入正确存款数额");
			return;
		}

		$.ajax({
			type : "post",
			url : "InterestRateAction!timeDeposit.action",
			data : {
				'deposit' : deposit,
				'interestRate' : interestRate,
				'depositTimeToYear' : depositTimeToYear
			},
			success : function(data) {
				var arr = new Array();
				arr = data.toString().split(",");
				document.getElementById("rate").value = arr[0];
				document.getElementById("total").value = arr[1];
			}
		});
		return false;
	}

	function selectItemFun() {
		var data = document.getElementById("interestRateItem").value;
		var arr = new Array();
		arr = data.toString().split(",");
		document.getElementById("interestRate").value = arr[0];
	}
</script>
	</body>
</html>
