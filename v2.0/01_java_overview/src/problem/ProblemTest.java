package problem;

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��� ������ (+, -, *, /)
		// Q1. ���� �ѷ�, ���� ����ϴ� ���α׷�
		// ���� �ѷ�: 2 * PI * ������
		// ���� ����: PI * ������ * ������
		int r = 3;
		final double PI = 3.141592; // ?
		// ���� �ѷ�: peri (double)
		// ���� ����: area (double)
		
		double peri = 2 * PI * r;
		double area = PI * r * r;
		System.out.println("���� �ѷ�: " + peri);
		System.out.println("���� ����: " + area);
		
		// 1) 18.84 -> "18.84" (�ڵ� ����ȯ)
		// 2) "���� �ѷ�: " + "18.84"
		// ---------------------------------------
		// print(), println(), printf() (print format)
		// printf() (enter�� �������� ����)
		// ���� (10����): %d (decimal)
		// ���� (8����): %o (octal)
		// ���� (16����): %x (hexa..)
		// �Ǽ� (float, double): %f
		// ���� (char): %c
		// ���ڿ� (String): %s
		
		System.out.printf("���� �ѷ�: %.2f\n", peri);
		System.out.printf("���� ����: %.2f\n", area);
		
		// ���� ����ϴ���?
		int month = 1; // 1 ~ 12 (�ִ� 2����)
		int day = 1; // 1 ~ 31 (�ִ� 2����)
		System.out.printf("month = %-2d, day = %-2d\n", month, day);
		month = 12;
		day = 31;
		System.out.printf("month = %-2d, day = %-2d\n", month, day);
		
		
		// + ����
		// ���ڿ� + ���ڿ�: ���ڿ� ����
		System.out.println("���� �ѷ�: " + "123"); 
		// ���� + ����: ���� ����
		System.out.println(234 + 123);
		
		
		// Q2. boolean b = true�� int�� ����ȯ�ϴ� �ڵ� �ۼ�
//		boolean b = true;
//		System.out.println((int)b); // �� �ȵǴ��� ����
//		// boolean -> int �� ��ȯ�� �ȵ� (java�� Ư¡)
		// false: 0
		// true: 1
		
//		
		// Q3. �Ʒ��� �ڵ尡 ������ ���� ������ �����Ͻÿ�.
		// ������ ���� ��쿡�� �� ������ �� �������� �����غ�����!
		float f = (float)0.12; // 0.12f
		// double -> float
		int i = (int)2.1; // 2.1 -> 2 (����� ����ȯ)
		// double -> int
		
		char c = 'a';
//		boolean bl = (boolean)1; // 1 -> true�� ���� �Ұ�!
		// 1 -> true
		// 0 -> false
		
		double d = 1; // 1 -> 1.0 (�ڵ� ����ȯ)
		// int -> double
		double dd = 1.2f; // 1.2f -> 1.2 (�ڵ� ����ȯ)
		// float -> double
//		
		// Q4. x, y ������ �̿��Ͽ� 
		// x, y�� ��� ���� ��ġ�� �ٲٴ� �ڵ� �ۼ�
		// swap (switch)
		int x = 10;
		int y = 20;
		
		System.out.println(x); // 10
		System.out.println(y); // 20
		// ���⿡ �ڵ� �ۼ�
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println(x); // ���� �����: 20
		System.out.println(y); // ���� �����: 10
		
		// Q5. ���� ������ ���� ����� Ȯ���ϰ� ������ �����غ�����!
		int xx = 65;
		System.out.printf("%.2f\n", (float)xx); 
		System.out.printf("%c\n", xx); // 65�� ���� �ƽ�Ű�ڵ� ���
		//		
		char chh = 'a';
		System.out.printf("%d\n", (int)chh); 
		// ���� 'a'�� ���� �ƽ�Ű�ڵ� �� ���
//		
		char chch = 97; // 'a'
		System.out.printf("%d\n", (int)chch);
		System.out.printf("%c\n", chch);
		
	}

}
