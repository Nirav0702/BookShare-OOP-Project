<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.example.BookShare.model.Book" %>
<%@page import="com.example.BookShare.model.Request" %>
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
			    <th>Request Id</th>
			    <th>Borrower Name</th>
			    <th>Book Id</th>
			    <th>Duration</th>
			    <th>Status</th>
			</tr>
			<c:forEach var="request" items="${requests}">
				<tr>
					<td>${request.requestId}</td>
					<td>${request.borrowerName}</td>
					<td>${request.bookId}</td>
					<td>${request.duration}</td>
					<td>${request.status}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>