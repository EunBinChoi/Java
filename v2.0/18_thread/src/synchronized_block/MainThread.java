package synchronized_block;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ü
		// : �� ��������� ���� ������ �� ������ ��� ��� (synchronized)
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
