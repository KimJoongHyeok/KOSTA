package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * ID에 해당하는 회원 정보를 삭제
 * 스캐너를 이용해 아이디를 입력받은 후 아이디에 해당하는 회원을 삭제
 * 삭제에 성공하면 executeUpdaet() 의 반환값이 1이 반환 --> 머머 id 회원정보를 삭제
 * 아이디에 해당하는 회원이 없어서 삭제하지 못하면 executeUpdate() 반환값이 0 을 반환
 * 회원이 없어서 삭제하지 못했습니다.
 */
public class TestJDBC4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		sc.close();
		System.out.println(id + "을 db에서 삭제하기 위해 조회중");
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			String sql = "delete from member where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			int result = pstmt.executeUpdate(); //result : 삭제한 row 의 수
			if(result==1) {
				System.out.println(id + " 아이디 회원정보를 삭제했습니다.");
			}else {
				System.out.println(id + " 아이디 회원정보가 존재하지 않아 삭제하지 못했습니다.");
			}
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
