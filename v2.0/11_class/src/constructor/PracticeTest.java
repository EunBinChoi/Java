package constructor;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1. Car
		// String id (�Ϸù�ȣ)
		// String model (���̸�)
		// String color (����)
		// int price (����) (������ �� �� ����)
		
//		int[] arr1 = new int[5];
//		arr1[0] = 10;
//		
//		int[] arr2 = {10, 20, 30, 40, 50};
		
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setId("1");
		c1.setModel("GRANDEUR");
		c1.setColor("red");
		c1.setPrice(3500);
		
		c2.setId("1");
		c2.setModel("GRANDEUR");
		c2.setColor("red");
		c2.setPrice(3500);
		c2.setPrice(-1000);
		
		System.out.println(c1);
		System.out.println(c2);
		
		// ������ ������ ����� �� �ּҰ��� �ƴ϶�
		// �ʵ尪�� ��µǰ� �ʹٸ� ..?
		// toString()�� �����ϸ� �ȴ�!
		
		System.out.println(c1.equals(c2));
		
		// �Լ�ȣ��
		// 1. �Լ��� ���� (Car())
		// 2. �Ű����� Ÿ��, ����, ����
		// ex)  ����
		// String, String, int != int, String, String
		Car c3 = new Car("2");
		System.out.println(c3);
		
		Car c4 = new Car("3", "BMW");
		System.out.println(c4);
		
		Car c5 = new Car("4", "BMW", "White", 10000);
		System.out.println(c5);
		
		c5.setColor("Black");
		System.out.println(c5);
	}

}
