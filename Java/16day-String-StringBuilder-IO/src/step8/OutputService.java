package step8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	private String path;

	public OutputService(String path) {
		super();
		this.path = path;
	}

	//path파일에 menu정보를 출력
	public void writeFile(String menu) throws IOException {
//		try {
//			FileWriter fw = new FileWriter(path);
//			PrintWriter pw = new PrintWriter(fw); //PrintWriter pw = new PrintWriter(new FileWriter(path));
//			pw.println(menu);
//			pw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		PrintWriter pw = new PrintWriter(new FileWriter(path,true));
		pw.println(menu);
		pw.close();	
	}
}
