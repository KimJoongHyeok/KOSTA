<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel = "stylesheet" type = "text/css" href = "css/home.css">
</head>
<body>
<div class = "container">
<a href = "index.jsp">Home</a>
<hr>
<%-- 가입하기 submit을 누르면 패스워드와 패스워드 확인란에 동일한 패스워드를 입력했을 때만 submit되게 javascript로
구현
일치하지 않으면 alert로 패스워드와 패스워드 확인이 일치하지 않습니다 후 전송하지 않는다. --%>
<h3>회원가입</h3>
<script type="text/javascript">
	function checkForm(){
		let pass = document.getElementById("pass");
		let confirmPass = document.getElementById("confirmPass");
		if(pass.value != confirmPass.value){
			alert("비밀번호가 일치하지 않습니다.");
			return false;
		}else{
			return true;
		}
	}
</script>
<form action = "RegisterMemberServlet" method = "post" onsubmit = "return checkForm()">
	아이디 : <input type = "text" name = "id" placeholder="아이디" required="required"><br>
	비밀번호 : <input type = "password" id = "pass" name = "password" placeholder="패스워드" required="required"><br>
	비밀번호 확인 : <input type = "password" id = "confirmPass" name = "confirmPassword" placeholder="패스워드확인" required="required"><br>
	이름 : <input type = "text" name = "name" placeholder="이름" required="required"><br>
	주소 : <input type = "text" name = "address" placeholder="주소" required="required"><br>
	<button type = "submit">가입</button>
</form>
</div>
</body>
</html>