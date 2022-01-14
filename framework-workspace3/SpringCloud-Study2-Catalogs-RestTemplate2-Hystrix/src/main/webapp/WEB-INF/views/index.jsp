<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REST</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){				
		$("#testGetBtn").click(function(){	
			if($("#customerId").val()==""){
				alert("아이디를 입력하세요");
				return;
				}
			$.ajax({
				type:"get",
				url:"/catalogs/customerinfo/"+$("#customerId").val(),				
				success:function(result){							
					$("#resultView").html(result);
				}
			});//ajax
		});//click					
	});//ready
</script>
</head>
<body>
<h3>SpringCloud </h3>
<h3>Netflix OSS Hystrix를 이용한 장애 내성 대비 Fallback 테스트 예제</h3>
<%-- 
		localhost:7777																localhost:7778
		CatalogsController <--> CustomerAPIService 					<--->  CustomerRestController <--> CustomerAPIService
								   RestTemplate 이용해 다른 서버와 통신 
								   Hystrix Fallback(장애시 대안흐름)  	     
									
 --%>
고객정보 <input type="button" value="조회" id="testGetBtn"><input type="text" id="customerId">
<span id="resultView"></span><br><br> 
<br><br><br>
<img src="Netfilx-OSS-Hystrix.PNG" width="900">
</body>
</html>


















