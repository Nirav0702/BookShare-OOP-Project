<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${userName}
	${userEmail}
	${userAddress}
	${userPhoneNumber}
	<form action="toChangePass">
		<input type="hidden" id="custId" name="userName" value=${userName}>
		<button type="submit">Change Password</button>
	</form>
</body>
</html>