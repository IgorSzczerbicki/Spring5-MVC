<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New customer form</title>
<style>
	.error {color:red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		Name: <form:input path="name" /><br>
		Surname(*) <form:input path="surname" />
		<form:errors path="surname" cssClass="error"/><br>
		
		Age(0-100): <form:input path="age" />
		<form:errors path="age" cssClass="error" /><br>
		
		Signs(5): <form:input path="signs" />
		<form:errors path="signs" cssClass="error"/><br>
		
		Kod kursu: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" /><br>
		
		<input type="submit" value ="Wyślij" />
	</form:form>
</body>
</html>