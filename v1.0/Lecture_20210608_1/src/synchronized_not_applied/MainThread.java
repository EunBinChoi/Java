package synchronized_not_applied;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameID gameID = new GameID(); // ���� ��ü
		User1 user1 = new User1();
		user1.setGameID(gameID);
		user1.start();
		
		User2 user2 = new User2(); 
		user2.setGameID(gameID);
		user2.start();
	}

}
