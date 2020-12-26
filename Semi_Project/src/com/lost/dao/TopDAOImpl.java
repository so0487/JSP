package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lost.dto.ClothVO;
import com.lost.request.SearchCriteria;

public class TopDAOImpl implements TopDAO{
	public void setSqlSessionFactory(SqlSessionFactory sessionFactory) {
		this.sqlSessionFactory = sessionFactory;
	}
	
	private static TopDAOImpl topDAOImpl;
	
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public List<ClothVO> selectClothList(SearchCriteria cri) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		
		
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		List<ClothVO> topList = null;
		
		topList = session.selectList("Top-Mapper.selectSearchClothList",cri,rowBounds);
		
		session.close();
				
		return topList;
	}

	@Override
	public int selectSearchClothListCount(SearchCriteria cri) throws SQLException {
		int count = 0;
		SqlSession session = sqlSessionFactory.openSession();		
		count = session.selectOne("Top-Mapper.selectSearchClothListCount",cri);
		session.close();
		return count;
	}

	@Override
	public ClothVO selectClothByCcode(String ccode) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		ClothVO cloth = session.selectOne("Top-Mapper.selectClothByCcode",ccode);
		session.close();
		return cloth;
	}

}
