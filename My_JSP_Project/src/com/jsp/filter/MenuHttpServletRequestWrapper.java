package com.jsp.filter;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import com.jsp.action.ApplicationContext;
import com.jsp.dto.MenuVO;
import com.jsp.service.MemberService;
import com.jsp.service.MenuService;
import com.jsp.service.MenuServiceImpl;

public class MenuHttpServletRequestWrapper extends HttpServletRequestWrapper {

	private Map<String, String[]> parameterMap = null;

	private MenuService menuService;

	public MenuHttpServletRequestWrapper(HttpServletRequest request) throws SQLException {
		super(request);

		menuService = (MenuService) ApplicationContext.getApplicationContext().get("menuService");
		
		
		parameterMap = new java.util.HashMap<String, String[]>(request.getParameterMap());

		try {
			List<MenuVO> menuList = menuService.getMainMenuList();

			request.setAttribute("menuList", menuList);

			System.out.println("Menu가 준비되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}

	}

	@Override
	public String getParameter(String name) {
		String[] values = getParameterValues(name);
		return values!=null ? values[0] : null;
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		return this.parameterMap;
	}

	@Override
	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(parameterMap.keySet());
	}

	@Override
	public String[] getParameterValues(String name) {
		return parameterMap.get(name);
	}

}
