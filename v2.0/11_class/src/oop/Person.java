package oop;

public class Person {
	// �ʵ� (������ ���� ����)
	// private
	private String name;
	private int age;
	private String regNum; // �ֹε�Ϲ�ȣ
	private String gender; // ����
	private String email;
	private String position; // ��å
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// �Լ� (������ ���/����)
	// public
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age > 0) { // ������ ��ȿ�� �˻�
			this.age = age;
		}
		else {
			System.out.println("[���] ��ȿ���� ���� �������Դϴ�.");
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
			System.out.println("[���] ��ȿ���� ���� �������Դϴ�.");
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
//		else System.out.println("[���] ��ȿ���� ���� �������Դϴ�.");
		
		if(email.indexOf('@') == -1) {
			System.out.println("[���] ��ȿ���� ���� �������Դϴ�.");
		}
		else { // ó�� ���� @�� �ε����� ��ȯ (abasd@as@@dasd@)
			this.email = email;
		}
	}
	
	public void addAge(int passedYear) {
		this.age += passedYear;
	}
	
	public void changeName(String name){
		this.name = name;
		// �ʵ� �̸��� �Ű����� �̸��� ������ ���
		// �ʵ� �̸� �տ� this.���� ���� ����
	}
	
	public void changeEmail(String email) {
		this.email = email;
	}
}
