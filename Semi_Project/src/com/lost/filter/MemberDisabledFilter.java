package com.lost.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;

//@WebFilter("/*")
public class MemberDisabledFilter implements Filter {
	
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	private List<String> inURLs=new ArrayList<String>(); 
	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpReq=(HttpServletRequest)request;
		HttpServletResponse httpResp=(HttpServletResponse)response;
		
		//제외안할 url 확인
		String reqUrl=httpReq.getRequestURI()
				.substring(httpReq.getContextPath().length());
		
		System.out.println("request URI : "+reqUrl);

		//url check
		if(includeCheck(reqUrl)) {
			chain.doFilter(request, response);	
			return;
		}
		
		
		//login check
		HttpSession session = httpReq.getSession();
		
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		//정지 상태확인
		if(loginUser.getEnabled()==0) { //사용 정지 상태
			httpResp.setContentType("text/html;charset=utf-8");
			PrintWriter out = httpResp.getWriter();
			out.println("<script>");
			out.println("alert('이용정지 회원입니다.');");
			out.println("location.href='"+httpReq.getContextPath()+"/';");
			out.println("</script>");
			
			out.close();
			
		}else { //사용 정지 아닌 상태
			chain.doFilter(request, response); //통과			
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		String includeURLNames=fConfig.getInitParameter("checkURL");
		StringTokenizer st= new StringTokenizer(includeURLNames,",");
		while(st.hasMoreTokens()) {
			inURLs.add(st.nextToken());
		}	
		System.out.println(inURLs);
	}
	
	private boolean includeCheck(String url) {
		if(url.length()<=1) return true;
		
		for(String exURL:inURLs) {
			if(url.contains(exURL)) {
				return false;
			}
		}		
		return true;
	}
	

}
