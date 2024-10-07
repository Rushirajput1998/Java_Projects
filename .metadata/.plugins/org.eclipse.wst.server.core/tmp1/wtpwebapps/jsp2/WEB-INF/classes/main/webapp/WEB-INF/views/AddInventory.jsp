<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/Buy.css" />" rel="stylesheet" type="text/css">
<title>Restock</title>
</head>
<body>
<div class="main">
	<div class="topbar1"></div>
	<div class="topbar2">
		<div class="container1">
			<div class="logout-btn">
				<a href="Logout.jsp">Logout</a>
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
	
	<div class="active">
	<div class="filler">
	<div class="row">
 				<div class="column">
    				<div class="card">
    					<form action="UpdateInventory.jsp" method="post">
    						<img src="images/pills.png" width=180 height=200>
  							<h1>${pname}</h1>
  							<p><b>ID: </b>${pid}</p>
							<p><b>Manufacturer: </b>${pmfname}</p>
							<p><b>Mfg Date: </b>${pmfdate}</p>
							<p><b>Exp Date: </b>${pexdate}</p>
							<p><b>Stock: </b>${quantity}</p>
							<p><b>Price: </b>${pprice}</p>
							<p><input type="text" name="restock" placeholder="quantity" onkeypress="return event.charCode>= 48 && event.charCode<= 57" required></p>
							<input type="hidden" name="pid" value= ${product.pid} >
							<p></p>
  							<button>ReStock</button>
  						</form>
  					</div>
  				</div>
  				</div>
	</div>
	</div>
</div>
</body>
</html>