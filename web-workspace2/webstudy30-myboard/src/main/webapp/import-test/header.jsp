<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<ul class="navbar-nav">
		<li class="nav-item active"> <%-- 활성화된 상태 - 맨처음 안눌럿을때 진하게 표시되어잇는부분 --%>
			<a class="nav-link" href="#">Home</a> <%-- # 부분에 이제 controller.do --%>
		</li>
		<li class="nav-item">
		    <a class="nav-link" href="#">회원</a>
		</li>
		<li class="nav-item">
		    <a class="nav-link" href="#">상품</a>
		</li>
		<li class="nav-item">
			<a class="nav-link disabled" href="#">Disabled</a>
		</li>
	</ul>
</nav>