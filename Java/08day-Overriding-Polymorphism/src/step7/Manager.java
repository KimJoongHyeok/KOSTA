package step7;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}
	
	@Override //������̼� -> �ǹ��ִ� �ּ� , �����ϰ� ��Ÿ�ӽ� ������ �ش�.
			  //�����Ͻÿ� �������̵� ������ üũ���ش�.
	public String toString() {
		return super.toString() + " department : " + department;
	}

	
}
