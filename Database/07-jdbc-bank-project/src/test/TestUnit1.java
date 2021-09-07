package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

/*
 * 계좌 개설
 */
public class TestUnit1 {
	public static void main(String[] args) {
		try {
			AccountDAO dao = new AccountDAO();
			// 계좌 개설
			// 정상흐름 테스트
//			AccountVO vo = new AccountVO("아이유", "1234", 1000);
//			dao.createAccount(vo);
//			System.out.println("계좌 개설");
			AccountVO vo2 = new AccountVO("박보검","1111",999);
			dao.createAccount(vo2);
			System.out.println("계좌 개설");
		} catch (CreateAccountException ce) {
			System.out.println(ce.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
