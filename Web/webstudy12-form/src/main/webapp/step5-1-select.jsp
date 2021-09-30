<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-1-select</title>
</head>
<body>
	<form action="step5-2-select-action.jsp">
		<select name="line" required="required">
			<option value = "">-호선-</option>
			<%for(int i = 1;i<=9;i++){ %>
			<option value = "<%=i%>"><%=i %>호선</option>
			<%} %>
		</select>
		<button type = "submit">선택</button>
	</form>
	<%--
		jsp for loop 를 이용해 1호선에서 9호선까지 옵션을 생성한다
		실제 전송 정보는 호선을 제회앟ㄴ 1~9까지의 정보가 전송된다.
	 --%>
</body>
</html>