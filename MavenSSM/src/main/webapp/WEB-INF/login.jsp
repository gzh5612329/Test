<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>用户登录</h3>
	<form action="login" method="post">
		<input name="acc_no"><br>
		<input type="password" name="acc_password"><br>
		<input type="submit" value="登录">${msg }
	</form>
</body>
</html>