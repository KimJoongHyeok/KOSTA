package step9;

public class TestString {
	public static void main(String[] args) {
		String name1 = "������";
		String name2 = new String("������");
		System.out.println(name1 + " " + name2);
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
	}
}
