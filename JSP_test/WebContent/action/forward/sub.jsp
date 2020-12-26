<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>sub Page...</h1>
	
	<h1>Name : <%=request.getParameter("name") %></h1>
	<h1>Number : <%=request.getParameter("no") %></h1>
</body>
</html>