package step09.ex;

import java.io.File;

public class MoveFileWorker implements Runnable {
	private int moveCount;
	private int movePeriod;

	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}

	@Override
	public void run() {
		makeDir();
		for(int i = 0;i<moveCount;i++) {
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			move();
			System.out.println("MoveFileWorker Thread가 파일들을 이동");
		}
	}

	public void makeDir() {
		File musicdir = new File(CommonInfo.MUSIC_PATH);
		File moviedir = new File(CommonInfo.MOVIE_PATH);
		if (musicdir.isDirectory() == false) {
			musicdir.mkdirs();
		}
		if (moviedir.isDirectory() == false) {
			moviedir.mkdirs();
		}
	}

	public void move() {

		File repositoryDir = new File(CommonInfo.MAKE_PATH);
		File[] files = repositoryDir.listFiles(); // 디렉토리에 있는 파일(or 디렉토리)들을 배열로 반환

		for (int i = 0; i < files.length; i++) {
			// System.out.println(files[i].getName() + "이동시켜야 할 파일");
			String destPath = null;
			if (files[i].getName().endsWith(".avi"))
				destPath = CommonInfo.MOVIE_PATH;
			else if (files[i].getName().endsWith(".mp3"))
				destPath = CommonInfo.MUSIC_PATH;
			File destFile = new File(destPath + File.separator + files[i].getName());
			// 이동대상파일객체.renameTo(이동할 파일)
			files[i].renameTo(destFile);
		}

	}

}
