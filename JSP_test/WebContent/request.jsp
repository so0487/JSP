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
	<%
		out.println("서버 : "+request.getServerName()+"</br>");
		out.println("포트 번호 : "+request.getServerPort()+"</br>");
		out.println("요청 방식 : "+request.getMethod()+"</br>");
		out.println("프로토콜 : "+request.getProtocol()+"</br>");
		out.println("URL : "+request.getRequestURL()+"</br>");
		out.println("URI : "+request.getRequestURI()+"</br>");
		out.println("컨텍스트명 : "+request.getContextPath()+"</br>");
		out.println("아이피 : "+request.getRemoteAddr()+"</br>");
		
	%>
	
</body>
</html>