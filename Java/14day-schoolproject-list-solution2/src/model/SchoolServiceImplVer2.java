package model;

import java.util.ArrayList;

public class SchoolServiceImplVer2 implements SchoolService {
	
	private ArrayList<Member>list = new ArrayList<Member>();
	
	
	/**
	 * �Ű����� ���ڰ����� ���޵Ǵ� tel�� ��ġ�ϴ� ����Ʈ ���� �������� index�� ��ȯ�ϴ� �޼���
	 * ���� ���ڰ� tel�� ��ġ�ϴ� �������� ����Ʈ ���� ���ٸ� -1 ��ȯ�ϰ� 
	 * �����ϸ� �� index�� ��ȯ�ϴ� �޼���
	 * 
	 * �̸޼���� ������ �߰�,�˻�,�������� ����� �� �ִ�.
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
	 * �ߺ�Ȯ���� ����findIndexByTel �޼��带 �����ؼ� �����Ѵ�.
	 */
	@Override
	public void addMember(Member member) {
		int index = findindexByTel(member.getTel());
		if(index != -1) {
			System.out.println(member.getTel() + "tel�� �ߺ��Ǿ� �߰��� �� �����ϴ�.");
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
			return tel + "tel�� �ش��ϴ� ������ ������ ���� ���� �Ұ�";
		}
		else {
			return list.remove(index).toString();
		}
	}

}
