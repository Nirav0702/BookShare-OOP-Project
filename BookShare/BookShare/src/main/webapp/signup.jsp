<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="addUser">
	
	    <input type="text" placeholder="Enter Username" name="userName" required>
	    <input type="password" placeholder="Enter Password" name="password" required>
	    <input type="number" placeholder="Enter Phone Number" name="phoneNumber" required>
	    <input type="email" placeholder="Enter Email Id" name="email" required>
	    <input type="text" placeholder="Enter your Address" name="address" required>
		<button type="submit">Sign Up</button>

	</form>
</body>
</html>