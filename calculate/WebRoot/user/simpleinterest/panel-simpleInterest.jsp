<%@ page language="java" import="java.util.*,com. bethinking.model.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
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
								复利计算
							</h1>
							<h1 class="page-subhead-line">
								This is dummy text , you can replace it with your original text.
							</h1>
						</div>
					</div>
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4>单利计算器</h4>
							</div>
							<div class="panel-body">
								<ul class="nav nav-pills" style="padding-bottom: 10px;"
									id="ultest">
									<li class="" id="ultest1">
										<a href="#home-pills" data-toggle="tab" name="0">求本金</a>
									</li>
									<li class="active">
										<a href="#profile-pills" data-toggle="tab" name="1">求終值</a>
									</li>
									<li class="">
										<a href="#messages-pills" data-toggle="tab" name="2">求年利率</a>
									</li>
									<li class="">
										<a href="#settings-pills" data-toggle="tab" name="3">求存入年限</a>
									</li>
								</ul>
								<div class="tab-content">
									<div class="tab-pane fade" id="home-pills">
										<h4>
											home
										</h4>
										<p>
											Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
											do eiusmod tempor incididunt ut labore et dolore magna
											aliqua. Ut enim ad minim veniam, quis nostrud exercitation
											ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
											aute irure dolor in reprehenderit in voluptate velit esse
											cillum dolore eu fugiat nulla pariatur. Excepteur sint
											occaecat cupidatat non proident, sunt in culpa qui officia
											deserunt mollit anim id est laborum.
										</p>
									</div>
									<div class="tab-pane fade active in" id="profile-pills">
										<h4>
											profile
										</h4>
										<p>
											Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
											do eiusmod tempor incididunt ut labore et dolore magna
											aliqua. Ut enim ad minim veniam, quis nostrud exercitation
											ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
											aute irure dolor in reprehenderit in voluptate velit esse
											cillum dolore eu fugiat nulla pariatur. Excepteur sint
											occaecat cupidatat non proident, sunt in culpa qui officia
											deserunt mollit anim id est laborum.
										</p>
									</div>
									<div class="tab-pane fade" id="messages-pills">
										<h4>
											messages
										</h4>
										<p>
											Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
											do eiusmod tempor incididunt ut labore et dolore magna
											aliqua. Ut enim ad minim veniam, quis nostrud exercitation
											ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
											aute irure dolor in reprehenderit in voluptate velit esse
											cillum dolore eu fugiat nulla pariatur. Excepteur sint
											occaecat cupidatat non proident, sunt in culpa qui officia
											deserunt mollit anim id est laborum.
										</p>
									</div>
									<div class="tab-pane fade" id="settings-pills">
										<h4>
											settings
										</h4>
										<p>
											Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
											do eiusmod tempor incididunt ut labore et dolore magna
											aliqua. Ut enim ad minim veniam, quis nostrud exercitation
											ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
											aute irure dolor in reprehenderit in voluptate velit esse
											cillum dolore eu fugiat nulla pariatur. Excepteur sint
											occaecat cupidatat non proident, sunt in culpa qui officia
											deserunt mollit anim id est laborum.
										</p>
									</div>
									<form method="post" action="">
										<table class="table table-bordered"
											style="text-align: center;">
											<tr>
												<input id="record.calculateWay" name="record.calculateWay"
													type="hidden" value="1"></input>
												<input id="record.calculateBlock"
													name="record.calculateBlock" type="hidden" value="1"></input>
											</tr>
											<tr>
												<td>
													<h4>
														本金
													</h4>
												</td>
												<td>
													<input id="numP" name="record.numP" class="form-control"
														type="text" value="${record.numP}" onblur="doChecknumP()" />
													<span class="inputError"></span>
												</td>
											</tr>
											<tr>
												<td>
													<h4>
														年利率
													</h4>
												</td>
												<td>
													<input id="numI" name="record.numI" class="form-control"
														type="text" value="${record.numI}" onblur="doChecknumI()" />
													<span class="inputError"></span>
												</td>
											</tr>
											<tr>
												<td>
													<h4>
														存入年限
													</h4>
												</td>
												<td>
													<input id="numN" name="record.numN" class="form-control"
														type="text" value="${record.numN}" onblur="doChecknumN()" />
													<span class="inputError"></span>
												</td>
											</tr>
											<tr>
												<td>
													<h4>
														终值
													</h4>
												</td>
												<td>
													<input id="numF" name="record.numF" class="form-control"
														disabled="disabled" type="text" value="${record.numF}"
														onblur="doChecknumF()" />
													<span class="inputError"></span>
												</td>
											</tr>
										</table>
										<input class="form-control btn btn-success" value="submit"
											onclick="doCheckAll()" />
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

	</body>
	<script type="text/javascript">
	function doCheckAll() { //1是求终值     0是求本金  2是求年利率  3是求存入年限  4是求分期付款
		var numP = $("#numP").val();
		var numI = $("#numI").val();
		var numN = $("#numN").val();
		var numF = $("#numF").val();
		//终值、本金、年利率 : 正数、支持小数
		var regm2 = /^[0-9]+(\.?[0-9]+)?$/;
		//存入年限：正整数
		var regm3 = /^[1-9]+(\.?[0-9]+)?$/;
		var calculateWay = document.getElementById("record.calculateWay").value;
		if (calculateWay != "0" && calculateWay != "4") {
			if (numP == null || numP.trim() == "") {
				alert("请填写:本金");
				return;
			} else if (numP != "" && !numP.match(regm2)) {
				alert("本金应为正数，检查后重新输入！");
				return;
			}
		}
		if (calculateWay != "1") {
			if (numF == null || numF.trim() == "") {
				alert("请填写:终值");
				return;
			} else if (numF != "" && !numF.match(regm2)) {
				alert("终值应为正数，检查后重新输入！");
				return;
			}
		}
		if (calculateWay != "2") {
			if (numI == null || numI.trim() == "") {
				alert("请填写:存入年利率");
				return;
			} else if (numI != "" && !numI.match(regm2)) {
				alert("存入年限应为正数，检查后重新输入！");
				return;
			}
		}
		if (calculateWay != "3") {
			if (numN == null || numN.trim() == "") {
				alert("请填写:存入年限");
				return;
			} else if (numN != "" && !numN.match(regm3)) {
				alert("存入年限应为正整数，检查后重新输入！");
				return;
			}
		}

		var numP_val = document.getElementById("numP").value;
		var numI_val = document.getElementById("numI").value;
		var numN_val = document.getElementById("numN").value;
		var numF_val = document.getElementById("numF").value;
		var record_calculateWay = document
				.getElementById("record.calculateWay").value;
		var record_calculateBlock = document
				.getElementById("record.calculateBlock").value;

		$.ajax({
			type : "post",
			url : "ExternalAction!calculate.action",
			data : {
				'record.numP' : numP_val,
				'record.numI' : numI_val,
				'record.numN' : numN_val,
				'record.numF' : numF_val,
				'record.calculateWay' : record_calculateWay,
				'record.calculateBlock' : record_calculateBlock
			},
			success : function(data) {
				if (record_calculateWay == "0" || record_calculateWay == "4") {
					document.getElementById("numP").value = data;
				} else if (record_calculateWay == "1") {
					document.getElementById("numF").value = data;
				} else if (record_calculateWay == "2") {
					document.getElementById("numI").value = data;
				} else if (record_calculateWay == "3") {
					document.getElementById("numN").value = data;
				}
			}
		});
	}

	document.getElementById("ultest").onclick = function(ev) {
		document.getElementById("numP").value = "";
		document.getElementById("numN").value = "";
		document.getElementById("numI").value = "";
		document.getElementById("numF").value = "";
		var ev = ev || window.event;
		var target = ev.target || ev.srcElement;
		//alert(target.innerHTML);
		var id = target.name;
		var oldId = document.getElementById("record.calculateWay").value;
		document.getElementById("record.calculateWay").value = id;
		//document.getElementById("numP").value
		switch (oldId) {
		case '0':
			document.getElementById("numP").disabled = "";
			document.getElementById("numP").onblur = "";
			break;
		case '1':
			document.getElementById("numF").disabled = "";
			document.getElementById("numP").onblur = "";
			break;
		case '2':
			document.getElementById("numI").disabled = "";
			document.getElementById("numP").onblur = "";
			break;
		case '3':
			document.getElementById("numN").disabled = "";
			document.getElementById("numP").onblur = "";
			break;
		default:
			break;
		}

		switch (id) {
		case '0':
			document.getElementById("numP").disabled = "disabled";
			document.getElementById("numP").onblur = "doChecknumP()";
			break;
		case '1':
			document.getElementById("numF").disabled = "disabled";
			document.getElementById("numF").onblur = "doChecknumF()";

			break;
		case '2':
			document.getElementById("numI").disabled = "disabled";
			document.getElementById("numI").onblur = "doChecknumI()";

			break;
		case '3':
			document.getElementById("numN").disabled = "disabled";
			document.getElementById("numN").onblur = "doChecknumN()";
			break;
		default:
			break;
		}
	}
</script>
</html>
