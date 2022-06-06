package student;

public class Student {
	// Ŭ���� ����
	// ��� ��ü�� �����ϴ� ����
	private static int count;
	private int ID;
	private String name;
	private int grade;
	private String subject;
	
	public Student() {
//		this.ID = 0;
//		this.name = "";
//		this.grade = 0;
//		this.subject = "";
		count ++;
	}
	
	public Student(int i, String name, 
			int grade, String subject) {
		this.ID = i;
		this.name = name;
		this.grade = grade;
		this.subject = subject;
		
		count ++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getID() {
		
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return "�й�: " + this.ID + ", " + 
				"�̸�: " + this.name + ", " + 
				"�г�: " + this.grade + ", " +
				"����: " + this.subject ;
	}
	
}
