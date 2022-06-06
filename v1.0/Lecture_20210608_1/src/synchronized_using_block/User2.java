package synchronized_using_block;

public class User2 extends Thread {
	GameID gameID;
	
	public User2() {
		setName("User2 Thread");
	}
	
	// ���� ��ü�� GameID�� User2 �ʵ忡 ����
	public void setGameID(GameID gameID) {
		this.gameID = gameID;
	}
	
	// User2 Thread �۾� ����
	public void run() {
		// ���� ��ü�� GameID�� �������� 50���� ����
		gameID.setItem(50); 
	}
}
