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
	<h1>전체 회원 목록</h1>
	<table border="1">
		<%
		ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");

		for (Member m : list) {
		%>
		<tr>
			<th>아이디<%=m.getId()%></th>
			<th>이름<%=m.getName()%></th>
			<th>비밀번호<%=m.getPassword()%></th>
		</tr>
		<%
		}
		%>
	</table>
	<a href="/index.jsp">첫 페이지로 이동 </a>
</body>
</html>