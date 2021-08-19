package step6;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		File dir = new File("C:\\kosta224\\iotest2\\music");
		// dir 즉 music 디렉토리 안에 있는 파일들만 ( 폴더는 제외 ) 모두 파일명을 출력
		File fa[] = dir.listFiles();
		//isFile(), 
		
		//폴더말고 파일들만 이름 추출하기
		for(int i = 0;i<fa.length;i++) {
			if(fa[i].isFile() == true) { //if(fa[i].isFile()) 로도 가능 ,자체가 true,false로 구분되기 때문
			System.out.println(fa[i].getName());
			}
		}
			
	}
}
