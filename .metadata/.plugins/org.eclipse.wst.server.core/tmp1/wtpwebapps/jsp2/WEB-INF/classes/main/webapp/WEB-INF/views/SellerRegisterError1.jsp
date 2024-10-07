<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link href="<c:url value="/resources/css/Register.css" />" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="SellerRegister"  method="post">
		<div class="container">
			<div class="registerbox">
				<h2>Seller Register</h2>
				<input type="text" name="name" placeholder="Enter Name" required>
				<input type="text"  name="phno" placeholder="Enter Phone Number" onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>
				<input type="text" name="address" placeholder="Enter Address" required>
				<input type="text" name="uid" placeholder="Enter Seller ID" required>
				<input type="password" name="pass1" placeholder="Enter Password" required>
				<input type="password" name="pass2" placeholder="Retype Password" required>
				<h3>Seller ID Already Exists</h3>
				<input type="submit" value="Submit" >
			</div>
		</div>
	</form>

</body>
</html>