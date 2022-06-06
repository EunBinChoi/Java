package static_variable;

public class HyundaiCar {
	
	// Ŭ���� ���� (static ����)
	// ��� ��ü�� �����ϴ� ����
	private static String model = "hyundai";
	
	// static ������ ���� ���� ����
	public static int count = 0; // ��ü �� ī��Ʈ
	
	// �ʵ� (������)
	private String id;
	private String color;
	private int price;
	
	// ������ (constructor, ��ü�� ������ �� ȣ���ϴ� �Լ�)
	// ���� ������ + Ŭ���� �̸� (��ȯ�� ���ǰ� ����)
	// ���� �����ڰ� �ƹ��͵� ���ǵǾ����� ������ 
	// �� ������ (����Ʈ ������)�� �ڵ� ����
	// ���� �����ڰ� �ϳ��� ���ǵǾ�������
	// �� ������ (����Ʈ ������)�� �ڵ� ���� X
	// -> ���� ����Ʈ �����ڸ� ��������� ��
	
	public HyundaiCar() { // �� ������ (����Ʈ ������)
//		this.id = null;
//		this.color = null;
//		this.price = 0;
		count++; // ��ü ���� ī��Ʈ�ϴ� ����
	}
	public HyundaiCar(String id) {
		this.id = id;
//		this.color = null;
//		this.price = 0;
		count++;
	}
	public HyundaiCar(String id,
			String color,
			int price) {
		this.id = id;
		this.color = color;
		this.price = price;
		count++;
	}
	
	// �Լ� (���/����)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	// static ������ �����ϴ� �Լ���
	// static���� ���� (static �޼ҵ�)
	public static String getModel() {
		return model;
	}
//	public void setModel(String model) {
//		this.model = model;
//	}
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
		if(this.id.equals(((HyundaiCar)c).id) && 
				this.model.equals(((HyundaiCar)c).model) &&
				this.color.equals(((HyundaiCar)c).color) &&
				this.price == ((HyundaiCar)c).price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
