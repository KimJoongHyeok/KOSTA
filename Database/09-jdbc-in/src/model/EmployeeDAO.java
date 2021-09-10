package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String password = "tiger";

	public EmployeeDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	public ArrayList<EmployeeVO> findEmployeeList() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeVO>list = new ArrayList<EmployeeVO>();
		try {
			con  = DriverManager.getConnection(url, username, password);
			String sql = "select * from s_employee where job in(select job from s_employee group by job having avg(salary) < (select avg(salary) from s_employee)) order by salary desc";
			StringBuilder sql2 = new StringBuilder();
			sql2.append("select * from s_employee where job in");
			sql2.append("(select job from s_employee group by job ");
			sql2.append("having avg(salary) < (select avg(salary)");
			sql2.append("from s_employee)) order by salary desc");
			
			//pstmt = con.prepareStatement(sql);
			pstmt = con.prepareStatement(sql2.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		
		return list;
	}

}
