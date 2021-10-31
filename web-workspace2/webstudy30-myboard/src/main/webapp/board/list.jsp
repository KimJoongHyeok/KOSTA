<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<table class="table table-hover table-bordered boardlist"> <%-- myhome css 에서 boardlist 로 설정해주었기 때문에 가운데 정렬 --%>
    <thead>
    	<tr style="background-color: #b3ccff">
	        <th>글번호</th>
	        <th class = "title">제목</th>
	        <th>작성자</th>
	        <th>작성일</th>
	        <th>조회수</th>
    	</tr>
    </thead>
    <tbody>
    	<c:forEach items = "${requestScope.postList }" var = "list">
	      	<tr>
		        <td>${list.no}</td>
		        <td>${list.title }</td>
		        <td>${list.memberVO.name }</td>
		        <td>${list.timePosted }</td>
		        <td>${list.hits }</td>
	    	</tr>
    	</c:forEach>
	</tbody>
</table>