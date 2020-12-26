<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%

	String paramID = request.getParameter("id");
	System.out.println("parameter : "+ paramID);
	
	request.setAttribute("id", "mama");
	
	request.getRequestDispatcher("result.jsp").forward(request, response);

%>