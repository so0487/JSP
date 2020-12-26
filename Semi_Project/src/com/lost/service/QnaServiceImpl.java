package com.lost.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.lost.dao.QnaDAO;
import com.lost.dao.ReplyDAO;
import com.lost.dto.QnAVO;
import com.lost.request.PageMaker;
import com.lost.request.SearchCriteria;

public class QnaServiceImpl implements QnaService{
	
	private QnaDAO qnaDAO;
	public void setQnaDAO(QnaDAO qnaDAO) {
		this.qnaDAO = qnaDAO;
	}
	
	
	private ReplyDAO replyDAO;
	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO = replyDAO;
	}
	
	
	@Override
	public Map<String, Object> getQnAList(SearchCriteria cri) throws SQLException {
		Map<String, Object> dataMap = new HashMap<String, Object>();

		// 현재 page 번호에 맞는 리스트를 perPageNum 개수 만큼 가져오기.
		List<QnAVO> qnaList = qnaDAO.selectSearchQnAList(cri);
		
		//전체 QnA 개수
		int totalCount=qnaDAO.selectSearchQnAListCount(cri);
		
		// PageMaker 생성.
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);

		dataMap.put("qnaList", qnaList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}

	@Override
	public QnAVO getQnA(int qno) throws SQLException {
		QnAVO qna = qnaDAO.selectQnAByQno(qno);
		qnaDAO.increaseViewCount(qno);
		return qna;
	}

	@Override
	public QnAVO getQnAModify(int qno) throws SQLException {
		QnAVO qna = qnaDAO.selectQnAByQno(qno);
		return qna;
	}

	@Override
	public void write(QnAVO qna) throws SQLException {
		int qno=qnaDAO.selectQnASequenceNextValue();
		qna.setQno(qno);
		qnaDAO.insertQnA(qna);

	}

	@Override
	public void modify(QnAVO qna) throws SQLException {
		qnaDAO.updateQnA(qna);
	}

	@Override
	public void remove(int qno) throws SQLException {
		qnaDAO.deleteQnA(qno);
	}
}
