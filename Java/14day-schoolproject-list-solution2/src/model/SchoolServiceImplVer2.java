package model;

import java.util.ArrayList;

public class SchoolServiceImplVer2 implements SchoolService {
	
	private ArrayList<Member>list = new ArrayList<Member>();
	
	
	/**
	 * 매개변수 인자값으로 전달되는 tel에 일치하는 리스트 내의 구성원의 index를 반환하는 메서드
	 * 만약 인자값 tel과 일치하는 구성원이 리스트 내에 없다면 -1 반환하고 
	 * 존재하면 그 index를 반환하는 메서드
	 * 
	 * 이메서드는 구성원 추가,검색,삭제에서 재사용될 수 있다.
	 * 
	 * @param tel
	 * @return
	 */
	@Override
	public int findindexByTel(String tel) {
		int index = -1;
		for(int i = 0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				index  = i;
				break;
			}
		}
		return index;
	}
	/**
	 * 중복확인은 위의findIndexByTel 메서드를 재사용해서 구현한다.
	 */
	@Override
	public void addMember(Member member) {
		int index = findindexByTel(member.getTel());
		if(index != -1) {
			System.out.println(member.getTel() + "tel이 중복되어 추가할 수 없습니다.");
		}
		else {
			list.add(member);
		}
		
	}

	@Override
	public void printAll() {
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	@Override
	public Member findMemberByTel(String tel) {
		int index = findindexByTel(tel);
		if(index != -1) {
			return list.get(index);
		}
		//else
		return null;
	}

	@Override
	public String deleteMemberByTel(String tel) {
		int index = findindexByTel(tel);
		if(index == -1) {
			return tel + "tel에 해당하는 구성원 정보가 없어 삭제 불가";
		}
		else {
			return list.remove(index).toString();
		}
	}

}
