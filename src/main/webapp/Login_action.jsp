<%@page import="in.nivethitha.service.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String accountNumber=request.getParameter("accountNumber");
String pin = request.getParameter("pin");

boolean valid = Login.isExist(accountNumber, pin);
if(valid){
	String message="Welcome to ATM Services";
	response.sendRedirect("Message.jsp?infoMessage=" + message);

}
else{	
	String message="Invalid Login Credentials";
	response.sendRedirect("Login.jsp?errorMessage=" + message);
}
%>
</body>
</html>