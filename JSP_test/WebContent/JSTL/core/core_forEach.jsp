<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="numberList" value="<%=new ArrayList<Integer>() %>"/>
<c:forEach begin="1" end="5" step="1" var="i" varStatus="status">

<%
	List<Integer> numberList = (ArrayList<Integer>)pageContext.getAttribute("numberList");
	numberList.add((Integer)pageContext.getAttribute("i"));

%>
</c:forEach>


<!DOCTYPE html>
<html>
<head>
<meta charset= "UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="i" items="${numberList }">
		<h1>${i }</h1>
	</c:forEach>
</body>
</html>