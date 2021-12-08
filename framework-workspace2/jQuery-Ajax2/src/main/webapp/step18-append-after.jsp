<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<title>step18-append-after</title>
		<style type="text/css">
			#span1{
				background-color: yellow;
			}
			#span2{
				background-color: lime;
			}
		</style>
		<script type="text/javascript">
			$(function(){
				$("#testBtn").click(function(){
					$("#span1").append("가수");	//css적용됨,append는 대상요소의 마지막 하위(자식)요소로 추가 <span>아이유가수</span>
					$("#span2").after("가수");	//css적용안됨,대상요소의 형제요소로 추가 <span>이효리</span> <span>기수</span>
					$("a[href*=daum]").append("go");
					$("a[href*=google]").after("go");
				});
			});
		</script>
	</head>
	<body>
		<div class="container">
		<input type="button" id="testBtn" value="테스트"><br><br>
		<span id="span1">아이유</span><hr>
		<span id="span2">이효리</span><hr>
		<a href="http://www.daum.net">다음넷으로</a><hr>
		<a href="http://google.com">구글로</a><hr>
		<a href="http://daum.net">다음넷으로</a><hr>
		</div>
	</body>
</html>











