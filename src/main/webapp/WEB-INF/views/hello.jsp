<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<h1>Welcome to Spring MVC</h1>

	<%
	String id = (String) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("Salary");

	out.println("ID : " + id);
	out.println("Name : " + name);
	out.println("Salary : " + salary);
	%>

	<br /> ID :
	<b> ${id} </b> Name :
	<b> ${name} </b> Salary :
	<b> ${salary} </b>


</body>
</html>