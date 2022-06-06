package generic_wildcard;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person>  c1 = new Course<>("구트 아카데미 소개 (일반인)", 5);
		Course<Student> c2 = new Course<>("즐거운 코딩 수업  (학생)", 5);
		Course<Worker>  c3 = new Course<>("실무에서의 코딩   (직장인)", 5);
		Course<HighStudent> c4 = new Course<>("스크래치로 코딩 배우기 (고등학생)", 5);
		Course<UnivStudent> c5 = new Course<>("자바 프로그래밍   (대학생)", 5);
		Course<Animal> c6 = new Course<>("반려동물 사회성 기르기  (반려동물)", 5);
	
		
		// Q1. s1이 들을 수 있는 수업은?
		Student s1 = new Student();
		c1.add(s1);
		c2.add(s1);

		
		
		// Q2. s2가 들을 수 있는 수업은?
		UnivStudent s2 = new UnivStudent();
		
		// Q3. s3가 들을 수 있는 수업은?
		Worker s3 = new Worker();
		
		// Q4. Person, Student, UnivStudent, HighStudent, Worker 클래스를
		// 다음과 같이 완성하시오.
		/* Person
		 * - 필드: name
		 * - 메소드: 생성자, getter, setter, toString, equals
		 * 
		 * Student
		 * - 필드: studentNo (학번), grade (학년)
		 * - 메소드: 생성자, getter, setter, toString, equals
		 * 
		 * UnivStudent
		 * - 필드: 
		 * - 메소드: 생성자, getter, setter, toString, equals
		 * 
		 * HighStudent
		 * - 필드:
		 * - 메소드: 생성자, getter, setter, toString, equals
		 * 
		 * Worker
		 * - 필드: workerNo (사원번호), department (부서), position (직책)
		 * - 메소드: 생성자, getter, setter, toString, equals
		 * */
		
		// Q5. 아래의 코드를 실행해보고 왜 주소값이 나오지 않는지 생각해보자.
//		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		// Q6. Course 클래스에 다음과 같은 함수를 추가하고자 한다.
		// 1) 과목을 선택한 학생이 과목을 철회하는 함수
		// withdraw (인자나 반환값은 생각해보세요!)
		
		// Q7. CourseTest 클래스에 static 메소드로 다음과 같은 함수를 추가하고자 한다.
		// 1) 해당 과목을 열었던 교수자가 과목을 최종적으로 등록하는 함수
		// registerCourse (해당 수업을 최종적으로 선택한 학생들을 출력)
		
		// 2) 해당 과목을 열었던 교수자가 과목을 수강하는 학생들의 학번으로 학생을 검색하는 함수
		// searchStudentCourseByNo
		
		// 3) 해당 과목을 열었던 교수자가 과목을 수강하는 직장인들의 부서로 직장인을 검색하는 함수
		// searchWorkerCourseByDepart
		
		// <? extends Person>, <? super Person>
		
		registerCourse(c5); // (Course<? extends Person> course)
//		registerCourse(c6); // 오류
	}
	public static void registerCourse(Course<? extends Person> course) {
		for(int i = 0; i < course.getRegisterStudents().length; i++) {
			if(course.getRegisterStudents()[i] != null) {
				System.out.println(course.getRegisterStudents()[i]);
			}
		}
	}
	
	public static Student[] searchStudentCourseByNo(Course<? extends Student> course, String studentNo){
		
		int count = 0;
		for(int i = 0; i < course.getRegisterStudents().length; i++) {
			Student targetStudent = course.getRegisterStudents()[i];
			if(targetStudent != null) {
				if(targetStudent.getStudentNo().equals(studentNo)) count++;
			}
		}
		Student[] searchStudent = new Student[count];
		
		for(int i = 0; i < course.getRegisterStudents().length; i++) {
			Student targetStudent = course.getRegisterStudents()[i];
			if(targetStudent != null) {
				if(targetStudent.getStudentNo().equals(studentNo)) {
					searchStudent[i] = targetStudent;
				}
			}
		}
		return searchStudent;
	}
	

}
