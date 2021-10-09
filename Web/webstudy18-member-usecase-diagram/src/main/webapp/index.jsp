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
	MemberVO mvo = (MemberVO)session.getAttribute("mvo");
	if(mvo == null){
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
<%= mvo.getName() %>님 반갑습니다.
<br><br>
<%-- a href 링크는 기본적으로 get 요청방식이다
로그인, 로그아웃은 post 방식이 적합나다
(get 방식은 사용자가 브라우저 url상에서 주소를 기입해서 실행해도 동작이 되기 떄문) --%>
<script type="text/javascript">
	function logout(){
		document.getElementById("logoutForm").submit();
	}
</script>
<form action = "LogoutServlet" method = "post" id = "logoutForm"></form>
<a href = "#" onclick = "logout()">로그아웃</a>

<br>
<a href = "update-form.jsp" >회원정보수정</a>

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