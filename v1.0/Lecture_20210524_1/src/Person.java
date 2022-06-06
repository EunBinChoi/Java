/*
 * ��ü���� (Object-oriented) ���
 * 
 * �ڵ��� ���赵 (�޴���) == Ŭ����
 * "�ʵ� (�Ӽ�) + �Լ� (���, ����)"
 * (color, id)
 * 
 * 
 * �ڵ��� == ��ü (object)
 * �ڵ��� �ֹ� -> �ڵ��� ���� == ������ (constructor)
 * 
 * 
 * 
 * (main �Լ�)
 * ������ ȣ�� - ��ü ����
 * new Car(); // 1�� ������ �̿�
 * new Car("red", 1); // 2�� ������ �̿�
 * String color = "red";
 * int id = 1;
 * 
 * ������ (��ȯ�� ����, ���� �����ڴ� �� �� ����)
 *
 * Car (){ - 1��
 * 
 * }
 * 
 * Car (String color, int id){ - 2��
 * 		this.color = color;
 * 		this.id = id;
 * }
 *	// color, id ������ ��
 * 
 * �Ű������� ��������� ����Ʈ ������
 * �Ű������� ���� �� �� ���� ����
 * 
 * 
 * �����ڸ� �ƿ� �� ���� - 1���� ����� �� ����
 * �����ڸ� 2���� ���� - 1���� ����� �� ���� (new Car() X)
 * 
 * */


public class Person {
	// �ʵ� ����
	private String name;
	private int age;
	private String regNum; // �ֹε�Ϲ�ȣ
	private String gender;
	private String email;
	private double height;
	private double weight;
	
	/*
	 * changeName()
	 * incAge()
	 * changeEmail(String newEmail)
	 * changeHeight(double newHeight)
	 * changeWeight(double newWeight)
	 * */
	
	// ������ (constructor):
	// ��ü�� ������ �� ȣ��Ǵ� �ʱ�ȭ �Լ�
	// ��� Ŭ�������� �ݵ�� �ϳ� �̻��� ������ �ʿ�
	// ���� �����ڰ� �ϳ��� ���� ��쿡�� ����Ʈ ������ �Ҹ�
	// �ϳ��� �����ڰ� ��������� ����Ʈ �����ڵ� �������� ��
	
	// ����Ʈ ������ 
	// (default constructor)
	public Person() {
		
	}
////	
	public Person(String name, String regNum){
		this.name = name;
		this.regNum = regNum;
	}
	
	public Person(String name, int age, 
			String regNum, String gender,
			String email, double height, 
			double weight){
		this.name = name;
		this.age = age;
		this.regNum = regNum;
		this.gender = gender;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	public void incAge(int rate) {
		if (rate > 0) {
			this.age = this.age + rate;
		}
		else {
			System.out.println("[���] ��ȿ���� ���� �������Դϴ�!");
		}
	}
	
	public void printAge() {
		System.out.println("���� : " + this.age);
	}
	
	public void changeEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public void changeHeight(double newHeight) {
		if(newHeight > 0) {
			this.height = newHeight;
		}
		else {
			System.out.println("[���] ��ȿ���� ���� �������Դϴ�!");
		}
	}
	
	public void printHeight() {
		System.out.println("���� : " + this.height);
	}
	
	public void changeWeight(double newWeight) {
		if(newWeight > 0) {
			this.weight = newWeight;
		}
		else {
			System.out.println("[���] ��ȿ���� ���� �������Դϴ�!");
		}
	}
	
	public void printWeight() {
		System.out.println("ü�� : " + this.weight);
	}
	// �Լ� ����
	/* ��ȯ�� �Լ��̸� (�Ű�����) {
	 * 	
	 * }
	 * 
	 * ��ȯ���� ���� ���: void
	 * */
	
	
	/* �ʵ� (�Ӽ�)
	 * �̸�: String
	 * ����: int
	 * �ֹε�Ϲ�ȣ: String
	 * ����: String (Female or Male)
	 * �̸��� �ּ�: String
	 * ���� (Ű): double
	 * ü��: double
	 * 
	 * 
	 * ��� (�Լ�)
	 * changeName()
	 * incAge()
	 * changeEmail()
	 * changeHeight()
	 * changeWeight()
	 * */
}
