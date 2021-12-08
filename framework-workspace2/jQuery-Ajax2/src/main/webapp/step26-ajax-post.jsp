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
		<title>step26-ajax-post</title>
		<script type="text/javascript">
			$(document).ready(function() {
				$("#ajaxBtn").click(function(){
					let commentInfo = $("#comment").val();
					if(commentInfo==""){
						alert("커멘트를 입력하세요");
						return; //함수 실행을 마침
					}
					//사용자가 글을 입력했으면 ajax 통신을 한다
					$.ajax({
						type:"post",
						url:"CommentServlet",
						data:"comment="+commentInfo,
						success:function(result){
							$("#resultView").html("<pre>"+result+"</pre>");
							$("comment").val("");
						}
					});//ajax
				});//click
			});//ready
		</script>
	</head>
	<body>
		<div class="container">
			<textarea rows="10" cols="20" id="comment"></textarea>
			<br>
			<input type="button" id="ajaxBtn" value="ajax연동테스트">
			<hr>
			<div id="resultView"></div>
		</div>
	</body>
</html>











