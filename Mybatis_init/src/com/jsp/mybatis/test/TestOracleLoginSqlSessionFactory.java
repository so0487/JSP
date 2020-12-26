package com.jsp.mybatis.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jsp.mybatis.core.OracleMyBatisSqlSessionFactory;
import com.jsp.mybatis.dto.MemberVO;

public class TestOracleLoginSqlSessionFactory {

	private SqlSession session;

	@Before
	public void initOpenSession() {
		session = OracleMyBatisSqlSessionFactory.getSqlSession();
	}

	@Test
	public void testSelectMember() {
		MemberVO member = new MemberVO("mini","mini",null,null,"mini");

		MemberVO target = session.selectOne("Member-Mapper.selectMemberById",member.getId());

		Assert.assertEquals(member.getId(), target.getId());
	}

	@After
	public void CloseSession() {
		if(session!=null)session.close();
	}

}
