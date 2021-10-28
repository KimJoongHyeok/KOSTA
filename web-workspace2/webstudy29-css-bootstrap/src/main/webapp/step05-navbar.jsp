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
		<title>nav bar</title>
	</head>
	<body>
		<div class = "container-fluid pt-3">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<ul class="navbar-nav">
					<li class="nav-item active"> <%-- 활성화된 상태 - 맨처음 안눌럿을때 진하게 표시되어잇는부분 --%>
						<a class="nav-link" href="#">Home</a> <%-- # 부분에 이제 controller.do --%>
					</li>
					<li class="nav-item">
					    <a class="nav-link" href="#">회원</a>
					</li>
					<li class="nav-item">
					    <a class="nav-link" href="#">상품</a>
					</li>
					<li class="nav-item">
						<a class="nav-link disabled" href="#">Disabled</a>
					</li>
				</ul>
			</nav>
			<div class = "row pt-3">
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