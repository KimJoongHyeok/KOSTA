package test.step4;

import model.DuplicateTelException;
import model.Employee;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseUpdate {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		try {
			service.addMember(new Student("011", "아이유", "종로", "21"));
			System.out.println("등록 ok");
		} catch (DuplicateTelException de) { // 기존에 tel이 존재하면
			System.out.println(de.getMessage()); // 011 tel 중복되어 등록불가합니다.
		}

		try {
			service.addMember(new Teacher("016", "RM", "강남", "수학"));
			System.out.println("등록 ok");
		} catch (DuplicateTelException de) { // 기존에 tel이 존재하면
			System.out.println(de.getMessage()); // 011 tel 중복되어 등록불가합니다.
		}
		service.printAll(); // 두명의 상세정보 (toString() )가 출력되어야 한다.
		System.out.println("******등록 완료********");

		// 수정 정상 흐름테스트
		try {
			Employee e = new Employee("011", "손흥민", "런던", "연구개발");
			service.updateMember(e);
			System.out.println("수정완료");
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
		//수정 예외 흐름테스트
		try {
			Teacher t = new Teacher("018", "이강인", "런던", "수학");
			service.updateMember(t);
			System.out.println("수정완료");
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
		service.printAll();
	}
}
