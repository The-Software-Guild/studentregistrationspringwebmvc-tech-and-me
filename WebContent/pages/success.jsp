<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>
	<h2>Student enrollment completed successfully.</h2>
	<br/>
	<h3>Student Information:</h3>
    <p>Student ID: ${stu.stuid}</p>
    <p>First Name: ${stu.fname}</p>
    <p>Last Name: ${stu.lname}</p>
</body>

</html>