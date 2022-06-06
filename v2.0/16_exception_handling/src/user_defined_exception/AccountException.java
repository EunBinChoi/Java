package user_defined_exception;


// Application Exception
// : 프로그램 구현시 생길 수 있는 오류
public class AccountException extends Exception {
	
	public AccountException() {}
	public AccountException(String message) {
		super(message);
	}

}
