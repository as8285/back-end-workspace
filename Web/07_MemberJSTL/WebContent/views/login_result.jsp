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

<c:choose>
<c:when test ="${not empty member} ">
<h1>로그인정보</h1>
<ul>
<li>아이디 : ${member.id} </li>
<li>이름 : ${member.name}</li>
<li>비밀번호 : ${member.password}</li>
</ul>
<a href ="/indext.jsp" >첫페이지 이동 </a>
</c:when>
</c:choose>
<c:otherwise>
<h1>로그인실패...@!@!</h1>
	<a href ="Login.html" >로그인 페이지로 이동페이지 이동 </a>
</c:otherwise>

</body>
</html>