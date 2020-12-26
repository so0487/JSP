package com.lost.service;

import java.sql.SQLException;
import java.util.Map;

import com.lost.dto.NoticeVO;
import com.lost.request.SearchCriteria;

public interface NoticeService {
	// 목록조회
	Map<String, Object> getNoticeList(SearchCriteria cri) throws SQLException;

	// 상세보기
	NoticeVO getNotice(int nno) throws SQLException;

	NoticeVO getNoticeModify(int nno) throws SQLException;

	// 등록
	void write(NoticeVO notice) throws SQLException;

	// 수정
	void modify(NoticeVO notice) throws SQLException;

	// 삭제
	void remove(int nno) throws SQLException;
}