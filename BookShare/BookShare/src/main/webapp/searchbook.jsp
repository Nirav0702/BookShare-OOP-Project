<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.example.BookShare.model.Book" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
			<tr>
			    <th>Book Title</th>
			    <th>Book Author</th>
			    <th>Book Publisher</th>
			    <th>Book Edition</th>
			    <th>Book Year</th>
			    <th>Book Owner</th>
			</tr>
			<c:forEach var="book" items="${searchedbooks}">
				<tr>
					<td>${book.bookTitle}</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookPublisher}</td>
					<td>${book.bookEdition}</td>
					<td>${book.bookYear}</td>
					<td>${book.ownerName}</td>
					<td>${book.bookId}</td>
					<td>
						<form action="borrowThisBook">
							<input type="hidden" id="custId" name="bookId" value=${book.bookId}>
							<button type="submit">Borrow This Book</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>				
</body>
</html>
