package model;

public class InsufficientBlanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5118036694289490533L;
	public InsufficientBlanceException(String message) {
		super(message);
	}
}
