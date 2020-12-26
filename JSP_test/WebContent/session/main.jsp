
<%@page import="com.jsp.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<%
	MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");	

	if(loginUser==null){
		out.println("<script>");
		out.println("alert('로그인은 필수입니다.')");
		out.println("location.href='"+request.getContextPath()+"/session/loginForm.jsp';");
		out.print("</script>");
		
		return;
	}
	
%>
	

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<button type="button" onclick="location.href='logout.jsp'">Logout</button>
	
	
	<h1>Main page...</h1>
<%-- 	<h1>request loginUser : <%=request.getAttribute("loginUser") %></h1> --%>
<%-- 	<h1>session loginUser : <%=session.getAttribute("loginUser") %></h1> --%>



<!-- EL문 -->
 	<h1>request loginUser : ${loginUser.id}</h1>
 	<%-- 	<h1>request loginUser : <%=request.getAttribute("loginUser").getId() %></h1> ---> (원문장 : ${}로 줄일 수 있다.)--%>
 	
<%--  	<h1>session loginUser : ${session.loginUser}</h1>  --%>
 	<h1>session loginUser : ${sessionScope.loginUser.id}</h1> 
	
	
</body>
</html>