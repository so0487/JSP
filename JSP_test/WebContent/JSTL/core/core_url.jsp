<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><c:url value="/member/list" var="memberList"></c:url></h1>
	
	
	
	<h1>${memberList }</h1>
	
	<h1><%=request.getContextPath() %>/member/list</h1>
</body>
</html>