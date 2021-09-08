package model;

public class NotMatchedPasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6419193578496432948L;
	public NotMatchedPasswordException(String message) {
		super(message);
	}
}
