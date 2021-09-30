<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-1-select2-onchange</title>
</head>
<body>
	<%-- submit 없이 option 선택한 즉시 서버로 전송되도록 javascript onchange 이벤트 속성을 이용해본다 --%>
	<script type="text/javascript">
		function sendLine() {
			let lineComp = document.getElementById("line");
			if (lineComp.value != "") {
				//alert(lineComp.value);
				//subway id form 을 submit 한다
				document.getElementById("subway").submit();
			}
		}
	</script>

	<form action="step5-2-select-action.jsp" id="subway">
		<select name="line" id="line" required="required"
			onchange="sendLine()">
			<option value="">-호선-</option>
			<%
			for (int i = 1; i <= 9; i++) {
			%>
			<option value="<%=i%>"><%=i%>호선
			</option>
			<%
			}
			%>
		</select>
		<!-- <button type = "submit">선택</button> -->
	</form>
</body>
</html>