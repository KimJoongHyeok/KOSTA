package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountNotFoundException;
import model.InsufficientBlanceException;
import model.NotMatchedPasswordException;
import model.NotMoneyException;

public class TestUnit5 {
	public static void main(String[] args) {
		try {
			AccountDAO dao = new AccountDAO();
			String accountNo = "1";
			String password = "1234";
			int money = 100;
			System.out.println("출금 전 계좌 금액 : " + dao.findBalanceByAccountNo(accountNo, password));
			dao.withdraw(accountNo,password,money);
			System.out.println("출금 후 계좌 금액 : " + dao.findBalanceByAccountNo(accountNo, password));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NotMatchedPasswordException e) {
			System.out.println(e.getMessage());
		} catch(InsufficientBlanceException e) {
			System.out.println(e.getMessage());
		} catch(NotMoneyException e) {
			System.out.println(e.getMessage());
		}
	}
}
