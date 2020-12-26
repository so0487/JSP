package com.lost.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lost.dto.ReplyVO;
import com.lost.request.SearchCriteria;

public class ReplyDAOImpl implements ReplyDAO {

	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public void insertReply(ReplyVO reply) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("Reply-Mapper.insertReply", reply);
		session.close();
	}

	@Override
	public void updateReply(ReplyVO reply) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("Reply-Mapper.updateReply", reply);
		session.close();

	}

	@Override
	public void deleteReply(int rno) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("Reply-Mapper.deleteReply", rno);
		session.close();
	}

	@Override
	public int selectReplySeqNextValue() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession(true);
		int rno = (Integer) session.selectOne("Reply-Mapper.selectReplySeqNextValue");
		session.close();
		return rno;
	}

	@Override
	public List<ReplyVO> selectReplyListPage(int qno, SearchCriteria cri) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession(true);

		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);

		List<ReplyVO> replyList = session.selectList("Reply-Mapper.selectReplyList", qno, rowBounds);

		session.close();
		return replyList;
	}

	@Override
	public int countReply(int qno) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession(true);
		int count = (Integer) session.selectOne("Reply-Mapper.countReply", qno);
		session.close();
		return count;
	}
}
