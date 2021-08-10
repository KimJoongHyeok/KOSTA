package step6.sollution;

public class CompanyService {
	//부모 Employee 타입의 배열로 선언해서 Employee 및 자식 객체들을 저장하게 된다
	
	private Employee [] array;
	private int cnt = 0;
	
	public CompanyService(int len) {
		super();
		array = new Employee[len]; //전달받은 인자값 10 길이의 배열을 생성
	}
	
	public void add(Employee e) {
		//employee [2] = new Employee("35","강하늘",300);
		array[cnt] = e;
		cnt++;
	}
	
	public void printAll() {
		for(int i = 0;i<cnt;i++) {
			System.out.println(array[i]);
		}
	}
	/**
	 *매개변수로 전달된 empNo에 해당하는 사원정보가 array 내에 존재하면
	 *해당 객체의 주소값을 반환하고
	 *존재하지 앟으면 null을 반환
	 *@param empNo
	 *@return employee 
	 * */
	
	public Employee findEmployeeByEmpNo(String empNo) {
		Employee employee = null;
		for(int i = 0;i<cnt;i++) {
			if(empNo.equals(array[i].getEmpNo())) {
				employee = array[i];
				break; //for문을 벗어남
			}
		}
		return employee;
	}
	
	public void deleteEmployeeByEmpNo(String empNo) {
		for(int i = 0;i<cnt;i++) {
			if(empNo.equals(array[i].getEmpNo())) {
				delete();
			}
		}
	}

	private void delete() {
		System.out.println("찾음");
	}

	 
	

	
}
