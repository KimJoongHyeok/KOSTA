package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	public EmployeeVO findEmployeeByEmpno(int empno) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO vo = null;
		DepartmentVO dvo = null;
		try {
			con = DriverManager.getConnection(url, username, password);
			StringBuilder sql = new StringBuilder();
//			sql.append("select e.ename, e.sal, d.deptno, d.dname, d.loc, d.tel ");
//			sql.append("from k_employee e,department d");
//			sql.append("where d.deptno = e.deptno and e.empno = ?");
			String sql2 = "select e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel from k_employee e,department d where d.deptno = e.deptno and e.empno = ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			//int empno, String ename, int sal, DepartmentVO departmentVO
			if(rs.next()) {
//				vo = new EmployeeVO();				
//				vo.setEmpno(empno);
//				vo.setEname(rs.getString(1));
//				vo.setSal(rs.getInt(2));
//				dvo = new DepartmentVO();
//				dvo.setDeptno(rs.getInt(3));
//				dvo.setDname(rs.getString(4));
//				dvo.setLoc(rs.getString(5));
//				dvo.setTel(rs.getString(6));
//				vo.setDepartmentVO(dvo);
				dvo = new DepartmentVO(rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
				vo = new EmployeeVO(empno,rs.getString(1),rs.getInt(2),dvo);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	
	
}
