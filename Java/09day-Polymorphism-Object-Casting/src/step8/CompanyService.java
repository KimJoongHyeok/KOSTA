package step8;

import step5.Employee;

public class CompanyService {
	//�θ� Employee Ÿ���� �迭�� �����ؼ� Employee �� �ڽ� ��ü���� �����ϰ� �ȴ�
	
	private Employee [] employee;
	private int cnt = 0;
	
	public CompanyService(int len) {
		super();
		employee = new Employee[len]; //���޹��� ���ڰ� 10 ������ �迭�� ����
	}
	
	public void add(Employee e) {
		employee[cnt] = e;
		cnt++;
	}
	
	public void printAll() {
		for(int i = 0;i<cnt;i++) {
			System.out.println(employee[i]);
		}
	}

//	public Employee findEmployeeByEmpNo(String empNo) {
//		if(empNo.equals("23")) {
//			return employee[1];
//		}
//		else if(empNo.equals("35")) {
//			return employee[2];
//		}
//		else if(empNo.equals("12")) {
//			return employee[0];
//		}
//		else {
//			return null;
//		}
//		
//	}
	
	public Employee findEmployeeByEmpNo(String empNo) {
		for(int i = 0;i<cnt;i++) {
			if(empNo.equals(employee[i].getEmpNo())) {
				return employee[i];
			}
		}
		return null;
	}
	
//	public Employee findEmployeeByEmpNo(String empNo) {
//		for(int i=0; i<this.cnt; i++) {
//			if(((Object)this.employee[i].getEmpNo()).equals(empNo)) {
//				return this.employee[i];
//			}
//		}
//		return null;
//	}
//	
	
}
