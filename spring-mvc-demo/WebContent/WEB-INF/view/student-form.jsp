<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First Name : <form:input path="firstName"/>
		<br/><br/>
		Last Name : <form:input path="lastName"/>
		
		<br/><br/>
		
		Country : <form:select path="country">
					<form:option value="IN">India</form:option>
					<form:option value="FR">France</form:option>
					<form:option value="US">United States</form:option>
					<form:option value="UK">United Kingdom</form:option>
				  </form:select>
		
		<br/><br/>
		
		Country Options : <form:select path="countryOptionVal">
					<form:options items="${student.countryOptions}"></form:options>
				  </form:select>
				  
		<br/><br/>
		
		Java <form:radiobutton path="favLang" value="Java"/>
		PHP <form:radiobutton path="favLang" value="PHP"/>
		Ruby <form:radiobutton path="favLang" value="Ruby"/>
		
		<br/><br/>
		
		Linux <form:checkbox path="operatingSystems" value="Linux "/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS "/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows "/>
		
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>