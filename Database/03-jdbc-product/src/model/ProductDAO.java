package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO : Data Access Object
public class ProductDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String password = "tiger";
	public ProductDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs !=null)
			rs.close();
		closeAll(pstmt,con);
	}
	public int getProductTotalCount() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;
		try {
			con = DriverManager.getConnection(url,username,password);
			String sql = "select count(*) from product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) { //조회된 결과가 있으면 true를 반환하고 결과행으로 커서를 이동
				totalCount = rs.getInt(1);
			}                                                                                                                                                                                                                     
		}finally {
			closeAll(rs,pstmt,con);
		}
		return totalCount;
	}
	public boolean existsById(int productID) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url,username,password);
			//String sql = "select * from product where id = ?";
			String sql = "select count(*) from product where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, productID);
			//int result = pstmt.executeUpdate();
			rs = pstmt.executeQuery();
//			if(result == 1)
//				return true;
			if(rs.next()) {
				if(rs.getInt(1)== 1) {
					return true;
				}
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return false;
	}
}
