package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * java application 과 database 연동
 * 1.jdbc driver loading (jdk 1.6 버전 이상에서는 생략 가능됩)
 * 2.db connection
 * 3.PreparedStatement
 * 4.ResultSet
 * 5.close
 */
public class TestJDBC1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		try {
			//oracle jdbc 드라이버 로딩
			Class.forName(driver); //class.forName() -> class를 loading시킨다 -> static 정보가 meta space에 저장
			System.out.println("jdbc driver loading");
			//oracle database 와 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			//강사님꺼
			//String url = "jdbc:oracle:thin:@221.150.136.4:1521:xe";
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("oracle db와 connection : " + con);
			
			String sql = "select id,password,name,address from member";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //sql 실행
			while(rs.next()) { //조회 결과 행이 존재하면 true 없으면 false
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
