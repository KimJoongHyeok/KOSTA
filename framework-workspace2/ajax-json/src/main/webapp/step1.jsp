<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax(JSON을 이용하여 통신)</title>
<script type="text/javascript">
function startAjax(){
	let makerComp=document.getElementById("maker");
	let modelComp=document.getElementById("modelView");
	let priceComp=document.getElementById("priceView");
	if(makerComp.value==""){
		modelComp.innerHTML="";
		priceComp.innerHTML="";
		return;	
	}
	let xhr=new XMLHttpRequest();
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4&&xhr.status==200){
			let jsonData = JSON.parse(xhr.responseText);
			modelComp.innerHTML = jsonData.model;
			priceComp.innerHTML = jsonData.price;
		}
	}//callback
	xhr.open("get", "FindCarJSONServlet?maker="+makerComp.value);
	xhr.send();
}
</script>
</head>
<body>
<select id="maker" onchange="startAjax()">
<option value="">---</option>
<option value="현대">현대</option>
<option value="르노">르노</option>
<option value="기아">기아</option>
</select>
<br><br><br>
모델 <span id="modelView"></span>
<br><br><br>
가격 <span id="priceView"></span>
</body>
</html>










