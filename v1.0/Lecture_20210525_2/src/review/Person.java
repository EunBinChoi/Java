package review;

import java.util.Calendar;

public class Person {
	protected String regNum;
	protected String name;
	
	// regNum�� ���� Ȯ��
	protected String gender;
	protected int age;
	
	public Person() {}
	public Person(String name, String regNum) {
		this.name = name;
		this.regNum = regNum;
		initGender(this.regNum); 
		initAge(this.regNum);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void initGender(String regNum) {
		if(regNum.charAt(7) == '1' || regNum.charAt(7) == '3') {
			gender = "Male";
		}
		else if(regNum.charAt(7) == '2' || regNum.charAt(7) == '4') {
			gender = "Female";
		}
	}
	// 901234-1111111
	public void initAge(String regNum) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		// 1900 <   <= 2021
		int age = year - Integer.parseInt("19" + regNum.substring(0, 2)) + 1;
		if(age >= 100) age = age - 100;
	
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// tostring sysout() - 1
	// toString sysout() = 2
	
	@Override // annotation (�ο�): �Լ����� ��Ÿ�� �����
	public String toString() {
		return String.format("�̸� : %4s, �ֹε�Ϲ�ȣ : %14s, ���� : %2d (��), ���� : %6s", 
				name, regNum, age, gender);
	}
	
	@Override // annotation (�ο�): �Լ����� ��Ÿ�� �����
	public boolean equals(Object o) {
		if(!(o instanceof Person)) return false;
		
		if(this.regNum.equals(((Person)o).regNum)) return true;
		else return false;
	}
	
}
