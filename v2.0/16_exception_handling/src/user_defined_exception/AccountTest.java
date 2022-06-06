package user_defined_exception;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(5000);
		
		try {
			ac.withdraw(-1);
		} catch(AccountException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
