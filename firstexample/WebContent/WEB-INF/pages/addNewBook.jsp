<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Application: checkout new books</title>
</head>
<body>
	<b>Books</b>
	<p></p>
	<hr>
	<form:form modelAttribute="book" autocomplete="false" action="saveNewBook">
		<table>
			<tr>
				<td>Enter Name Of Book:</td>
				<td><form:input path="bookName" /></td>
			</tr>
			<tr>
				<td>Enter Authors Name:</td>
				<td><form:textarea path="authors" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="Save" /></td>
				<td><input type="reset" name="Reset" />
			</tr>
		</table>
	</form:form>
	Handling time: ${handlingTime} miliseconds.
</body>
</html>