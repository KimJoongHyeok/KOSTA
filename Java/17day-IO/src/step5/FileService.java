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
	 * pasteFilePath ������ ���丮�� �������� �ʴ´ٸ� 
	 * ���丮�� ����
	 */
	public FileService(String copyFilePath, String pasteFilePath) {
		super();
		this.copyFilePath = copyFilePath;
		this.pasteFilePath = pasteFilePath;
		File dir = new File(pasteFilePath).getParentFile(); //���ϸ���� �ֱ� ������ ���� ���丮���� �̾Ƴ��°���
		if (dir.isDirectory() == false) { //���丮�� ������ , isDirectory() ���丮�� �����ϸ� true
			dir.mkdirs(); //���丮�� �����Ѵ�.
		}
	}

	public void copyAndPaste() throws IOException {
		BufferedReader br = null; // new BufferedReader(new FileReader(copyFilePath));
		PrintWriter pw = null; // new PrintWriter(new FileWriter(pasteFilePath));
		try {
			br = new BufferedReader(new FileReader(copyFilePath));
			pw = new PrintWriter(new FileWriter(pasteFilePath));
//			while (br.ready()) { // �Է¹��� ������ ������ true
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
