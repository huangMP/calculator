<%@ page language="java" import="java.util.*,com. bethinking.model.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	Record record=(Record)session.getAttribute("record");
	int newCalculateBlock=record.getCalculateBlock();
	int calculateWay=record.getCalculateWay();
%>
 
	<div class="statusBar" style="text-align: center">
		<nav>
			<ul class="pagination pagination-lg">
				<!-- 0是求本金   1是求终值     2是求年利率 3求存入年限 -->
				<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=<%=calculateWay - 1%>"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span></a></li>
				<c:choose>
					<c:when test="${record.calculateWay==0}">
						<li class="active"><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=0" Id="li0" name="li0"
							value="" type="text" >求本金</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=0" Id="li0" name="li0"
							value="" type="text">求本金</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${record.calculateWay==1}">
						<li class="active"><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=1" Id="li1" name="li1"
							value="" type="text">求终值</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=1" Id="li1" name="li1"
							value="" type="text">求终值</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${record.calculateWay==2}">
						<li class="active"><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=2" Id="li2" name="li2"
							value="" type="text">求年利率</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=2" Id="li2" name="li2"
							value="" type="text">求年利率</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${record.calculateWay==3}">
						<li class="active"><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=3" Id="li3" name="li3"
							value="" type="text">求存入年限</a></li></a></li>
					</c:when>
					<c:otherwise>
						<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=3" Id="li3" name="li3"
							value="" type="text">求存入年限</a></li></a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${record.calculateBlock==2&&record.calculateWay!=4}">
						<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=4" Id="li5"
							name="li5" value="" type="text">等额还款</a></li>
					</c:when>
					<c:when test="${record.calculateBlock==2&&record.calculateWay==4}">
						<li class="active"><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=4" Id="li5"
							name="li5" value="" type="text">等额还款</a></li>
					</c:when>
				</c:choose>
				<li><a href="<%=path%>/changeCalculateWay.jsp?calculateWay=<%=calculateWay + 1%>"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
		</nav>
	</div>
<!-- options end -->
