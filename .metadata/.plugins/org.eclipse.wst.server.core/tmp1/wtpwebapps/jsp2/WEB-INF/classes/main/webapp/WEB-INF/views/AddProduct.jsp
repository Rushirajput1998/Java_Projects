<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/AddProduct.css" />" rel="stylesheet" type="text/css">
<title>Add Product</title>
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
	<div class="filler"></div>
		<h2>Add product</h2>
		<form action="addProduct" method="post">
			<div class="bigcard">
				<div class="bigcard1">
					<h3>Enter Product Name</h3><input type='text' name='pname' required>
					<h3>Enter Product ID</h3><input type='text' name='pid' required>
					<h3>Enter Manufacturer Name</h3><input type='text' name='pmfname' required>
					<h3>Enter Manufacture Date</h3><input type="text" name="pmfdate" placeholder="YYYY-MM-DD" onkeypress="return event.charCode>= 48 && event.charCode<= 57 || event.charCode==45" required>
					<h3>Enter Expiry Date</h3><input type="text" name="pexdate" placeholder="YYYY-MM-DD" onkeypress="return ((event.charCode>= 48 && event.charCode<= 57) || event.charCode==45)" required>
    		  	</div>
  		    	<div class="bigcard2">
   					 <h3>Quantity</h3><input type="text" name="quantity" onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>
   					 <h3>Price</h3><input type="text" name="pprice" onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>
   					 <p></p>
 					 <input type="submit" value="Add">
				</div>
			</div>
		</form>
	</div>

</body>
</html>