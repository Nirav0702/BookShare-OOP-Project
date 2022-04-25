<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<input type="text" placeholder="Enter Book" name="bookName" required>
  		<button formaction="searchbook.jsp">Search books</button>
	</form>
	<form action="xyz">
		<input type="hidden" id="custId" name="userName" value=${userName}>
		<button type="submit">Add a book</button>
	</form>
	<form>
  		<button formaction="ownedbooks.jsp">Show owned books</button>
	</form>
	<form action="userprofile">
		<input type="hidden" id="custId" name="userName" value=${userName}>
  		<button type="submit">Your profile</button>
	</form>
	<form action="userwallet">
		<input type="hidden" id="custId" name="userName" value=${userName}>
  		<button type="submit">View wallet</button>
	</form>
</body>
</html>
