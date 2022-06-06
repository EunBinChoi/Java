package not_synchronized;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ü
		// : �� ��������� ���� ������ �� ������ ��� ��� (synchronized)
		GameID gameID = new GameID();
		gameID.setId("a"); // ���� id: "a"
		
		User1 user1 = new User1();
		user1.setGameID(gameID); 
		user1.start(); // run(): "a" -> "a1234"
		
		User2 user2 = new User2();
		user2.setGameID(gameID);
		user2.start(); // run(): "a" -> "a2345"
		
		System.out.println(gameID.getId());
	}

}
