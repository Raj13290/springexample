<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Application: checkout new books</title>
</head>
<body>
	<b>Books</b><hr>
	<p>List of all available books</p>
	<hr>
	<c:if test="${fn:length(books)==0 || books==null}">
		No book is there in database.
	</c:if>
	<c:if test="${fn:length(books)!=0 && books!=null}">
	<table cellpadding="1" border="1">
	<thead>
		<tr>
			<th>SL NO</th>
			<th>Name</th>
			<th>Subject</th>
			<th>Authors</th>
			<th>Edit</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book" varStatus="i">
				<tr>
					<td>${i.count }</td>
					<td>${book.bookName}</td>
					<td>-</td>
					<td>${book.authors.toString()}</td>
					<td><a href="editBook?bookId=${book.bookId}">Edit</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</c:if>
</body>
</html>