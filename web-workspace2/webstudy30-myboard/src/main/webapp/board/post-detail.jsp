<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<table class = "table">
	<tr>
		<td>글번호 : </td>
		<td>제목 : </td>
		<td>작성자 : </td>
		<td>조회수 : </td>
		<td> <%-- 작성일시 2021.10.29 --%></td>
	</tr>
	<tr>
		<td colspan = "5"><%-- td를 하나로 합침 --%>
			<pre> <%-- pre : DB에 저장된 글 형식 그대로 표현 --%>
				<font size = "4">
					
				</font>
			</pre>
		</td> 
	</tr>
	<%-- 글쓴이가 로그인한 회원이면 하단부에 삭제와 수정 버튼을 제공  jstl c:if 문 사용 --%> 
	<tr>
		<%-- <td colspan = "5" class = "btnArea">--%> <%-- 버튼중앙에 오게하는 css 적용부분 --%>
		<td colspan = "5" class = "text-center"> <%--부트스트랩에서 제공해주는 버튼 가운데 부분 --%>
			<button type = "button" class = "button btn-success">삭제</button> <%--js로 작성 --%>
			<button type = "button" class = "button btn-success">수정</button> <%--js로 작성 --%>			
		</td>
	</tr>
</table>