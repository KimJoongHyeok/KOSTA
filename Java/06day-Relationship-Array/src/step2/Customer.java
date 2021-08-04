package step2;

public class Customer {
	private String name;
	private SmartPhone smartPhone;
		
	public Customer(String name) {
		this.name = name;
	}
	/*
	 * 
	 * aggregation : has a ���� �� Customer �� SmartPhone �� ������ �ִ� ����
	 * �Ʒ��� ���� �ν��Ͻ� ������ ������ ����
	 */
	//���ϰ��� ����Ʈ�� ��ü�� �ּҰ��̹Ƿ� ����Ÿ���� Ŭ�������� SmartPhone �� �ȴ�.
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	// ȣ���� ������ ������ ���ڰ��� ����Ʈ�� ��ü�� �ּҰ�
	// �̸� ���޹ޱ� ���� �Ű������� Ÿ���� ����Ʈ�� ��ü�� Ŭ�������� SmartPhone �̴�.
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
