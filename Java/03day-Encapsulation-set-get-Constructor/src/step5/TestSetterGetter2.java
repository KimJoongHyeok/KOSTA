package step5;

public class TestSetterGetter2 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAddress("øµ≈Î±∏");
		p.setId("moon960427");
		p.setNickName("¡§øÏº∫");
		p.setMoney(100);
		p.setName("±Ë¡ﬂ«ı");
		System.out.println(p.getAddress() + " " + p.getId() + " " + p.getNickName() + " " + p.getMoney() + " " + p.getName());
	}
}
