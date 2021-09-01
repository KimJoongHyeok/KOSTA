package test;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

/*
 * 회원 정보를 member table에 insert 하는 에제
 * 
 * 
 */
public class TestMemberDAO1 {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			//insert 즉 등록할 회원 정보
			MemberVO vo = new MemberVO("servlet","a","이상수","애월읍");
			dao.registerMember(vo);
			System.out.println("등록완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
