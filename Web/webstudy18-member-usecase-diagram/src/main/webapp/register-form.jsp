<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h3>회원가입</h3>
<form action = "RegisterMemberServlet">
	<form action = "IdCheckServlet">
	아이디 : <input type = "text" name = "memberId" placeholder="아이디" required="required">
			<button>아이디 중복 확인</button>
	<br>
	</form>
	패스워드 : <input type = "password" name = "memberPassword" placeholder="패스워드" required="required"><br>
	이름 : <input type = "text" name = "memberName" placeholder="이름" required="required"><br>
	주소 : <input type = "text" name = "memberAddress" placeholder="주소" required="required"><br>
	<button>가입</button>
</form>

</body>
</html>