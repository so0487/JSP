<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<%!String message="안녕하세요";%>



<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main page...</h1>
	<h1><%=message %></h1>
<%-- 	<jsp:include page="sub.jsp" /> --%>

<%@include file="sub.jsp" %><!-- 파일전체 설정 -->

<%=kkk %>
</body>
</html>