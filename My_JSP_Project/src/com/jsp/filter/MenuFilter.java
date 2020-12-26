package com.jsp.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.ApplicationContext;
import com.jsp.dto.MenuVO;
import com.jsp.service.MenuService;

public class MenuFilter implements Filter {
	
	private MenuService menuService;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		try {			
			List<MenuVO> menuList = menuService.getMainMenuList();

			request.setAttribute("menuList", menuList);

			chain.doFilter(request, response);		
			
		} catch (SQLException e) {
			HttpServletResponse httpResp = (HttpServletResponse)response;
			HttpServletRequest httpReq = (HttpServletRequest)request;
			httpResp.setContentType("text/html;charset=utf-8");
			PrintWriter out = httpResp.getWriter();
			
			out.println("<script>");
			out.println("alert('내부 서버 장애로 사용이 잠시 중단됩니다.');");
			out.println("location.href='"+httpReq.getContextPath()+"';");
			out.println("</script>");
			out.close();
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		menuService = (MenuService) ApplicationContext.getApplicationContext().get("menuService");
	}

	
	@Override
	public void destroy() {}
}







