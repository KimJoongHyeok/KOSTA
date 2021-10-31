package org.kosta.myboard.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	private DataSource dataSource;
	private BoardDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();
	}
	public static BoardDAO getInstance() {
		return instance;
	}
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public ArrayList<PostVO> getPostingList() throws SQLException{
		ArrayList<PostVO>list = new ArrayList<PostVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select b.no, b.title, b.content, b.hits, to_char(b.time_posted,'yyyy.mm.dd'), m.name, m.id");
			sql.append(" from board b,board_member m");
			sql.append(" where m.id = b.id");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PostVO vo = new PostVO();
				vo.setNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setContent(rs.getString(3));
				vo.setHits(rs.getInt(4));
				vo.setTimePosted(rs.getString(5));
				MemberVO mvo = new MemberVO();
				mvo.setName(rs.getString(6));
				mvo.setId(rs.getString(7));
				
				vo.setMemberVO(mvo);
				list.add(vo);
			}
		}finally{
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public PostVO getPostingByNo(String no) throws SQLException {
		PostVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
		}finally {
			closeAll(pstmt, con);
		}
		return vo;
	}
	
}
