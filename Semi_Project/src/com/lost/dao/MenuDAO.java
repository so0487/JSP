package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import com.lost.dto.MenuVO;


public interface MenuDAO {
	
	
	List<MenuVO> selectMainMenu()throws SQLException;
	List<MenuVO> selectSubMenu(String mCode)throws SQLException;
	MenuVO selectMenuBymCode(String mCode)throws SQLException;
}
