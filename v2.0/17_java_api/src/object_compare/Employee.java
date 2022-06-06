package object_compare;

public class Employee implements Comparable<Employee>{
	private int eno; // ��� ��ȣ
	private String name; // ��� �̸�
	private String position; // ����
	private String depart; // �μ�
	
	private static int count = 0; // ����� (��ü��)
	private static final String company = "Goott Academy";
	
	// ������
	public Employee() {count++;}
	public Employee(int eno) {
		this.eno = eno;
		count++;
	}
	public Employee(int eno, String name,
			String position, String depart) {
		this.eno = eno;
		this.name = name;
		this.position = position;
		this.depart = depart;
		count++;
	}
	
	// getter, setter
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
	public static String getCompany() {
		return company;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
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

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public String toString() {
		return String.format("eno = %d, name = %s, "
				+ "position = %s, depart = %s", 
				eno, name, position, depart);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.eno == ((Employee)o).eno 
				&& this.name.equals(((Employee)o).name)
				&& this.position.equals(((Employee)o).position)
				&& this.depart.equals(((Employee)o).depart)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		// eno (�����ȣ) �������� ��ü ��
		
		if(this.eno < o.eno) return -1;
		else if(this.eno == o.eno) return 0;
		else return 1;
		
	}
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		// name (����̸�) �������� ��ü ��
//		
//		if(this.name.compareTo(o.name) < 0) return -1;
//		else if(this.name.compareTo(o.name) == 0) return 0;
//		else return 1;
//		
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		// 1) eno (�����ȣ) + 2) name (����̸�) �������� ��ü ��
//		
//		if(this.eno < o.eno) return -1;
//		else if(this.eno == o.eno) {
//			if(this.name.compareTo(o.name) < 0) return -1;
//			else if(this.name.compareTo(o.name) == 0) return 0;
//			else return 1;
//		}
//		else return 1;
//		
//	}
	
}
