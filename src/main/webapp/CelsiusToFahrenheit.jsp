<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="convertTempServlet" method="post">
		Enter the current temperature in Celsius. 
		<input type="text" name="Temperature" size="5"> 
		<input type="submit" name="conversionType" value="Convert to Fahrenheit" />
	</form>
</body>
</html>