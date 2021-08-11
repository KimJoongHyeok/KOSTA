package step1;

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
	 * ��������� �����ϴ� �޼���
	 * �Ű������� ���޵� ���ڰ� empNo�� �ش��ϴ� �����ü�� �迭��ҷ� �����ϸ� �����ϴ� �޼���
	 * ���� �����ȣ�� ����ġ�ϴ� �迭 ��Ұ� ���ٸ� 
	 * @param empNo
	 * 
	 */
	public void deleteEmployeeByEmpNo(String empNo) {
		int position = findPositionByEmpNo(empNo);
		if(position == -1) { //�����ȣ�� �ش��ϴ� ����� �迭 ���� ���ٸ� 
			System.out.println(empNo + "�����ȣ�� �ش��ϴ� ����� ��� �����Ұ�");
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
