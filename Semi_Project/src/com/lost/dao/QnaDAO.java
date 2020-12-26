package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import com.lost.dto.QnAVO;
import com.lost.request.SearchCriteria;

public interface QnaDAO {

	List<QnAVO> selectSearchQnAList(SearchCriteria cri) throws SQLException;

	int selectSearchQnAListCount(SearchCriteria cri) throws SQLException;

	QnAVO selectQnAByQno(int qno) throws SQLException;

	void insertQnA(QnAVO qna) throws SQLException;

	void updateQnA(QnAVO qna) throws SQLException;

	void deleteQnA(int qno) throws SQLException;

	// viewcnt 증가
	void increaseViewCount(int qno) throws SQLException;

	// qna_seq.nextval 가져오기
	int selectQnASequenceNextValue() throws SQLException;
}


