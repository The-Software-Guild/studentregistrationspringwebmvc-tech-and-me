<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Enrolment Form</title>
</head>
<body>
	<form action="enrol.htm" method="post">
		Enter Student ID</label> <input type="number" id="id" name="id" required> <br>
		Enter First Name:</label> <input type="text" id="fname" name="fname" required> <br>
		Enter Last Name:</label> <input type="text" id="lname" name="lname" required> <br>
		
		<!-- <br> <label for="age">Enter Age:</label> <input type="number" id="age" name="age" required> <br>
		<br> <label for="mobile">Enter Mobile No:</label> <input type="tel" id="mobile" name="mobile" required> <br>
		<br> <label for="address">Enter Address:</label> <textarea id="address" name="address" required></textarea>	<br> -->
		
		<br> <input type="submit" value="Submit"> <input type="reset" value="Reset">
	</form>

</body>
</html>