package step6.sollution;

public class CompanyService {
	//�θ� Employee Ÿ���� �迭�� �����ؼ� Employee �� �ڽ� ��ü���� �����ϰ� �ȴ�
	
	private Employee [] array;
	private int cnt = 0;
	
	public CompanyService(int len) {
		super();
		array = new Employee[len]; //���޹��� ���ڰ� 10 ������ �迭�� ����
	}
	
	public void add(Employee e) {
		//employee [2] = new Employee("35","���ϴ�",300);
		array[cnt] = e;
		cnt++;
	}
	
	public void printAll() {
		for(int i = 0;i<cnt;i++) {
			System.out.println(array[i]);
		}
	}
	/**
	 *�Ű������� ���޵� empNo�� �ش��ϴ� ��������� array ���� �����ϸ�
	 *�ش� ��ü�� �ּҰ��� ��ȯ�ϰ�
	 *�������� ������ null�� ��ȯ
	 *@param empNo
	 *@return employee 
	 * */
	
	public Employee findEmployeeByEmpNo(String empNo) {
		Employee employee = null;
		for(int i = 0;i<cnt;i++) {
			if(empNo.equals(array[i].getEmpNo())) {
				employee = array[i];
				break; //for���� ���
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
		System.out.println("ã��");
	}

	 
	

	
}
