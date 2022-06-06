package object_stream;

import java.io.Serializable;

public class Student implements Serializable { // 직렬화 허용
	
	// 직렬화할 때 static 변수는 제외
	private static final long serialVersionUID = -3889886865408882909L;

	/*
	 * serialVersionUID 필드: 클래스의 식별자
	 * 
	 * 직렬화했던 클래스 UID 필드값 == 역직렬화할 클래스 UID 필드값
	 * (두 값이 동일해야 직렬화한 객체를 역직렬화할 수 있음!)
	 * 
	 * 같은 클래스는 UID 값이 동일 (UID 값은 명시적으로 지정)
	 */
	
	
	public enum Gender { MALE, FEMALE; }
	public enum Grade { JUNIOR, SENIOR; }
	
	private String name;
	private Gender gender;
	private Grade grade;
	
	public Student(String name, Gender gender, Grade grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", grade=" + grade + "]";
	}

}
