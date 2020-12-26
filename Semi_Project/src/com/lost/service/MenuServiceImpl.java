package com.lost.service;

import java.sql.SQLException;
import java.util.List;

import com.lost.dao.MenuDAO;
import com.lost.dto.MenuVO;


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
		List<MenuVO> subMenuList=menuDAO.selectSubMenu(mCode);
		return subMenuList;
	}

	@Override
	public MenuVO getMenuBymCode(String mCode) throws SQLException {
		MenuVO menu = menuDAO.selectMenuBymCode(mCode);
		return menu;
	}

}




