package step1;

public class CompanyService {
	// 부모 Employee 타입의 배열로 선언해서 Employee 및 자식 객체들을 저장하게 된다

	private Employee[] employee;
	private int cnt = 0;

	public CompanyService(int len) {
		super();
		employee = new Employee[len]; // 전달받은 인자값 10 길이의 배열을 생성
	}

	public void add(Employee e) {
		// employee [2] = new Employee("35","강하늘",300);
		employee[cnt++] = e;
	}

	public void printAll() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(employee[i]);
			
		}
	}

	/**
	 * 매개변수로 전달된 empNo에 해당하는 사원정보가 array 내에 존재하면 해당 객체의 주소값을 반환하고 존재하지 앟으면 null을 반환
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


	public int findPositionByEmpNo(String empNo) {
		int position = -1;
		for(int i = 0;i<cnt;i++) {
			if(empNo.equals(employee[i].getEmpNo())) {
				position = i;
				break;
			}
		}
		return position;
	}
	/**
	 * 사원정보를 삭제하는 메서드
	 * 매개변수로 전달된 인자값 empNo에 해당하는 사원객체가 배열요소로 존재하면 삭제하는 메서드
	 * 만약 사원번호에 ㅇ리치하는 배열 요소가 없다면 
	 * @param empNo
	 * 
	 */
	public void deleteEmployeeByEmpNo(String empNo) {
		int position = findPositionByEmpNo(empNo);
		if(position == -1) { //사원번호에 해당하는 사원이 배열 내에 없다면 
			System.out.println(empNo + "사원번호에 해당하는 사원이 없어서 삭제불가");
		}
		else {
			for(int i = position;i<cnt;i++) {
				if(i+1 == employee.length) {
					employee[i] = null;
				}
				else {
				employee[i] = employee[i+1];
				}
			}
			cnt--;
		}
	
	}


}
