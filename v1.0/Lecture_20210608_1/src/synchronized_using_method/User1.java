package synchronized_using_method;

public class User1 extends Thread {
	GameID gameID;
	
	public User1() {
		setName("User1 Thread");
	}
	
	// ���� ��ü�� GameID�� User1 �ʵ忡 ����
	public void setGameID(GameID gameID) {
		this.gameID = gameID;
	}
	
	// User1 Thread �۾� ����
	public void run() {
		// ���� ��ü�� GameID�� �������� 100���� ����
		gameID.setItem(100); 
	}
}
