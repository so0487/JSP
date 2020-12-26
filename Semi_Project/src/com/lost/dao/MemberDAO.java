package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import com.lost.dto.MemberVO;
import com.lost.request.SearchCriteria;



public interface MemberDAO {
	
	//회원리스트
	List<MemberVO> selectMemberList(SearchCriteria cri) throws SQLException;
	
	//검색 결과의 전체 리스트 개수
	int selectMemberListCount(SearchCriteria cri) throws SQLException;
		
	//회원정보 조회
	MemberVO selectMemberById(String id) throws SQLException;
	
	//회원추가
	void insertMember(MemberVO member) throws SQLException;
	
	//회원수정
	void updateMember(MemberVO member) throws SQLException;
	
	//회원삭제
	void deleteMember(String id) throws SQLException;
	
	//회원정지
	void disableMember(String id) throws SQLException;
	
	//회원 활성화
	void enabledMember(String id) throws SQLException;
}
