<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1~50까지의 합산 결과 값 1) 기존방식</h2>
	<p>
		sum :
		<%=request.getAttribute("result") %></p>
	<p>
		session:<%=session.getAttribute("result") %>


		<%--
	EL
	- Attribute에 바인딩된 값을 찾아오는 로직을 태그로 바꾼 기술 
	- 객체로 바인딩한 ${이름}이 시용


 --%>
	<h2>1~50까지의 합산 결과 값 2)EL</h2>
	<p>request : ${requestScope.result}</p>
	<p>session : ${requestScope.result}</p>
	<p>result :${result}</p>
</body>
</html>