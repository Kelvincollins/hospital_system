<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient's Records</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 align="center">______ All Records______</h2>
		
		
	<spring:url value="/home/addPatient/" var="addURL" />
		<a class="btn btn-primary" href="${addURL }" role="button">Add New</a>
		
		
		<spring:url value="/home/addPatient/" var="addURL" />
		<a  class="btn btn-primary" href="${addURL }" role="button">Search</a> 
		
		
	
		
		<table class="table table-striped">
			<thead>
				
				<th scope="row">Id No.</th>
				<th scope="row">First Name</th>
				<th scope="row">Second Name</th>
				<th scope="row">Last Name</th>
				<th scope="row">Mobile No.</th>
				<th scope="row">Last Update</th>
				<th scope="row">Edit</th>
				<th scope="row">View</th>
			</thead>
			<tbody>
				<c:forEach items="${patientList }" var="patient">
					<tr>
						
						<td>${patient.id_number }</td>
						<td>${patient.first_name }</td>
						<td>${patient.second_name }</td>
						<td>${patient.last_name }</td>
						<td>${patient.tel }</td>
						<td>${patient.date_created }</td>
						<td><spring:url
								value="/home/updatePatient/${patient.id }"
								var="updateURL" /> <a class="btn btn-primary"
							href="${updateURL }" role="button">Edit</a></td>
						<td><spring:url
								value="/home/viewPatient/${patient.id }"
								var="deleteURL" /> <a class="btn btn-primary"
							href="${deleteURL }" role="button">View</a></td>
							
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>