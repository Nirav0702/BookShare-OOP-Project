<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="changePass">
		<label for="newpass"><b>Enter the New Password</b></label>
		<input type="password" name="userPass" required>
		<label for="newpassconfirm"><b>Re-enter the New Password</b></label>
		<input type="password" name="userPassConfirm" required>
		<input type="hidden" id="custId" name="userName" value=${userName}>
		<button type="submit">Confirm Change</button>
	</form>
	
</body>
</html>