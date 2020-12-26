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
	<form action="receiveRequest.jsp" method="post">
		화면전환 : <select name="view">
					<option value="forward">포워드</option>
					<option value="redirect">리다이렉트</option>
		</select>
		
		파라메터 : <input type="text" name="name">
		<input type="submit" value="전송">
	</form> 
</body>
</html>