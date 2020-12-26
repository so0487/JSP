package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lost.dto.QnAVO;
import com.lost.request.SearchCriteria;

public class QnaDAOImpl implements QnaDAO {
	
	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<QnAVO> selectSearchQnAList(SearchCriteria cri) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		int offset=cri.getPageStartRowNum();
		int limit=cri.getPerPageNum();		
		RowBounds rowBounds=new RowBounds(offset,limit);		
		
		List<QnAVO> qnaList=
				sqlSession.selectList("QnA-Mapper.selectSearchQnAList",cri,rowBounds);
		sqlSession.close();
		
		return qnaList;
	}

	@Override
	public int selectSearchQnAListCount(SearchCriteria cri) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		int count=sqlSession.selectOne("QnA-Mapper.selectSearchQnAListCount",cri);
		sqlSession.close();
		return count;
	}

	@Override
	public QnAVO selectQnAByQno(int qno) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		QnAVO qna=
				sqlSession.selectOne("QnA-Mapper.selectQnAByQno",qno);
		sqlSession.close();
		return qna;
	}

	@Override
	public void insertQnA(QnAVO qna) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);		
		sqlSession.update("QnA-Mapper.insertQnA",qna);
		sqlSession.close();

	}

	@Override
	public void updateQnA(QnAVO qna) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);		
		sqlSession.update("QnA-Mapper.updateQnA",qna);
		sqlSession.close();
	}

	@Override
	public void deleteQnA(int qno) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);		
		sqlSession.update("QnA-Mapper.deleteQnA",qno);
		sqlSession.close();

	}

	@Override
	public void increaseViewCount(int qno) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);		
		sqlSession.update("QnA-Mapper.increaseViewCount",qno);
		sqlSession.close();

	}

	@Override
	public int selectQnASequenceNextValue() throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int seq_num=
				sqlSession.selectOne("QnA-Mapper.selectQnASequenceNextValue");
		sqlSession.close();
		return seq_num;
	}

}
