package model;

public class AccountVO {

	private String account_no;
	private String name;
	private String password;
	private int balance;
	public AccountVO() {
		super();
	}
	public AccountVO(String name, String password, int balance) {
		super();
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountVO [account_no=" + account_no + ", name=" + name + ", password=" + password + ", balance="
				+ balance + "]";
	}
	
	
	
}
