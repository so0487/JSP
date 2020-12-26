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
	<h1>main page...</h1>
	
	<jsp:forward page="sub.jsp?name=kim&no=1234">
	
<%-- 		<jsp:param value="kim" name="name"/> --%>
<%-- 		<jsp:param value="1234" name="no"/> --%>
<%-- 	</jsp:forward> --%>


<!-- 주소줄에 직접 적어 param값을 전달가능 -->
		
		
</body>
</html>