package com.lost.service;

import java.sql.SQLException;
import java.util.Map;

import com.lost.dto.ReplyVO;
import com.lost.request.SearchCriteria;

public interface ReplyService {
	Map<String, Object> getReplyList(int qno, SearchCriteria cri) throws SQLException;
	
	void registReply(ReplyVO reply) throws SQLException;
	
	void modifyReply(ReplyVO reply) throws SQLException;
	
	void removeReply(int rno) throws SQLException;
	
}
