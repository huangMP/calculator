<%@ page language="java" import="java.util.*,com.bethinking.model.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
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
			<div id="page-wrapper">
				<div id="page-inner">
					<div class="row">
						<div class="col-md-12">
							<h1 class="page-head-line">
								汇率换算器
							</h1>
							<h1 class="page-subhead-line" >
								This is dummy text , you can replace it with your original text.
							</h1>
						</div>
					</div>

					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4>汇率计算</h4>
							</div>
							<div class="panel-body">
								<div class="tab-content">
									<form method="post" action="">
										<table class="table table-bordered"
											style="text-align: center;">
											<tr>
												<td>
													<select class="form-control" id="currencyId1"
														name="currencyId1">
														<s:iterator var="e" value="#session.exchangeRateList">
															<option value="<s:property value="#e.id"/>">
																<s:property value="#e.currencyName" />
															</option>
														</s:iterator>
													</select>
												</td>
												<td>
													<input id="input1" name="input1" onblur="onclickInput1()"
														onclick="onclickInput1()" class="form-control" type="text"
														value="<s:property value="#session.principal"/>" />
												</td>
											</tr>
											<tr>
												<td>
													<select class="form-control" id="currencyId2"
														name="currencyId2">
														<s:iterator var="e" value="#session.exchangeRateList">
															<option value="<s:property value="#e.id"/>">
																<s:property value="#e.currencyName" />
															</option>
														</s:iterator>
													</select>

												</td>
												<td>
													<input id="input2" name="input2" onblur="onclickInput2()"
														onclick="onclickInput2()" class="form-control" type="text"
														value="<s:property value="#session.result"/>" />
												</td>
											</tr>
										</table>
										<input id="sumbitButton" class="form-control btn btn-success"
											value="submit" onclick="onclickSubmit()" />
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
			function onclickInput1() { 
				document.getElementById("input2").value="";
				document.getElementById("input2").placeholder="";
				document.getElementById("input1").placeholder="请输入本金";
			}
			function onclickInput2() { 
				document.getElementById("input1").value="";
				document.getElementById("input1").placeholder="";
				document.getElementById("input2").placeholder="请输入本金";
			}
			function onclickSubmit(){
				var input1_val = document.getElementById("input1").value;
				var input2_val = document.getElementById("input2").value;
				var currencyId1_val = document.getElementById("currencyId1").value;
				var currencyId2_val = document.getElementById("currencyId2").value;
				
				if(input1_val == "" && input2_val == ""){
					alert("请输入本金");
					return ;
				}
				if(input1_val == ""){
					var input2_value = $("#input2").val();
					//终值、本金、年利率 : 正数、支持小数
					var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
					if (input2_value == null || input2_value.trim() == "") {
						alert("请输入本金");
						return ;
					} else if (input2_value != "" && !input2_value.match(regm2)) {
						alert("本金应为数字，检查后重新输入！");
						return ;
					}
				}else{
					var input1_value = $("#input1").val();
					//终值、本金、年利率 : 正数、支持小数
					var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
					if (input1_value == null || input1_value.trim() == "") {
						alert("请输入本金");
						return ;
					} else if (input1_value != "" && !input1_value.match(regm2)) {
						alert("本金应为数字，检查后重新输入！");
						return ;
					}
				}
				$.ajax({ 
					type: "post", 
					url : "ExchangeRateAction!executeCalculate.action", 
					data: {'input1': input1_val,'input2': input2_val,'currencyId1': currencyId1_val,'currencyId2': currencyId2_val},
					success: function( data ) { 
						if(input1_val == ""){
							document.getElementById("input1").value = data;
						}else{
							document.getElementById("input2").value = data;
						}
					}
				});
			}
	</script>
	</body>
</html>
