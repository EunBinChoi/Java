package student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int: 0
		 * String: null
		 * char: null
		 * boolean: false
		 * 
		 * */
		
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2 = new Student(1234, "������", 1, "CS");
		s2.setName("������");
		s2.setGrade(2);
		
		System.out.println(s2);
		
		System.out.println("��ü �� : " + s1.getCount());
		System.out.println("��ü �� : " + s2.getCount());
	
	}

}
