<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
			<h3>Invalid Password</h3>
			<input type="submit" value="Login">
		</div>
	</div>
	</form>
</body>
</html>