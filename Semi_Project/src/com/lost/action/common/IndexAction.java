package com.lost.action.common;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.MenuVO;
import com.lost.service.MenuService;

public class IndexAction implements Action {

	private MenuService menuService;
	public void setMenuService(MenuService menuService) {
		this.menuService=menuService;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url="/common/indexpage";
		
		String mCode = request.getParameter("mCode");
		
		if(mCode == null) {
			mCode="M000000";
		}
		try {
			List<MenuVO> menuList = menuService.getMainMenuList();
			MenuVO menu = menuService.getMenuBymCode(mCode);
			
			request.setAttribute("menuList", menuList);
			request.setAttribute("menu", menu);
		} catch (SQLException e) {
			e.printStackTrace();
			url =null;
		}
		return url;
	}

}

