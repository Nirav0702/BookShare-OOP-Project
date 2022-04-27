<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addBook" method="post">
	    <input type="text" placeholder="Enter BookTame" name="bookTitle" required>
	    <input type="text" placeholder="Enter BookAuthor" name="bookAuthor" required>
	    <input type="text" placeholder="Enter BookPublisher;" name="bookPublisher" required>
	    <input type="text" placeholder="Enter BookEdition" name="bookEdition" required>
	    <input type="text" placeholder="Enter Book Year" name="bookYear" required>
	    <input type="hidden" id="custId" name="userName" value=${userName}>
		<button type="submit">Add Book</button>

	</form>
</body>
</html>