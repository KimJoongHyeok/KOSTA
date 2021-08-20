package step6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	private String orgImgPath;
	private String destImgPath;
	
	public ImageService(String orgImgPath, String destImgPath) {
		super();
		this.orgImgPath = orgImgPath;
		this.destImgPath = destImgPath;
		new File(destImgPath).getParentFile().mkdirs();
	}
	/**
	 * 이미지 처리를 위해 1byte 단위의 스트림을 이용한다
	 * 입력스트림 FileInputStream, BufferedInputStream
	 * 출력스트림 FileOutputStream, BufferedOutputStream
	 * @throws IOException 
	 */
	public void copyAndPasteImg() throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(orgImgPath));
			bos = new BufferedOutputStream(new FileOutputStream(destImgPath));
			int data = bis.read();
			while(data != -1) {
				bos.write(data);
				data = bis.read();
			}
			
		}finally {
			if(bis != null) bis.close();
			if(bos != null) bos.close();
		}
	}	
}
