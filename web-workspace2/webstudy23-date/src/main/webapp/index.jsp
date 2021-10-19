<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db sql date 형 테스트</title>
</head>
<body>
	<%-- 
		컨트롤러 영역 테스트를 위한 폼 
					 @WebServlet("*.do")
		index.jsp -- FrontControllerSerlvlet -- HandletMapping -- Controller
																	  |
																TestController
							   | forward
						test.result.jsp
	--%>
	<!-- <form action="TestController.do" method = "post">
		<button type = "submit">전송</button>
	</form> -->
	<%--
			index.jsp -- FrontControllerServlet -- HandlerMapping -- FindProductByIdController -- ProdcutDAO 				-- DB
																								findProductId(id):ProductVO
								   |
						findbyid-fail.jsp(alert 후 다시 index로 이동)
								   or
					    findbyid-ok.jsp(검색된 상품 정보를 제공)															
	 --%>
	<h3>MVC + Front Controller Desing Pattern 상에 db date 형 연습</h3>
	<form action="FindProductByIdController.do">
		<input type="number" name="productId" placeholder="상품아이디"
			required="required">
		<button>검색</button>
	</form>
	<BR>
	<br>
	<%--
			index.jsp -- FrontControllerServlet -- HandlerMapping -- RegisterProductController --ProductDAO -- DB
	 							|																registerProduct
	 							| redirect
	 						register-result.jsp
	 
	 --%>
	<h3>상품등록</h3>
	<form action="RegisterProductController.do" method="post">
		<input type="text" name="name" placeholder="상품명" required="required">
		<br> <input type="text" name="maker" placeholder="제조사명"
			required="required"><br> <input type="text" name="price"
			placeholder="상품가격" required="required"><br>
		<button>등록</button>
		<button type="reset">리셋</button>
	</form>
	<br>
	<br>
	<%--
			index.jsp -- FrontControllerServlet -- HandlerMapping -- AllProductListController -- ProductDAO -- DB
																									  |
									|forward										getAllProductList():ArrrayList<ProductVO>
									|												
								product-list.jsp
								( 상품 리스트 제공 : 상품명,제조사,등록년,월,일 )															
	 --%>
	<a href = "AllProductListController.do">상품리스트</a>

</body>

</html>