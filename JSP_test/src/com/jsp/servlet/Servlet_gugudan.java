package com.jsp.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_gugudan")
public class Servlet_gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet_gugudan() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		
	 	for(int i=1;i<10;i++){
//	 		System.out.println(i+"단 입니다.");
	 		out.println("<h1>"+i+"단 입니다.</h1>");
	 		for(int j=1;j<10;j++){
//	 			System.out.println(i+"*"+j+"="+i*j);
	 			out.println("<span>"+i+"*"+j+"="+i*j+"</span><br/>");
	 		}
//	 		System.out.println();
	 		out.println("<br/>");
	 	}
	 	
	 	
	 	
	 	for(int hang=1;hang<6;hang++){
	 		out.print("<span>");
		 	for(int count=1;count<hang+1;count++){
//		 		System.out.print("*");
		 		out.print("*");
		 	} 		
//		 	System.out.println();
		 	out.println("</sapn><br/>");
	 	}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
