<%@page import="org.kosta.webstudy18.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리</title>
<link rel = "stylesheet" type = "text/css" href = "css/home.css">
</head>
<body>
<div class = "container">
<h3>Model2 MVC 회원관리</h3>
<%--1. 아이디로 회원 검색 --%>
<form action = "FindMemberByIdServlet">
	<input type = "text" name = "memberId" placeholder="아이디" required="required">
	<button>검색</button>
</form>
<br>
<hr>
<%
	MemberVO vo = (MemberVO)session.getAttribute("mvo");
	if(vo == null){
%>
<h3>로그인</h3>
<form action = "LoginServlet" method = "post">
	<input type = "text" name = "memberId" placeholder="아이디" required="required"><br>
	<input type = "password" name = "memberPassword" placeholder="비밀번호" required="required">
	<button>로그인</button>
</form>
<hr>
<form action = "register-form.jsp">
	<button>회원가입하기</button>
</form>

<%
	}else{
%>
<h3>로그인 성공</h3>
<%= vo.getName() %>님 반갑습니다.
<br><br>
<form action = "LogoutServlet">
	<button>로그아웃</button>
</form>
<br>
<form action = "update-form.jsp">
	<button>회원정보수정</button>
</form>
<br>
<hr>
<h3>주소로 회원정보 검색하기</h3>
<form action = "FindMemberListByAddressServlet">
	<input type = "text" name = "address" placeholder="주소" required="required">
	<button>검색</button>
</form>
<%
}
%>

</div>
</body>
</html>