package oop;

public class Person {
	// 필드 (데이터 저장 공간)
	// private
	private String name;
	private int age;
	private String regNum; // 주민등록번호
	private String gender; // 성별
	private String email;
	private String position; // 직책
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// 함수 (데이터 기능/동작)
	// public
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age > 0) { // 데이터 유효성 검사
			this.age = age;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터입니다.");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터입니다.");
		}
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
//		boolean checker = false; 
//		for(int i = 0; i < email.length(); i++) {
//			if(email.charAt(i) == '@') {
//				checker = true;
//				break;
//			}
//		}
//		if(checker)	this.email = email;
//		else System.out.println("[경고] 유효하지 않은 데이터입니다.");
		
		if(email.indexOf('@') == -1) {
			System.out.println("[경고] 유효하지 않은 데이터입니다.");
		}
		else { // 처음 만난 @의 인덱스값 반환 (abasd@as@@dasd@)
			this.email = email;
		}
	}
	
	public void addAge(int passedYear) {
		this.age += passedYear;
	}
	
	public void changeName(String name){
		this.name = name;
		// 필드 이름과 매개변수 이름이 동일한 경우
		// 필드 이름 앞에 this.으로 구분 가능
	}
	
	public void changeEmail(String email) {
		this.email = email;
	}
}
