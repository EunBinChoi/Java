
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(1, "Eclass", "���", 80);
		SportsCar c2 = new SportsCar(2, "BMW", "����", 100, 20);
		SportsCar c3 = new SportsCar(2, "BMW", "����", 100, 20);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c2.getModel());
		
		// �ּҰ� ��
		System.out.println(c2 == c3);
		
		// ���빰 �� (equals ������)
		System.out.println(c2.equals(c3));
	
	}

}
