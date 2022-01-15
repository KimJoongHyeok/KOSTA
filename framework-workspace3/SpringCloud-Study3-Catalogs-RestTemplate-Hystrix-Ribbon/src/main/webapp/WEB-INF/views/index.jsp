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
<h3>SpringCloud  : RestTemplate 이용해 다른 REST API 서버와 통신</h3>
<h4>부하 분산을 위한 Load Balancer – Ribbon 테스트 </h4>
<%-- 
		localhost:7777																첫번째 서버 localhost:7778
		CatalogsController <--> CustomerAPIService 					<--->  CustomerRestController <--> CustomerAPIService
								   RestTemplate 이용해 다른 REST서버와 통신 
								     	     
								   											<---> 두번째 서버 localhost:7779
								   													CustomerRestController <--> CustomerAPIService
		서버 리스트에서 하나의 서버씩 순회하며 요청한다   						
 --%>
고객정보 <input type="button" value="조회" id="testGetBtn"><input type="text" id="customerId">
<span id="resultView"></span><br><br> 
<br><br><br>
<img src="Netfilx-OSS-Ribbon.PNG" width="900">
</body>
</html>


















