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
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Giỏ hàng</li>
			</ul>
			<div class="well well-small">
				<h1>
					Check Out <small class="pull-right"> ${totalQuantityCart} sản phẩm trong giỏ
						hàng </small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Hình ảnh</th>
							<th>Size</th>
							<th>Màu sắc</th>
							<th>Giá bán</th>
							<th>Số lượng</th>
							<th>Chỉnh sửa</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<tbody>


						<c:forEach var="item" items="${cart}">
							<tr>
								<td><img width="100"
									src="<c:url value="/assets/user/img/${item.value.product.img }"/>"
									alt=""></td>
								<td>${item.value.product.sizes}</td>
								<td><span class="shopBtn" style="background-color: ${item.value.product.code_color };"><span class="icon-ok"></span></span>
								</td>


								<td><fmt:formatNumber type="number" maxFractionDigits="3"
										value="${item.value.totalPrice}" /> đ </span></a></td>
								<td><input type="number" min="1" class="span1"
									style="max-width: 34px" placeholder="1"
									id="quantity-cart-${item.key}" size="16" type="text" value="${item.value.quantity }">
								</td>
								<td><button data-id="${item.key}"
									class="btn btn-mini btn-danger edit-cart" type="button"><span
										class="icon-edit"></span></button></td>
								<td><a href="<c:url value="/DeleteCart/${item.key} "/>"
									class="btn btn-mini btn-danger" type="button"><span
										class="icon-remove"></span></a></td>
								
							</tr>


						</c:forEach>
						<tr>
							<td colspan="6" class="alignR">Tổng tiền:</td>
							<td><fmt:formatNumber type="number" maxFractionDigits="3"
									value="${totalPriceCart}" /> đ </span></a></td>
						</tr>






					</tbody>
				</table>
				<br /> <a href='<c:url value="/"/>' class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Tiếp tục mua hàng </a> <a
					href="<c:url value="/checkout"/>" class="shopBtn btn-large pull-right">Thanh
					toán<span class="icon-arrow-right"></span>
				</a>

			</div>
		</div>
	</div>
	<content tag="script">
	<script>
		$(".edit-cart").on("click", function() {
			var id = $(this).data("id");
			var quantity = $("#quantity-cart-"+id).val();
			window.location = "EditCart/"+id+"/"+quantity;
		});
	</script>
	</content>
</body>