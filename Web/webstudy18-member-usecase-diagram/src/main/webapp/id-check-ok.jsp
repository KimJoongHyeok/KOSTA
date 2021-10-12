<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id-check-ok</title>
</head>
<% String id = request.getParameter("id"); %>
<script type="text/javascript">
	opener.document.getElementById("flag").value = "<%= id%>"; 
	function closePopup(){
		//자신을 띄운 웹페이지 요소에 접근
		//자바스크립트의 opener 객체 : 자신을 띄운 웹페이지를 제어하기 위한 객체
		//본 창의 nick 입력 text 요소에 접근해서 value를 삭제해본다
		opener.document.getElementById("id").value = "<%= id%>";
		//본 창의 hidden flag 에 접근해서 닉네임을 할당해본다
		//자신의 창을 종료할 떄 
		self.close();
	}
	alert("사용가능한 아이디입니다.");
</script>
<%-- onunload 는 창의 끄기 버튼을 누를때 발생하는 이벤트 --%>
<body bgcolor = "yellow" onunload = "closePopup()">
<%= id%> 사용가능한 아이디 입니다.<br>
<input type = "button" value = "확인" onclick = "closePopup()">
</body>
</html>