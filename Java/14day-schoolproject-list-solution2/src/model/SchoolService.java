package model;

public interface SchoolService {

	void addMember(Member member);

	void printAll();

	Member findMemberByTel(String tel);

	String deleteMemberByTel(String tel);
	
	//Version2에서 추가( jdk1.8이상 지원)
	public default int findindexByTel(String tel) {
		return 0;
	}

}