package review;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static ����
		// Ŭ�����̸�.�����̸�
		// ��ü �������� ȣ�� ����
		System.out.println("��ü �� : " 
				+ Car.getCarNum());
		
		// ��ü ����
		Car myCar = new Car(1);
		
		System.out.println("��ü �� : " 
				+ Car.getCarNum());
		
		Car yourCar = new Car(2);
		
		System.out.println("��ü �� : " 
				+ Car.getCarNum());
		
		// add vs add()
		// add: ���� ȣ��
		// add(): �Լ� ȣ��
		
		// new �����ڸ� ���� ��ü ����
		// int: 0
		// String: null, 
		// double: 0.0, 
		// char: '' (\u0000)
		// boolean: false
		
		// myCar: ��ü ����
		// new Car(): ��ü�� �����ϱ� ���� ������ ȣ��
		// �����ڰ� �ƹ��͵� ���ǵǾ����� ������
		// ����Ʈ ������ �ڵ� ����
		
		// ��ü�� �Ӽ��� �ʱ�ȭ
//		myCar.id = -1000;
		//myCar.color = "purple";
		boolean b = myCar.setColor("purple");
		if(b) {
			System.out.println("���� �Ϸ�!");
		}
		else {
			System.out.println("��ȿ���� ���� �������Դϴ�."
					+ "������ ������ Ȯ�����ּ���!");
		}
		
		String c = myCar.getColor();
		System.out.println(c);
		
		myCar.setNavi("���̳���");
		String n = myCar.getNavi();
		System.out.println(n);
		
		myCar.setNavi("īī���׺�");
		n = myCar.getNavi();
		System.out.println(n);
		
		myCar.setHeat(true);
		boolean h = myCar.isHeat();
		System.out.println(h);
		
		myCar.setFan(true);
		boolean f = myCar.isFan();
		System.out.println(f);
		
		System.out.println(myCar);
		
		
//		System.out.println(c);
//		myCar.color = "purple";
//		myCar.navi = "���̳���";
//		myCar.heat = true;
//		myCar.fan = false;
		
		// �Ϸù�ȣ ���� 
//		myCar.id = 100;
		// ���̻� �� ���� ã�� �� ���� ...!
		// (����)�� ������� ��!
		
		
		
	}

}
