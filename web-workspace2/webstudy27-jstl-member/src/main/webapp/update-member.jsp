<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보수정페이지</title>
</head>
<body>
	<a href = "index.jsp">Home</a> <hr>
	<form action = "">
	아이디 : <input type = "text" name = "id" placeholder="${sessionScope.mvo.id }" required="required"> <br>
	이름 : <input type = "text" name = "name" placeholder="${sessionScope.mvo.name }" required="required"> <br>
	비밀번호 : 
	주소 : 
	생년월일 : 
	</form>
	
</body>
</html>