package step4;
/*
	문자열을 다루는 String 과 StringBuilder 의 차이점
	
	String : 불변, 상수 -> 문자열 상수영역 ( literal pool )에 저장,
	 		 한번 생성된 문자열을 여러 곳에서 공유 해서 사용 -> 동일한 문자열이 자주 사용될 경우 메모리를 효율적으로 사용
	 		 String 문자열을 메서드를 이용해 데이터를 추가 또는 삭제 또는 수정할 경우에는 자체가 변경되지 않고 
	 		 새로 생성
	StringBuilder : 가변, StringBuilder 메서드를 이용해 추가 또는 삭제 또는 수정할 경우 자체가 변경
			 		동일한 문자열이 자주 변경될 떄 유리
			 		
	String	vs	StringBuilder	vs	StringBuffer
	불변			가변					가변
	새로생성		자체가 변경				자체가 변경
									동기화 지원( thread-sage ) -> 이후 공부예정
 			
 */

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name = "아이유"; //String 불변(상수)
		System.out.println(name.concat("님")); //아이유님 문자열을 새로만든걸 알수잇음 -> String 은 여러 곳에서 공유될 수 있으므로 
		System.out.println(name); //name은 아이유 
		System.out.println("***************");
		StringBuilder sb = new StringBuilder("아이유");
		System.out.println(sb.append("님")); // 아이유님 -> StringBuilder 는 자체가 변경
		System.out.println(sb);//sb는 아이유님(원본 자체가 변경됨)
		System.out.println("*******************");
		String nick  = "손흥민";
		StringBuilder snick = new StringBuilder("손흥민");
		System.out.println(nick + " " + snick);
		//비교테스트
		System.out.println(nick == snick.toString()); //==로는 문자열 비교 불가
		System.out.println(nick.equals(snick));
		System.out.println(nick.equals(snick.toString())); //equals 로는 비교 가능 (StringBuilder 또는 StringBuffer를 toString() 필요)
		System.out.println(nick.contentEquals(snick)); //contentEquals 는 String 과 StringBuilder or StringBuffer 를 바로 비교가능
		
		
		
	}
}










