package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Member>list = new ArrayList<Member>();

	public void addMember(Member member) {
		for(int i = 0;i<list.size();i++) {
			if(member.getTel().equals(list.get(i).getTel())) {
				System.out.println(member.getTel() + "tel �� �ߺ��Ǿ� �߰��� �� �����ϴ�.");
				return;
			}
		}
		list.add(member);
	}
	
	public void printAll() {
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public Member findMemberByTel(String tel) {
		Member m = null;
		
		for(int i =0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				m = list.get(i);
			}
		}
		return m;
	}
	
//	public void deleteMemberByTel(String tel) {
//		for(int i =0;i<list.size();i++) {
//			if(list.get(i).getTel().equals(tel)) {
//				list.remove(i);
//				return;
//			}
//		}
//	}
	
	public String deleteMemberByTel(String tel) {
		String message = null;
		
		for(int i = 0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				message = list.remove(i).toString();
				break;
			}
		}
		if(message != null)
			return message;
		else
		return tel + "tel �� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
	}
}
