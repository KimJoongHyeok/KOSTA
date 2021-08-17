package test;

import model.Employee;
import model.SchoolService;
import model.SchoolServiceImpl;
import model.Student;
import model.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		
		SchoolService service = new SchoolServiceImpl();
		
		service.addMember(new Student("0101231234", "������", "����", "17"));
//		service.addMember(new Teacher("0101231235", "�ǿ���", "����", "����"));
//		service.addMember(new Student("0101231236", "��ٿ�", "����", "16"));
//		service.addMember(new Employee("0101231237", "��ٿ�", "ȭ��", "�繫��"));
//		service.addMember(new Student("0101231238", "�����", "����", "18"));
//		service.addMember(new Teacher("0101231239", "�躴��", "����", "����"));
//		service.printAll();
		
		service.addMember(new Student("0101231234", "������", "���", "18"));
		
		service.addMember(new Student("0101231236", "��ٿ�", "����", "16"));
		service.addMember(new Employee("0101231237", "��ٿ�", "ȭ��", "�繫��"));
		service.addMember(new Student("0101231238", "�����", "����", "18"));
		service.addMember(new Teacher("0101231239", "�躴��", "����", "����"));
		service.printAll();
		
		String tel="0101231230";//�������� �ʴ� ��ȣ�� �׽�Ʈ 
		System.out.println(service.findMemberByTel(tel));//null
		tel="0101231237";//�����ϴ� ��ȣ�� �׽�Ʈ 
		System.out.println(service.findMemberByTel(tel));// tel:0101231237 name:��ٿ� address:ȭ�� department:�繫��
		
		
		tel="0101231237";//�������� �ʴ� ��ȣ�� �׽�Ʈ 
		//service.deleteMemberByTel(tel);
		System.out.println(service.deleteMemberByTel(tel));//01012341234 tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�
		service.printAll();
		service.addMember(new Student("0101231234", "������", "���", "18"));
		System.out.println("***�б� ������ ��� �Ϸ�***");
		service.printAll();// 6�� ���

	}
}
