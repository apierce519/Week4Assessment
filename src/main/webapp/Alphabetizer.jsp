<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alphabetize 5 words!</title>
</head>
<body>
<h1>Please enter 5 words you would like alphabetized!</h1>
<form action="alphabetizeServlet" method="post">
Word 1.
<input type="text" name="Word1" size="10">
<br>
Word 2.
<input type="text" name="Word2" size="10">
<br>
Word 3.
<input type="text" name="Word3" size="10">
<br>
Word 4.
<input type="text" name="Word4" size="10">
<br>
Word 5.
<input type="text" name="Word5" size="10">
<br>
<input type="submit" value="Alphabetize!"/>
</form>
</body>
</html>