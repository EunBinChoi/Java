
public class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ū �� (�ڽ�)�� ���� �� (�θ�)�� ������ �� ��ȯ�� �ʿ���!
//		Shape s = new Rectangle();
//		Rectangle r = ((Rectangle)s);
//		
		
		// ���� �� (�θ�)�� ū �� (�ڽ�)�� ���� ���� �Ϲ������� ������ ����!
		//Rectangle rs = new Shape();
		
		/*
		 * ���� ���ε�: ���� ����Ű�� �ִ� ��ü Ÿ�Կ� �´� �Լ��� ȣ��
		 * >> ���� ���� ���� �� �������� ������ Ÿ�� üũ�� ���ֱ� ������
		 * >> ������ �� ����
		 * */
		Shape[] arrayOfShapes = new Shape[3];
		
		arrayOfShapes[0] = new Rectangle(0, 0, 3, 3);
		arrayOfShapes[1] = new Triangle(5, 5, 5, 5);
		arrayOfShapes[2] = new Circle(3, 3, 3);
		
		for(int i = 0; i < arrayOfShapes.length; i ++) {
			arrayOfShapes[i].draw();
		}
		System.out.println();
		
		for(int i = 0; i < arrayOfShapes.length; i ++) {
			arrayOfShapes[i].move(3, 5);
			System.out.printf("����: x = %d, y = %d \n", arrayOfShapes[i].x, arrayOfShapes[i].y);
		}
		
		// ��ü �̸� instanceof Ŭ���� �̸�
		System.out.println(arrayOfShapes[0] instanceof Rectangle);
		System.out.println(arrayOfShapes[1] instanceof Triangle);
		
		
		for(int i = 0; i < arrayOfShapes.length; i ++) {
//			double area = arrayOfShapes[i].areaCalc();
			System.out.printf("����: %.2f \n", 
					arrayOfShapes[i].areaCalc());
		}
	}

}
