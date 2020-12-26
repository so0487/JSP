package com.lost.action.product.top;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.ClothVO;
import com.lost.service.TopService;

public class ProductTopDetailAction implements Action{
	
	private TopService topService;
	public void setTopService(TopService topService) {
		this.topService = topService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "/product/top/topDetail";
		
		
		String ccode = request.getParameter("ccode");
		
		try {
			ClothVO cloth = topService.getCloth(ccode);
			request.setAttribute("cloth", cloth);

		} catch (SQLException e) {
			e.printStackTrace();
			url = null;
		}
		
		return url;
	}

}
