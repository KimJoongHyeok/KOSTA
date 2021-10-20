<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>step4-forEach( jstl for loop )</title>
	</head>
<body>
	<%  //컨트롤러에서 공유한 정보라고 가정
		String friends[] = {"이강인","손흥민","황의조"};
		request.setAttribute("fa", friends);
	%>
	<%-- 
		jstl forEach : jstl for loop
		items : 저장된 배열 또는 컬렉션 ( list or map .. )
		var : 요소를 저장할 변수
		varStatus : index 와 count 속성
						 index 는 0부터 시작
						 count는 1부터 시작
	--%>
	<c:forEach items="${requestScope.fa }" var="f" varStatus="order">
		${f} , index = ${order.index } , count : ${order.count }
		<br>
	</c:forEach>
</body>
</html>