package step09.ex.test.step2;

import java.text.SimpleDateFormat;

/*
 * 유일한 파일명을 만들기 위해 시간정보를 이용하는 단위테스트
 * java : System.currentTimeMills() 메서드를 이용
 * 반환되는 값이 long 타입, 세계표준시 1970년 1월 1일 0시 0분 기분으로 
 * 몇 밀리세컨드가 흘렀는 지 기록한 값 -> 유닉스 시간이라고 함
 */
public class TestTime {
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		long time = System.currentTimeMillis();
		//시간정보인 long 형 데이터를 시간 포맷을 설정해서 확인해본다.
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String nowTime = s.format(time);
		System.out.println(nowTime);
		
	}
}
