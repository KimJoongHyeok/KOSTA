package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * MEMBER TABLE에  INSERT하는 예제
 * 
 * JDBC 개발단계
 * 1. JDBC Driver Loading
 * 2. Connection
 * 3. PreparedStatement -> insert sql 실행 executeUpdate() ( select 시에는 executeQuery() )
 * 4. close
 * 
 */
public class TestJDBC2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("oracle jdbc driver loading");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@221.150.136.4:1521:xe", "scott", "tiger");
			System.out.println("connection");
			String sql = "insert into member(id,password,name,address) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "JoongHyeok"); //1의 의미는 첫번째 '?' 를 의미 , id에 jsp를 insert
			pstmt.setString(2, "a"); //2의 의미는 두번째 '?' 를 의미 , password에 a를 할당
			pstmt.setString(3, "김중혁");
			pstmt.setString(4, "수원 영통");
			//sql 실행
			int result = pstmt.executeUpdate(); //sql 실행해서 테이블에 영향을 준 row 수가 반환
			System.out.println("insert member : " + result);
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
