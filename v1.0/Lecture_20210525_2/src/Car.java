
public class Car {
	protected int ID; // �ڵ��� �Ϸù�ȣ
	protected String model; // �� �̸�
	protected String color; // �ڵ��� ����
	protected int speed; // ���� �ӵ�
	
	public Car() {}
	
	public Car(int ID, String model, 
			String color, int speed) {
		this.ID = ID;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// toString �Լ�: Object Ŭ����
	// ��ӹ��� Car Ŭ�������� �ٽ� ���� (������, override)
	
	// �������̵� (������, overriding): ��ӹ��� �Լ� ���� ������
	
	@Override // annotation (�ο�)
	public String toString() {
		return "�Ϸù�ȣ :" + ID +
				", �� �̸� :" + model +
				", ���� : " + color +
				", �ӵ� : " + speed;
	}
	
}
