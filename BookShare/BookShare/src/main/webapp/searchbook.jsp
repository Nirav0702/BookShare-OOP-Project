<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.example.BookShare.model.Book" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:if test="${not empty bookList}">
				    <c:forEach var="listitem" items="${bookList}">
				       ${listitem}
					</c:forEach>-
		</c:if>
	</ul>
	
	
	<table border="1"> 
		<thead> 
			<tr> 
				<th>#</th> 
				<th>User Name</th> 
				<th>Password</th> 
				<th>Email</th> 
				<th>Display Name</th> 
			</tr> 
		</thead> 
		<tbody> 
			
			<tr> 
				 
			</tr> 
			
		</tbody> 
	</table>
</body>
</html>