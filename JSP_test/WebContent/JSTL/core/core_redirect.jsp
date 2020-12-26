<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	alert("JSTL Core Redirect");
</script>

</head>
<body>
	<h1>JSTL Core Redirect</h1>
</body>
</html>


<c:redirect url="https://www.ddit.or.kr"></c:redirect>
<!-- redirect를 만나 버퍼를 비우고 화면에 출력되지 않는다. -->
