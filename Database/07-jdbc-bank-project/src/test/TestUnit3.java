package test;

import java.sql.SQLException;

import model.AccountDAO2;
import model.AccountNotFoundException;
import model.NotMatchedPasswordException;
import model.NotMoneyException;

public class TestUnit3 {
	public static void main(String[] args) {
		try {
			AccountDAO2 dao = new AccountDAO2();
			String accountNo = "1";
			String password = "12340";
			int money = 1;
			dao.deposit(accountNo,password,money);
			System.out.println("입금완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
		} catch (NotMoneyException e) {
			e.printStackTrace();
		} catch (NotMatchedPasswordException e) {
			e.printStackTrace();
		}
	}
}	
