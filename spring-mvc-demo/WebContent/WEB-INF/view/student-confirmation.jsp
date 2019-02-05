<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>

First name : ${student.firstName}
Last name : ${student.lastName}
Country : ${student.country}
Country Option Val: ${student.countryOptionVal}
Fav Langauage : ${student.favLang}

Operating Systems :
<ul>
	<c:forEach items="${student.operatingSystems}" var="os">
		<li>${os}</li>
	</c:forEach>
</ul>
</body>
</html>