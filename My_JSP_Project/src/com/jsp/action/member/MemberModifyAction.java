package com.jsp.action.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.action.Action;
import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;

public class MemberModifyAction implements Action {
	
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService=memberService;
	}
	
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "redirect:detail.do?id="+ request.getParameter("id");

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String authority = request.getParameter("authority");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone").replace("-", "");

		

		MemberVO member = new MemberVO();
		member.setEmail(email);
		member.setId(id);
		member.setPhone(phone);
		member.setPwd(pwd);
		member.setAuthority(authority);
		member.setName(name);
		member.setPicture("");
		
		
		//로그인 사용자 확인
		try {
			memberService.modify(member);
			HttpSession session = request.getSession();
			MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
			if (member.getId().equals(loginUser.getId())) {
				member = memberService.getMember(id);
				session.setAttribute("loginUser", member);
				
				url="";
				
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("location.href='detail.do?id="+request.getParameter("id")+"';");
				out.println("window.opener.location.reload();");
				out.println("</script>");
				out.close();
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}

		return url;
	}

}
