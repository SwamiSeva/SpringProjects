<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of JSP file</title>
</head>
<body>
Welcome to SpringMVC

<form action="addalien" method="post">
<h3>Enter the Alien Id:<input type="text" name="aid"</h3>
<h3>Enter the Alien Name</h3>:<input type="text" name="aname">
                          <input type="submit">
</form>
<br>

<form action="getalience">
<h3>Enter the Alien Id:<input type="text" name="aid"</h3>
<input type="submit">
</form>

<form action="rmalien">
<h2>Enter the Alien Id to Remove:<input type="text" name="aid"</h2>
<input type="submit">
</form>
<br>

<form action="getAlienByName">
<h3>Enter the Alien Name</h3>:<input type="text" name="aname"
<input type="submit">
</body>
</html>

