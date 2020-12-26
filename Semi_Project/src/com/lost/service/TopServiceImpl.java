package com.lost.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lost.dao.TopDAO;
import com.lost.dto.ClothVO;
import com.lost.request.PageMaker;
import com.lost.request.SearchCriteria;

public class TopServiceImpl implements TopService {

	private TopDAO topDAO;

	public void setTopDAO(TopDAO topDAO) {
		this.topDAO = topDAO;
	}

	@Override
	public Map<String, Object> getClothList(SearchCriteria cri) throws SQLException {
		Map<String, Object> dataMap = new HashMap<String, Object>();

		// 현재 page 번호에 맞는 리스트를 perPageNum 개수 만큼 가져오기.
		List<ClothVO> topList = topDAO.selectClothList(cri);

		// 전체 board 개수
		int totalCount = topDAO.selectSearchClothListCount(cri);

		// PageMaker생성
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);

		dataMap.put("topList", topList);
		dataMap.put("pageMaker", pageMaker);

		return dataMap;
	}

	@Override
	public ClothVO getCloth(String ccode) throws SQLException {
		
		ClothVO cloth = topDAO.selectClothByCcode(ccode);
		
		return cloth;
	}

}
