<%@page import="java.util.ArrayList"%>
<%@page import="com.kh.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 회원 목록</h1>
	<table border="1">
	<tr>
	<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
		</tr>
	
		<c:forEach items ="${list}" var="m">
		<tr>
		<td>${m.id}</td>
		<td>${m.name}</td>
		<td>${m.password}</td>
		</tr>
	</c:forEach>
	</table>
	<jsp:forward page="/index.jsp" />
</body>
</html>