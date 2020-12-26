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
	<form action="goSite.jsp" method="get" name="frm">
		<select name="site" id="site" onchange="select_change();">
			<option value="">이동할 사이트를 선택하세요.</option>
			<option value="https://www.naver.com">네이버</option>
			<option value="https://www.google.com">구글</option>
			<option value="https://www.ddit.or.kr">대덕인재개발원</option>
		</select>
	</form>
	
	<script>
		function select_change() {
			//alert(document.getElementById("site").value);
			
			if(document.getElementById("site").value)
			
			document.frm.submit();
		}
	</script>
</body>
</html>