package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	private String path;
	/*
	 * 생성자 매개변수로 전달받는 파일 경로에 해당하는 디렉토리가 존재하지 않는다면 디렉토리를 생성한다
	 */
	public MenuService(String path) {
		super();
		this.path = path;
		// 파일경로의 상위 디렉토리 정보를 반환받는다.
		File dir = new File(path).getParentFile();
		// 확인용System.out.println(dir.getPath());
		if (dir.isDirectory() == false) { //디렉토리가 없으면
			dir.mkdirs(); //디렉토리를 생성한다.
		}
	}
	//throws
	public void order() throws IOException {
		/*//내코드
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("점심 메뉴를 주문하세요 : ");
			String menu = s.nextLine();
			PrintWriter pw = new PrintWriter(new FileWriter(path,true));
			pw.println(menu);
			if(menu.equals("주문끝")) {
				System.out.println("주문이 완료되었습니다.");
				break;
			}
			pw.close();
		}
		s.close();
	*/
		Scanner s = null;
		PrintWriter pw = null;
		
		try {
			s = new Scanner(System.in);
			pw = new PrintWriter(new FileWriter(path,true));
			while(true) {
				System.out.print("점심 메뉴를 주문하세요 : ");
				String menu = s.nextLine();
				if(menu.equals("주문끝")) {
					System.out.println("주문이 완료되었습니다.");
					break;
				}
				pw.println(menu);
				System.out.println(menu + " 주문");
			}
		}finally{
			if(pw != null) {
				pw.close();
			}
			if(s != null) {
				s.close();
			}
		}
		 
	}
}
