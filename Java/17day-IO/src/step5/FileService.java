package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	private String copyFilePath;
	private String pasteFilePath;
	/*
	 * pasteFilePath 파일의 디렉토리가 존재하지 않는다면 
	 * 디렉토리를 생성
	 */
	public FileService(String copyFilePath, String pasteFilePath) {
		super();
		this.copyFilePath = copyFilePath;
		this.pasteFilePath = pasteFilePath;
		File dir = new File(pasteFilePath).getParentFile(); //파일명까지 있기 떄문에 상위 디렉토리까지 뽑아내는거임
		if (dir.isDirectory() == false) { //디렉토리가 없으면 , isDirectory() 디렉토리가 존재하면 true
			dir.mkdirs(); //디렉토리를 생성한다.
		}
	}

	public void copyAndPaste() throws IOException {
		BufferedReader br = null; // new BufferedReader(new FileReader(copyFilePath));
		PrintWriter pw = null; // new PrintWriter(new FileWriter(pasteFilePath));
		try {
			br = new BufferedReader(new FileReader(copyFilePath));
			pw = new PrintWriter(new FileWriter(pasteFilePath));
//			while (br.ready()) { // 입력받을 정보가 있으면 true
//				pw.println(br.readLine());
//			}
			String data = br.readLine();
			while(data != null) {
				pw.println(data);
				data = br.readLine();
			}
		} finally {
			if (br != null) {
				br.close();
			}
			if (pw != null) {
				pw.close();
			}
		}
		
	}
	
	
}
