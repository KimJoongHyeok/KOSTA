<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findMemberById-fail</title>
</head>
<body>
<%--Controller인 findMemberByIdServlet에서 forward 방싱그오 이동했으므로
	아래와 같이 client 가 전달한 id를 얻어와 출력할 수 있다. --%>
<script type = "text/javascript">
	alert("<%=request.getParameter("memberId") %>아이디에 대한 회원 정보가 없습니다.")
	location.href = "findMemberById-form.jsp";
</script>
</body>
</html>