<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>emi calculator</title>


<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">


<link rel="stylesheet" href="css/style.css">
<script type="text/javascript">
function ValidationEvent() {
	var loanAm = document.getElementById("loan").value;
	var rate = document.getElementById("rate").value;
	var tenure = document.getElementById("tenure").value;
	var numOf = document.getElementById("numOf").value;
	if(isNaN(loanAm))
		{
		alert("please type the number");
		return false;
		}
		
		if(isNaN(rate))
		{
			alert("please type the number!");
			return false;
		}
		
		if(isNaN(tenure))
		{
			alert("please type the number!");
			return false;
		}
		
		if(isNaN(numOf))
		{
			alert("please type the number!");
			return false;
		}
	
		return true;

}
</script>
</head>
<body>

	<div class="main">

		<section class="signup">
		
			<div class="container">
				<div class="signup-content">
					<form:form method="POST" action="insertFields"
						modelAttribute="fields" class="signup-form"  onsubmit="return ValidationEvent()">

						
						<h2 class="form-title">EMI Calculator</h2>
						<div class="form-group">
							<form:input path="loanAmount" class="form-input"
								name="loanAmount" id="loan" placeholder="loan Amount" />
						</div>
						<div class="form-group">
							<form:input path="rateOfInterest" class="form-input"
								name="rateOfInterest" id="rate"
								placeholder="Rate of rateOfInterest" />
						</div>
						<div class="form-group">
							<form:input path="tenure" class="form-input" name="tenure"
								id="tenure" placeholder="Tenure" />

						</div>
						<div class="form-group">
							<form:input path="numberOfInstalments" class="form-input"
								name="noOfInstalment" id="numOf"
								placeholder="no of instammlents" />
						</div>

						<div class="form-group">
							<input type="submit" name="submit" id="submit"
								class="form-submit" value="Calculate EMI"/>
						</div>
					</form:form>

				</div>
			</div>
		</section>

	</div>

	
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>