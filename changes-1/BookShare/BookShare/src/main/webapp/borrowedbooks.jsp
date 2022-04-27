<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.example.BookShare.model.Book" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body style= "background-color:#fff">
			
		
		<div  style="width:40%; margin:auto; margin-top:30px" >
		<table class="table table-striped table-bordered table-hover" >
  <thead>
   <tr>
			    <th scope="col">Book Title</th>
			    <th scope="col">Book Author</th>
			    <th scope="col">Book Publisher</th>
			    <th scope="col">Book Edition</th>
			    <th scope="col">Book Year</th>
			    <th scope="col">Book Owner</th>
			    <th scope="col">Book Id</th>
			</tr>
  </thead>
  <tbody>
   <c:forEach var="book" items="${borrowedbooks}">
				<tr>
					<th scope="row">>${book.bookTitle}</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookPublisher}</td>
					<td>${book.bookEdition}</td>
					<td>${book.bookYear}</td>
					<td>${book.ownerName}</td>
					<td>${book.bookId}</td>
				</tr>
			</c:forEach>
  </tbody>
</table>
    </div>
</body>
</html>