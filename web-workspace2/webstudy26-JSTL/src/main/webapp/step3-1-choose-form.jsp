<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>step3-1-choose-form</title>
	</head>
<body>
	<form action = "step3-3-choose-action.jsp">
		<input type="text" name="name" placeholder="이름" required="required"><br>
		<input type="number" name="age" placeholder="나이" required="required"><br>
		<button>전송</button>
	</form>
	<%--
		step3-2-choose-action.jsp에서
		19세 이상이면 
		누구님 28세 성인입니다
		13세 이상이면 
		누구님 14세 청소년입니다
		13세 미만이면
		누구님 11세 어린이입니다.
	 --%>
</body>
</html>