package synchronized_block;

public class User2 extends Thread {
	GameID gameID;
	
	public User2() {
		// Thread 클래스에서 받은 함수
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
