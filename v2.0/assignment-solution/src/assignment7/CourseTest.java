package assignment7;

import java.util.Arrays;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person>  c1 = new Course<>("구트 아카데미 소개 (일반인)", 5);
		Course<Student> c2 = new Course<>("즐거운 코딩 수업  (학생)", 5);
		Course<Worker>  c3 = new Course<>("실무에서의 코딩   (직장인)", 5);
		Course<HighStudent> c4 = new Course<>("스크래치로 코딩 배우기 (고등학생)", 5);
		Course<UnivStudent> c5 = new Course<>("자바 프로그래밍   (대학생)", 5);
		Course<Animal> c6 = new Course<>("반려동물 사회성 기르기  (반려동물)", 5);

		// Q1 ~ Q3의 문제는 다음과 같은 원리로 해결하면 됩니다.
		// 해당 문제는 Course 클래스의 객체들이 어떤 제너릭 타입을 가지고 있는 지에 따라
		// Course 클래스의 registerStudents 배열의 원소가 될 수 있는지 확인하는 문제입니다.

		// 따라서 Course 클래스의 객체의 타입이 결정되면
		// 해당 객체 타입 이하의 객체들만 registerStudents 배열의 원소가 될 수 있습니다.

		// 예를 들어, c1의 경우 Person 타입으로 객체가 생성되어 registerStudents 타입이 Person[]이 되고
		// 따라서 registerStudents 배열에 원소로 들어올 수 있는 객체는 Person와 Person 이하 자식들이 원소로 들어올 수 있습니다.
		// (부모 객체 변수에 자식들이 들어가 살 수 있으므로)

		// 이러한 원리로 각 수업에 수강할 수 있는 수강생은 다음과 같습니다.
		// c1: Person 이하 자식들 (Person 포함)이 수강할 수 있음 (Person, Student, Worker, HighStudent, UnivStudent)
		// c2: Student 이하 자식들 (Student 포함)이 수강할 수 있음 (Student, HighStudent, UnivStudent)
		// c3: Worker 이하 자식들 (Worker 포함)이 수강할 수 있음 (Worker)
		// c4: HighStudent 이하 자식들 (HighStudent 포함)이 수강할 수 있음 (HighStudent)
		// c5: UnivStudent 이하 자식들 (UnivStudent 포함)이 수강할 수 있음 (UnivStudent)
		// c6: Animal 이하 자식들 (Animal 포함)이 수강할 수 있음 (Animal)

		////////////////////////////////////////////////////////////
		// Course 클래스의 필드
		// private String courName; // 과목명
		// private T[] registerStudents; // 해당 과목을 수강하고 있는 학생
		////////////////////////////////////////////////////////////


		// Q1. s1이 들을 수 있는 수업은?
		Student s1 = new Student();
		c1.add(s1); // 해당 수업은 일반인이면 수강할 수 있으므로 학생인 s1은 들을 수 있음
		c2.add(s1); // 해당 수업은 학생이면 수강할 수 있으므로 학생인 s1은 들을 수 있음
//		c3.add(s1); // 해당 수업은 직장인만 수강할 수 있으므로 학생인 s1은 들을 수 없음
//		c4.add(s1); // 해당 수업은 고등학생만 수강할 수 있으므로 학생인 s1은 들을 수 없음
//		c5.add(s1); // 해당 수업은 대학생만 수강할 수 있으므로 학생인 s1은 들을 수 없음
//		c6.add(s1); // 해당 수업은 반려동물만 수강할 수 있으므로 학생인 s1은 들을 수 없음


		// Q2. s2가 들을 수 있는 수업은?
		UnivStudent s2 = new UnivStudent();
		c1.add(s2); // 해당 수업은 일반인이면 수강할 수 있으므로 대학생인 s2은 들을 수 있음
		c2.add(s2); // 해당 수업은 학생이면 수강할 수 있으므로 대학생인 s2은 들을 수 있음
//		c3.add(s2); // 해당 수업은 직장인만 수강할 수 있으므로 대학생인 s2은 들을 수 없음
//		c4.add(s2); // 해당 수업은 고등학생만 수강할 수 있으므로 대학생인 s2은 들을 수 없음
		c5.add(s2); // 해당 수업은 대학생이면 수강할 수 있으므로 대학생인 s2은 들을 수 있음
//		c6.add(s2); // 해당 수업은 반려동물만 수강할 수 있으므로 대학생인 s2은 들을 수 없음


		// Q3. s3가 들을 수 있는 수업은?
		Worker s3 = new Worker();
		c1.add(s3); // 해당 수업은 일반인이면 수강할 수 있으므로 직장인인 s3은 들을 수 있음
//		c2.add(s3); // 해당 수업은 학생만 수강할 수 있으므로 직장인인 s3은 들을 수 없음
		c3.add(s3); // 해당 수업은 직장인이면 수강할 수 있으므로 직장인인 s3은 들을 수 있음
//		c4.add(s3); // 해당 수업은 고등학생만 수강할 수 있으므로 직장인인 s3은 들을 수 없음
//		c5.add(s3); // 해당 수업은 대학생만 수강할 수 있으므로 직장인인 s3은 들을 수 없음
//		c6.add(s3); // 해당 수업은 반려동물만 수강할 수 있으므로 직장인인 s3은 들을 수 없음



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
		// toString() 함수가 정의되어 있어서 주소값이 나오지 않고 내용물이 출력된다.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println();
		System.out.println();
		System.out.println();



		//////////////////////////////////////////////////////////////////////////
		// 수강생 초기화하기 위해 수강 과목 객체 재생성
		/////////////////////////////////////////////////////////////////////////
		System.out.println("============================== add and withdraw test ==============================");
		c1 = new Course<Person>("구트 아카데미 소개 (일반인)", 5);
		c2 = new Course<Student>("즐거운 코딩 수업  (학생)", 5);
		c3 = new Course<Worker>("실무에서의 코딩   (직장인)", 5);
		c4 = new Course<HighStudent>("스크래치로 코딩 배우기 (고등학생)", 5);
		c5 = new Course<UnivStudent>("자바 프로그래밍   (대학생)", 5);
		c6 = new Course<Animal>("반려동물 사회성 기르기  (반려동물)", 5);

		Person person1  = new Person("일반인1");
		Student student1  = new Student("학생1", "20211111", "90");
		HighStudent highStudent1  = new HighStudent("고등학생1", "20212222", "80");
		UnivStudent univStudent1  = new UnivStudent("대학생1", "20213333", "95");
		Worker worker1  = new Worker("직장인1", "20214444", "개발팀", "대리");
		c1.add(person1);
		c1.add(student1);
		c1.add(highStudent1);
		c1.add(univStudent1);
		c1.add(worker1);
		System.out.println(c1);

		Student student2 = new Student("학생2", "20215555", "50");
		HighStudent highStudent2 = new HighStudent("고등학생2", "20216666", "60");
		UnivStudent univStudent2 = new UnivStudent("대학생2", "20217777", "70");
		c2.add(student2);
		c2.add(highStudent2);
		c2.add(univStudent2);
		System.out.println(c2);

		Worker worker3 = new Worker("직장인3", "20218888", "영업팀", "사원");
		c3.add(worker3);
		System.out.println(c3);

		HighStudent highStudent4 = new HighStudent("고등학생4", "20219999", "65");
		c4.add(highStudent4);
		System.out.println(c4);

		UnivStudent univStudent5 = new UnivStudent("대학생5", "20201111", "78");
		c5.add(univStudent5);
		System.out.println(c5);

		Animal animal6 = new Animal("반려동물6");
		c6.add(animal6);
		System.out.println(c6);

		// Q6. Course 클래스에 다음과 같은 함수를 추가하고자 한다.
		// 1) 과목을 선택한 학생이 과목을 철회하는 함수
		// withdraw (인자나 반환값은 생각해보세요!)
		System.out.println();
		c1.withdraw(person1); // withdraw person1 in the students list
		System.out.println(c1);
		c1.withdraw(person1); // withdraw person1 in the students list (철회 불가능! 이미 철회한 학생이여서 과목 수강생 목록에 해당 학생이 없습니다라는 오류 발생!)

		c1.add(person1); // add person1 at the index which has null
		System.out.println(c1);
		System.out.println("===================================================================================");
		System.out.println();
		System.out.println();


//		Q7. CourseTest 클래스에 static 메소드로 다음과 같은 함수를 아래와 같이 작성하고 테스트 코드를 작성해보자.
//
//		1) 모든 과목을 등록할 수 있는 함수
//		registerCourse(Course<?> course)
//
//		2) 직장인 과목만 등록할 수 있는 함수
//		registerWorkerCourse(Course<? extends Worker>)
//	
//		3) 학생 과목만 등록할 수 있는 함수
//		registerStudentCourse(Course<? extends Student>)

//		c1 = new Course<Person>("구트 아카데미 소개 (일반인)", 5);
//		c2 = new Course<Student>("즐거운 코딩 수업  (학생)", 5);
//		c3 = new Course<Worker>("실무에서의 코딩   (직장인)", 5);
//		c4 = new Course<HighStudent>("스크래치로 코딩 배우기 (고등학생)", 5);
//		c5 = new Course<UnivStudent>("자바 프로그래밍   (대학생)", 5);
//		c6 = new Course<Animal>("반려동물 사회성 기르기  (반려동물)", 5);

		// registerCourse 함수로 모든 강의를 등록할 수 있음
		System.out.println("[registerCourse() Test]");
		registerCourse(c1);
		registerCourse(c2);
		registerCourse(c3);
		registerCourse(c4);
		registerCourse(c5);
		registerCourse(c6);
		System.out.println();

		// registerStudentCourse 함수는 Student 이하 객체들이 수강할 수 있는 학생 대상 강의를 등록할 수 있음
		System.out.println("[registerStudentCourse() Test]");
//		registerStudentCourse(c1); // c1은 일반인이라면 수강 가능한 수강과목이기 때문에 registerStudentCourse() 함수로는 과목을 등록할 수 없음
		registerStudentCourse(c2); // c2은 학생이라면 수강 가능한 수강과목이기 때문에 registerStudentCourse() 함수로 과목을 등록할 수 있음
//		registerStudentCourse(c3); // c3은 직장인이라면 수강 가능한 수강과목이기 때문에 registerStudentCourse() 함수로는 과목을 등록할 수 없음
		registerStudentCourse(c4); // c4은 고등학생이라면 수강 가능한 수강과목이기 때문에 registerStudentCourse() 함수로 과목을 등록할 수 있음
		registerStudentCourse(c5); // c5은 대학생라면 수강 가능한 수강과목이기 때문에 registerStudentCourse() 함수로 과목을 등록할 수 있음
//		registerStudentCourse(c6); // c6은 반려동물이라면 수강 가능한 수강과목이기 때문에 registerStudentCourse() 함수로는 과목을 등록할 수 없음
		System.out.println();

		// registerWorkerCourse 함수는 Worker 이하 객체들이 수강할 수 있는 직장인 대상 강의를 등록할 수 있음
		System.out.println("[registerWorkerCourse() Test]");
//		registerWorkerCourse(c1); // c1은 일반인이라면 수강 가능한 수강과목이기 때문에 registerWorkerCourse() 함수로는 과목을 등록할 수 없음
//		registerWorkerCourse(c2); // c2은 학생이라면 수강 가능한 수강과목이기 때문에 registerWorkerCourse() 함수로는 과목을 등록할 수 없음
		registerWorkerCourse(c3); // c3은 직장인이라면 수강 가능한 수강과목이기 때문에 registerWorkerCourse() 함수로 과목을 등록할 수 있음
//		registerWorkerCourse(c4); // c4은 고등학생이라면 수강 가능한 수강과목이기 때문에 registerWorkerCourse() 함수로는 과목을 등록할 수 없음
//		registerWorkerCourse(c5); // c5은 대학생라면 수강 가능한 수강과목이기 때문에 registerWorkerCourse() 함수로는 과목을 등록할 수 없음
//		registerWorkerCourse(c6); // c6은 반려동물이라면 수강 가능한 수강과목이기 때문에 registerWorkerCourse() 함수로는 과목을 등록할 수 없음
		System.out.println();


//		Q8. Course 클래스에 일반 메소드 (static 아님)로 다음과 같은 함수를 추가하고자 한다.
//
//		1) 해당 과목을 열었던 교수자가 과목을 수강하는 학생들의 학번으로 학생을 검색하는 함수를 만들고 해당 함수를 호출해보자.
//		searchStudentCourseByNo(String studentNo)

		System.out.println("[searchStudentCourseByNo(String studentNo) Test]");

		String searchStudentNo = "20211111";
		Student searchStudent = c1.searchStudentCourseByNo(searchStudentNo);
		if(searchStudent == null) {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 학번으로 학생을 검색할 수 없습니다.\n",
					c1.getCourName(), searchStudentNo);
		}
		else {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 학번으로 학생을 검색한 학생의 정보는 다음과 같습니다.\n",
					c1.getCourName(), searchStudentNo);
			System.out.println(searchStudent);
		}

		searchStudentNo = "20212222";
		searchStudent = c3.searchStudentCourseByNo(searchStudentNo);
		if(searchStudent == null) {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 학번으로 학생을 검색할 수 없습니다.\n",
					 c3.getCourName(), searchStudentNo);
		}
		else {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 학번으로 학생을 검색한 학생의 정보는 다음과 같습니다.\n",
					c3.getCourName(), searchStudentNo);
			System.out.println(searchStudent);
		}
		System.out.println();

//		2) 해당 과목을 열었던 교수자가 과목을 수강하는 직장인들의 부서로 직장인을 검색하는 함수를 만들고 해당 함수를 호출해보자.
//		searchWorkerCourseByDepart(String department)


		System.out.println("[searchWorkerCourseByDepart(String department) Test]");

		String searchDepart = "인사팀";
		Worker searchWorker = c1.searchWorkerCourseByDepart(searchDepart);
		if(searchWorker == null) {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 부서로 학생을 검색할 수 없습니다.\n",
					c1.getCourName(), searchDepart);
		}
		else {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 부서로 학생을 검색한 학생의 정보는 다음과 같습니다.\n",
					c1.getCourName(), searchDepart);
			System.out.println(searchWorker);
		}

		searchDepart = "영업팀";
		searchWorker = c3.searchWorkerCourseByDepart(searchDepart);
		if(searchWorker == null) {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 부서로 학생을 검색할 수 없습니다.\n",
					c3.getCourName(), searchDepart);
		}
		else {
			System.out.printf("%s 과목을 수강하고 있는 학생 중 %s 부서로 학생을 검색한 학생의 정보는 다음과 같습니다.\n",
					c3.getCourName(), searchDepart);
			System.out.println(searchWorker);
		}


	}
	public static void registerCourse(Course<?> course) {
		System.out.println("수업 이름: " + course.getCourName());
		System.out.println("수강생 목록: " + Arrays.toString(course.getRegisterStudents()));
	}

	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("수업 이름: " + course.getCourName());
		System.out.println("수강생 목록: " + Arrays.toString(course.getRegisterStudents()));
	}

	public static void registerWorkerCourse(Course<? extends Worker> course) {
		System.out.println("수업 이름: " + course.getCourName());
		System.out.println("수강생 목록: " + Arrays.toString(course.getRegisterStudents()));
	}
	

}
