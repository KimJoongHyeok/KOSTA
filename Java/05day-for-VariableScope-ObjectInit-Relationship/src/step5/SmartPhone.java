package step5;

public class SmartPhone {
	//instance variable (or member variable)
	private String model;
	private int price; //
	
	public String getModel() {
		return model;
	}
	//아래 model 은 매개변수 이자 지역변수
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
