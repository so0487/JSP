<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<%
	String applicationParam = request.getServletContext().getInitParameter("name");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Context initParameter : <%=applicationParam%></h1>
</body>
</html>