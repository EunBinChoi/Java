
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Card.getHeight());
		System.out.println(Card.getWidth());
		//System.out.println(Card.getCount());
		
		Card c1 = new Card("�����̵�", 10);
		System.out.println(c1.getCount());
		Card c2 = new Card("��Ʈ", 7);
		System.out.println(c2.getCount());
		System.out.println(Card.getHeight());
		System.out.println(Card.getWidth());
		System.out.println(c1);
		System.out.println(c2);

	}

}
