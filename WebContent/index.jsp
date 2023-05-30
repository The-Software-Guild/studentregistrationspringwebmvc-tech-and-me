<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Enrollment Form</title>
</head>
<body>
	<h2>Student Registration Form</h2>
	<form action="register.htm" method="post">
		Enter First Name: <input type="text" id="name" name="name" required>
		<br/> Enter Age: <input type="number" id="age" name="age" required>
		<br/> Enter Mobile No: <input type="tel" id="mob" name="mob" required> <br/> 
		<br/> Enter Address: <input id="addr" name="addr" />
		<br/><input type="submit"value="Submit">
		<input type="reset" value="Reset">
	</form>

</body>
</html>