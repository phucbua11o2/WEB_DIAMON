<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta charset="UTF-8">
<title>Sửa hình ảnh</title>
</head>
<body>
	<div class="row">
		
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Sửa hình ảnh</li>
			</ul>
			<h3>Sửa hình ảnh</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span12">
					<div class="well">
						<hr> 
						<h3>Sửa hình ảnh</h3>
						<form:form action="${colors.id}" method="POST" modelAttribute="colors" class="form-horizontal" style="margin-left: 200px;"> 
							
							<div class="control-group">
								<label class="control-label">ID Product<sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="id_product" placeholder="Nhập id sản phẩm"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Name <sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="name" placeholder="Nhập tên màu"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Code<sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="code" placeholder="Nhập code màu"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">IMG<sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="img" placeholder="Nhập tên image"/>
								</div>
							</div>
							
							<div class="control-group">
								<div class="controls">
									<input type="submit" name="submitAccount" value="Sửa"
										class="shopBtn exclusive">
								</div>
							</div>
						</form:form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>

			</div>

		</div>
	</div>
</body>