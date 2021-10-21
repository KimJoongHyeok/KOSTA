<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL forEach begin end</title>
	</head>
<body>
	<c:forEach begin="1" end="10" var="page">
		${page} &nbsp; &nbsp; <!-- spacebar 같은 역할 -->
	</c:forEach>
	<br><br>
	<%
		//컨트롤러에서 공유했다고 가정
		request.setAttribute("startPage", 11); //시작페이지번호
		request.setAttribute("endPage", 15); //마지막페이지번호
		request.setAttribute("nowPage", 13); //현재페이지번호
	%>
	
	startPage와 endPage까지 page정보를 출력<br>
	<%-- 현재페이지 nowPage 에는 링크를 부여하지 않고 나머지 페이지는 링크를 부여해본다 --%>
	<c:forEach begin="${requestScope.startPage }" end="${requestScope.endPage }" var="page">
		<c:choose>
			<c:when test="${page==requestScope.nowPage}">
				${page} &nbsp; &nbsp;
			</c:when>
			<c:otherwise>
				<a href = "">${page}</a>&nbsp; &nbsp; 
			</c:otherwise>
		</c:choose>
	</c:forEach>
</body>
</html>