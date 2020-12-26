<%@page import="java.util.StringTokenizer"%>
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
	<%
		String source = "a,b,c,d,e";
	
	
		StringTokenizer token = new StringTokenizer(source,",",true);
		
		
		//다음 token이 있는지 판단 : nextToken, hasMoreTokens
		
		//while(token.nextToken()!=null){
		while(token.hasMoreTokens()){
			out.println("<h1>"+token.nextToken()+"</h1>");
		}
		
	%>


	<c:forTokens items="<%=source%>" delims="," var="token">
		<h1>${token }</h1>
	</c:forTokens>


</body>
</html>