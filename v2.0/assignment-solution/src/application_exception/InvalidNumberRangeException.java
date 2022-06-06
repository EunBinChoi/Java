package application_exception;

public class InvalidNumberRangeException extends Exception {
	public InvalidNumberRangeException() {
		super();
	}
	public InvalidNumberRangeException(String msg) {
		super(msg);
	}
}
