package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * member id 로 select
 * id 는 primary key
 * 1 명의 회원정보가 존재하거나 아니면 회원정보가 존재하지 않는다.
 */
public class TestJDBC3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 회원아이디를 입력하세요 : ");
		String id = sc.nextLine();
		sc.close();
		System.out.println(id + " 아이디 회원정보를 db에서 조회");
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			String sql = "select name,address from member where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			//primary key 인 id로 검색했으므로 한 row 행이 존재하거나 아니면 존재하지 않으므로 if else 로 결과를 보여준다
			if(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}else {
				System.out.println(id + "아이디를 가진 회원은 존재하지 않습니다.");
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
