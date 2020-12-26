<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<script >
	alert("페이지를 이동합니다.");
	location.href = "<%=request.getParameter("site")%>";
</script>
<%
	//response.sendRedirect(request.getParameter("site"));


	//alert문을 buffer에 저장 --> response.sendRedirect(request.getParameter("site"));을 만나면 alert문을 무효화 --> location을 활용
%>