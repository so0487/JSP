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
<%-- 
	표현식을 적용

	이름 : <%=request.getParameter("name") %><br/>
	아이디 : <%=request.getParameter("id") %><br/> 
	비밀번호 : <%=request.getParameter("pw") %><br/> 
	취미 : <%=Arrays.toString(request.getParameterValues("hobbys"))%><br/> 
	전공 : <%=request.getParameter("major") %><br/> 
	프로토콜 : <%=request.getParameter("protocol")%><br/> 
--%>


<!-- el문으로 간단하게 할 수 있다. -->

	<%-- 이름 :  <%=Arrays.toString(request.getParameterValues("name"))%><br/> --%>
	이름 :  ${param.name}<br/>
	아이디 : ${param.id}<br/> 
	비밀번호 : ${param.pw}<br/> 
	취미 : <%=Arrays.toString(request.getParameterValues("hobby"))%><br/> 
	전공 : ${param.major}<br/> 
	프로토콜 : ${param.protocol}<br/> 
	전화번호 : <%=Arrays.toString(request.getParameterValues("phone"))%><br/> 
	
</body>
</html>