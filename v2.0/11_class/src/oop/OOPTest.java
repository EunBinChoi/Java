package oop;

public class OOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 객체지향 프로그래밍 (Object-Oriented Programming) 
		 * 
		 * 클래스: 데이터 (필드, 멤버변수) + 함수 (메서드)
		 * ex) 자동차 공장
		 * 클래스: 자동차 설계도
		 * 객체: 자동차 (실제 행동하고 실존하는 단위)
		 * 
		 * 객체지향 3대 특징
		 * 1) 캡슐화 (encapsulation, 정보 은닉) 
		 * + setter (반환형 void), getter (반환형 존재)
		 * set필드이름, get필드이름 (*필드이름의 첫문자는 대문자)
		 * 
		 * 
		 * 	- 접근 제어자
		 *  a. public: 모든 클래스 접근 가능
		 *  b. protected: 상속 관계 접근 가능
		 *  c. private: 동일 클래스에서만 접근 가능
		 *  
		 * 2) 상속 (inheritance)
		 * 3) 다형성 (polymorphism)
		 * */
		
		// 클래스도 하나의 데이터 타입
		Person p1 = new Person(); // 객체 만듦
//		p1.name = "홍길동";
//		p1.age = -1;
//		p1.age = -100;
		
		p1.setName("홍길동");
//		System.out.println(p1.age);
		p1.setAge(-1);
//		System.out.println(p1.age);
		System.out.println(p1.getAge());
		
		// addAge 함수를 통해 3년 후의 홍길동 나이는?
		p1.addAge(3);
		p1.changeName("홍길길");
		
//		p1.email = "qwer@gmail.com";
		p1.setEmail("qwer@gmail.com");
		p1.changeEmail("qwert@gmail.com");
		
		System.out.println(p1); // 참조 변수
		
		Person p2 = new Person();
//		p2.name = "홍길순";
		p2.setName("홍길순");
		
		Person manager = new Person();
		Person employee = new Person();
		
		// 1) manger, employee 이름, 나이, 직책을 설정하시오.
		manager.setName("김매니저");
		manager.setAge(35);
		manager.setPosition("manager");
		
		employee.setName("박파트타임");
		employee.setAge(20);
		employee.setPosition("part-time");
		
		// 2)
		int age = employee.getAge();
		System.out.println(age); // 20
		
//		System.out.println(employee.getAge());
		employee.setAge(-100); 
		// setAge() 함수 내에서 유효성 검사에서 탈락! (-100은 양수가 아니기 때문)
		
		age = employee.getAge();
		System.out.println(age); // 20
		
		// 3)
		Person employee2 = new Person();
		employee2.setName("박파트타임");
		
		System.out.println(employee == employee2); // false
		// 주소값 비교 (new를 통해 새로운 주소 할당 -> false)
		
		// 이름이 동일한지 확인
		System.out.println(employee.getName().equals(employee2.getName()));
		
		// 4) manager의 성별, 이메일을 설정, 확인
		manager.setGender("male");
		manager.setEmail("abc@naver.com");
		
		String gender = manager.getGender();
		System.out.println(gender);
		
		String email = manager.getEmail();
		System.out.println(email);
		
		// 5) employee의 성별, 이메일을 설정, 확인
		employee.setGender("female");
		employee.setEmail("aaa@naver.com");
		
		gender = employee.getGender();
		System.out.println(gender);
		
		email = employee.getEmail();
		System.out.println(email);
		
		// 6) 성별 (male, female)이 아닌 다른 성별이 들어올 경우 에러 출력
		employee.setGender("fem");
		gender = employee.getGender(); // female
		System.out.println(gender);
		
		// 7) 이메일에 @가 없는 이상한 이메일이 들어올 경우 에러 출력
		employee.setEmail("qwe");
		email = employee.getEmail();
		System.out.println(email);
		
	}
}
