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
		let flagComp = document.getElementById("flag");
		let idComp = document.getElementById("id");
		let confirmPass = document.getElementById("confirmPass");
		if(pass.value != confirmPass.value){
			alert("비밀번호가 일치하지 않습니다.");
			return false;
		}
		//인증받은 아이디(hidden에 저장되어있는 value)와 input text에 입력된 아이디와 일치하지 않으면 가입시키지 않는다
		if(flagComp.value != idComp.value){
			alert("인증받은 아이디가 아닙니다 \n 아이디 중복확인을 해주세요");
			return false;
		}
	}
	function checkId(){
		let idComp = document.getElementById("id");
		if(idComp.value == ""){
			alert("아이디를 입력하세요");
			idComp.focus();
		}else{
		//server로 팝업창을 띄울때 닉네임을 전달하려고 한다 : query string을 이용
		window.open("IdCheckServlet?id="+idComp.value,"mypopup","width = 450,height=150,top=150,left=400");
		}
	}
	
</script>
<form action = "RegisterMemberServlet" method = "post" onsubmit = "return checkForm()">
	아이디 : <input type = "text" name = "id" id = "id" placeholder="아이디" required="required">
	<%-- 클라이언트가 아이디 중복확인 작업을 수행했는지 여부를 저장하는 용도로 hidden 을 이용 --%>
	<input type = "hidden" id = "flag" value = "">
	<button type = "button" onclick = "checkId()">중복확인</button><br>
	비밀번호 : <input type = "password" id = "pass" name = "password" placeholder="패스워드" required="required"><br>
	비밀번호 확인 : <input type = "password" id = "confirmPass" name = "confirmPassword" placeholder="패스워드확인" required="required"><br>
	이름 : <input type = "text" name = "name" placeholder="이름" required="required"><br>
	주소 : <input type = "text" name = "address" placeholder="주소" required="required"><br>
	<button type = "submit" >가입</button>
</form>
</div>
</body>
</html>