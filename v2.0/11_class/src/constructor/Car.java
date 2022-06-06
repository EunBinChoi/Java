package constructor;

public class Car {
	// �ʵ� (������)
	private String id;
	private String model;
	private String color;
	private int price;
	
	// ������ (constructor, ��ü�� ������ �� ȣ���ϴ� �Լ�)
	// ���� ������ + Ŭ���� �̸� (��ȯ�� ���ǰ� ����)
	// ���� �����ڰ� �ƹ��͵� ���ǵǾ����� ������ 
	// �� ������ (����Ʈ ������)�� �ڵ� ����
	// ���� �����ڰ� �ϳ��� ���ǵǾ�������
	// �� ������ (����Ʈ ������)�� �ڵ� ���� X
	// -> ���� ����Ʈ �����ڸ� ��������� ��
	
	public Car() { // �� ������ (����Ʈ ������)
//		this.id = null;
//		this.model = null;
//		this.color = null;
//		this.price = 0;
	}
	public Car(String id) {
		this.id = id;
//		this.model = null;
//		this.color = null;
//		this.price = 0;
	}
	public Car(String id, String model) {
		this.id = id;
		this.model = model;
	}
	public Car(String id,
			String model,
			String color,
			int price) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;	
	}
	
	// �Լ� (���/����)
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			System.out.println("[ERROR] ��ȿ���� ���� ������");
		}
	}
	
	@Override // ������̼� (�ο�), toString()�� ��Ÿ�� �����
	public String toString() {
		return String.format
				("id: %s, model: %s, color: %s, price: %d", 
						id, model, color, price);
	}
	
	@Override
	public boolean equals(Object c) {
		if(this.id.equals(((Car)c).id) && 
				this.model.equals(((Car)c).model) &&
				this.color.equals(((Car)c).color) &&
				this.price == ((Car)c).price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
