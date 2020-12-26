package com.lost.action.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lost.action.Action;
import com.lost.exception.InvalidPasswordException;
import com.lost.exception.NotFoundIDException;
import com.lost.service.MemberService;

public class LoginAction implements Action {

	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}


	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url="redirect:/common/main.do";
		
		//로그인처리
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");		
		
		HttpSession session = request.getSession();
		
		try {
			memberService.login(id, pwd);
			session.setAttribute("loginUser", memberService.getMember(id));
			
//			response.setContentType("text/html;charset=utf-8");
//			PrintWriter out = response.getWriter();
//			
//			out.print("<script>");
//			out.print("alert('로그인성공');");			
//			out.print("</script>");
//			out.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
			request.setAttribute("exception", e);
		} catch (NotFoundIDException | InvalidPasswordException e) {
			//e.printStackTrace();
			url="redirect:/";
			session.setAttribute("msg", e.getMessage());
		} 
		
		
		return url;
	}
}
