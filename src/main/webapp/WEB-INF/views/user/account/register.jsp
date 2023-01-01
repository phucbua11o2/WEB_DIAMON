<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
</head>
<body>
	<div class="row">
<div id="sidebar" class="span3">
<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${categories}">
						<li><a href='<c:url value="/san-pham/${item.id} "/>'><span
								class="icon-chevron-right"></span> ${item.name }</a></li>
					</c:forEach>
					<li><a class="totalInCart" href="cart.html"><strong>Tổng tiền <span class="badge badge-warning pull-right"
								style="line-height: 18px;"><fmt:formatNumber
											type="number" maxFractionDigits="3" value="${totalPriceCart }" />
										đ </span>
						</strong></a></li>
				</ul>
			</div>

			  <div class="well well-small alert alert-warning cntr">
				<h2>Giảm 50% </h2>
				<p>
					khi mua sắm online <br> <br> <a
						class="defaultBtn" href="#">Nhận ngay</a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img src="assets/user/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Sản phẩm sắp ra mắt <br>
				<small>Xem</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
			<li>
					<div class="thumbnail">
						<img src="assets/user/img/1.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="assets/user/img/2.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="assets/user/img/3.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="assets/user/img/4.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="assets/user/img/5.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="assets/user/img/6.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
		  </ul>

	</div>
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
		<li class="active">Người dùng</li>
    </ul>
	<h3> Login</h3>	
	<hr class="soft"/>
	
	<div class="row">
		<div class="span4">
			<div class="well">
			<h5>Đăng ký tài khoản</h5>
			<h1>${status }</h1>
			<hr>
			<form:form action="dang-ky" method="POST" modelAttribute="users">   
			  <div class="control-group">
				<label class="control-label" for="inputEmail">E-mail</label>
				<div class="controls">
				   <form:input class="span3" type="email" path="user" placeholder="Nhập email"/> 
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputPassword">Mật khẩu</label>
				<div class="controls">
				  <form:input class="span3" type="password" path="password" placeholder="Nhập mật khẩu"/>
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputName">Họ và tên</label>
				<div class="controls">
				  <form:input class="span3" type="text" path="display_name" placeholder="Nhập họ tên"/>
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputAddress">Địa chỉ</label>
				<div class="controls">
				  <form:input class="span3" type="text" path="address" placeholder="Nhập địa chỉ"/>
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputPhone">SDT</label>
				<div class="controls">
				  <form:input class="span3" type="text" path="phone" placeholder="Nhập số điện thoại"/>
				</div>
			  </div>
			  <div class="controls">
			  <button type="submit" class="btn block">Tạo tài khoản</button>
			  </div>
			</form:form>
		</div>
		</div>
		<div class="span1"> &nbsp;</div>
		<div class="span4">
			<div class="well">
			<h5>Đăng nhập</h5>
			<h1>${statusLogin }</h1>
			<form:form action="dang-nhap" method="POST" modelAttribute="users">  
			  <div class="control-group">
				<label class="control-label" for="inputEmail">Email</label>
				<div class="controls">
				  <form:input class="span3" type="email" path="user" placeholder="Nhập email"/>  
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputPassword">Mật khẩu</label>
				<div class="controls">
				  <form:input class="span3" type="password" path="password" placeholder="Nhập mật khẩu"/>
				</div>
			  </div>
			  <div class="control-group">
				<div class="controls">
				  <button type="submit" class="defaultBtn">Đăng nhập</button> <a href="#">Quên mật khẩu?</a>
				</div>
			  </div>
			</form:form>
		</div>
		</div>
	</div>	
	
</div>
</div>
</body>