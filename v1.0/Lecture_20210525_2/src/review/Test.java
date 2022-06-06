package review;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[Person Test]");
		Person personTest1 = new Person("홍길동", "101234-1000000");
		System.out.println(personTest1);
		
		Person personTest2 = new Person("홍길순", "001234-2000000");
		System.out.println(personTest2);		
		System.out.println(personTest1.equals(personTest2));
		System.out.println();
		
		System.out.println("[Parent Test]");
		Parent parentTest1 = new Parent
				("박금자", "731111-2000000", "재무관리사", 50000);
		parentTest1.setMarried(true);
		parentTest1.setWeddingDate("2010-07-01");
		Parent parentTest2 = new Parent
				("이순신", "701111-1000000", "개발자", 50000);
		parentTest2.setMarried(true);
		parentTest2.setWeddingDate("2010-07-01");
		System.out.println(parentTest1);
		System.out.println(parentTest2);
		System.out.println();
		
		System.out.println("[Child Test]");
		Child childTest1 = new Child
				("이초롱", "111111-2000000");
		childTest1.setStudent(true);
		childTest1.setSchoolName("가산 초등");
		childTest1.setGrade(2);
		
		System.out.println(childTest1);
	}

}
