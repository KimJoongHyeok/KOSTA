package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class ConsoleUI {
	public String path = "C:\\kosta224\\iotest\\schoolproject.obj";
	private SchoolService service = new SchoolService(path);
	private Scanner sc = new Scanner(System.in);

	public void execute() throws DuplicateTelException, MemberNotFoundException, FileNotFoundException, IOException,
			ClassNotFoundException {
	
		service.loadData();
		System.out.println("*******학사관리프로그램을 시작합니다******");
		exit: while (true) {
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String num = sc.nextLine();
			switch (num) {
			case "1":
				addview();
				break;
			case "2":
				deleteview();
				break;
			case "3":
				findview();
				break;
			case "4":
				System.out.println("**전체 구성원 보기**");
				service.printAll();
				break;
			case "5":
				System.out.println("*******학사관리프로그램을 종료합니다******");
				service.saveData();
				break exit;
			default:
				System.out.println("잘못된 입력값입니다!");
				break;
			}
		}
		
		sc.close();
	}

	public void addview() throws DuplicateTelException {
		String kind = null;
		String tel = null;
		while (true) {
			System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
			kind = sc.nextLine();
			if (kind.equals("1") || kind.equals("2") || kind.equals("3"))
				break;
			else
				System.out.println("1.학생,2.선생님,3.직원 중 하나의 메뉴를 선택하세요");
		}

		while (true) {
			System.out.println("1. 전화번호를 입력하세요");
			tel = sc.nextLine();
			//SchoolService의 findMemberByTel(tel)을 이용
			//try catch 구문을 이용해 중복되면 try구문이 실행되고
			//중복이 되지 않으면 findMemberByTel은 thorw 구문을 통해
			//MemberNotFoundException에 예외를 던지고 아래의 catch문으로 예외를 잡음
			try {
				service.findMemberByTel(tel);
				System.out.println("입력하신 " + tel+" tel번호는 중복된 번호입니다.다시 입력해주세요.");
			} 
			//catch 구문이 실행되면 tel은 중복된 번호가 아님
			catch (MemberNotFoundException e) {
				break;
			}
//			//이건 service에 tel이 중복되는지 확인하는 메서드추가해서 구현
//			boolean flag = service.findMemberByTel2(tel);
//			if(flag == false)
//				break;
		
		}
		System.out.println("2. 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("3. 주소를 입력하세요");
		String address = sc.nextLine();
		Member member = null;
		switch (kind) {
		case "1":
			System.out.println("4. 학번을 입력하세요");
			String stuid = sc.nextLine();
			member = new Student(tel, name, address, stuid);
			break;
		case "2":
			System.out.println("4. 과목을 입력하세요");
			String subject = sc.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. 사번을 입력하세요");
			String department = sc.nextLine();
			member = new Employee(tel, name, address, department);
			break;
		}
		try {
			service.addMember(member);
			System.out.println("리스트에 추가:" + member);
		} catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteview() {

		System.out.println("삭제할 구성원의 전화번호를 입력하세요.");
		String tel = sc.nextLine();
		try {
			System.out.println("삭제 : " + service.deleteMemberByTel(tel));
		} catch (MemberNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void findview() {
		System.out.println("조회할 구성원의 전화번호를 입력하세요");
		String tel = sc.nextLine();
		try {
			System.out.println("조회 : " + service.findMemberByTel(tel));
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
