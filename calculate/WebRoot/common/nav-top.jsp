<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- /. NAV TOP  -->
<nav class="navbar-default navbar-side" role="navigation">
<div class="sidebar-collapse">
	<ul class="nav" id="main-menu">
		<li>
			<div class="user-img-div">
				<img src="assets/img/qq.png" class="img-thumbnail" />

				<div class="inner-text">
					Jhon Deo Alex
					<br />
					<small>Last Login : 2 Weeks Ago </small>
				</div>
			</div>

		</li>
		
		<li>
			<a href="IndexAction.action"><i class="fa fa-desktop "></i>首页</a>
		</li>

		<li>
			<a href="#" ><i class="fa fa-square-o "></i>利率计算器 <span class="fa arrow"></span> </a>
			<ul class="nav nav-second-level">
				<li>
					<a href="ExternalAction!simpleInterest.action"><i class="fa fa-toggle-on"></i>单利计算</a>
				</li>
				<li>
					<a href="ExternalAction!compoundInterest.action"><i class="fa fa-toggle-on"></i>复利计算</a>
				</li>
				<li>
					<a href="RecordAction.action"><i class="fa fa-toggle-on"></i>显示历史记录</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="ExchangeRateAction.action"><i class="fa fa-yelp "></i>汇率换算器 </a>
		</li>
		<li>
			<a href="#" ><i class="fa fa-desktop "></i>存款计算 <span class="fa arrow"></span> </a>
			<ul class="nav nav-second-level">
				<li>
					<a href="InterestRateAction.action?type=demand"><i class="fa fa-toggle-on"></i>活期存款</a>
				</li>
				<li>
					<a href="InterestRateAction.action?type=time"><i class="fa fa-toggle-on"></i>定期存款</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="#" ><i class="fa fa-desktop "></i>房贷计算 <span class="fa arrow"></span> </a>
			<ul class="nav nav-second-level">
				<li>
					<a href="LoanRateAction.action"><i class="fa fa-toggle-on"></i>等额本息</a>
				</li>
				<li>
					<a href=""><i class="fa fa-toggle-on"></i>等额本金</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="#"><i class="fa fa-sitemap "></i>拓展预留模块 <span
				class="fa arrow"></span> </a>
			<ul class="nav nav-second-level">
				<li>
					<a href="#"><i class="fa fa-bicycle "></i>Second Level Link</a>
				</li>
				<li>
					<a href="#"><i class="fa fa-flask "></i>Second Level Link</a>
				</li>
				<li>
					<a href="#">Second Level Link<span class="fa arrow"></span> </a>
					<ul class="nav nav-third-level">
						<li>
							<a href="#"><i class="fa fa-plus "></i>Third Level Link</a>
						</li>
						<li>
							<a href="#"><i class="fa fa-comments-o "></i>Third Level Link</a>
						</li>
					</ul>
				</li>
			</ul>
		</li>
		<li>
			<a href="#"><i class="fa fa-square-o "></i>返回顶部</a>
		</li>
	</ul>

</div>

</nav>

