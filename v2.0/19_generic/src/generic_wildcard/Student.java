package generic_wildcard;

public class Student extends Person {
	private String studentNo;
	private String grade;
	
	public Student() {}
	public Student(String studentNo) {
		this.studentNo = studentNo;
	}
	public Student(String name, String studentNo, String grade) {
		super(name);
		this.studentNo = studentNo;
		this.grade = grade;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
