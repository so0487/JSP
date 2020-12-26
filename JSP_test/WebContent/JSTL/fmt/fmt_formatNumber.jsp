<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
	pageContext.setAttribute("price", "100000");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="price" value="100000" scope="page" />
<c:set var="avg" value="85.0" scope="page" />




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>금액 : ￦<fmt:formatNumber value="${price}" pattern="###,###,###"></fmt:formatNumber></h1>
	<h1>금액 : ￦<fmt:formatNumber value="${price}" pattern="000,000,000"></fmt:formatNumber></h1>
	<h1>평균 : ￦<fmt:formatNumber value="${avg}" pattern="#.#"></fmt:formatNumber></h1>
	<h1>평균 : ￦<fmt:formatNumber value="${avg}" pattern="0.0"></fmt:formatNumber></h1>
</body>
</html>