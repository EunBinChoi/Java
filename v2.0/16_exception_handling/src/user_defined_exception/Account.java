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
	// �Ա�
	public void deposit(int money) {
		balance += money;
	} 
	// ���
	public void withdraw(int money) throws Exception, AccountException {
		if(money < 0) {
			throw new Exception("���� �Ұ�");
		}
		
		if(balance >= money) {
			balance -= money;
		}
		else {
			throw new AccountException("�ܰ� ����");
			// ���������� ���� ���� (throw new ���� Ŭ����())
		}
	} 
	
	
}
