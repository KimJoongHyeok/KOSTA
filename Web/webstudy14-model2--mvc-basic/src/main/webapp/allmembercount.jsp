<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>총 회원수</title>
</head>
<body>
<%-- Controller servlet 이 공유한 request로부터 총회원수 정보를 얻어온다 --%>

총 회원수 <%= request.getAttribute("count") %> 명
</body>
</html>