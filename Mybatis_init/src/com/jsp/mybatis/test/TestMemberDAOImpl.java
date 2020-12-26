package com.jsp.mybatis.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.jsp.mybatis.dao.MemberDAO;
import com.jsp.mybatis.dao.MemberDAOImpl;
import com.jsp.mybatis.dto.MemberVO;



public class TestMemberDAOImpl {
	
	private MemberDAO dao = MemberDAOImpl.getInstance();

	@Test
	public void testInsertMember() throws SQLException{
		MemberVO target = new MemberVO("mama","mama","010-1234-1234","mama@mama.com","mama");
		
		dao.deleteMember(target.getId());
		
		dao.insertMember(target);
		
		
		MemberVO result = dao.selectMemberById(target.getId());
		
		
		Assert.assertEquals(target.getId(), result.getId());
		
		dao.deleteMember(target.getId());
	}

}
