package step3;

public class TestComposition {
	public static void main(String[] args) {
		Car car = new Car("소나타");
		
		System.out.println(car.getModel());
		//car 객체의 engine의 타입을 반환받아 출력해보기
		System.out.println(car.getEngine().getType());
		//car 객체의 engine displacement 를 반환받아 출력해보기
		System.out.println(car.getEngine().getDisplacement());
		//car 객체의 engine displacement를 2500으로 변경해본다
		car.getEngine().setDisplacement(2500);
		System.out.println(car.getEngine().getDisplacement());
		
	}
}
