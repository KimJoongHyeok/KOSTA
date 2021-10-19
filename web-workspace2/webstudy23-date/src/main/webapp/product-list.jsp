<%@page import="org.kosta.webstudy23.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품리스트결과</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	@SuppressWarnings("unchecked")
	ArrayList<ProductVO> list = (ArrayList<ProductVO>) request.getAttribute("productList");
	%>
	<div class="container pt-3">
		<%-- pt : padding top --%>
		<a href="index.jsp">Home</a>
		<hr>
		<table class="table table-bordered table-hover">
			<thead>
				<tr class="bg-dark text-white">
					<th>상품명</th>
					<th>제조사</th>
					<th>등록일</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td><a href="FindProductByIdController.do?productId=<%=list.get(i).getId()%>"><%=list.get(i).getName()%></a></td>
					<td><%=list.get(i).getMaker()%></td>
					<td><%=list.get(i).getRegDate()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	<%-- div container --%>
</body>
</html>