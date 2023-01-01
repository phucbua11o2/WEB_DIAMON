<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm</title>
</head>
<body>
	<div class="row">
		
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Thêm sản phẩm</li>
			</ul>
			<h3>Thêm sản phẩm</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span12">
					<div class="well">
						<hr> 
						<h3>Thêm sản phẩm</h3>
						<form:form action="them-san-pham" method="POST" modelAttribute="products" class="form-horizontal" style="margin-left: 200px;"> 
							
							<div class="control-group">
								<label class="control-label">ID Category<sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="id_category" placeholder="Nhập id thể loại"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Sizes <sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="sizes" placeholder="Nhập size"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Name<sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="name" placeholder="Nhập tên sản phẩm"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Price<sup>*</sup></label>
								<div class="controls">
									<form:input class="span3" type="text" path="price" placeholder="Nhập giá sản phẩm"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Sale</label>
								<div class="controls">
									<form:input class="span3" type="text" path="sale" placeholder="Nhập giá khi giảm giá"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Title</label>
								<div class="controls">
									<form:textarea path="title" rows="5" cols="30"></form:textarea>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Highlight</label>
								<div class="controls">
									<form:input class="span3" type="boolean" path="highlight" placeholder="Sản phẩm nổi bật"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">New Product</label>
								<div class="controls">
									<form:input class="span3" type="boolean" path="new_product" placeholder="Sản phẩm mới"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Details</label>
								<div class="controls">
									<form:textarea path="details" rows="5" cols="30"></form:textarea>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Created At</label>
								<div class="controls">
									<form:input class="span3" type="date" path="created_at" placeholder="Ngày tạo"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Updated At</label>
								<div class="controls">
									<form:input class="span3" type="date" path="updated_at" placeholder="Ngày sửa"/>
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<input type="submit" name="submitAccount" value="Thêm"
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