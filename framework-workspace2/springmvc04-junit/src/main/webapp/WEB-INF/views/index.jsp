<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
	</head>
	<body>
		<h3>SpringMVC MyBatis JUnit</h3>
		<br><br>
		아이템수 ${totalItemCount}
		<%--
			HomeController -- ItemMapper
			home()
			|
			index.jsp
		 --%>
		 <form action = "findItemByNo.do">
		 	<input type = "number" name = "itemNo" placeholder="아이템번호" required="required">
		 	<button>검색</button>
		 </form><br><br>
		 
		 <a href = "getAllItemList.do">아이템 리스트</a>
		 <br><br>
		 
		 <form action = "registerItem.do" method = "post">
		 	<input type = "text" name = "name" placeholder="이름" required="required">
		 	<input type = "text" name = "maker" placeholder="제조사" required="required">
		 	<input type = "number" name = "price" placeholder="가격" required="required">		 
		 	<button>등록</button>	
		 </form>
		 <%--register-item-result.jsp 에서 등록된 아이템 상세 정보가 제공된다. --%>
	</body>
</html>