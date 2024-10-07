<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta   charset="ISO-8859-1">

<link href="<c:url value="/resources/css/Register.css" />" rel="stylesheet" type="text/css">
<title>Register</title>
<link rel="stylesheet" href="css/Register.css">
</head>
<body>
	<form action="SellerRegister" method="post">
		<div class="container">
			<div class="registerbox">
				<h2>Register New Vendor</h2>
				<input type="text" name="name" placeholder="Enter Name" required>
				<input type="text"  name="phno" placeholder="Enter Phone Number" onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>
				<input type="text" name="address" placeholder="Enter Address" required>
				<input type="text" name="sid" placeholder="Enter Vendor ID" required>
				<input type="password" name="pass1" placeholder="Enter Password" required>
				<input type="password" name="pass2" placeholder="Retype Password" required>
				<input type="submit" value="Submit" >
			</div>
		</div>
	</form>
</body>
</html>