<%@page import="in.nivethitha.service.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">

		<h2>LOGIN</h2>
		<jsp:include page="Message.jsp"></jsp:include>
		<form action="LoginAction">
			<label>Enter Account Number</label> <input type="number"
				name="accountNumber" id="accountNumber"
				placeholder="Enter Account Number"> <br> <br> <label>Enter
				Pin Number</label> <input type="number" name="pin" id="pin"
				placeholder="Enter pin here"> <br> <br>
			<button type="submit">ENTER</button>

		</form>
	</main>
</body>
</html>