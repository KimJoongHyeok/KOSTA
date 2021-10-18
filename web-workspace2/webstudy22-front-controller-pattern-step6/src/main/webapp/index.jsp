<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web MVC + FrontController</title>
</head>
<body>
	<h3>Model 2 Architecture MVC,Singleton,FrontControl</h3>
	<%--
		index.jsp -- FrontControllerServlet -- FindCustomerByIdController --DAO --DB
								|
						findbyid-ok.jsp
								|
						findbyid-fail.jsp
							
 --%>
 <%--	
 		step6 에서는 command 를 컨트롤러명.do 스타일로 변경해서 적용해본다.
 		
  --%>
	<form action="FindCustomerByIdController.do" method="get">
		<!-- <input type="hidden" name="command" value="FindCustomerByIdController"> -->	
		<input type="text" name="id" placeholder="고객아이디" required="required">
		<button type="submit">검색</button>
	</form>
	<br>
	<br>
	<form action="RegisterCustomerController.do" method="post">
		<!-- <input type="hidden" name="command" value="RegisterCustomerController"> -->
		<input type="text" name="customerInfo" placeholder="고객정보"
			required="required">
		<button type="submit">등록</button>
	</form>
	<br>
	<br>
	<form action="UpdateCustomerController.do" method="post">
		<!-- <input type="hidden" name="command" value="UpdateCustomerController"> -->
		<input type="text" name="customerInfo" placeholder="고객정보"
			required="required">
		<button type="submit">수정</button>
	</form>
	<br>
	<br>
	<form action="DeleteCustomerController.do" method="post">
		<!--<input type="hidden" name="command" value="DeleteCustomerController">  -->
		<input type="text" name="customerId" placeholder="고객아이디"
			required="required">
		<button>삭제</button>
	</form>
	<br>
	<br>
	<img src="image/frontcontroller.gif">
</body>
</html>