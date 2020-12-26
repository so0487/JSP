<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>



<%
 	for(int dan=2;dan<10;dan++){

%>
 	<ul>
	<h1><%=dan%>단 입니다.</h1>
 		
 		
<% 	
 		
 		for(int gop=1;gop<10;gop++){
 			
%>
			<li>
				<span>
					<%=dan%> * <%=gop%> = <%=dan*gop%>
				</span>
			</li>
<%

 		}
 
%>
 
 			</br>	
 		</ul>
<%

 	}
%>



<%
 	for(int hang=1;hang<6;hang++){
 		out.print("<span>");
	 	for(int count=1;count<hang+1;count++){
	 		out.print("*");
	 	} 		
	 	out.println("</sapn><br/>");
 	}
 %>

