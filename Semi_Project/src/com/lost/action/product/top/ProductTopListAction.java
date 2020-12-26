package com.lost.action.product.top;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.request.SearchCriteria;
import com.lost.service.TopService;

public class ProductTopListAction implements Action {
	
	private TopService topService;
	public void setTopService(TopService topService) {
		this.topService = topService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/product/top/list";

		String page = request.getParameter("page");
		String perPageNum = request.getParameter("perPageNum");
		String searchType=request.getParameter("searchType");
		String keyword = request.getParameter("keyword");
		
		SearchCriteria cri = new SearchCriteria(page,perPageNum,searchType,keyword);
		
		Map<String, Object> dataMap = null;
		
		try {
			dataMap = topService.getClothList(cri);
			request.setAttribute("dataMap", dataMap);
		} catch (SQLException e) {
			e.printStackTrace();
			url = null;
		}
		return url;
	}

}
