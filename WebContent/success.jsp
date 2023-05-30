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
	<h2>Registered successfully!!!</h2>
	<br/>
	<h3>Your details are:</h3>
	<p>Name : ${stu.name}</p>
    <p>Age: ${stu.age}</p>
    <p>Mobile no: ${stu.mob}</p>
    <p>Address: ${stu.addr}</p>
    
</body>

</html>