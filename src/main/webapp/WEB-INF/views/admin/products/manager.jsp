<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<head>
<meta charset="utf-8">
<title>Danh sách sản phẩm</title>
</head>
<body>
	<div class="row">
		<div class="span14">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Danh sách sản phẩm</li>
			</ul>
			<div class="well well-small">
				<h1>
					Danh sách sản phẩm <a href="<c:url value="/them-san-pham "/>" class="pull-right">Thêm sản phẩm</a>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>ID</th>
							<th>ID_CATEGORY</th>
							<th>SIZES</th>
							<th>NAME</th>
							<th>PRICE</th>
							<th>SALE</th>
							<th>TITLE</th>
							<th>HIGHLIGHT</th>
							<th>NEW_PRODUCT</th>
							<th>DETAILS</th>
							<th>Update</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>


						<c:forEach var="item" items="${products}">
							<tr>
								<td>${item.id}</td>
								<td>${item.id_category}</td>
								<td>${item.sizes}</td>
								<td>${item.name}</td>
								<td>${item.price}</td>
								<td>${item.sale}</td>
								<td>${item.title}</td>
								<td>${item.highlight}</td>
								<td>${item.new_product}</td>
								<td>${item.details}</td>
								
								<td><a href="<c:url value="/sua-san-pham/${item.id} "/>"
									class="btn btn-mini btn-danger" type="button"><span
										class="icon-edit"></span></a></td>
								<td><a href="<c:url value="/xoa-san-pham/${item.id} "/>"
									class="btn btn-mini btn-danger" type="button"><span
										class="icon-remove"></span></a></td>
								
							</tr>


						</c:forEach>
						






					</tbody>
				</table>
				<br /> 

			</div>
		</div>
	</div>
</body>