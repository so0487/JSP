package com.jsp.mybatis.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.mybatis.core.OracleMyBatisSqlSessionFactory;
import com.jsp.mybatis.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {


	//싱글톤 패턴 구현
	private static MemberDAOImpl instance;
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {
		if(instance==null) {
			synchronized (MemberDAOImpl.class) {
				instance = new MemberDAOImpl();
			}
		}
		return instance;
	}



	@Override
	public List<MemberVO> selectMemberList() throws SQLException {
		SqlSession session = OracleMyBatisSqlSessionFactory.getSqlSession();
		List<MemberVO>memList = session.selectList("Member-Mapper.selectMemberList",null);


		if(session!=null)session.close();
		return memList;
	}

	@Override
	public MemberVO selectMemberById(String id) throws SQLException {
		SqlSession session = OracleMyBatisSqlSessionFactory.getSqlSession();

		MemberVO member = session.selectOne("Member-Mapper.selectMemberById",id);

		if(session!=null)
			session.close();

		return member;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {
		SqlSession session = OracleMyBatisSqlSessionFactory.getSqlSession();

		session.update("Member-Mapper.insertMember",member);

		if(session!=null)session.close();

		

	}

	@Override
	public void updateMember(MemberVO member) throws SQLException {

		
		SqlSession session = OracleMyBatisSqlSessionFactory.getSqlSession();
		session.update("Member-Mapper.updateMember",member);

		if(session!=null)session.close();
		


	}

	@Override
	public void deleteMember(String id) throws SQLException {
		SqlSession session = OracleMyBatisSqlSessionFactory.getSqlSession();
		session.update("Member-Mapper.deleteMember",id);

		if(session!=null)session.close();
		
	}

}
