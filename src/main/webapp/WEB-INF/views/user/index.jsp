<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>Trang chủ</title>
<body>

	<!-- 
Body Section 
-->
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
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">
						<c:forEach var="item" items="${slides}" varStatus="index">
							<c:if test="${index.first }">
								<div class="item active">
							</c:if>
							<c:if test="${not index.first}">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value="/assets/user/img/${item.img }"/>"
								alt="bootstrap ecommerce templates">
							
					</div>
					</c:forEach>

				</div>
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
		</div>
	</div>
	<!--
New Products
-->
	<div class="span9">
		<div class="well well-small">
			<h3>Sản phẩm mới</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
						<c:if test="${newProducts.size()>0 }">
							<div class="item active">
								<ul class="thumbnails">
									<c:forEach var="item" items="${newProducts }" varStatus="loop">
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="chi-tiet-san-pham/${item.id_product }"
													title="add to cart"><span class="icon-search"></span>
													Xem chi tiết</a> <a href="chi-tiet-san-pham/${item.id_product }" class="tag"></a> <a
													href="chi-tiet-san-pham/${item.id_product }"><img
													src="<c:url value="/assets/user/img/${item.img }"/>" alt=""></a>
											</div>
										</li>
										<c:if
											test="${(loop.index +1)%4 == 0 || (loop.index +1) == newProducts.size()}">
								</ul>
							</div>
							<c:if test="${(loop.index +1)<newProducts.size() }">
								<div class="item">
									<ul class="thumbnails">
							</c:if>
						</c:if>
						</c:forEach>
						</c:if>

						
						
					</div>
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>

		</div>
	</div>
	<!--
	Featured Products
	-->
	<div class="span9">
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right" href="<c:url value="/all-product"/>"
					title="View more">Xem thêm<span class="icon-plus"></span></a> Sản
				phẩm nổi bật
			</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<c:if test="${highlightProducts.size()>0 }">
					<ul class="thumbnails">
						<c:forEach var="item" items="${highlightProducts }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="chi-tiet-san-pham/${item.id_product }"
										title="add to cart"><span class="icon-search"></span>
										Xem chi tiết</a> <a href="chi-tiet-san-pham/${item.id_product }"><img
										src="<c:url value="/assets/user/img/${item.img }"/>" alt="" /></a>
									<div class="caption">
										<h5>${item.name}</h5>
										<h4>
											<a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="<c:url value="/AddCart/${item.id_product }"/>" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right"> <fmt:formatNumber
													type="number" maxFractionDigits="3" value="${item.price}" />
												đ
											</span>
										</h4>
									</div>
								</div>
							</li>
							<c:if
								test="${(loop.index +1)%3 == 0 || (loop.index +1) == highlightProducts.size()}">
					</ul>
					<c:if test="${(loop.index +1)<highlightProducts.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>
				</c:forEach>
				</c:if>

			</div>
		</div>

		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="<c:url value="/all-product"/>">Xem thêm <span
				class="icon-plus"></span></a> Tất cả sản phẩm
		</div>
	</div>
	</div>
	</div>
</body>

