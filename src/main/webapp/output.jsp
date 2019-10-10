<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output Page</title>
</head>
<body>
	<h1>Login details</h1><hr>
	<h2>User ID: ${login.userId}</h2>
	<h2>Password: ${login.password}</h2>
	<hr>
	<a href="logout.do">logout</a>
</body>
</html>