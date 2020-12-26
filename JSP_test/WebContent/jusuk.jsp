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
	<!--HTML 주석 -->
	
	<%--스크립틀릿 주석 : (페이지 소스로 나가지 않는다.) --%>
	
	
	
	<script>
		var k=1;
		var l = // <%=1/0%>;
	</script>
	
	<%
		int k=1;
		int y=2;
		
		//out.println(k+y);
	%>
	
</body>
</html>