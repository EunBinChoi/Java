package vector;

public class Fruit {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("���� �̸� : %4s, ���� : %6d", name, price);
				// "���� �̸� : " + name + ", ���� : " + price;
	}
}
