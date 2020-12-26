package com.lost.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lost.dao.MemberDAO;
import com.lost.dto.MemberVO;
import com.lost.exception.InvalidPasswordException;
import com.lost.exception.NotFoundIDException;
import com.lost.request.PageMaker;
import com.lost.request.SearchCriteria;

public class MemberServiceImpl implements MemberService {
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	private MemberDAO memberDAO;// = MemberDAOImpl.getInstance();
	
	@Override
	public void login(String id, String pwd) throws SQLException, NotFoundIDException, InvalidPasswordException {
		MemberVO member = memberDAO.selectMemberById(id);
		if(member==null)
			throw new NotFoundIDException();
		if(!pwd.equals(member.getPwd()))
			throw new InvalidPasswordException();
	}
	
	@Override
	public MemberVO getMember(String id) throws SQLException {
		MemberVO member = memberDAO.selectMemberById(id);
		return member;		
	}
	
	@Override
	public Map<String, Object> getSearchMemberList(SearchCriteria cri) throws SQLException {
		List<MemberVO> memberList = memberDAO.selectMemberList(cri);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(memberDAO.selectMemberListCount(cri));
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("memberList", memberList);
		dataMap.put("pageMaker", pageMaker);
		
		return dataMap;
	}
	
	@Override
	public List<MemberVO> getMemberList(SearchCriteria cri) throws SQLException {
		List<MemberVO> memberList = memberDAO.selectMemberList(cri);
		return memberList;		
	}
	
	@Override
	public void regist(MemberVO member) throws SQLException {
		memberDAO.insertMember(member);		
	}
	
	@Override
	public void modify(MemberVO member) throws SQLException {
		memberDAO.updateMember(member);		
	}
	
	@Override
	public void remove(String id) throws SQLException {
		memberDAO.deleteMember(id);		
	}
	
	@Override
	public void disabled(String id) throws SQLException {			
		memberDAO.disableMember(id);		
	}
	
	@Override
	public void enabled(String id) throws SQLException {
		memberDAO.enabledMember(id);		
	}


}
