<%@page import="org.kosta.webstudy18.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyaddress-result.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/home.css">
</head>
<body>

<h3>검색 결과</h3>
<table>
	<thead>
		<tr>
			<th>아이디</th> <th>이름</th><th>주소</th>
		</tr>
	</thead>
	<tbody>
		<%
			ArrayList<MemberVO>list = (ArrayList<MemberVO>)request.getAttribute("addresslist");
			for(int i = 0;i<list.size();i++){
		%>
		<tr>
			<td><%= list.get(i).getId() %></td><td><%=list.get(i).getName() %></td><td><%=list.get(i).getAddress() %></td>
		</tr>
		<%
			}
		%>
	</tbody>
</table>

</body>
</html>