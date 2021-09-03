package test;

import java.sql.SQLException;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO1 {
	public static void main(String[] args)  {
		//Guestbook에 insert (guestbook_no 는 sequence 로 자동발급)
		try {
			GuestBookDAO dao = new GuestBookDAO();
			GuestBookDTO dto = new GuestBookDTO("불금","잘먹고 잘놀자");
			dao.register(dto);
			System.out.println("방명록에 글 등록");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
