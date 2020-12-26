<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>


<%@ include file="/WEB-INF/views/include/header.jsp" %>

<div id="if_list_div" style="position:relative;padding:0;overflow:hidden;height:800px;">
	<iframe id="if_list" onLoad="calcHeight();" name="if_list" frameborder="0" scrolling="no" 
	src="#" style="position:absolute;top:0px;left:0px;bottom:0px;height:100%;width:100%;border:0px;"></iframe>
</div>

<%@ include file="/WEB-INF/views/include/footer.jsp" %>
