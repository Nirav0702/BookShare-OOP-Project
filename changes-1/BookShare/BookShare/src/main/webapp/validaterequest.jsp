<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${selectedbook.bookTitle}
	${selectedbook.bookAuthor}
	${selectedbook.bookPublisher}
	${selectedbook.bookEdition}
	${selectedbook.bookYear}
	${selectedbook.ownerName}
	${selectedbook.bookId}
	<form action="confirmBorrow" method="post">
		<input  type="text" placeholder="Enter Duration" name="duration" required>
		<input type="hidden" id="custId1" name="ownerName" value=${selectedbook.ownerName}>
		<input type="hidden" id="custId2" name="borrowerName" value=${selectedbook.borrowerName}>
		<input type="hidden" id="custId3" name="bookId" value=${selectedbook.bookId}>
		<button type="submit">Confirm</button>
	</form>
	<form action="cancelBorrow">
		<input type="hidden" id="custId" name="borrowerName" value=${selectedbook.borrowerName}>
		<button type="submit">Cancel</button>
	</form>
</body>
</html>