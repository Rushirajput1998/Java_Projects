<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/orders.css" />"
	rel="stylesheet" type="text/css">
<title>Orders</title>
</head>
<body>
	<div class="main">
		<div class="topbar1"></div>
		<div class="topbar2">
			<div class="container1">
				<div class="logout-btn">
					<a href="Logout">Logout</a>
				</div>
			</div>
		</div>
		<div class="header">
			<div class="container2">
				<div class="navbar">
					<a href="Homepage">HOME</a>
					 <a href="Buy">BUY</a> 
					 <a href="Orders">ORDERS</a>
				</div>
			</div>
		</div>
		<div class="active">
			<div class="filler2"></div>
			<table class="tables">
				<tr>
					<th>Order ID</th>
					<th>Product ID</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Seller ID</th>
					<th>Order Date and Time</th>
				</tr>
				<c:forEach items="${orders}" var="order">
					<tr>
						<td>${order.oid}</td>
						<td>${order.pid}</td>
						<td>${order.price}</td>
						<td>${order.quantity}</td>
						<td>${order.sid}</td>
						<td>${order.orderDateTime}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>