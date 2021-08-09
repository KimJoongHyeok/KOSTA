package step9;

public class TestString {
	public static void main(String[] args) {
		String name1 = "아이유";
		String name2 = new String("아이유");
		System.out.println(name1 + " " + name2);
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
	}
}
