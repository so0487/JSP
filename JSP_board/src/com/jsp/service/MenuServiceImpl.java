package com.jsp.service;

import java.sql.SQLException;
import java.util.List;

import com.jsp.dao.MenuDAO;
import com.jsp.dao.MenuDAOImpl;
import com.jsp.dto.MenuVO;

public class MenuServiceImpl implements MenuService {
	
	
	private MenuDAO menuDAO;// = MenuDAOImpl.getInstance();
	public void setMenuDAO(MenuDAO menuDAO) {
		this.menuDAO=menuDAO;
	}
	
	@Override
	public List<MenuVO> getMainMenuList() throws SQLException {
		List<MenuVO> menuList=menuDAO.selectMainMenu();
		return menuList;
	}

	@Override
	public List<MenuVO> getSubMenuList(String mCode) throws SQLException {
		List<MenuVO> menuList=menuDAO.selectSubMenu(mCode);
		return menuList;
	}

	@Override
	public MenuVO getMenuByMcode(String mCode) throws SQLException {
		MenuVO menu = menuDAO.selectMenuByMcode(mCode);
		return menu;
	}

}




