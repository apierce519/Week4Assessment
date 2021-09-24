<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week 4 Assessment</title>
</head>
<body>
	<h1>This is the convert from CELSIUS to FAHRENHEIT page.</h1>
	
	<form action="convertTempServlet" method="post">
		Enter the current temperature in Celsius. 
		<input type="text" name="Temperature" size="5"> 
		<input type="submit" name="conversionType" value="Convert to Fahrenheit" />
	</form>
	
</body>
</html>