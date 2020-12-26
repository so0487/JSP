<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	div.container{
		width: 800px;
		height: 400px;
		overflow: hidden;
		overflow-y: scroll;
		scrollbar-color : green;
		scrollbar-width:thin
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<c:import url="https://google.com" var="google"></c:import>
	<c:import url="https://www.naver.com" var="naver"></c:import>
	
	<div class="container">${google } </div>
	<div class="container">${naver } </div>
</body>
</html>