<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginProcess" method="post">
	<table>
	<tr>
		<th>Username<th>
		<td><input type="text" name="username" id="username"></input></td>
	</tr>
	<tr>
		<th>password<th>
		<td><input type="text" name="password" id="password"></input></td>
	</tr>
	<tr>
		<td><input type="Submit" value="Submit"></td>
	</tr>
	</table>
	<%= request.getAttribute("message") %>
	</form>
	
</body>
</html>