package step1; //package : Ŭ�������� ���丮���� �з��Ͽ� ����


//public : ���� ���� ���� ���� ������
public class Market {

	/*
	 * �ν��Ͻ� ���� instance variable
	 * String 
	 * */
	String name;
	
	public String searchProduct(String a) {
		System.out.println("DB���� ������ ��ȸ..");
		return name + " : " + a + "��ǰ �˻� ��� -> �����, �Ŷ��";
	}
	
}
