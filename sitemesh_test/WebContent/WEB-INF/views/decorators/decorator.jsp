<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><decorator:title default="Sitemesh Test"/></title>
<decorator:head/>
</head>
<body>
	<header>
		<h1>header</h1>
	</header>
	
	<div class="content">
		<decorator:body/>
	</div>
	
	<footer>
		<h1>footer</h1>
	</footer>
</body>
</html>