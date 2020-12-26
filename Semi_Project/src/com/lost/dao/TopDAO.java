package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import com.lost.dto.ClothVO;
import com.lost.request.SearchCriteria;

public interface TopDAO {
	
	//상품리스트
	List<ClothVO> selectClothList(SearchCriteria cri) throws SQLException;
	
	//검색 결과의 전체 리스트 개수
	int selectSearchClothListCount(SearchCriteria cri) throws SQLException;
	
	//상품정보 조회
	ClothVO selectClothByCcode(String ccode) throws SQLException;
	
	
}
