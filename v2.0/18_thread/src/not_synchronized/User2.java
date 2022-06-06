package not_synchronized;

public class User2 extends Thread {
	private GameID gameID;
	
	public User2() {
		// Thread Ŭ�������� ���� �Լ�
		setName("User2 Thread");
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
