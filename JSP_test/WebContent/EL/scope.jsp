<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%
	pageContext.setAttribute("key","pageContext");
	request.setAttribute("key", "request");
	session.setAttribute("key", "session");
	application.setAttribute("key", "application");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		표현식
		<li>pageCotext : pageContext.getAttribute()=<%=pageContext.getAttribute("key") %></li>
		<li>request : pageContext.getAttribute()=<%=request.getAttribute("key") %></li>
		<li>session : pageContext.getAttribute()=<%=session.getAttribute("key") %></li>
		<li>application : pageContext.getAttribute()=<%=application.getAttribute("key") %></li>
	</ul>
	<ul>
		EL문
		<li>pageContext : pageScpe.key = ${pageScope.key}
		<li>request : requestScope.key = ${requestScope.key}
		<li>session : sessionScope.key = ${sessionScope.key}
		<li>application : applicationScope.key = ${applicationScope.key}
	</ul>
</body>
</html>