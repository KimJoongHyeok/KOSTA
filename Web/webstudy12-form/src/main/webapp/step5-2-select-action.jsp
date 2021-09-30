<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-2-select-action</title>
</head>
<body>
	<%
	int line = Integer.parseInt(request.getParameter("line"));
	String subway = "";
	if( line < 5){
		subway = "코레인";
	}else{
		subway = "도시철도";
	}
	%>
	<%= subway%> <%=line %>호선 선택하셨습니다.
</body>
</html>