package com.lost.service;

import java.sql.SQLException;
import java.util.Map;

import com.lost.dto.QnAVO;
import com.lost.request.SearchCriteria;

public interface QnaService {
	
	
	// 목록조회
	Map<String, Object> getQnAList(SearchCriteria cri) throws SQLException;

	// 상세보기
	QnAVO getQnA(int qno) throws SQLException;

	QnAVO getQnAModify(int qno) throws SQLException;

	// 등록
	void write(QnAVO qno) throws SQLException;

	// 수정
	void modify(QnAVO qno) throws SQLException;

	// 삭제
	void remove(int qno) throws SQLException;
}
