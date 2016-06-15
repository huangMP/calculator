<%@ page language="java" import="java.util.*,com.bethinking.model.*"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<div id="page-wrapper">
				<div id="page-inner">
					<div class="row">
						<div class="col-md-12">
							<h1 class="page-head-line">
								显示历史记录
							</h1>
							<h1 class="page-subhead-line">
								This is dummy text , you can replace it with your original text.
							</h1>
						</div>
					</div>
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4>
									用户使用记录
								</h4>
							</div>
							<div class="panel-body">
								<div class="tab-content">
									<table class="table table-striped table-hover top10">
										<c:if test="${recordList.size()==0}">
											<div class="top10">
												<div class="alert alert-danger">
													系统还没有您的使用记录，
													<a href="<%=path%>/">请返回首页</a>，使用复利计算器吧.
												</div>
											</div>
										</c:if>
											<!-- Table -->
											<table class="table table-hover">
											<thead>
												<tr>
													<th>
														<h4>本金</h4>
													</th>
													<th>
														<h4>年利率</h4>
													</th>
													<th>
														<h4>存入年限</h4>
													</th>
													<th>
														<h4>终值</h4>
													</th>
													<th>
														<h4>计算方式</h4>
													</th>
													<th>
														<h4>计算模块</h4>
													</th>
												</tr>
												</thead>
												<c:forEach items="${recordList}" var="recordItem"
													varStatus="Record">
													<tr>
														<td>
															${recordItem.getNumP() }
														</td>
														<td>
															${recordItem.getNumI() }
														</td>
														<td>
															${recordItem.getNumN() }
														</td>
														<td>
															${recordItem.getNumF() }
														</td>
														<td>
															${recordItem.getCalculateWayValue() }
														</td>
														<td>
															${recordItem.getCalculateBlockValue() }
														</td>
													</tr>
												</c:forEach>
											</table>
									</table>
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
</html>
