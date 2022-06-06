package arithmetic;

// �ڵ� ����: ctrl + A (��ü �� ���) + ctrl+shift+F (�ڵ� ����)
public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		/* ����/�Ҵ� ������ (assignment operator)
		 * : ���� = ������
		 * : ��ǻ�Ϳ��� ���ٴ� == ǥ��
		 * 
		 * ��� ������ (+, -, *, /, %)
		 * : x % y: x�� y�� �������� �� ������ ��
		 * ex) 3 % 5 == 3
		 * ex) 5 % 3 == 2
		 * ex) 10 % 6 == 4
		 * ex) 2 % 4 == 2
		 * 
		 * when? ���
		 * x % 2 == 1 (ex) 1, 3, 5, 7, ... x�� Ȧ��)
		 * x % 2 == 0 (ex) 2, 4, 6, 8, ... x�� ¦��)
		 * 
		 * x % 5 == 0 (x�� 5�� ���)
		 * x % 16 == 0 (x�� 16�� ���)
		 * */
		int x = 10;
		int y = 20;
		System.out.println(x + y); // 30
		System.out.println(x - y); // -10
		System.out.println(x * y); // 200
		System.out.println(x / y); // 0.5, ���� �̻� (0)
		System.out.println(x % y); // 10
		//  x          y
		// ���� ��Ģ���� ���� ==> ����
		// ���� ��Ģ���� �Ǽ� ==> �Ǽ�
		// �Ǽ� ��Ģ���� ���� ==> �Ǽ�
		// �Ǽ� ��Ģ���� �Ǽ� ==> �Ǽ�
		// * ��Ģ������ ����� �ǿ������� ū ���� ���󰣴�!
		
		// float fl = 3.14f;
		// (������Ÿ��)����: �� ��ȯ (type casting)
		System.out.println((double)x / y);
		// 10 -> 10.0
		System.out.println(x / (double)y);
		// 20 -> 20.0
		System.out.println((double)x / (double)y);
		
		// Q1. �µ� ��ȯ�� (ȭ�� �µ� -> ���� �µ�)
		double f = 95;
		double c; // c = 5/9 * (f-32)
		c = (5/9.0) * (f-32); // ?
		System.out.printf("ȭ���µ� %.2f�� �����µ� %.2f�Դϴ�\n ", f, c);
		
		// Q2. 
		double total = 7500;
		double pay = 10000;
		double tax; // ��ü ��ǰ �Ѿ��� 10%
		double change; // ������ ������ �ܵ��� ���
		tax = total * 0.1;
		change = pay - (total + tax);
		System.out.printf("�ܵ� = %.0f��\n", change);
		
		// Q3.
		int var = 10; 
		
		// "10", "a", "10.23"
		String strVar = "hello" + var; 
		// ������ ����� �ǿ����� �߿��� ū ���� ���󰣴�!
		// "hello" + "10" => "hello10"
		// ���ڿ� + ���ڿ� ==> ���ڿ� ����
		
		// strVar ������ �� ������ �����غ��� (������ ����)
		System.out.println(strVar);
		
		int intVar = 20 + var;
		// intVar ������ �� ������ �����غ��� (������ ����)
		System.out.println(intVar);
		// +
		// ���ڿ� + ���ڿ� ==> ���ڿ��� ����
		// "hello" + "world" => "helloworld"
	}

}
