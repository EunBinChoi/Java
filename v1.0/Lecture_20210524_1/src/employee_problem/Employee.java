package employee_problem;

public class Employee {
	private static int empCount; // 사원 객체수
	private int eno; // 사원 번호
	private String name; // 사원 이름
	private String position; // 직급
	private String department; // 부서

	
	public Employee(int eno){
		this.eno = eno;
		empCount ++;
	}
	
	public static int getEmpCount() {
		return empCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEno() {
		return eno;
	}
	
	public String toString() {
		return String.format("사원 번호: %2d, 사원 이름: %s, "
				+ "직급: %s, 부서: %s",  eno, name, position, department);
	}
	
}
