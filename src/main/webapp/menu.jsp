<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container header">
	<div class="span5">
		<div class="logo">
			<a href="index.htm">
				<img src="./image/r___________renleipic_01/logo.gif" alt="传智播客"/>
			</a>
		</div>
	</div>
	<div class="span9">
<div class="headerAd">
	<img src="./image/header.jpg" width="320" height="50" alt="正品保障" title="正品保障"/>
</div>	</div>
	<div class="span10 last">
		<div class="topNav clearfix">
			<ul>
			<c:if test="${sessionScope.currentCustomer==null}">
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="login.jsp">登录</a>|
				</li>
				<li id="headerRegister" class="headerRegister" style="display: list-item;">
					<a href="regist.jsp">注册</a>|
				</li>
			</c:if>
			<c:if test="${sessionScope.currentCustomer!=null}">
			<li id="headerRegister" class="headerRegister" style="display: list-item;">
					<a href="">欢迎你:${sessionScope.currentCustomer.username}</a>|
				</li>
				<li id="headerRegister" class="headerRegister" style="display: list-item;">
					<a href="${ pageContext.request.contextPath }/customerAction_logout.action">退出</a>|
				</li>
					</c:if>
		
			
						<li>
							<a>会员中心</a>
							|
						</li>
						<li>
							<a>购物指南</a>
							|
						</li>
						<li>
							<a>关于我们</a>
							
						</li>
			</ul>
		</div>
		<c:if test="${sessionScope.currentCustomer!=null}">
		<div class="cart">
			<a  href="cat.jsp">购物车8件</a>
		</div>
				</c:if>
			<div class="phone">
				客服热线:
				<strong>96008/53277764</strong>
			</div>
	</div>
	<div class="span24">
		<ul class="mainNav">
					<li>
						<a href="./index.jsp">首页</a>
						|
					</li>
					<li>
						<a href="./category.jsp">定制套餐</a>
						|
					</li>
					<li>
						<a >安全频道</a>
						|
					</li>
					<li>
						<a>亿家卡</a>
						|
					</li>
					<li>
						<a>蔬菜基地</a>
						|
					</li>
					<li>
						<a>节气养生</a>
						|
					</li>
					<li>
						<a>便民服务</a>
						|
					</li>
					
		</ul>
	</div>


</div>	