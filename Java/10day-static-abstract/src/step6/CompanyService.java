package step6;

import java.util.ArrayList;

public class CompanyService {
	// �θ� Employee Ÿ���� �迭�� �����ؼ� Employee �� �ڽ� ��ü���� �����ϰ� �ȴ�

	private Employee[] employee;
	private int cnt = 0;

	public CompanyService(int len) {
		super();
		employee = new Employee[len]; // ���޹��� ���ڰ� 10 ������ �迭�� ����
	}

	public void add(Employee e) {
		// employee [2] = new Employee("35","���ϴ�",300);
		employee[cnt++] = e;
	}

	public void printAll() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(employee[i]);
		}
	}

	/**
	 * �Ű������� ���޵� empNo�� �ش��ϴ� ��������� array ���� �����ϸ� �ش� ��ü�� �ּҰ��� ��ȯ�ϰ� �������� ������ null�� ��ȯ
	 * 
	 * @param empNo
	 * @return employee
	 */
	public Employee findEmployeeByEmpNo(String empNo) {
		for (int i = 0; i < cnt; i++) {
			if (empNo.equals(employee[i].getEmpNo())) {
				return employee[i];
			}
		}
		return null;
	}

	public void deleteEmployeeByEmpNo(String empNo) {
		boolean found = false;
		for (int i = 0; i < cnt; i++) {
			if (empNo.equals(employee[i].getEmpNo())) {
				for (int j = i; j < cnt - 1; j++) {
					employee[j] = employee[j + 1];
				}
				cnt -= 1;
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println(empNo + "�����ȣ�� �ش��ϴ� ����� ���� ���� �Ұ�");
		}
	}



}
