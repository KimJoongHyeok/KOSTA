<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findMemberById-OK</title>
</head>
<body>
<%--Controller인 findMemberByIdServlet에서 forward 방식으로 이동했으므로
	아래와 같이 아이디,이름,주소를 출력할 수잇다--%>
	<%
		//MemberVO vo = (MemberVO)request.getAttribute("memberId");
		//vo.getId(),name,address  로 다 빼올수 잇음 --
	%>
	아이디 : <%= request.getAttribute("memberId") %><br>
	이름 : <%= request.getAttribute("memberName") %><br>
	주소 : <%= request.getAttribute("memberAddress") %><br>
	
	
	
</body>
</html>