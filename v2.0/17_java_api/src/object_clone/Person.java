package object_clone;

import java.util.Arrays;

public class Person implements Cloneable {
	// 클래스의 복제를 허용한다는 의미 (의도적인 표시)
	// Object 클래스의 clone() 사용할 수 있음
	// 만약 Cloneable 인터페이스를 구현하지 않은 클래스를 clone()하면
	// CloneNotSupportedException 발생!
	
	private String name;
	private int age;
	private String gender;
	private int[] scores; // 필드에 참조변수 정의했을 때 객체 clone은 어떻게 되는지? 
	// 국어, 수학, 영어 성적
	
	public Person(String name, int age, String gender, int[] scores) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.scores = scores;
	}
	
	public Person(String name, int age, String gender) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// 객체 복제본을 반환하는 함수
	// ex) pCopy = p.getCloned()
	public Person getCloned() {
		Person cloned = null;
		try {
			cloned = (Person)clone(); 
			// Object 클래스의 clone()
			// 기본적으로 얕은 복제 (참조형 변수가 필드로 있는 경우에 주소 복사)
//			pCopy.name = p.name (String)
//			pCopy.age = p.age (int)
//			pCopy.gender = p.gender (String)
//			pCopy.scores = p.scores (int[], scores 주소값)
					
			// CloneNotSupportedException
			// => Cloneable 인터페이스가 
			// implements 되어있지 않은 클래스에서 clone() 함수 호출
		} catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return cloned;
	}
	
	// 만약에 깊은 복제를 하려면 ..?
	// => Object 클래스의 clone() 함수 재정의
	@Override
	public Object clone() throws CloneNotSupportedException {
		// 얕은 복제
//		Person cloned = (Person)super.clone();
		Person cloned = new Person(name, age, gender);
//		cloned.scores = this.scores; // 얕은 복제
		
		// 깊은 복제
		cloned.scores = new int[scores.length]; 
		// clone.scores만의 새로운 공간을 만듦
		
		for(int i = 0; i < cloned.scores.length; i++) {
			cloned.scores[i] = scores[i];
			// scores의 데이터만 복사
		}
		////////////////////////////////////////////////
		
		// 깊은 복제
		// 1) 원본 사이즈만큼 배열 공간 할당
		// 2) 새로운 배열 공간에 원본 원소값 복사
		// 3) cloned 객체의 scores가 가리키는 주소값 변경
//		int[] newScore = new int[cloned.scores.length];
//		for(int i = 0; i < newScore.length; i++) {
//			newScore[i] = cloned.scores[i];
//		}
//		cloned.scores = newScore;
		
//		int[] newScore 
//		= Arrays.copyOf(cloned.scores, cloned.scores.length);
//		cloned.scores = newScore;
//		
		return cloned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	// equals
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Person)) return false;
		// 이 부분이 없으면 ClassCastException이 날 수 있음
		
		return (this.name.equals(((Person)o).name) &&
				this.age == ((Person)o).age &&
				this.gender.equals(((Person)o).gender) &&
				this.scores[0] == ((Person)o).scores[0] &&
				this.scores[1] == ((Person)o).scores[1] &&
				this.scores[2] == ((Person)o).scores[2]);
	}
	// toString
	@Override
	public String toString() {
		return String.format("name = %s, age = %d, gender = %s, "
				+ "scores (%d %d %d)", 
				name, age, gender, scores[0], scores[1], scores[2]);
	}
	
}
