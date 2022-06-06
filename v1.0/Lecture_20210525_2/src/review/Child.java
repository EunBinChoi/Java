package review;

public class Child extends Parent{
	private String schoolName;
	private int grade;
	private boolean isStudent;
	
	public Child() {}
	public Child(String name, String regNum) {
		super(name, regNum);
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public boolean isStudent() {
		return isStudent;
	}
	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	public String toString() {
		String returnStr = 
				String.format("%s", super.toString());
		
		if(isStudent) {
			returnStr += ", 학생 여부: " + isStudent + 
					", (" + schoolName + "학교, " +
					grade + "학년)";
		}
		
		return returnStr;
	}
}
