package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {


	@Override
	public void destroy() {
		System.out.println("destroy() method...");
	}



	/*
	@Override
	public void init() throws ServletException {
		System.out.println("init() method...");
	}

	 */





	public void init(ServletConfig config) throws ServletException {
		String param = config.getInitParameter("message");
		System.out.println("init() method..."+param);
	}






	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() method...");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPsot() method...");
	}

}
