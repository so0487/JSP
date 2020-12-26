<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%
	pageContext.setAttribute("key1","pageContext");
	request.setAttribute("key2", "request");
	session.setAttribute("key3", "session");
	application.setAttribute("key4", "application");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${key3}</h1>
</body>
</html>