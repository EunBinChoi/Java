package synchronized_block;

public class User2 extends Thread {
	GameID gameID;
	
	public User2() {
		// Thread Ŭ�������� ���� �Լ�
		setName("User2 Thread");
	}
	
	public void login() {
		System.out.println("User2 log in");
	}
	
	public GameID getGameID() {
		return gameID;
	}

	public void setGameID(GameID gameID) {
		this.gameID = gameID;
	}

	@Override
	public void run() {
		//login();
		gameID.setId("a2345");
	}
}
