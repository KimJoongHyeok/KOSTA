package step2;

public class TestString {
	public static void main(String[] args) {
		String name = "������";
		System.out.println(name.concat("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.indexOf("��")); //2index ��ȯ
		System.out.println(name.indexOf("��")); //�������� ������ index �� -1�� ��ȯ
		System.out.println(name.startsWith("��"));
		System.out.println(name.startsWith("����")); //� �ܾ�� �����ϴ���, �� �� true, ���� �� true
		System.out.println(name.endsWith("��")); //� �ܾ�� ��������
		String info = "���ϰ��ִ�.";
		System.out.println(info.substring(2)); //2 begin index
		System.out.println(info.substring(2,4)); //����
		info = "���ϰ� �ִ�."; //���� �߰�
		System.out.println(info.substring(2,5));
		String id = " java king";
		System.out.println(id.length()); //������ ���� �������
		System.out.println(id.trim()); //�� �� ������ ����
		System.out.println(id.trim().length()); //�� ������ ������ �� length�� Ȯ��
		String nick = "���ڿ���";
		System.out.println(nick.replace("��", "��"));
		String fileName = "org.web.t.java";
		System.out.println(fileName.lastIndexOf(".")); // . ������ ���ڿ��� index�� ��ȯ
		int i = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1)); //������ Ȯ���ڸ� ���Ѵ�.
		System.out.println(fileName.replace(".java", "")); //.java�� ������ ���ڿ��� ����
	}
}
