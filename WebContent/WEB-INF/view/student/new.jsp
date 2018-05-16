<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding new student</title>
</head>
<body>
<h2>New student form</h2>
<form:form action="process" modelAttribute="student">
Imie: <form:input path="name" /><br>
Nazwisko: <form:input path="surname" /><br>
Kraj: <form:select path="country">
	<form:option value="Brazil" label="Brazil" />
	<form:option value="Poland" label="Poland" />
	<form:option value="Ireland" label="Ireland" />
</form:select>
<input type ="submit" value="Wyślij" />
</form:form>
</body>
</html>