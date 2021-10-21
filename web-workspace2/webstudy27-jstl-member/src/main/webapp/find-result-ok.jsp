<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색창</title>
</head>
<body>
	<a href="index.jsp">Home</a>
	<hr>
	아이디 : ${requestScope.memberInfo.id }
	<br> 이름 :${requestScope.memberInfo.name }
	<br> 주소 : ${requestScope.memberInfo.address }
	<br> 생년월일 : ${requestScope.memberInfo.birth }
	<br> 가입일시 : ${requestScope.memberInfo.regdate }
	<br>
</body>
</html>