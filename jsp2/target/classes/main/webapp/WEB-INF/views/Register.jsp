<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link href="<c:url value="/resources/css/Register.css" />" rel="stylesheet" type="text/css">
</head>
<body>
<form action="Register" method="post">
	<div class="container">
		<div class="registerbox">
			<h2>Register New Customer</h2>
			<input type="text" name="cfname" placeholder="Enter First Name" required>
			<input type="text" name="clname" placeholder="Enter Last Name" required>
			<input type="text" name="cemail" placeholder="Enter Email ID" required>
			<input type="text"  name="cphno" placeholder="Enter Phone Number" onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>
			<input type="text" name="caddress" placeholder="Enter Address" required>
			<input type="text" name="uid" placeholder="Enter Customer ID" required>
			<input type="password" name="cpass1" placeholder="Enter Password" required>
			<input type="password" name="cpass2" placeholder="Retype Password" required>
			<input type="submit" value="Submit" >
		</div>
		</div>
	</form>

</body>
</html>