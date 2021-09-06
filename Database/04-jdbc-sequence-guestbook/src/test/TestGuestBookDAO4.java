package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO4 {
	public static void main(String[] args) {
		// LIKE 연산자를 이용해서 방명록 글제목(TITLE)을 이용해 정보를 조회하는 기능을 구현
		try {
			GuestBookDAO dao = new GuestBookDAO();
			String keyword = "즐";
			ArrayList<GuestBookDTO> list = dao.getGeustBookListLikeKetword(keyword); 
//			for(int i = 0;i<list.size();i++) {
//				System.out.println(list.get(i));
//			}
			for(GuestBookDTO dto:list) //list에 잇는 모든 요소를 순차적으로 dto에 할당하면서 반복한다
				System.out.println(dto);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
