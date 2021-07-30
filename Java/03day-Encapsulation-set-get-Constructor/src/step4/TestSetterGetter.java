package step4;

public class TestSetterGetter {
	public static void main(String[] args) {
		KostaMember m = new KostaMember();
		
		
		m.setId("javaking");
		System.out.println(m.getId());
		m.setPassword("abcd");
		System.out.println(m.getPassword());
	}

}
