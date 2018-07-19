<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Form</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<spring:url value="/home/savePatient" var="saveURL" />
		<h2>Persons's Details</h2>
		<form:form modelAttribute="patientForm" method="post"
			action="${saveURL }" cssClass="form">
			<form:hidden path="id" />
			<div class="form-group">
				<label>Id No.</label>
				<form:input path="id_number" cssClass="form-control" id="id_number" />
			</div>

			<div class="form-group">
				<label>First Name</label>
				<form:input path="first_name" cssClass="form-control"
					id="first_name" />
			</div>
			<div class="form-group">
				<label>Second Name</label>
				<form:input path="second_name" cssClass="form-control"
					id="second_name" />
			</div>

			<div class="form-group">
				<label>Last Name</label>
				<form:input path="last_name" cssClass="form-control" id="last_name" />
			</div>
			<div class="form-group">
				<label>Mobile No</label>
				<form:input path="tel" cssClass="form-control" id="tel" />
			</div>
			<h2>Spouse</h2>
			<div class="form-group">
				<label>Id No.</label>
				<form:input path="id_number_spouse" cssClass="form-control"
					id="id_number_spouse" />
			</div>

			<div class="form-group">
				<label>First Name</label>
				<form:input path="first_name_spouse" cssClass="form-control"
					id="first_name_spouse" />
			</div>

			<div class="form-group">
				<label>Last Name</label>
				<form:input path="last_name_spouse" cssClass="form-control"
					id="last_name_spouse" />
			</div>
			<div class="form-group">
				<label>Mobile No</label>
				<form:input path="tel_spouse" cssClass="form-control"
					id="tel_spouse" />
			</div>

			<h2>Children</h2>
			<h3>1st child</h3>
			<div class="form-group">
				<label>First Name</label>
				<form:input path="first_name_child1" cssClass="form-control"
					id="first_name_child1" />
			</div>
			<div class="form-group">
				<label>Last Name</label>
				<form:input path="last_name_child1" cssClass="form-control"
					id="last_name_child1" />

				<h3>2nd child</h3>
				<div class="form-group">
					<label>First Name</label>
					<form:input path="first_name_child2" cssClass="form-control"
						id="first_name_child2" />
				</div>
				<div class="form-group">
					<label>Last Name</label>
					<form:input path="last_name_child2" cssClass="form-control"
						id="last_name_child2" />

					<h3>3rd child</h3>
					<div class="form-group">
						<label>First Name</label>
						<form:input path="first_name_child3" cssClass="form-control"
							id="first_name_child3" />
					</div>
					<div class="form-group">
						<label>Last Name</label>
						<form:input path="last_name_child3" cssClass="form-control"
							id="last_name_child3" />


						<h3>4th child</h3>
						<div class="form-group">
							<label>First Name</label>
							<form:input path="first_name_child4" cssClass="form-control"
								id="first_name_child4" />
						</div>
						<div class="form-group">
							<label>Last Name</label>
							<form:input path="last_name_child4" cssClass="form-control"
								id="last_name_child4" />


							<h3>5th child</h3>
							<div class="form-group">
								<label>First Name</label>
								<form:input path="first_name_child5" cssClass="form-control"
									id="first_name_child5" />
							</div>
							<div class="form-group">
								<label>Last Name</label>
								<form:input path="last_name_child5" cssClass="form-control"
									id="last_name_child5" />
								<button type="submit" class="btn btn-primary">Save</button>
		</form:form>

	</div>

</body>
</html>