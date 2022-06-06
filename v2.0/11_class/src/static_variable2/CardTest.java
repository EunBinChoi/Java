package static_variable2;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Card.getCount());
		System.out.println(Card.getWidth());
		System.out.println(Card.getHeight());
		Card c1 = new Card("Heart", "K");
		Card c2 = new Card("Heart", "K");
		Card c3 = new Card(); // 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Card.getCount());
		System.out.println(c1.equals(c2));
		
	}

}
