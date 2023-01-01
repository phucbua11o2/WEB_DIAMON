<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<title>Tất cả sản phẩm</title>
<style>
.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not (.active ) {
	background-color: #ddd;
}
</style>
</head>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sản phẩm</title>
</head>
<body>
	<div class="well well-small">
		<div class="row-fluid">
			<span style="margin-left: 25px;">Danh sách tất cả sản phẩm</span> <select
				class="pull-right">
				<option>A - Z</option>
				<option>Cao - Thấp</option>
			</select>
		</div>



		<c:if test="${product.size()>0 }">
			<div class="row-fluid">
				<ul class="thumbnails">
					<c:forEach var="item" items="${product}" varStatus="loop">
						<li class="span4">
							<div class="thumbnail">
								<a href="<c:url value="/chi-tiet-san-pham/${item.id_product}"/>" class="overlay"></a> <a
									class="zoomTool" href="<c:url value="/chi-tiet-san-pham/${item.id_product}"/>"
									title="add to cart"><span class="icon-search"></span> Xem chi tiết</a> <a href="<c:url value="/chi-tiet-san-pham/${item.id_product}"/>"><img
									src="<c:url value="/assets/user/img/${item.img }"/>" alt=""></a>
								<div class="caption cntr">
									<p>${item.name}</p>
									<p>
										<strong> <fmt:formatNumber
													type="number" maxFractionDigits="3" value="${item.price}" /> đ</strong>
									</p>
									<h4>
										<a class="shopBtn" href="<c:url value="/AddCart/${item.id_product }"/>" title="add to cart"> Thêm vào giỏ hàng </a>
									</h4>
									<div class="actionList">
										<a class="pull-left" href="#">Yêu thích </a> <a
											class="pull-left" href="#"> So sánh </a>
									</div>
									<br class="clr">
								</div>
							</div>
						</li>
						<c:if
							test="${(loop.index +1) % 3 == 0 || (loop.index +1) == product.size()}">
				</ul>
			</div>
			<c:if test="${(loop.index +1)<product.size() }">
				<div class="row-fluid">
					<ul class="thumbnails">
			</c:if>
		</c:if>
		</c:forEach>
		</c:if>
	</div>

</body>
</html>