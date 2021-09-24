<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The result page!</title>
<h1>This is where we show you the results!</h1>

</head>
<body>
	<p>${convertedTemperature.toString() }<br>LineBreak!<br>Thanks for participating!</p>
	<br>If you would like to try the other way, click below! Or click main menu!
	

<br><a href="FahrenheitToCelsius.jsp">Fahrenheit to Celsius</a>
<br><a href="CelsiusToFahrenheit.jsp">Celsius to Fahrenheit</a>
<br><a href="MainMenu.jsp">Main Menu</a>
	
	
</body>
</html>