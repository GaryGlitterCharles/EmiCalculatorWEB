<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

	<h2>RePayment Schedule</h2>


	<table>
		<tr>
			<th>Installment Number</th>
			<th>OutStanding principal</th>
			<th>Interest</th>
			<th>Principal </th>
			<th>EMI</th>
		</tr>
		<c:forEach items="${repay}" var="element">
			<tr>
				<th>${element.id}</th>
				<th>${element.outsandingPrincipal}</th>
				<th>${element.interst}</th>
				<th>${element.principal}</th>
				<th>${element.emi}</th>
			</tr>
		</c:forEach>
	</table>
	<br><br/>
	<form:form action="viewRecord" method="post" modelAttribute="emiID">
		<p>
			<b>Enter the instalment number: </b><p />
			<form:input path="id" class="form-input" name="emiID" id="emiID"
				placeholder="enter the instalment number" />

			<form:button class="btn btn-success">submit</form:button>
	</form:form>

</body>
</html>
