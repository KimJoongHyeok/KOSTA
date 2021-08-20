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
	// path 파일에 menu 정보를 출력 
	// Node: FileWriter
	// Process: PrintWriter 
	// Exception은 throws 
	public void writeFile(String menu) throws IOException {
		PrintWriter pw=new PrintWriter(new FileWriter(path,true));
		pw.println(menu);
		pw.close();
	}	
}















