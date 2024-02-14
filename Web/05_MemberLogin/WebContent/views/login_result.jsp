<%@page import="com.kh.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바 코드는 다시 닫아두고 사용해야한다. -->
	<%
	Member member = (Member) session.getAttribute("member");
	if (member != null) {
	%>
	<h1>로그인정보</h1>
	<ul>
		<li>아이디 :<%=member.getId()%></li>
		<li>이름 :<%=member.getName()%></li>
		<li>비밀번호 :<%=member.getPassword()%></li>
	</ul>
	<!-- /를 붙여야지 다시 시작  -->
	<a href="/indext.jsp">첫 페이지로 이동</a>
	<%
	} else {
	%>
	<h2>로그인 실패</h2>
	<a href="views/login.html"> </a>
	<%}%> <!-- 자바 코드는 다시 닫기!!!!!!!!! -->
</body>
</html>