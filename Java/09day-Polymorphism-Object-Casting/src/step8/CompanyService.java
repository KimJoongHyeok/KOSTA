package step8;

import step5.Employee;

public class CompanyService {
	//부모 Employee 타입의 배열로 선언해서 Employee 및 자식 객체들을 저장하게 된다
	
	private Employee [] employee;
	private int cnt = 0;
	
	public CompanyService(int len) {
		super();
		employee = new Employee[len]; //전달받은 인자값 10 길이의 배열을 생성
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
