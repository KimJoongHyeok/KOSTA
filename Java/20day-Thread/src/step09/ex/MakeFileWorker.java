package step09.ex;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class MakeFileWorker implements Runnable {
	private int makeCount;
	private int makePeriod;

	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}

	@Override
	public void run() {
		makeDir();
		try {
			makeFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	public void makeDir() {
		File dir = new File(CommonInfo.MAKE_PATH);
		if (dir.isDirectory() == false) {
			dir.mkdirs();
		}
	}

	public void makeFile() throws InterruptedException, IOException {
		for (int i = 0; i < makeCount; i++) {
			String fileName = createFile(i);
			File file = new File(CommonInfo.MAKE_PATH + File.separator + fileName);
//			try {
//				boolean b = file.createNewFile();
//				System.out.println("완료" + b);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			file.createNewFile();
			System.out.println(fileName + " 생성 - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}

	}

	public String createFile(int i) {
		Random r = new Random();
		String ext = i + "_";
		long time = System.currentTimeMillis();
		if (r.nextBoolean())
			ext = ext + time + ".avi";
		else
			ext = ext + time + ".mp3";
		return ext;
	}

}
