
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.println("Hello Java!1");
//		System.out.println("Hello Java!2");
//		System.out.println("Hello Java!3");
		// ������ ���� �׻� �����ݷ� (;)
		// ������ ������ ���������� �����
		
		// sysout + (ctrl + space)
		// ���� : �ʷϻ� ��� ��ư (ctrl + F11)
		// println(): �ܼ� (����ȭ��) ����ϴ� �Լ�
		
		// �ڵ� : ������
		// ����ȭ�� : �����, �׽��� ������
		
		// ��� ����ɱ�?
		// �ڵ� -> ��ǻ�� -> ����ȭ��
		
		// �ڵ� (java) -> (������) -> ��ǻ��
		// (������): �����Ϸ� (compiler)
		
		// ��ǻ�� -> ����ȭ��
		// ��ǻ�� : 001011.. (������)
		
		// �ּ� (comment): �ڵ尡 �ƴ�
		// �����ڵ鳢�� �ǻ���� (����, ���� ����)
		// dsdadasdas
		/* asdasdasdasdasdasd
		 * 
		 * asdasdsadasd
		 * */
		
		/*
		 * ��������������������
		 * ����������������������
		 * ������������������
		 * 
		 * 
		 * 
		 * */
		
		
		 /*
		  * ������ �̸��� ����غ�����.
		  * 
//		  * */
//		System.out.println("�������Դϴ�.");
//		System.out.println("���� ���ɺ��� ���� �����մϴ�.");
//		System.out.println("");
		
		// �ֿܼ� ����ϴ� �Լ�
		// println(): ���� + ���� o (enter, '\n')
		// print(): ���� + ���� x
		// printf(): print format (���Ĵ�� ����ض�)
		
		System.out.print("Java 1");
		System.out.print("Java 2");
		System.out.print("Java 3");
//		
		
		/*
		 * ���� (variables, ���� �� �ִ� ��)
		 * : ���� �� �ִ� �� (������)�� �����ϴ� ���� (����)
		 * : �̸�, Ÿ��
		 * 
		 * 1) �̸� �ۼ���
		 * a = 1;
		 * 
		 * 1) �̸��� ���� �ۼ� (���� X ->  _) ex) sum_height
		 * 2) Ư�����ڴ� _ �����ϰ� �Ұ���
		 * 3) ���ڴ� ù���ڷ� �� �� ���� 1sum, 2sum, -> sum1, sum2 
		 * 4) �̸��� ����Ǵ� �����Ϳ� �°� ���
		 * ex) height, count, x, y, num, ch (o)
		 * ex) a, b, c, d (x)
		 * 
		 * 
		 * 2) ������ Ÿ��
		 * int (����, 4byte) ex) int count = 0;
		 * ����) 1byte = 8bit
		 *
		 * float (�Ǽ�, 4byte)
		 * double (�Ǽ�, 8byte)
		 * ex) float height = 3.141231234564561234564564
		 * 
		 * char (character, ����) 'a'
		 * ex) char ch = 'a';
		 * ex) "Hello Java" : ���� ���� (���ڿ�)
		 * ex) a (����) vs 'a' (����)
		 * 
		 * boolean (���� ����, true, false)
		 * = (���� ������), == (����)
		 * 1 == 1 => true
		 * 1 == 2 => false
		 * 
		 * String (���ڿ�) "abc"
		 * ex) "Hello Java" "a" 
		 * 
		 * */
//		boolean a = (1 == 1);
//		System.out.println(a);
		
		
		
		int x = 10;
		int y = 20;
		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		int div = x / y;
//		int x, y, sum, sub, mul, div;
		
//		x = 10;
//		y = 20;
//		sum = x + y;
//		sub = x - y;
//		mul = x * y;
//		div = x / y;
//		
		
		System.out.println("sum"); // "sum" ���ڿ�
		System.out.println(sum); // sum ����
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div); // 0.5
		// ���� / ���� = ����
		// ���� / �Ǽ� = �Ǽ�
		// �Ǽ� / ���� = �Ǽ�
		// �Ǽ� / �Ǽ� = �Ǽ�
		
		System.out.println(3 / 5);
		System.out.println(3.0 / 5);
		System.out.println(3 / 5.0);
		System.out.println(3.0 / 5.0);
		
		x = 10;
		y = 20;
		
		// �� ��ȯ (type casting)
		// 10 -> 10.0
		System.out.println(x / y);
		System.out.println((double)x / y);
		System.out.println(x / (double)y);
		System.out.println((double)x / (double)y);
		
		// ���԰���
		// ���� < �Ǽ� < ������
		
		/* �� ���� ����, ����, ������ ���α׷� �ۼ� (�ǽ��ð�)
		 * 
		 * ���� : -
		 * ���� : *
		 * ������ : /
		 * 
		 * */
		
		// ��� �Լ�
		// println(), print(), printf()
		
		// int sum
		System.out.printf("hello hi java %d \n", sum);
		System.out.printf("hello hi java %d \n", sum);
		System.out.printf("sum = %d, sub = %d \n", sum, sub);
		
		// Ķ����
		int month = 2; // 1 ~ 12
		int day = 1; // 1 ~ 31
		
		System.out.printf("%-2d�� %-2d�� \n", month, day);
		
		month = 12;
		day = 31;
		
		System.out.printf("%-2d�� %-2d�� \n", month, day);
	
		// printf �� ����? --> ���� �ð�
		// ���� �״�� ������ֱ� ���� (���ڰ� �����ϰ� ���)
		
		/*
		 * printf() 
		 * " " ���� ������
		 * 
		 * ���� (int, integer): %d (decimal, 10����)
		 * �Ǽ� (float, double): %f,
		 * ���� (char): %c
		 * ���ڿ� (String): %s
		 * 
		 * */
		
		
		
		
	}
}
