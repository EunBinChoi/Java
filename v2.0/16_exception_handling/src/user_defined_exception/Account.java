package user_defined_exception;

public class Account {
	private int balance;
	
	public Account() {}
	public Account(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 입금
	public void deposit(int money) {
		balance += money;
	} 
	// 출금
	public void withdraw(int money) throws Exception, AccountException {
		if(money < 0) {
			throw new Exception("음수 불가");
		}
		
		if(balance >= money) {
			balance -= money;
		}
		else {
			throw new AccountException("잔고 부족");
			// 인위적으로 예외 던짐 (throw new 예외 클래스())
		}
	} 
	
	
}
