<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="<h1>가나다라마바사</h1>" escapeXml="false"></c:out>
	
	<!--escapeXml - false : 마크업으로 해석 -->
	<!--escapeXml - true : 마크업으로 해석X -->
</body>
</html>