<%@page import="java.util.ArrayList"%>
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
	<%--search랑 매핑할 Servlet 생성 
search.jsp <-- 결과보여주기 --%>

	<%Member info=(Member)request.getAttribute("info"); %>
	<ul>
	<li>아이디 : <%=info.getId() %></li>
	<li>비밀번호 :<%=info.getPassword() %>></li>
	<li>이름 :<%=info.getName() %></li>
	

</ul>>
</body>
</html>