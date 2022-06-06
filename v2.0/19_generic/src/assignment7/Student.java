package assignment7;

import java.util.Objects;

public class Student extends Person {
	protected String studentNo;
	protected int grade;

	public Student() {
		super();
	}

	public Student(String studentNo) {
		super();
		this.studentNo = studentNo;
	}

	public Student(String studentNo, int grade) {
		super();
		this.studentNo = studentNo;
		this.grade = grade;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "studentNo=" + studentNo + ", grade=" + grade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return grade == other.grade && Objects.equals(studentNo, other.studentNo);
	}

	

}
