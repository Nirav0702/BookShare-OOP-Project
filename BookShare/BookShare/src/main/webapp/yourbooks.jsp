<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   	<%for ( int fontSize = 1; fontSize <= 3; fontSize++){ %>
         <font color = "green" size = "<%= fontSize %>">
            JSP Tutorial
         </font><br />
      <%}%>
      
      <table class="table">
      	<thead>
      		<tr>
      			<th>book_id</th>
      			<th>availability</th>
      			<th>author</th>
      			<th>edition</th>
      			<th>publisher</th>
      			<th>title</th>
      			<th>borrower id</th>
      			<th>owner_id</th>
      			<th>time_borrowed</th>
      			<th>time_returned</th>
      		</tr>
      	</thead>
      	<tbody>
      		<tr th:each="book:$(books)">
      			<td th:text="$(books.id)"></td>
      			<td th:text="$(books.availability)"></td>
      			<td th:text="$(books.bookAuthor)"></td>
      			<td th:text="$(books.bookEdition)"></td>
      			<td th:text="$(books.bookPublisher)"></td>
      			<td th:text="$(books.bookTitle)"></td>
      			<td></td>
      			<td></td>
      			<td></td>
      			<td></td>

      		</tr>
      	</tbody>
      </table>
</body>
</html>