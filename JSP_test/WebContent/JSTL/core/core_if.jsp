<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
// 	String str = "Good Day!";
%>



<c:set var="str" value="Good Day!"/>

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 	<% 
// 		if(str.equals("Good Day!")){
		
 	%> 
<%--  		<h1><%=str %></h1>  --%>
		
 	<% 
// 		}
 	%> 
	
	
	<c:if test="${str eq 'Good Day!' }">
		<h1>${url }</h1>
	</c:if>
</body>
</html>