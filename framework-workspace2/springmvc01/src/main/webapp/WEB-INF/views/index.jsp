<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>${message}</h3>
		<br><br>
		<%--
			index.jsp - hello.do -- MyTestController 의 hello()
											|
									/WEB-INF/views/result1.jsp 로 응답
		 --%>
		spring controller 테스트
		<br><br>
		<a href = "hello.do">Hello Test</a><br><br>
		
		<a href = "hi.do">Hi Test</a><br><br>
		
		<form action="paramTest1.do">
			고객아이디 
			<input type = "text" name = "customerId" required="required"> 
			<button type = "submit">검색</button>
		</form><br><br>
		
		<form action="paramTest2.do">
			<input type = "text" name = "userName" placeholder="고객이름" required="required">		
			<input type = "text" name = "userAddress" placeholder="고객주소" required="required">		
			<button>전송</button>
		</form><br><br>
		
		<form action ="paramTest3.do">
			<input type = "checkbox" name = "hobby" value="영화보기">영화보기<br>
			<input type = "checkbox" name = "hobby" value="독서">독서<br>
			<input type = "checkbox" name = "hobby" value="게임">게임<br>
			<button>전송</button>
		</form><br><br>
		
		<form action="methodTest1.do"> <%--405 ERROR , 컨트롤러는 POST방식만 지원하도록 설정--%>
			<button>get방식 요청</button>
		</form><br><br>
		
		<form action="methodTest1.do" method = "post">
			<button>post방식 요청</button>
		</form><br><br>
		<hr>
		<form action="methodTest2.do">
			<button>get방식 요청</button>
		</form><br><br>
		
		<form action="methodTest2.do" method = "post">
			<button>post방식 요청</button>
		</form><br><br>
		
		<form action="paramTest4.do" method = "post">
			<input type = "text" name = "id" placeholder="아이디" required="required"><br>
			<input type = "text" name = "name" placeholder="이름" required="required"><br>
			<input type = "text" name = "address" placeholder="주소" required="required"><br>
			<button>등록</button>
		</form><br><br>
		
		<form action="redirectTest.do" method = "post">
			<input type = "text" name = "id" placeholder="아이디" required="required"><br>
			<input type = "text" name = "name" placeholder="이름" required="required"><br>
			<button>redirectTest</button>
		</form><br><br>
		
		<form action="hasA-Test.do" method = "post">
			<input type = "text" name = "id" placeholder="아이디" required="required"><br>
			<input type = "text" name = "name" placeholder="이름" required="required"><br>
			<!-- has a 관계 : 인스턴스변수명.인스턴스변수명 -->
			<input type = "text" name = "carDTO.model" placeholder="차 모델" required="required"><br>
			<input type = "number" name = "carDTO.price" placeholder="차 가격" required="required"><br>
			<button>HasA-Test</button>
		</form><br><br>
		
		<form action = "login.do" method = "post">
			<input type = "text" name = "id" placeholder="id" required="required"><br>
			<input type = "password" name = "password" placeholder="password" required="required"><br>
			<button>로그인</button>
		</form>
		
		<img src = "springmvc.jpg">
	</body>
</html>










