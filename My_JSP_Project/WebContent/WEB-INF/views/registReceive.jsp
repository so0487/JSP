<%@page import="java.util.Arrays"%>
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
	아이디 : ${param.id}<br/>
	패스워드 : ${param.pwd }</br>
	이름 : ${param.name }</br>
 	생년월일 : <%=Arrays.toString(request.getParameterValues("birth")) %><br/>
	성별 : ${param.gender }</br>
	이메일 : <%=Arrays.toString(request.getParameterValues("email")) %><br/>
	전화번호 :<%=Arrays.toString(request.getParameterValues("phone")) %><br/>
	
	
</body>
</html>