<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="menu" value="<%=1 %>"/>

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${menu==1 }"> <!-- if -->
		
			<h1>콜라</h1>
		</c:when>
		<c:when test="${menu==2 }"> <!-- if -->
		
			<h1>환타</h1>
		</c:when> 
		<c:otherwise> <!-- else -->
			<h1>반환</h1>
		
		</c:otherwise>
	</c:choose>
</body>
</html>