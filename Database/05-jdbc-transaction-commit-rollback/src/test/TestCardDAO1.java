package test;

import java.sql.SQLException;

import model.CardDAO;

public class TestCardDAO1 {
	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			//정상적인 실행은 card와 point table에 각각 정보가 등록 된다
			//dao.registerCardAndPointVer1("java", "아이유", "cgv", 10000);
			//고의로 예외적인 상황을 만들어서 테스트해본다
			//아래 코드를 실행하면 card table에는 insert가 되고 
			//point table 에 insert 될 때 예외가 발생
			//즉 카드는 등록, 포인트는 등록되지 않아 
			dao.registerCardAndPointVer1("spring", "강하늘", null, 10000);
			//
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
