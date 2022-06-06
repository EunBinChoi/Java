package object_clone;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p 
		= new Person("È«±æµ¿", 30, "³²¼º", new int[]{70, 85, 60});
		// int[] scores = new int[]{70, 85, 60};
		
		Person pCopy = p.getCloned();
		boolean isThinCopy = (p.getScores() == pCopy.getScores());
		System.out.println(isThinCopy);
		
		pCopy.getScores()[0] = 90;
		System.out.println(p);
		System.out.println(pCopy);
	}

}
