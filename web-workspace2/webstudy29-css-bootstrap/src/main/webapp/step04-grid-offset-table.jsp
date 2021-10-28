<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<title>grid-offset-table</title>
	</head>
	<body>
		<div class = "container pt-3">
			<div class = "row">
				<div class = "col-sm-6 offset-sm-3">
					<table class="table table-hover table-bordered">
					    <thead>
					    	<tr>
						        <th>Firstname</th>
						        <th>Lastname</th>
						        <th>Email</th>
					    	</tr>
					    </thead>
					    <tbody>
					      	<tr>
						        <td>John</td>
						        <td>Doe</td>
						        <td>john@example.com</td>
					    	</tr>
					    	<tr>
						        <td>Mary</td>
						        <td>Moe</td>
						        <td>mary@example.com</td>
					        </tr>
					      	<tr>
						        <td>July</td>
						        <td>Dooley</td>
						        <td>july@example.com</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div> <%-- row div --%>
		</div><%-- container div --%>
	</body>
</html>