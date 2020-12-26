package com.lost.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.lost.dto.ClothVO;
import com.lost.request.SearchCriteria;

public interface TopService {
	
	
	Map<String, Object> getClothList(SearchCriteria cri) throws SQLException;
	
	ClothVO getCloth(String ccode) throws SQLException;
}
