<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link href="<c:url value="/resources/css/HomePage.css" />" rel="stylesheet" type="text/css">
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
	</div>
	<div class="active">
		<div class="filler"></div>
		<h2>
			Welcome <span th:text="${guid}"></span>
		</h2>

		<div class="filler2"></div>
		<div class="card">
			<img src="resources/images/User.png" class="Avatar" width=234 height=234>
			<div class="container">
				<div class="space1">
					<b>Name:</b><span th:text=>${customer.cfname}</span>
					<span th:text=>${customer.clname}</span>
				</div>
				<div class="filler3"></div>
				<div class="space">
					<b>ID: </b><span th:text=>${customer.uid}</span>
				</div>
				<div class="space">
					<b>Address: </b><span th:text=>${customer.caddress}</span>
				</div>
				<div class="space">
					<b>Phone: </b><span th:text=>${customer.cphno}</span>
				</div>
				<div class="space">
					<b>Email: </b><span th:text=>${customer.cemail}</span>
				</div>
			</div>
		</div>
	</div>
</body>
</html>