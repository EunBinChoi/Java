package generic_wildcard;

import java.util.Arrays;

public class CourseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person> personCourse 
		= new Course<>("�Ϲ��ΰ���", 5);
		
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������")); // ?
		personCourse.add(new Student("�л�")); // ?
		personCourse.add(new HighStudent("���")); // ?
		// Person�� �θ� Ŭ�����̱� ������
		// Worker, Student, HighStudent (�ڽ� Ŭ����)��
		// ��ü�� ���� �� ����
//		Person p1 = new Worker(); // ������
//		Person p2 = new Student(); // ������
//		Person p3 = new HighStudent(); // ������
		
		// �����ΰ��� (5), �л����� (5), ����л����� (5)
		Course<Worker> workerCourse 
		= new Course<>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		//workerCourse.add(new Student("�л�"));
		
		Course<Student> studentCourse 
		= new Course<>("�л�����", 5);
		//studentCourse.add(new Person("�Ϲ���"));
		// �θ�� �ڽĿ��� �� �� ����
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		// Student s1 = new Student(); // ������ 
		// Student s2 = new HighStudent(); // ������
		// Student s3 = new Person(); (x)
		
		// ������ (polymorphism)
		// �Ϲ��� - �л� - ����л�
		
		// Fruit: name (�̸�) (�θ�)
		// Apple extends Fruit: flavor(��), color(����) (�ڽ�)
		
		// Fruit f = new Apple(); (o)
		// Apple a = new Fruit(); (X)
		// a�� ���� �θ� (name)
		// a. (name, flavor, color)
		
		Course<HighStudent> highStudentCourse 
		= new Course<>("�������", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		// ��� ���� ��� ����
		registerCourse(personCourse);
		registerCourse(studentCourse);
		registerCourse(workerCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// �л� (�л�, ����л�) ���� ��� ����
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		// ������ ���� ����� ���� 
		registerCourseWorker(workerCourse);
		System.out.println();
		
		// ����л� ���� ����� ���� 
		registerCourseHStudent(highStudentCourse);
		System.out.println();
		
		// ���� �Ϲ��� ����, ������ ���� ����� ������  
		// registerCourseWorker2 �Լ��� �����Ϸ��� ?
		registerCourseWorker2(personCourse);
		registerCourseWorker2(workerCourse);
		
	}
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getCourseName()
				+ " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent
	(Course<? extends Student> course) {
		System.out.println(course.getCourseName()
				+ " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker
	(Course<? super Worker> course) {
		System.out.println(course.getCourseName()
				+ " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseHStudent
	(Course<? extends HighStudent> course) {
		System.out.println(course.getCourseName()
				+ " ������ : " + 
				Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker2
	(Course<? super Worker> course) {
		System.out.println(course.getCourseName() + " ������: " + Arrays.toString(course.getStudents()));
	}
}
