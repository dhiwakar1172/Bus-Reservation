<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Bus</title>
</head>
<body>
	<h1>Check Bus:</h1>
	<form method="post" action="BusController">
		<table>
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
				<td><input type="submit" value="Show Available Buses" /></td>
		</table>
	</form>
</body>
</html>