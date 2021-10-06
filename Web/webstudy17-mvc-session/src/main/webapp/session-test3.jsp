<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test3</title>
</head>
<body>
	<%
		//session 무효화 처리
		session.invalidate();
	%>
	세션 무효화 처리  <%-- <%= session.getAttribute("mvo") %> --%>  <%--세션무효화처리되어 getAttribute 할수 없다. --%>
	<br><br>
	<a href = "session-test1.jsp"> session 1에서 확인</a><br>
	<a href = "session-test2.jsp"> session 2에서 확인</a><br>
</body>
</html>