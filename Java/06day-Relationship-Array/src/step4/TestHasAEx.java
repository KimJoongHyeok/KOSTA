package step4;

public class TestHasAEx {
	/*
	 * Has a ���� : aggregation (����) ���踦 �����غ��� ����
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s = new School("�ڽ�Ÿ");
		System.out.println(s.getName());
		s.setStudent(new Student("������","21"));
		System.out.println(s.getStudent().getName());
		System.out.println(s.getStudent().getStuId());
	}

}
