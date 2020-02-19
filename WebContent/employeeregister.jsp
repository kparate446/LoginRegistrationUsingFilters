<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h2 {
	color: navy;
}
.c1 {
	color: green;
}
</style>
</head>
<body>
	<h2>Register Form</h2>
	<form action="EmployeeServlet" method="post">
		<table>
			<tr class="c1">
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr class="c1">
				<td>Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr class="c1">
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr class="c1">
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr class="c1">
				<td>Address</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr class="c1">
				<td>Contact No</td>
				<td><input type="text" name="contact" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit"
			style="margin-left: 6.4%; margin-top: 1%" />
	</form>
</body>
</html>