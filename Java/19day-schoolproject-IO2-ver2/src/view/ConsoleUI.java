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
		System.out.println("*******�л�������α׷��� �����մϴ�******");
		exit: while (true) {
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
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
				System.out.println("**��ü ������ ����**");
				service.printAll();
				break;
			case "5":
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				service.saveData();
				break exit;
			default:
				System.out.println("�߸��� �Է°��Դϴ�!");
				break;
			}
		}
		
		sc.close();
	}

	public void addview() throws DuplicateTelException {
		String kind = null;
		String tel = null;
		while (true) {
			System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
			kind = sc.nextLine();
			if (kind.equals("1") || kind.equals("2") || kind.equals("3"))
				break;
			else
				System.out.println("1.�л�,2.������,3.���� �� �ϳ��� �޴��� �����ϼ���");
		}

		while (true) {
			System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���");
			tel = sc.nextLine();
			//SchoolService�� findMemberByTel(tel)�� �̿�
			//try catch ������ �̿��� �ߺ��Ǹ� try������ ����ǰ�
			//�ߺ��� ���� ������ findMemberByTel�� thorw ������ ����
			//MemberNotFoundException�� ���ܸ� ������ �Ʒ��� catch������ ���ܸ� ����
			try {
				service.findMemberByTel(tel);
				System.out.println("�Է��Ͻ� " + tel+" tel��ȣ�� �ߺ��� ��ȣ�Դϴ�.�ٽ� �Է����ּ���.");
			} 
			//catch ������ ����Ǹ� tel�� �ߺ��� ��ȣ�� �ƴ�
			catch (MemberNotFoundException e) {
				break;
			}
//			//�̰� service�� tel�� �ߺ��Ǵ��� Ȯ���ϴ� �޼����߰��ؼ� ����
//			boolean flag = service.findMemberByTel2(tel);
//			if(flag == false)
//				break;
		
		}
		System.out.println("2. �̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���");
		String address = sc.nextLine();
		Member member = null;
		switch (kind) {
		case "1":
			System.out.println("4. �й��� �Է��ϼ���");
			String stuid = sc.nextLine();
			member = new Student(tel, name, address, stuid);
			break;
		case "2":
			System.out.println("4. ������ �Է��ϼ���");
			String subject = sc.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. ����� �Է��ϼ���");
			String department = sc.nextLine();
			member = new Employee(tel, name, address, department);
			break;
		}
		try {
			service.addMember(member);
			System.out.println("����Ʈ�� �߰�:" + member);
		} catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteview() {

		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���.");
		String tel = sc.nextLine();
		try {
			System.out.println("���� : " + service.deleteMemberByTel(tel));
		} catch (MemberNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void findview() {
		System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = sc.nextLine();
		try {
			System.out.println("��ȸ : " + service.findMemberByTel(tel));
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
