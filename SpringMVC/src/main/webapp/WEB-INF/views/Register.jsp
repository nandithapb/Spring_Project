<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  action="registerProcess" method="post">
	<table>
	<tr>
	<td>username</td>
	<td><input type="text" name=username id="username"></input></td>
	</tr>
	<tr>
	<td>Password</td>
	<td><input type="text" name="password" id="password"></input></td>
	</tr>
	<tr>
	<td>First Name</td>
	<td><input type="text" name="firstname" id="firstname"></input></td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="lastname" id="lastname"></input></td>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="email" id="email"></input></td>
	</tr>
	<tr>
	<td>Address</td>
	<td><input type="text" name="address" id="address"></input></td>
	</tr>
	<tr>
	<td>Mobile number</td>
	<td><input type="text" name="number" id="number"></input></td>
	</tr>
	</table>
	<input type="submit" value="submit"></input>
	</form>
</body>
</html>