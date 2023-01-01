<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
<style>
.product-content {
	overflow-x: hidden;
}
</style>
</head>
<body>
	<div class="row product-content">
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
				<a href="#"><img src="/DiamonShop/assets/user/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Sản phẩm sắp ra mắt <br>
				<small>Xem</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<img src="/DiamonShop/assets/user/img/1.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="/DiamonShop/assets/user/img/2.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="/DiamonShop/assets/user/img/3.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="/DiamonShop/assets/user/img/4.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="/DiamonShop/assets/user/img/5.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<img src="/DiamonShop/assets/user/img/6.png"
							alt="bootstrap ecommerce templates">
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li><a href="products.html">Sản phẩm</a> <span class="divider">/</span></li>
				<li class="active">Chi tiết sản phẩm</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img
										src="<c:url value="/assets/user/img/${product.img }"/>" alt=""
										style="width: 100%"></a>
								</div>

							</div>
							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev">‹</a> <a class="right carousel-control"
								href="#myCarousel" data-slide="next">›</a>
						</div>
					</div>
					<div class="span7">
						<h3>${product.name }</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get" action="<c:url value="/AddCart/${product.id_product }"/>">
							<div class="control-group">
								<label class="control-label"><span><fmt:formatNumber
											type="number" maxFractionDigits="3" value="${product.price}" />
										đ</span></label>
								<div class="controls">
									<input type="number" min="1" value="1" class="span6"
										placeholder="Qty.">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label"><span>Color</span></label>
								<div class="controls">
									<select class="span11">
										<option>Red</option>
										<option>Purple</option>
										<option>Pink</option>
										<option>Red</option>
									</select>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label"><span>Size</span></label>
								<div class="controls">
									<select class="span11">
										<option>S</option>
										<option>M</option>
										<option>L</option>
										<option>XL</option>
									</select>
								</div>
							</div>
							<h4></h4>
							<p>${product.title }
							<p>
								<button type="submit" class="shopBtn">
									<span class=" icon-shopping-cart"></span> Thêm vào giỏ hàng
								</button>
						</form>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="#home" data-toggle="tab">Chi
							tiết sản phẩm</a></li>
					<li class=""><a href="#profile" data-toggle="tab">Sản phẩm
							liên quan</a></li>

				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">

						${product.details }</div>
					<div class="tab-pane fade" id="profile">

						<c:set var="countList" value="${productByIDCategory.size() }" />
						<c:if test="${productByIDCategory.size() > 6 }">
							<c:set var="countList" value="6" />
						</c:if>
						<c:forEach var="item" items="${productByIDCategory}" begin="1"
							end="${countList }" varStatus="loop">

							<div class="row-fluid">
								<div class="span2">
									<img src="<c:url value="/assets/user/img/${item.img }"/>"
										alt="">
								</div>
								<div class="span6">
									<h5>${item.name }</h5>
									<p>${item.title}</p>
								</div>
								<div class="span4 alignR">
									<form class="form-horizontal qtyFrm">
										<h3>
											<fmt:formatNumber type="number" maxFractionDigits="3"
												value="${product.price}" />
											đ
										</h3>

										<div class="btn-group">
											<a
												href="${item.id_product }" class="shopBtn">Xem chi tiết</a>
										</div>
									</form>
								</div>
							</div>
							<hr class="soft" />
						</c:forEach>

					</div>
				</div>

			</div>
		</div>
	</div>
</body>