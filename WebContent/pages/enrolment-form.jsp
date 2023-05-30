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
	<form action="enroll.htm" method="post">
		Enter First Name:</label> <input type="text" id="name" name="name" required> <br>		
		Enter Age:</label> <input type="number" id="age" name="age" required> <br>
		Enter Mobile No:</label> <input type="tel" id="mob" name="mob" required> <br>
		Enter Address:</label> <input id="addr" name="addr" /><br>		
		<br> <input type="submit" value="Submit"> <input type="reset" value="Reset">
	</form>

</body>
</html>