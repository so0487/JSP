package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import com.lost.dto.ReplyVO;
import com.lost.request.SearchCriteria;

public interface ReplyDAO {
	
	
	void insertReply(ReplyVO reply)throws SQLException;
	void updateReply(ReplyVO reply)throws SQLException;
	void deleteReply(int rno)throws SQLException;
	
	
	int selectReplySeqNextValue()throws SQLException;
	
	List<ReplyVO> selectReplyListPage(int qno, SearchCriteria cri) throws SQLException;
	
	int countReply(int qno) throws SQLException;
	
}
