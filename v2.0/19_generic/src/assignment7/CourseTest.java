package assignment7;
import java.util.Arrays;

public class CourseTest {

	public static void main(String[] args) {

		Course<Person>  c1 = new Course<>("��Ʈ ��ī���� �Ұ� (�Ϲ���)", 5);
		Course<Student> c2 = new Course<>("��ſ� �ڵ� ����  (�л�)", 5);
		Course<Worker>  c3 = new Course<>("�ǹ������� �ڵ�   (������)", 5);
		Course<HighStudent> c4 = new Course<>("��ũ��ġ�� �ڵ� ���� (����л�)", 5);
		Course<UnivStudent> c5 = new Course<>("�ڹ� ���α׷���   (���л�)", 5);

		// Q1. s1�� ���� �� �ִ� ������?
//		Student s1 = new Student(); // c1, c2
//		c1.add(s1);
////	c2.add(s1);
//
//		// Q2. s2�� ���� �� �ִ� ������?
//		UnivStudent s2 = new UnivStudent(); // c1, c2, c5
//		c1.add(s2);
////		c2.add(s2);
//		c5.add(s2);
//
//		// Q3. s3�� ���� �� �ִ� ������?
		Worker s3 = new Worker(); // c1, c3
//		c1.add(s3);
		c3.add(s3);
//
//		// Q4. Person, Student, UnivStudent, HighStudent, Worker Ŭ������ �ϼ��Ͻÿ�.
//
//		// Q5. �Ʒ��� �ڵ带 �����غ��� �� �ּҰ��� ������ �ʴ��� �����غ�.
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);
//		// Course Ŭ�������� toString�� �����߱� �����̴�.
//
//		// Q6. Course Ŭ������ ������ ���� �Լ��� �߰��ϰ��� �Ѵ�.
//		// 1) ������ ������ �л��� ������ öȸ�ϴ� �Լ�
//		// withdraw() (���ڳ� ��ȯ���� �����غ�����!)
//		c1.withdraw(s3);
//		
		Worker s4 = new Worker(1234, "�λ���", "�븮");
		Worker ss4 = new Worker(1235, "������", "�븮");
		c3.add(s4);
		c3.add(ss4);
		System.out.println(c3);

		c3.withdraw(s4);
		System.out.println(c3);

		// Q7. CourseTest Ŭ������ static �޼ҵ�� ������ ���� �Լ��� �߰��ϰ��� �Ѵ�.
//		registerCourse(c1);

		Student s5 = new Student("1234");
		HighStudent s6 = new HighStudent("5678");
		UnivStudent s7 = new UnivStudent("0246");

		c2.add(s5);
		c2.add(s6);
		c2.add(s7);
		
		
		c3.searchStudentCourseByNo("1234");
		System.out.println();
		
		c3.searchWorkerCourseByDepart("������");
		System.out.println();
		
		registerStudentCourse(c2);
		registerCourse(c1);
	}
	
	public static void registerCourse(Course<?> course) {
		System.out.println("���� �̸�: " + course.getCourseName());
		System.out.println("������ ���: " + Arrays.toString(course.getRegisterStudents()));
	}
	
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("���� �̸�: " + course.getCourseName());
		System.out.println("������ ���: " + Arrays.toString(course.getRegisterStudents()));
	}
	
	public static void registerWorkerCourse(Course<? extends Worker> course) {
		System.out.println("���� �̸�: " + course.getCourseName());
		System.out.println("������ ���: " + Arrays.toString(course.getRegisterStudents()));
	}


}
