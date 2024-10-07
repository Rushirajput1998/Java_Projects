<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/Register.css" />" rel="stylesheet" type="text/css">
<title>Login</title>

</head>
<body>
	<form action="Login" method="post">
	<div class="container">
		<div class="loginbox">
			<h2>Login</h2>
				<div class="customselect">
					<div class="select">
  					<select  name="utype" required>
    					<option value="" selected disabled>Select Account Type</option>
    					<option value="1">Customer</option>
    					<option value="2">Seller</option>
  					</select>
					</div>
					
				</div>
			<input type="text" name="userid" placeholder="Enter User ID" required>
			<input type="password" name="password" placeholder="Enter Password" required>
			<input type="submit" value="Login">
		</div>
	</div>
	</form>
</body>
</html>