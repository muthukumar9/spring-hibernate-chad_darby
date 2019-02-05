<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>luv2code Home Page</title>
</head>
<body>
	<h2>luv2code Home Page</h2>
	
	<form:form method="POST" action="${pageContext.request.contextPath}/logout">
		<input type="submit" value="LogOut" />
	</form:form>
	
	
</body>
</html>