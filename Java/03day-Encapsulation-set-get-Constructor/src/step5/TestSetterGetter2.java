package step5;

public class TestSetterGetter2 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAddress("���뱸");
		p.setId("moon960427");
		p.setNickName("���켺");
		p.setMoney(100);
		p.setName("������");
		System.out.println(p.getAddress() + " " + p.getId() + " " + p.getNickName() + " " + p.getMoney() + " " + p.getName());
	}
}
