<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adding new student</title>
</head>
<body>
<h2>New student form</h2>
<form:form action="process" modelAttribute="student">
Imie: <form:input path="name" /><br>
Nazwisko: <form:input path="surname" /><br>
Kraj: <form:select path="country">
	<form:options items="${student.countryOptions}" />
</form:select><br>
Ulubiony język:
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
	Scala <form:radiobutton path="favoriteLanguage" value="Scala"/>
<input type ="submit" value="Wyślij" />
</form:form>
</body>
</html>