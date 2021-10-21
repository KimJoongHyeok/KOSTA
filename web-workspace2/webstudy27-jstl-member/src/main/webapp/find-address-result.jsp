<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
  <title>회원검색결과</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<a href = "index.jsp">Home</a><hr>
  <h2>"<%=request.getParameter("address")%>" 에 사는 회원검색결과</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>생년월일</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.addressList }" var="list">
      <tr>
        <td>${list.id}</td>
        <td>${list.name }</td>
        <td>${list.birth}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>