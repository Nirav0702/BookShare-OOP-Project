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
	<table>
		<tr>
			<td>
				<table border="1">
							<c:forTokens items = "${bookTitle}" delims="," var = "book">
							<tr>
								<td>${book}</td>
							</tr>
					    	</c:forTokens>
				</table>
			</td>
			<td>
				<table border="1">
					<c:forTokens items = "${bookAuthor}" delims="," var = "book">
					<tr>
						<td>${book}</td>
					</tr>
			    	</c:forTokens>
				</table>
			</td>
			<td>
				<table border="1">
							<c:forTokens items = "${bookPublisher}" delims="," var = "book">
							<tr>
								<td>${book}</td>
							</tr>
					    	</c:forTokens>
				</table>
			</td>
			<td>
				<table border="1">
							<c:forTokens items = "${bookYear}" delims="," var = "book">
							<tr>
								<td>${book}</td>
							</tr>
					    	</c:forTokens>
				</table>
			</td>
			<td>
				<table border="1">
					<c:forTokens items = "${bookEdition}" delims="," var = "book">
					<tr>
						<td>${book}</td>
					</tr>
			    	</c:forTokens>
				</table>
			</td>
			<td>
				<table border="1">
							<c:forTokens items = "${bookOwnerName}" delims="," var = "book">
							<tr>
								<td>${book}</td>
								<td>
									<form action="borrowThisBook">
										<input type="hidden" id="custId" name="bookOwnerName" value=${book}>
										<button type="submit">Borrow Book</button>
									</form>
								</td>
							</tr>
					    	</c:forTokens>
				</table>
			</td>
			<td>
				<table border="1">
							<c:forTokens items = "${bookBorrowerName}" delims="," var = "book">
							<tr>
								<td>${book}</td>
							</tr>
					    	</c:forTokens>
				</table>
			</td>
		</tr>
	</table>
	
				
</body>
</html>
