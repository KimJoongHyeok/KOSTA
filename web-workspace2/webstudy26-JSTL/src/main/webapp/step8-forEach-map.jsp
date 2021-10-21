<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,model.*"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--컨트롤러에서 데이터를 session 영역에 저장해서 공유한다고 가정 --%>
<%
LinkedHashMap<String, PersonVO> map = new LinkedHashMap<String, PersonVO>();
map.put("a", new PersonVO("아이유", 30));
map.put("b", new PersonVO("이강인", 22));
map.put("c", new PersonVO("손흥민", 29));
session.setAttribute("personMap", map);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl forEach Map</title>
	</head>
<body>
	기존 스크립틀릿 방식으로 Map의 key와 value를 표현
	<br>
	<br>
	<%
		@SuppressWarnings("unchecked")
		LinkedHashMap<String, PersonVO> rmap = (LinkedHashMap<String, PersonVO>) session.getAttribute("personMap");
		// ketSet() : Set<String>
		// Set -> iterator() -> Iterator : hasNext() 와 next() 를 이용하면 key를 추출할수 있다
		Set<String> set = rmap.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
	%>
		key :<%=key%> value :<%=rmap.get(key).getName()%>
	<br>
	<%
		}
	%>
	<br>
	<br>
	JSTL forEach 로 map 의 키와 value를 출력 
	<br>
	<br>
	<c:forEach items="${sessionScope.personMap }" var = "person">
		key : ${person.key} value : ${person.value.name} <br>
	</c:forEach>
</body>
</html>