<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Page</title>
</head>
<body>
	<h1>Bus Booking:</h1>
	<form method="post" action="PassengerServlet">
		<table>
			<tr>
				<td>Name:</td>
				<td><input name="name" /></td>
			</tr>
			<tr>
				<td>Age :</td>
				<td><input name="age" /></td>
			</tr>
			<tr>
				<td>Bus Name:</td>
				<td><input name="busName" /></td>
			</tr>
			<tr>
				<td>Date Of Travel:</td>
				<td><input name="dateOfTravel" /></td>
			</tr>
			<tr>
				<td>Departure Place:</td>
				<td><input name="departurePlace" /></td>
			</tr>
			<tr>
				<td>Arrival Place:</td>
				<td><input name="arrivalPlace" /></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Go for Booking" /></td>
		</table>
	</form>
</body>
</html>