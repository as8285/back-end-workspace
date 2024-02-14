<%--
JSTL 사용하려면////
1. 라이브러리 추가 : standard.jar,jstl.jar
2. taglib 속성을 지정


 --%>



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


<c:set var="CODE" value="1004" scope="request"/>
<c:set var="NAME" value="kh" scope="request"/>
<c:set var="PRICE" value="220000" scope="request"/>
<jsp:forward page="JSTL_cSet2_view.jsp" />
</body>
</html>