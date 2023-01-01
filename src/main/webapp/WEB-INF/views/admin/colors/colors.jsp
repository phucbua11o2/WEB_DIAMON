<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<head>
<meta charset="utf-8">
<title>Danh sách hình ảnh</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Danh sách hình ảnh</li>
			</ul>
			<div class="well well-small">
				<h1>
					Danh sách hình ảnh <a href="<c:url value="/them-hinh-anh "/>" class="pull-right">Thêm hình ảnh</a>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>ID</th>
							<th>ID_PRODUCT</th>
							<th>NAME</th>
							<th>CODE</th>
							<th>IMG</th>
							<th>Update</th>
						</tr>
					</thead>
					<tbody>


						<c:forEach var="item" items="${colors}">
							<tr>
								<td>${item.id}</td>
								<td>${item.id_product }</td>
								<td>${item.name}</td>
								<td>${item.code}</td>
								<td>${item.img}</td>
								
								<td><a href="<c:url value="/sua-hinh-anh/${item.id} "/>"
									class="btn btn-mini btn-danger" type="button"><span
										class="icon-edit"></span></a></td>
								
							</tr>


						</c:forEach>
						






					</tbody>
				</table>
				<br /> 

			</div>
		</div>
	</div>
	
</body>