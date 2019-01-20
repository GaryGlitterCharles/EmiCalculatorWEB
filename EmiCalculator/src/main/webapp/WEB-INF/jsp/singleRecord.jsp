<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
<p><b>For Installment Number: ${single.id}</b> <p>
<br>
		<table>
		<tr>
			<th>Installment Number</th>
			<th>OutStanding principal</th>
			<th>Interest</th>
			<th>Principal </th>
			<th>EMI</th>
		</tr>
		<tr>
			<th>${single.id}</th>
			<th>${single.outsandingPrincipal}</th>
			<th>${single.interst}</th>
			<th>${single.principal}</th>
			<th>${single.emi}</th>
		</tr>


	</table>
</body>
</html>