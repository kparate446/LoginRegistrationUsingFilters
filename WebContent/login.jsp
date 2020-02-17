<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div >
		<h2>Login Form</h2>
		<form action="login" method="post">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" style="margin-top:1.25%"/></td>
				</tr>
				
			</table>
			<input type="submit" value="Login" style="margin-left:6% ; margin-top: 1.25% " />
<!-- <!-- 			   <input type="submit" value="Registration">
 --> 
			<a  href="employeeregister.jsp" style="margin-left:2%"> Registration</a>
		</form>
	</div>
</body>
</html>