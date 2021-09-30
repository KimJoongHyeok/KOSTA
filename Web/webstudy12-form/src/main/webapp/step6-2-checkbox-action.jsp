<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-2-checkbox-action.jsp</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>No</th>
				<th>MENU</th>
			</tr>
		</thead>
		<tbody>
			<%
			String[] menu = request.getParameterValues("menu");
			for (int i = 0; i < menu.length; i++) {
			%>
			<tr>
				<td><%=i + 1%></td>
				<td><%=menu[i]%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>