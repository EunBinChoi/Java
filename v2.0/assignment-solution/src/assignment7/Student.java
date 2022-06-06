package assignment7;

import java.util.Objects;

public class Student extends Person {
	protected String studentNo;
	protected String grade;
	
	public Student() {}
	public Student(String name) {
		super(name);
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Student student = (Student) o;
		return Objects.equals(studentNo, student.studentNo) && Objects.equals(grade, student.grade);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", studentNo='" + studentNo + '\'' +
				", grade='" + grade + '\'' +
				'}';
	}
}
