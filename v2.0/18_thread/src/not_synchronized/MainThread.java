package not_synchronized;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 공유객체
		// : 각 스레드들이 동시 접근할 수 없도록 잠금 대상 (synchronized)
		GameID gameID = new GameID();
		gameID.setId("a"); // 기존 id: "a"
		
		User1 user1 = new User1();
		user1.setGameID(gameID); 
		user1.start(); // run(): "a" -> "a1234"
		
		User2 user2 = new User2();
		user2.setGameID(gameID);
		user2.start(); // run(): "a" -> "a2345"
		
		System.out.println(gameID.getId());
	}

}
