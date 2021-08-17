package test;

import model.Employee;
import model.SchoolService;
import model.SchoolServiceImpl;
import model.Student;
import model.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		
		SchoolService service = new SchoolServiceImpl();
		
		service.addMember(new Student("0101231234", "곽승진", "용인", "17"));
//		service.addMember(new Teacher("0101231235", "권용은", "수지", "국어"));
//		service.addMember(new Student("0101231236", "김근영", "수원", "16"));
//		service.addMember(new Employee("0101231237", "김근원", "화성", "재무부"));
//		service.addMember(new Student("0101231238", "김민주", "용인", "18"));
//		service.addMember(new Teacher("0101231239", "김병준", "용인", "수학"));
//		service.printAll();
		
		service.addMember(new Student("0101231234", "아이유", "잠실", "18"));
		
		service.addMember(new Student("0101231236", "김근영", "수원", "16"));
		service.addMember(new Employee("0101231237", "김근원", "화성", "재무부"));
		service.addMember(new Student("0101231238", "김민주", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김병준", "용인", "수학"));
		service.printAll();
		
		String tel="0101231230";//존재하지 않는 번호로 테스트 
		System.out.println(service.findMemberByTel(tel));//null
		tel="0101231237";//존재하는 번호로 테스트 
		System.out.println(service.findMemberByTel(tel));// tel:0101231237 name:김근원 address:화성 department:재무부
		
		
		tel="0101231237";//존재하지 않는 번호로 테스트 
		//service.deleteMemberByTel(tel);
		System.out.println(service.deleteMemberByTel(tel));//01012341234 tel에 해당하는 구성원 정보가 없어서 삭제 불가
		service.printAll();
		service.addMember(new Student("0101231234", "아이유", "잠실", "18"));
		System.out.println("***학교 구성원 등록 완료***");
		service.printAll();// 6명 출력

	}
}
