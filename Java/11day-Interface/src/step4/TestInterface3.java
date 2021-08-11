package step4;

public class TestInterface3 {	
	public static void main(String[] args) {
		Player pa[] = {new Youtube(),new CDPlayer()};
		for(int i = 0;i<pa.length;i++) {
			pa[i].play();
			
			/*
			 * 유튜브가 동영상을 재생하다.
			 * CD플레이어가 CD를 재생하다.
			 * */
		}
	}
}
