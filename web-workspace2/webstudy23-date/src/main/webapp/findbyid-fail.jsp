<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid-fail</title>
</head>
<body>
<script type="text/javascript">
	alert(" <%= request.getParameter("productId") %>에 해당하는 정보가 없습니다.");
	location.href = "index.jsp";
</script>

</body>
</html>