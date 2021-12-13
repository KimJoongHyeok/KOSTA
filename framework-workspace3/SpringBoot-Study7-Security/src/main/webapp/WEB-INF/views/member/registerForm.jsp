<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
 
<%-- 
	post 방식 request일때는 반드시 서버로부터 csrf 해킹방지를 위한 token을 발급받아 
	서버로 요청시 함게 전달해야 한다
	csrf토근을 전달하지 않으면 서버에서 요청처리가 되지 않고
	accessDeniedView.jsp 로 (서비스 접근할 권한이 없습니다)로 응답된다
 --%>
<form method="post" action="/guest/registerMember" id="regForm">
<sec:csrfInput/>	<%-- csrf 토큰 --%>
<input type="text" name="id" id="memberId" placeholder="아이디"><span id="idCheckView"></span><br>
<input type="password" name="password" placeholder="비밀번호" required="required"><br>
<input type="text" name="name" placeholder="이름"  required="required"><br>
<input type="text" name="address" placeholder="주소"  required="required"><br>
<input type="submit" value="가입하기">
</form>
<script type="text/javascript">
 	$(document).ready(function(){
		$("#regForm :input[name=id]").keyup(function(){
			$("#idCheckView").html("아이디 중복확인 구현해야 합니당");		
		});//keyup
	});//ready 
</script>










