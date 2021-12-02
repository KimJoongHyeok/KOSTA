<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>jquery show hide 함수</title>
<script type="text/javascript">
	$(document).ready(function(){
		//$("#imgView").hide();
		$("#showBtn").hide();
		$("#showBtn").click(function(){
			$("#imgView").show(3000,function(){	//show(시간,이벤트처리후 후속작업 callback function)
				$("#showBtn").hide();
				$("#hideBtn").show();
			});
		});
		$("#hideBtn").click(function(){
			$("#imgView").hide(3000,function(){
				$("#hideBtn").hide();
				$("#showBtn").show();
			});
		});
	});
</script>
</head>
<body>
<img src="록키.jpg" id="imgView">
<input type="button" value="사진보기" id="showBtn">
<input type="button" value="사진감추기" id="hideBtn">
</body>
</html>










