package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountNotFoundException;
import model.NotMatchedPasswordException;

//계좌번호 존재유무와 비밀번호 일치여부를 확인하는 메서드
public class TestUnit4 {
	public static void main(String[] args) {
		try {
			AccountDAO dao = new AccountDAO();
			String accountNo = "11";
			String password = "456";
			dao.checkAccountNoAndPassword(accountNo,password);
			System.out.println("계좌번호가 존재하고 비밀번호가 일치합니다");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotMatchedPasswordException e) {
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
