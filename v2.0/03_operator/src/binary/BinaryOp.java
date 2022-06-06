package binary;

public class BinaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ������ (binary operator)
		// x + y, x - y, .... 
		// ��� �����ڵ� ���� �������� (+, -, /, *, %)
		
		int x = 10;
		int y = 20;
		x = x + y;
		System.out.println(x); // 30
		
		// ���� ���� ������
		x += y; // x = x + y
		System.out.println(x); // 50
		
		x -= y; // x = x - y;
		System.out.println(x); // 30
		
		x *= y;
		System.out.println(x); // 600

		x /= y;
		System.out.println(x); // 30
		
		x %= y;
		System.out.println(x); // 10
		
		
		// ���� ������
		/*
		 * == : ����? 
		 * !=: �ٸ���?
		 * > : ũ��?
		 * <: �۴�?
		 * >= : ũ�ų� ����?
		 * <= : �۰ų� ����?
		 * 
		 * 
		 * ������ ��� boolean (true, false)
		 * */
		
		System.out.println(3 == 3); // true
		System.out.println(3 != 3); // false
		System.out.println(5 != 3); // true
		System.out.println(3 > 3); // false
		System.out.println(3 >= 3); // true
		System.out.println(10 > 5); // true
		System.out.println(5 < 5); // false
		System.out.println(5 <= 5); // true
		System.out.println(-20 < -10); // true
		
		
		// �� ������ (�׸���, �Ǵ�, �ƴϴ�)
		/*
		 * x && y 
		 * x || y 
		 * !x
		 * 
		 * x, y�� ������ Ÿ���� boolean (true, false�� �Ǵ� ���ɽ�)
		 * ex) x = (3 == 3)
		 * */
		
		System.out.println((3 == 3) && (5 == 3)); // false
		System.out.println((3 != 3) && (5 == 3)); // false
		System.out.println((3 == 3) || (5 == 3)); // true
		System.out.println((3 != 3) || (5 == 3)); // false
		System.out.println(!(3 != 3)); // true
//		System.out.println(3 && 3); // ������ (x, y�� boolean�� �ƴ�)
		
		// ���� ������ (ternary operator)
		/* (���ǽ�) ? ���� �� ��� : ������ �� ���
		 * int z = (x > y) ? x : y
		 * 1) (x > y) => z = x
		 * 2) (x <= y) => z = y
		 * 
		 * * z�� ���� �ִ� ���� ��� �����ǳ���? (x, y��)
		 * : x, y �߿� �� ū �� (x, y�� �������� �ʴٰ� ����)
		 * 
		 * 
		 * ex) x, y �߿� �� ���� �� �����ϴ� ���� ������
		 * int z = (x < y) ? x : y
		 *
		 * */
		x = 3;
		y = 5;
		String str = (x > y) ? 
				x + "�� " + y + "���� Ů�ϴ�" : x + "�� " + y + "���� �۽��ϴ�";
		System.out.printf("%s", str);
		
		// %n vs \n
		// %n: ���� (printf (%d %f.. formatter))
		// \n: ���� (printf, print, println)
		
		/* Q1. ���� �˻� ���α׷�
		 * int year = 2021;
		 * 
		 * �Ʒ��� ���� �� �ϳ��� �����ϸ� ����
		 * 1) 4�� ����̾���ϰ� 100�� ����� �ƴϾ�� ��
		 * 2) 400�� ����� ������ ������ �� 
		 * 
		 *
		 * Q2. ��� ���� �Ǵ� ���α׷�
		 * int num = -100;
		 * 
		 * �ش� ���� 0���� ũ�� "���"�� ���
		 *         0���� ������ "����"�� ���
		 *         0�̸� "0"�� ��� (**)
		 */
		// 1) (���ǽ�) ? ���� �� ��� : ������ �� ���
		// 2) (���ǽ�) ? ���� �� ��� : ������ �� ���
		
		
		 /* Q3. ������
		 * int a = -1;
		 * int b = 0;
		 * 
		 * a/b�� ������ �����ϸ� ���� ����� ���
		 * a/b�� ������ �Ұ����ϸ� "���� �Ұ����մϴ�"�� ���
		 * 
		 * (* ���������� �и�� 0�� �� �� �����ϴ�!)
		 * (* int -> String, 
		 * String s = Integer.toString(i);
		 * int i = 3;
		 * String s = Integer.toString(i); // "3"
		 * 3 -> "3"
		 * */
		
		// ��Ʈ ������ (IoT, �ϵ����)
		/* ~: ��Ʈ�� NOT
		 * &: ��Ʈ�� AND
		 * ^: ��Ʈ�� XOR (exclusive or, ��Ÿ������)
		 * (3^5 != 3�� 5��, Math.pow(3, 5))
		 * |: ��Ʈ�� OR
		 * <<: ��Ʈ ���� �̵�
		 * >>: ��Ʈ ������ �̵�
		 * 
		 * a*2, a*4, a*8
		 * a<<1, a<<2, a<<3
		 * 
		 * a*(1/2), a*(1/4), a*(1/8)
		 * a>>1, a>>2, a>>3
		 * */
		
		System.out.println(); // enter
		
		int var1 = 5; // 101
		int var2 = 3; // 011
		System.out.println(var1 & var2); // AND
		// 101
		// 011
		// ----
		// 001
		System.out.println(var1 | var2); // OR
		// 101
		// 011
		// ----
		// 111
		System.out.println(var1 ^ var2); // XOR
		// 101
		// 011
		// ----
		// 110
		System.out.println(~var2); // NOT
		System.out.println(~8);	
		
		System.out.println(var1 << 1); // x2
		// 1010
		System.out.println(var1 << 2); // x4
		// 10100
		System.out.println(var1 >> 1); // /2 == 2
		// 101 >> 1
		// 010
		System.out.println(var1 >> 2); // /4 == 1
		// 101 >> 2
		// 001
		
	}
}
