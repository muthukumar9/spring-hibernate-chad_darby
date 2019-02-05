<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

	<head>
		<title>Login Form</title>
	</head>
	
	<body>
	
		<h3>My Login Form</h3>
		
		<form method="POST" action="${pageContext.request.contextPath}/authenticateTheUser">
		
			<c:if test="${param.error != null }">
				<i>Sorry! You entered invalid username or password.</i>
			</c:if>
			
			<c:if test="${param.logout != null }">
				<i>You have been logged out.</i>
			</c:if>
			
			<p> Username : <input type="text" name="username" /> </p>
			<p> Password : <input type="password" name="password" /> </p>
			
			<input type="submit" value="Login" />
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		
	</body>
</html>