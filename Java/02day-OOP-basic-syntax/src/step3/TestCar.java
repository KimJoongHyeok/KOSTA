package step3;

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.price = 2000;
		System.out.println(c.price);
		c.model = "k5";
		System.out.println(c.model);
		c.go();
	}
}
