package assignment7;
import java.util.Arrays;

public class CourseTest {

	public static void main(String[] args) {

		Course<Person>  c1 = new Course<>("구트 아카데미 소개 (일반인)", 5);
		Course<Student> c2 = new Course<>("즐거운 코딩 수업  (학생)", 5);
		Course<Worker>  c3 = new Course<>("실무에서의 코딩   (직장인)", 5);
		Course<HighStudent> c4 = new Course<>("스크래치로 코딩 배우기 (고등학생)", 5);
		Course<UnivStudent> c5 = new Course<>("자바 프로그래밍   (대학생)", 5);

		// Q1. s1이 들을 수 있는 수업은?
//		Student s1 = new Student(); // c1, c2
//		c1.add(s1);
////	c2.add(s1);
//
//		// Q2. s2가 들을 수 있는 수업은?
//		UnivStudent s2 = new UnivStudent(); // c1, c2, c5
//		c1.add(s2);
////		c2.add(s2);
//		c5.add(s2);
//
//		// Q3. s3가 들을 수 있는 수업은?
		Worker s3 = new Worker(); // c1, c3
//		c1.add(s3);
		c3.add(s3);
//
//		// Q4. Person, Student, UnivStudent, HighStudent, Worker 클래스를 완성하시오.
//
//		// Q5. 아래의 코드를 실행해보고 왜 주소값이 나오지 않는지 생각해보.
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);
//		// Course 클래스에서 toString을 정의했기 때문이다.
//
//		// Q6. Course 클래스에 다음과 같은 함수를 추가하고자 한다.
//		// 1) 과목을 선택한 학생이 과목을 철회하는 함수
//		// withdraw() (인자나 반환값은 생각해보세요!)
//		c1.withdraw(s3);
//		
		Worker s4 = new Worker(1234, "인사팀", "대리");
		Worker ss4 = new Worker(1235, "개발팀", "대리");
		c3.add(s4);
		c3.add(ss4);
		System.out.println(c3);

		c3.withdraw(s4);
		System.out.println(c3);

		// Q7. CourseTest 클래스에 static 메소드로 다음과 같은 함수를 추가하고자 한다.
//		registerCourse(c1);

		Student s5 = new Student("1234");
		HighStudent s6 = new HighStudent("5678");
		UnivStudent s7 = new UnivStudent("0246");

		c2.add(s5);
		c2.add(s6);
		c2.add(s7);
		
		
		c3.searchStudentCourseByNo("1234");
		System.out.println();
		
		c3.searchWorkerCourseByDepart("개발팀");
		System.out.println();
		
		registerStudentCourse(c2);
		registerCourse(c1);
	}
	
	public static void registerCourse(Course<?> course) {
		System.out.println("수업 이름: " + course.getCourseName());
		System.out.println("수강생 목록: " + Arrays.toString(course.getRegisterStudents()));
	}
	
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("수업 이름: " + course.getCourseName());
		System.out.println("수강생 목록: " + Arrays.toString(course.getRegisterStudents()));
	}
	
	public static void registerWorkerCourse(Course<? extends Worker> course) {
		System.out.println("수업 이름: " + course.getCourseName());
		System.out.println("수강생 목록: " + Arrays.toString(course.getRegisterStudents()));
	}


}
