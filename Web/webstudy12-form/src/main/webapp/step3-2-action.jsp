<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step3-2-action</title>
</head>
<body>
	<%
		//post 요청 메서드일때는 별도의 한글 처리가 필요하다
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("userName");
		int age = Integer.parseInt(request.getParameter("userAge"));
		String adult = "";
		if(age >= 19){
			adult = "성인";
		}else{
			adult = "미성년";
		}
	%>
	<%=adult %> <br>
	이름 : <%= name %><br>
	나이 : <%= age %> 세
</body>
</html>



