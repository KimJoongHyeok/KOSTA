//ajaxSetup():  실행될  AJAX 요청에 대한 기본 속성을 정의해 재사용 
$.ajaxSetup({
	success: function(result) {
		alert(result);
	},
	error : function(jqXHR) {
				if (jqXHR.status == 401) {
					alert("인증이 필요한 서비스입니다");
					//기존페이지를 새로운 페이지로 변경시킨다. 참고 - location.href="url"; 는 새로운 페이지로 이동시킨다 
					//href는 페이지를 이동하므로 뒤로가기 버튼을 누르면 이전 페이지로 이동이 가능,
					//replace는 현재 페이지를 새로운 페이지로 대체하므로 이전 페이지로 이동이 불가 
					location.replace("/");//로그인 폼이 있는 home으로 페이지를 대체한다 
			   }else{
			   	alert("jqXHR status code:"+jqXHR.status+" message:"+jqXHR.responseText);
			   }
		}
});//ajaxSetup
