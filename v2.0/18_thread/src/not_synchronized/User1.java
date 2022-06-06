package not_synchronized;

public class User1 extends Thread {
	private GameID gameID;
	
	public User1() {
		// Thread 클래스에서 받은 함수
		setName("User1 Thread");
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
		gameID.setId("a1234");
	}
}
