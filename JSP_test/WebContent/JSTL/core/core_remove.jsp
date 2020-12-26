<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var = "key" value="pageContext" scope="page"/>
<c:set var = "key" value="request" scope="request"/>
<c:set var = "key" value="session" scope="session"/>
<c:set var = "key" value="application" scope="application"/>

<c:remove var="key" scope="page" />


<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${key }</h1>
</body>
</html>