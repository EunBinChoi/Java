import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ����/�Ҵ� ������ (=)
		 * : ���� ������ ������ �����͸� ����
		 * : ���п����� equals (==)
		 * 
		 * ��� ������ (+, -, *, /, %)
		 * : ���� / (double)���� == �Ǽ�
		 * 
		 * : % : ������ ������ (modulus, mod)
		 * : x % y�� ����: x�� y�� ���� ���� ������ �� 
		 * : ex) 3 % 5 == 3
		 * : ex) 5 % 3 == 2
		 * 
		 * 
		 * 
		 * */
		
		int x, y;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("X ���� �Է��Ͻÿ� : ");
//		x = scan.nextInt();
//
//		System.out.print("Y ���� �Է��Ͻÿ� : ");
//		y = scan.nextInt();
//		
//		System.out.println("���� : " + (x + y));
//		System.out.println("���� : " + (x - y));
//		System.out.println("���� : " + (x * y));
//		System.out.println("������ : " + (x / (double)y));
//		System.out.println("������ : " + (x % y));
		
		// 2 (����) -> "2" (���ڿ�)
		
		
		// + ������ : ���ڿ� + ���ڿ� => ���ڿ��� ����
		System.out.println("����" + "��ο�");
		System.out.println("����" + 2);
		int res = 3;
		System.out.println("��� : " + res);
		// 3 -> "3" (���������� Ÿ�� ��ȯ�� �Ͼ!)
		
		// "����" : ���ڿ�
		// 2: ���� => "2" : ���ڿ�
		
		// ���� ������
		// x + y, x - y, x * y ...
		
		// x + y
		// x - y
		
		// ���� ������ (���� �ϳ�)
		// 1. ��ȣ ������ (+, -)
		int a = 3;
		a = -a;
		System.out.println(a);
		
		int b = 3;
		b = +b;
		System.out.println(b);
		
		// 2. ���� ������ (�����ϰų� �����ϰų�)
		a = 3;
		System.out.println("�� :" + a);
		++a; // a++, a = a + 1;
		System.out.println("�� :" + a);
		
		System.out.println("�� :" + a);
		--a; // a--, a = a - 1;
		System.out.println("�� :" + a);
		
		// 3. ���� ���� ������
		x = 10;
		y = 20;
		x = x + y; // x += y;
		System.out.println("��� : " + x);
		
		// x: 30, y: 20
		x += y; // x = x + y;
		System.out.println("��� : " + x);
		
		// x: 50, y: 20
		// x = x - y
		x -= y;
		System.out.println("��� : " + x);
		
		// x: 30, y: 20
		// x = x * y
		x *= y;
		System.out.println("��� : " + x);
		
		// x: 600, y: 20
		// x = x / y
		x /= y;
		System.out.println("��� : " + x);
		
		// x: 30, y: 20
		// x = x % y (mod ����)
		x %= y;
		System.out.println("��� : " + x);
		
		// 4. ���� ������
		/*
		 * ==: ����
		 * !=  : �ٸ���
		 * > : ũ��
		 * < : �۳�
		 * >= : ũ�ų� ����
		 * <= : �۰ų� ����
		 * 
		 * ������ ����� boolean (true or false)
		 * */
		// �����ڿ��� =�� �׻� �ڿ� ��
		
		System.out.println(3 == 3);
		System.out.println(5 != 3);
		System.out.println(3 > 3);
		System.out.println(3 >= 3);
		System.out.println(5 < 5);
		System.out.println(5 <= 5);
		
		// 5. �� ������ (�׸���, �Ǵ�, �ƴϴ�)
		/*
		 * x && y �׸���: x�� y�� ��� ���̸� ��
		 * x || y �Ǵ�: x�� y �߿��� �ϳ��� ���̸� ��
		 * !x �ƴϴ�: x�� ���̸� ����, x�� �����̸� ��
		 * */
		
		x = 3;
		y = 4;
		System.out.println((x == 3) && (y == 4)); // T
		System.out.println((x == 5) && (y == 4)); // F
		System.out.println((x != 3) && (y == 4)); // F
		System.out.println((x != 5) && (y == 4)); // T
		System.out.println((x == 3) || (y == 4)); // T
		System.out.println(!(x != 5)); // F
		System.out.println();
		// 0: ����
		// 0�̿��� ��: �� (-100, 100, -10000, 1)

		
		// 6. ���� ������
		// (���ǽ�) ? ���� �� ��� : ������ �� ���
		// ex) max_value = (x > y) ? x : y;
		// ���̸�   x > y  => z = x
		// �����̸� x <= y => z = y
		// ex) min_value = (x < y) ? x : y;
		
		// � ���ǿ� ���� ����� ������ �����ϰ� ���� �� ����
		// ���߿� ������ ���ǹ����� ���̰� ª��
		
		// �׷��� �߸����� �������� ������
		
		// �������� ����߸��� ���� ������ 
		// ��, ������ ���ǿ� ���ؼ��� ����ص� ����
		
		System.out.println((3 > 5) ? 3 : 5);
		System.out.println((5 > 3) ? 5 : 3);
		
		x = 3;
		y = 5;
		int max_value = (x > y)? x : y;
		System.out.println(max_value);
		
		// �� ���� �ּҰ��� �̾Ƴ��� ���� �����ڸ� ��������.
		int min_value = (x < y)? x : y;
		
		
		// ===============================================
		/* - ���� ǥ����
		 * 
		 * ����� ��� (10����, 0 ~ 9)
		 * ���� (2���� (0, 1), 8���� (0 ~ 7), 16���� (0 ~ 15)
		 * 
		 * */
		
		// 7. ��Ʈ ������ (�ϵ����)
		
		/* ~: ��Ʈ�� NOT
		 * &: ��Ʈ�� AND
		 * ^: ��Ʈ�� XOR
		 * |: ��Ʈ�� OR
		 * <<: ��Ʈ ���� �̵�
		 * >>: ��Ʈ ������ �̵�
		
		 * a *2 a *4 a *8
		 * a<<1 a<<2 a<<3
		 * 	  
		 * 
		 * */
		
		// ���α׷��� ���: 10, 8, 16
		// 8 ����: 0o (oct)
		// 16 ���� : 0x (hex)
		
		x = 0x0fff;
		y = 0xfff0;
		
		// ����
		// %d (decimal, 10����)
		// %x (hex, 16����)
		// %o (oct, 8����)
		System.out.printf("%x \n", x & y);
		//   0000 1111 1111 1111
		// & 1111 1111 1111 0000
		// -------------------
		//   0000 1111 1111 0000
		
		System.out.printf("%x \n", x | y);
		//   0000 1111 1111 1111
		// | 1111 1111 1111 0000
		// -------------------
		//   1111 1111 1111 1111
		
		System.out.printf("%x \n", x ^ y);
		//   0000 1111 1111 1111
		// ^ 1111 1111 1111 0000
		// -------------------
		//   1111 0000 0000 1111
	
		System.out.printf("%x \n", ~x);
		// ~ 0000 1111 1111 1111
		// ---------------------
		//   1111 0000 0000 0000
		
		System.out.printf("%x \n", x << 2);
		// 0000 1111 1111 1111 << 2
		// 0011 1111 1111 1100
		
		System.out.printf("%x \n", x >> 2);
		// 0000 1111 1111 1111 >> 2
		// 0000 0011 1111 1111
		
		
		/*
		 * println() => ���� (����)
		 * print, printf => ���� x (���� x)
		 * => '\n'
		 * 
		 * */
		
		
		// ����ȯ (type casting)
		// (���ο� �ڷ���) ���� �̸�
		
		// int i = (int)12.5;
		// double d = (double)100;
		
		
		// ������ �켱����
		// (2 + 3) * 5
		
		// x = y = z = 5
		
		/*
		 * ����, ����
		 * 
		 * 40��
		 * 
		 * ������: ��/��: java, css, html, spring...
		 *       �κ�, �ϵ���� (�ݵ�ü): c, c++
		 *       
		 *       ��/�� (��ŸƮ��): django
		 *       
		 * 
		 * ������: �����ͺм���, �˰��� ���� (����ȭ)
		 * 
		 * ��ŸƮ��
		 * - ���� => ���� ����, ����
		 * - ��� => ���� j curve, ����
		 * 
		 * �ؿ����
		 * - ����, ���п��� �ؿܷ� �ٽ� ���ðų�
		 * - ���� ���� 3��
		 * 
		 * 
		 * 		
		 * 
		 * */

	}

}
