<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid-ok</title>
</head>
<body>
<a href = "index.jsp">Home</a><hr>
고객 정보 : <%= request.getAttribute("customerInfo") %>
</body>
</html>