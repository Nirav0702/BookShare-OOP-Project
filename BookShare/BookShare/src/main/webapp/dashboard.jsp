<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="searchBook">
		<input type="text" placeholder="Enter Book" name="bookTitle" required>
  		<button type="submit">Search books</button>
	</form>
	<form action="xyz">
		<input type="hidden" id="custId" name="userName" value=${userName}>
		<button type="submit">Add a book</button>
	</form>
	<form action="ownedBooks">
		<input type="hidden" id="custId" name="userName" value=${userName}>
  		<button >Show owned books</button>
	</form>
	<form action="borrowedBooks">
		<input type="hidden" id="custId" name="userName" value=${userName}>
  		<button >Show lent books</button>
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
