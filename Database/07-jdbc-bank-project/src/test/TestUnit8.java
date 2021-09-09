package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.AccountDAO;
import model.AccountVO;

//최고 잔액을 가진 계좌 리스트를 조회
public class TestUnit8 {
	public static void main(String[] args) {
		try {
			AccountDAO dao = new AccountDAO();
			ArrayList<AccountVO> list = dao.findHighestAccount();
			for(AccountVO vo : list) { //리스트에 잇는 요소 첫번째부터 마지막 요소까지 vo에 넣어줌
				System.out.println(vo);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}	
