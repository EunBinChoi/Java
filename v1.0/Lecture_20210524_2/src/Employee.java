
public class Employee {
	private int id;
	private String name;
	private String depart;
	private String position;
	
	
	public Employee(int i, String na,
			String de, String pos) {
		this.id = i;
		this.name = na;
		this.depart = de;
		this.position = pos;
		
	}
	/* ��� �ʵ���� private => �ܺο��� ������ �� �� ����
	 * �� �ʵ���� �����ϰų� �ʵ��� ���� ������ ���� �Լ� �ʿ�
	 * ������: setter
	 * ������: getter
	 * 
	 * */


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	// sysout print�� �� ��
	// toString�̶�� �Լ��� ã��
	public String toString() {
		return "�����ȣ :" + id + ", "
				+ "�̸� : " + name + ", "
				+ "�μ� : " + depart + ", "
				+ "��å : " + position;
	}
	
	
//	public void changeName(String newName) {
//		this.name = newName;
//	}
//	
//	public void changeDepart(String newDepart) {
//		this.depart = newDepart;
//	}
//	
//	public void changePos(String newPos) {
//		this.position = newPos;
//	}
	
	
}
