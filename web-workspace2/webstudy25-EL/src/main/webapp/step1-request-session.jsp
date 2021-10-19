<%@page import="model.FoodVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL 기본</title>
	</head>
<body>
	<%
		//컨트롤러에서 공유했다고 가정
		FoodVO vo = new FoodVO("짜장면", 5000);
		//request 에 저장
		request.setAttribute("fvo", vo);
		//session 에 저장
		session.setAttribute("food", new FoodVO("탕수육", 10000));
		//동일한 이름의 request와 session에 정보를 할당
		request.setAttribute("test", new FoodVO("떡볶이", 2000));
		session.setAttribute("test", new FoodVO("피자", 12000));
	%>
		1.기존 방식으로 표현
	<%
		FoodVO fvo = (FoodVO) request.getAttribute("fvo");
		FoodVO fvo2 = (FoodVO) session.getAttribute("food");
	%>
		<%=fvo.getName()%>
		<%=fvo.getPrice()%>
		<%=fvo2.getName()%>
		<%=fvo2.getPrice()%>
		<br>
		<br> 2.EL 방식으로 표현 : ${fvo.name} ${fvo.price}
		${requestScope.fvo.name} ${requestScope.fvo.price} ${food.name}
		${food.price} ${sessionScope.food.name} ${sessionScope.food.price }
		<BR>
		<BR>
		동일한 name의 정보를 request와 session 에서 EL로 정보를 확인해본다
		<%-- 
			아래와 같이 별도의 Scope를 명시하지 않으면 request 영역에 있는 정보를 반환 
			request < session < application(ServletContext) 좁은 순서대로 반환하기 떄문에 request 반환
		--%>
		${test.name} ${test.price}
		<%-- session 의 test 정보를 얻으려면 Scope를 명시한다 --%>
		${sessionScope.test.name } ${sessionScope.test.price }

</body>
</html>