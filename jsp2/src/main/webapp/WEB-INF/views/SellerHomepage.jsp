<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/HomePage.css" />" rel="stylesheet" type="text/css">
<title>HomePage</title>
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
					<a href="SellerHomepage">HOME</a> 
					<a href="AddProduct">ADD</a>
					<a href="AddInventory">RESTOCK</a> 
					<a href="SellerOrders">ORDERS</a>
				</div>
			</div>
		</div>
	</div>
	<div class="active">
		<h2>welcome ${guid}</h2>
		<div class="filler2"></div>
		<div class="card">
			<img src="resources/images/vendor.png" class="Avatar" width="264" height="194">
			<div class="container">
				<h4>
					<b>${seller.name}</b>
				</h4>
				<p>
					<b>ID: </b>${seller.sid}</p>
				<p>
					<b>Address: </b>${seller.address}</p>
				<p>
					<b>Phone: </b>${seller.phno}</p>
			</div>
		</div>
	</div>

</body>
</html>