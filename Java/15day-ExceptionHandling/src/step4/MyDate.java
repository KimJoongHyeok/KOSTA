package step4;

public class MyDate {
	private int day;

	public int getDay() {
		return day;
	}

	public void setDay(int day) throws DayException {
		if(1 <= day && day <= 31 ) {
			this.day = day;
		}else {
			throw new DayException("1 이상 31 이하의 값만 할당 가능");
		}
		
	}
	
	
}
