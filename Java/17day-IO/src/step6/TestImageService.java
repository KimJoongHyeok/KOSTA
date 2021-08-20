package step6;

import java.io.IOException;

public class TestImageService {
	public static void main(String[] args) {
		String orgImgPath = "C:\\kosta224\\iotest3\\아이유.jfif";
		String destImgPath = "C:\\kosta224\\iotest4\\복사본-아이유.jfif";
		ImageService service = new ImageService(orgImgPath,destImgPath);
		try {
			service.copyAndPasteImg();
			System.out.println("이미지 작업완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
