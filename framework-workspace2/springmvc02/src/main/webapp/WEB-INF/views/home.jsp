<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>home</title>
	</head>
	<body>
		<h3>SpringMVC + MyBatis</h3><br><br>
		<a href = "getTotalCustomerCount.do">고객수 보기</a>
		<!-- 
			CustomerController		CustomerMapper		DB
			getTotalCustomerCount()	--    Proxy		--
					|
		WEB-INF/views/customer-count.jsp
			고객수는 1명입니다.			
		 -->
		 
		 <form action = "findCustomerById.do">
		 	<input type = "text" name = "id" placeholder="아이디" required="required">
		 	<button>검색</button>
		 </form><br><br>
		 
		 <form action = "registerCustomer.do" method = "post">
		 	<input type = "text" name = "id" placeholder="아이디" required="required"><br>
		 	<input type = "text" name = "name" placeholder="이름" required="required"><br>
		 	<input type = "text" name = "address" placeholder="주소" required="required"><br>
		 	<button>등록</button>
		 </form><br><br>
	</body>
</html>