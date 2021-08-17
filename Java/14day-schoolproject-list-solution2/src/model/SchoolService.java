package model;

public interface SchoolService {

	void addMember(Member member);

	void printAll();

	Member findMemberByTel(String tel);

	String deleteMemberByTel(String tel);
	
	//Version2���� �߰�( jdk1.8�̻� ����)
	public default int findindexByTel(String tel) {
		return 0;
	}

}