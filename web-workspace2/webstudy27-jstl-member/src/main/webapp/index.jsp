<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h3>회원검색</h3>
	<form action="FindMemberByIdController.do">
		<input type="text" name="id" placeholder="아이디" required="required">
		<button>검색</button>
	</form>
	<hr>
	<c:choose>
		<c:when test="${sessionScope.mvo==null }">
			<h3>로그인</h3>
			<form action="LoginController.do" method="post">
				<input type="text" name="id" placeholder="아이디" required="required">
				<br> <input type="password" name="password" placeholder="비밀번호"
					required="required"> <br>
				<button>로그인</button>
			</form>
		</c:when>
		<c:otherwise>
			<h3>로그인성공</h3>
			${sessionScope.mvo.name}님 환영합니다
			<form action = "LogoutController.do">
				<button>로그아웃</button>
			</form>
			<br>
			<h3>주소로 회원검색하기</h3>
			<form action = "FindAddressController.do">
				<input type = "text" name = "address" placeholder="주소" required="required">
				<button>검색</button>
			</form>
			<br>
			<br>
			<a href = "update-member.jsp">회원정보수정</a>
		</c:otherwise>
	</c:choose>

</body>
</html>