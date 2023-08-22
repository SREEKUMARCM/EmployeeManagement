<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<form action="Register" method="post">
<h1>Employee Registration</h1>
<table>
<tr><td>User Name:</td><td><input type="text" name="uName"></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
<tr><td>Email:</td><td><input type="email" name="email"></td></tr>
<tr><td><input type="submit" value="register"></td></tr>

</table>
</form>
<button id="viewListButton">ViewList</button>
<script>
    document.getElementById("viewListButton").addEventListener("click", function() {
        window.location.href = "List.jsp";
    });
</script>
</body>
</html>