package generic_method;

public class Fruit <T, P>{
	T name; // ���� �̸�
	P price; // ���� ����
	
	// ����Ʈ ������
	Fruit(){}
	
	// 2�� ���ڸ� ���� ������
	Fruit(T name, P price){
		this.name = name;
		this.price = price;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public P getPrice() {
		return price;
	}

	public void setPrice(P price) {
		this.price = price;
	}
	
}
