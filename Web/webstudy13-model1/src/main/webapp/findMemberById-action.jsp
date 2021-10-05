<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findMemberById- action </title>
</head>
<body>
<%--
		findMemberById-form.jsp 의 폼으로부터 회원 아이디를 전달받ㄴ튼다.
		MemberDAO 의 findMmeberById(String id) : MemberVO 메서드를 구현한 후 
		이 메서드를 이용해 전달받는 아이디에 대한 외원정보를 반환받는다
		회원 정보가 존재하면 
		아이디 : java
		이름 : 아이유
		주소 : 오리
		
		존재하지 않으면 ( null이 리턴될 경우 )
		javascript alert 로 00아이디에 대한 회원정보가 없습니다! 출력하고 확인 누르면 
		findMemberById-form.jsp 로 다시 이동시킨다(javascript location-href = "" 를 이용)
 --%>
<%
	String memberId = request.getParameter("memberId");
	MemberDAO dao = new MemberDAO();
	MemberVO info = dao.findMmeberById(memberId);
	if(info != null){
%>
	아이디 : <%= info.getId() %><br>
	이름 : <%= info.getName() %><br>
	주소 : <%= info.getAddress() %><br>
<%
	} 
	else{
%>
	<script>
		alert("<%= memberId %> 아이디에 대한 회원정보가 없습니다!");
		location.href = "findMemberById-form.jsp";
	</script>
<%
	}
%>

</body>
</html>