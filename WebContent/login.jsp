<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h2 {
	color: red;
}

.c1 {
	color: green;
}
</style>
</head>
<body>
	<div>
		<h2>Login Form</h2>
		<form action="login" method="post">
			<table>
				<tr class="c1">
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr class="c1">
					<td>Password</td>
					<td><input type="password" name="password"
						style="margin-top: 1.25%" /></td>
				</tr>

			</table>
			<input type="submit" value="Login"
				style="margin-left: 6%; margin-top: 1%" />
			<!-- <!-- 			   <input type="submit" value="Registration">
 -->
			<a href="employeeregister.jsp" style="margin-left: 2%">
				Registration</a>
		</form>
	</div>
</body>
</html>