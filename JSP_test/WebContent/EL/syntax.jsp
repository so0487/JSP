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
	<ul>산술연산자
		<li>${1+1}</li>
		<li>${1-1}</li>
		<li>${1*1}</li>
		<li>${1/1}</li>
	</ul>
	
	<ul>관계연산
		<li>${1>1 }</li>
		<li>${1<1 }</li>
		<li>${1>=1 }</li>
		<li>${1<=1 }</li>
		<li>${1==1 }, ${1 eq 1 }</li>
		<li>${1!=1 }, ${1 ne 1 }</li>
	</ul>
	<ul>논리연산
		<li>${true && true }</li>
		<li>${true || true }</li>
		<li>${!true}</li>
	</ul>
	<ul>삼항연산
		<li>${1 eq 1 ? '1과 같습니다':'1과 다릅니다.'}</li>

	</ul>

	<ul>empty
		<li><%pageContext.setAttribute("str", null); %>${empty str}</li>
	</ul>
	<ul>주의
<%-- 		<li>${'abcd'+1234}</li>  : EL연산에서는 문자열 연산은 안된다.--%>
	</ul>
</body>
</html>