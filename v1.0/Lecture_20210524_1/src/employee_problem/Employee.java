package employee_problem;

public class Employee {
	private static int empCount; // ��� ��ü��
	private int eno; // ��� ��ȣ
	private String name; // ��� �̸�
	private String position; // ����
	private String department; // �μ�

	
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
		return String.format("��� ��ȣ: %2d, ��� �̸�: %s, "
				+ "����: %s, �μ�: %s",  eno, name, position, department);
	}
	
}
