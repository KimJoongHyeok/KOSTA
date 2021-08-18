package step3;
/*
 * throws, throw, try, catch, finally 를 테스트 하는 예제
 * 
 * 필요시 특정 Exception을 직접 정의해서 사용할 수 있다.
 * 특정 Exception을 정의할 때는 java.lang.Exception을 상속받으면 된다.( extends Exception)
 */

class AgeException extends Exception {
	// IO 부분 객체 직렬화해서 공부할 예정
	private static final long serialVersionUID = -1641932421720612222L;

	AgeException(String message) {
		super(message); // 부모인 Exception 의 생성자를 호출할 때 예외메세지를 전달 -> 이후 catch 구문에서 e.getMessage() 를 이용해
						// 반환받을수 있다.
	}
}

class MovieService {
	// 19세 이상이면 영화 관람 가능하고 미만이면 AgeException을 발생시키고 throws 한다
	public void enter(int age) throws AgeException {
		try {
			if (age < 19) {
				throw new AgeException(age + "세 미성년자이므로 영화관람이 불가합니다."); // Exception 발생
			}
			System.out.println("즐거운 영화 관람되세요!");
		} finally {
			System.out.println("finally 항상 실행하는 영역, 다음에 또 봐요~~");
		}
	}
}

public class TestThrows2 {
	public static void main(String[] args) {
		MovieService service = new MovieService();
		try {
			service.enter(17);
		} catch (AgeException e) {
			//e.printStackTrace(); //예외 발생 경로를 모두 출력
			System.out.println(e.getMessage()); //예외 메세지를 반환받아 출력한다.
		}
		System.out.println("시스템 정상 수행");
	}
}






