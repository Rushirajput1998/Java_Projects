<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/Buy.css" />" rel="stylesheet"
	type="text/css">
<title>Buy</title>
</head>
<body>
<body>
	<div class="main">
		<div class="active">
			<div class="filler"></div>
			<div class="filler2"></div>
			<div class="block">
				<c:forEach var="product" items="${products}">
					<div class="column">
						<div class="card">
							<img src="resources/images/pills.png" width="180" height="200">
							<h1>${product.pname}</h1>
							<p><b>ID: </b><c:out value="${product.pid}" /></p>
							<p><b>Manufacturer: </b><c:out value="${product.pmfname}" /></p>
							<p><b>Mfg Date: </b><c:out value="${product.pmfdate}" /></p>
							<p><b>Ex Date: </b><c:out value="${product.pexdate}" /></p>
							<p><b>Stock: </b><c:out value="${product.inventory.quantity}" /></p> 
							<p><b>Price: </b><c:out value="${product.pprice}" /></p>
							
							<c:choose>
								<c:when test="${product.inventory.quantity > 0}">
									<form action="PlaceOrder" method="post">
										<input type="number" name="quantity"
											onkeypress="return event.charCode>= 48 && event.charCode<= 57"
											placeholder="Enter quantity" max="<c:out value='${product.inventory.quantity}' />"
											required>
										<input type="hidden" name="pid" value="<c:out value='${product.pid}' />">
										<p></p>
										<button>Buy</button>
									</form>
								</c:when>
								<c:otherwise>
									<button>Out Of Stock</button>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>	

</body>
</html>