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
	<h1>parameter from client : <%=request.getParameter("id") %></h1>
	<h1>attribute from server : <%=request.getAttribute("id") %></h1>
</body>
</html>