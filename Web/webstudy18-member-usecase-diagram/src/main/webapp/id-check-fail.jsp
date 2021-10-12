<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id-check-fail.jsp</title>
</head>
<% String id = request.getParameter("id"); %>
<script type="text/javascript">
opener.document.getElementById("flag").value = ""; 
function closePopup(){
	//자신을 띄운 웹페이지 요소에 접근
	//자바스크립트의 opener 객체 : 자신을 띄운 웹페이지를 제어하기 위한 객체
	//본 창의 nick 입력 text 요소에 접근해서 value를 삭제해본다
	let idComp = opener.document.getElementById("id");
	idComp.value = "";
	idComp.focus();	
	self.close();
}
	alert("아이디가 중복되어 사용불가합니다.");
</script>
<body bgcolor = "orange" onunload = "closePopup()">
<%= id%> 아이디가 중복되어 사용불가합니다.<br>
<button onclick = "closePopup()" >확인</button>
</body>
</html>