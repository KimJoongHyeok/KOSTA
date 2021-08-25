package step08;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}


	@Override
	public void run() {
		moveFile();
	}
	
	public void moveFile() {
		
	}
}
