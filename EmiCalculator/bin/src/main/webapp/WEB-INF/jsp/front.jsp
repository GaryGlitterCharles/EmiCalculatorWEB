<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMI Calculator</title>
</head>
<body>
	<form:form action="insertFields" method="post" modelAttribute="fields">
		Loan Amount <form:input path="loanAmount"/>
		Rate of Interest <form:input path="rateOfInterest"/>
		Tenure <form:input path="tenure"/>
		Number of Installments <form:input path="numberOfInstalments"/><br><br/>
		<form:button>submit</form:button>
	</form:form>
</body>
</html>