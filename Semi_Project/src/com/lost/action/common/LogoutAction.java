package com.lost.action.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lost.action.Action;

public class LogoutAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		String url="redirect:/";
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		return url;
	}
	

}
