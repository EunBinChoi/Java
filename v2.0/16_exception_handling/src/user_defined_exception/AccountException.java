package user_defined_exception;


// Application Exception
// : ���α׷� ������ ���� �� �ִ� ����
public class AccountException extends Exception {
	
	public AccountException() {}
	public AccountException(String message) {
		super(message);
	}

}
