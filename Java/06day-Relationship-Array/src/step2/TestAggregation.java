package step2;

public class TestAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SmartPhone sp = new SmartPhone("������ 20",120);
			//System.out.println(sp.getModel() + " " + sp.getPrice());
			
			Customer c = new Customer("����");
			c.setSmartPhone(sp);
			System.out.println(c.getName());
			//���ڰ��� ����Ʈ�� �𵨸��� ��ȯ�޾� ����غ���.
			System.out.println(c.getSmartPhone().getModel());
			//���� ���� ����Ʈ�� ������ ��ȯ�޾� ����غ���
			System.out.println(c.getSmartPhone().getPrice());
			System.out.println("******************");
			
			Customer c2 = new Customer("���");
			c2.setSmartPhone(new SmartPhone("������ 9",200));
			//c2 �� ��� ���� ����Ʈ�� �𵨸��� ��ȯ�޾� ���
			System.out.println(c2.getSmartPhone().getModel());
			System.out.println(c2.getSmartPhone().getPrice());
			//customer2 ���� ����Ʈ�� model ���� iphone11�� ����
			c2.getSmartPhone().setModel("������11");
			System.out.println(c2.getSmartPhone().getModel());
			
	}

}
