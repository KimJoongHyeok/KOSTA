<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h4>SpringBoot Ajax Study</h4>
	<script type="text/javascript">
		$(function(){
			$("#AjaxBtn1").click(function() {
				$.ajax({
					type:"get",
					url:"testAjax1",
					data:"userId=javaking",
					success:function(result){
						alert(result);
					}
				});//ajax
			});//click
			
			$("#AjaxBtn2").click(function() {
				$.ajax({
					type:"get",
					url:"testAjax2",
					dataType:"json",
					data:"customerId=javaking",
					success:function(customer){
						alert(customer.id + " "+customer.name + " "+customer.address);
					}
				});//ajax
			});//click
			
			$("#AjaxBtn3").click(function() {
				$.ajax({
					type:"get",
					url:"testAjax3",
					dataType:"json",
					data:"id=javaking",
					success:function(result){
						for(let i=0;i<result.length;i++){
							alert(result[i]);
						}
					}
				});//ajax
			});//click
			
			$("#AjaxBtn4").click(function() {
				$.ajax({
					type:"get",
					url:"testAjax4",
					dataType:"json",
					data:"id=javaking",
					success:function(result){
						for(let i=0;i<result.length;i++){
							alert(result[i].name + " " + result[i].address);
						}	
					}
				});//ajax
			});//click
			
			$("#AjaxBtn5").click(function() {
				$.ajax({
					type:"get",
					url:"testAjax5",
					dataType:"json",
					data:"id=javaking",
					success:function(result){
						alert(result.CAR_NO + " " + result.MODEL);
					}
				});//ajax
			});//click
			
			$("#AjaxBtn6").click(function() {
				$.ajax({
					type:"get",
					url:"testAjax6",
					data:"name=javaking&address=판교",
					success:function(result){
						alert(result);
					}
				});//ajax
			});//click
		}); //ready
	</script>
	<%-- 문자열 데이터로 응답받는 ajax 테스트 --%>
	<button type="button" id="AjaxBtn1">AjaxTest1</button>
	
	<%-- JSONObject( DTO or VO )로 응답받는 Ajax test --%>
	<button type="button" id="AjaxBtn2">AjaxTest2</button>
	
		<%-- JSONArray로 응답받는 Ajax test --%>
	<button type="button" id="AjaxBtn3">AjaxTest3</button>
	
		<%-- JSONArray(JSONObject)로 응답받는 Ajax test --%>
	<button type="button" id="AjaxBtn4">AjaxTest4</button>
	
		<%-- JSONObject(Map)로 응답받는 Ajax test --%>
	<button type="button" id="AjaxBtn5">AjaxTest5</button>
	
	<%-- 한글로 된 일반 문자열 데이터 응답받는 테스트 --%>
	<button type="button" id="AjaxBtn6">AjaxTest6</button>
	
	<br><br>
	
	<a href = "employeeAjaxTestView">사원 검색 페이지</a>
	
</div>	
</body>
</html>







