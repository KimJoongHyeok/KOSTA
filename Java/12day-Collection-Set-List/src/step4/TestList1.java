package step4;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("�ܹ���");
		list.add("«��");
		list.add("���");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.remove(1)); //index 1�� ��Ҹ� ����
		System.out.println(list);
		System.out.println("****************");
		//for ������ ��� ��Ҹ� ��� size()�� get()�̿�
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("���� : " + list.set(2, "����")); //��µǴ� ���� ���� �� ������,index 2�� �ش��ϴ� ��Ҹ� ����
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
