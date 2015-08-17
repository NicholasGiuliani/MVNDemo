<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Hello World Spring MVC</title>
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
</head>
<body>
	<!--TODO-01: change insert type -->
	<form action="insert" method="POST">
		Name: <input type="text" name="in_name"> 
		 <input type="submit" value="Submit" />
	</form>
	
	<input type="button" value="Add"
		onClick="javascript:window.location='insert';">
	<input type="button" value="display"
		onClick="javascript:window.location='welcome';">

	<br>
	<br>
	<h2>My Page</h2>

	<h3>${message}</h3>

	<table>
		<tr>
			<td>start</td>
		</tr>
		<c:forEach items="${people}" var="Person">
			<tr>
				<td><li>name:${Person.name} ----- ID:${Person.id}</li></td>
			</tr>
		</c:forEach>
		<tr>
			<td>end</td>
		</tr>
	</table>

</body>
</html>