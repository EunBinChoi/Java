package overview;

/* ��ü���� ���α׷��� 3�� Ư¡
 * 1) (�ʵ���) ĸ��ȭ (���� ����) + setter, getter
 * 2) ���
 * 3) ������
 * */

public class Car {
	// protected
	// : ��� ���迡 �ִ� Ŭ��������
	// ���� ������ �ְڴ�! (�����ϰڴ�!)
	protected int id;
	protected String model;
	protected String color;
	protected int speed;
	
	public Car() {}
	
	// �ߺ� ���� �ϱ��? 
	// �ߺ� ���� �ƴ� (�Ű� ���� �̸��� �߿����� ����)
	// ������ ������ �޼���!
	public Car(int id) {
		this.id = id;
	}
//	public Car(int id2) {
//		this.id = id2;
//	}
	
	public Car(int id, String model, String color, int speed) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return String.format("id = %d, model = %s, "
				+ "color = %s, speed = %d", id, model, color, speed);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.id == ((Car)o).id &&
				this.model.equals(((Car)o).model) &&
				this.color.equals(((Car)o).color) &&
				this.speed == ((Car)o).speed) return true;
		else return false;
	}
	
}
