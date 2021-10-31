<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%-- 
	layout.jsp 에서 import 하는 상단부 영역
	비로그인시에는 로그인 폼을 제공하고
	로그인시에는 홈, 글쓰기, 누구님, 로그아웃 을 제공
--%>
<c:choose>
	<c:when test="${sessionScope.mvo == null}">
		<form action = "LoginController.do" method = "post">
			<input type = "text" name = "id" placeholder="아이디" required="required" size = "12">
			<input type = "password" name = "password" placeholder="비밀번호" required="required" size = "12">
			<button>로그인</button>
		</form>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name} 님 환영합니다.
		<a href = "LogoutController.do">로그아웃</a>
	</c:otherwise>
</c:choose>
