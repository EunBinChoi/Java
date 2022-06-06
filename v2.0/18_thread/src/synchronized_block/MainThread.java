package synchronized_block;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 공유객체
		// : 각 스레드들이 동시 접근할 수 없도록 잠금 대상 (synchronized)
		GameID gameID = new GameID();
		gameID.setId("a");
		
		User1 user1 = new User1();
		user1.setGameID(gameID);
		user1.start();
		
		User2 user2 = new User2();
		user2.setGameID(gameID);
		user2.start();
		
		System.out.println(gameID.getId());
	}

}
