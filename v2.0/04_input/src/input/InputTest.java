package input;

// �ܼ� (����ȭ��)�� ���� ����ڿ��� �Է¹޴� ���
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Scanner: Ŭ���� (�ر׸�, ���� ==> �ؾƲ)
		// sc: ��ü (object, �繰, ��� ==> �ؾ) (���� ���Ǵ� ��)
		
		// Q1. ����ڿ��� ������ �Է¹޾� �ش� ������ ���� �Ǵ��ϴ� ���α׷�
//		�Ʒ��� ���� �� �ϳ��� �����ϸ� ����
//		1) 4�� ����̾���ϰ� 100�� ����� �ƴϾ�� ��
//		2) 400�� ����� ������ ������ �� 
		
//		System.out.print("������ �Է��ϼ��� : "); // ����� ���� �޽���
//		int year = sc.nextInt();
//		boolean isLeapYear 
//		= ((year % 4 == 0) && (year % 100 != 0)) 
//		|| (year % 400 == 0); // t/f
//		
//		// true, false => "������ �½��ϴ�", "������ �ƴմϴ�"
//		String leapYearStr = (isLeapYear) ? "������ �½��ϴ�." : "������ �ƴմϴ�.";
//		System.out.println(leapYearStr);
//		System.out.println("���� ����: " + isLeapYear);
		
		// Q2. ����ڿ��� �Է¹��� �� ���� �Ǽ� (double)�� 
		// +, -, *, / (�и� 0�� ��� ���� ���) ���α׷�
		// sc.nextDouble()
//		System.out.print("ù��° ���� �Է��ϼ��� : "); // ����� ���� �޽���
//		double x = sc.nextDouble();
//		System.out.print("�ι�° ���� �Է��ϼ��� : "); // ����� ���� �޽���
//		double y = sc.nextDouble();
//		double add = x + y;
//		double sub = x - y;
//		double mul = x * y;
////		double div = x / y;
//		String div = (y == 0) ? "[����] 0���� ���� �� ����!" : x/y + "";
//		System.out.println(add);
//		System.out.println(sub);
//		System.out.println(mul);
//		System.out.println(div);
		/*
		 * Infinity, -Infinity: ���Ѵ�
		 * nan (not a number)
		 * 
		 * */
		
		
		// Q3. ����ڿ��� "hello world" ���ڿ��� �Է¹޾ƺ���!
		// sc.next()
//		System.out.print("���ڿ� �Է�: ");
//		String s1 = sc.next();
//		System.out.println(s1);
//		String s2 = sc.nextLine();
//		System.out.println(s2);
		
		// ���� ���ۿ� �����ִ� ���빰�� �����ϰ� �ʹٸ�?
//		sc.close(); // ���������� flush() ȣ��
		

		// next(): ����/space ������ ������
		// nextLine(): ���� ������ ������
		// "hello world"
		
		// Q1. char �ϳ��� �����ϰ� ���� ��?
//		char ch = sc.next().charAt(0); 
		// �Էµ� ���ڿ� �� ���� ù��°�� ������ ��
		// "abcd" -> 'a'
		// "a" -> 'a'
//		char ch = "hello".charAt(0);
//		System.out.println(ch);
		
		// "a" vs 'a'
		// "a" : ������ + �Լ� (String)
		// 'a' : ������ (char)
		
		// Q1. ���� (�� -> Ư����) �Ʒ��� ���� �� 
		// �ϳ��� �����ϸ� Ư���ð� �� �� �ִٰ� ����
		// 1) �ش� ���ð� �߽����̰� �α��� 100�� �̻�
		// 2) ������ �α� 50�� �̻�
		
		// �Էº���: �߽������� �ƴ��� (boolean), �α��� ��, ������ ��
//		System.out.print("�߽�����? (yes/no) ");
//		String isCenter = sc.next().toLowerCase();
//		// yes (YES, Yes, yEs)
//		// no (NO)
//		System.out.print("�α�����? (�� ������ �Է�) ");
//		int citizen = sc.nextInt();
//		
//		System.out.print("���ڼ���? (�� ������ �Է�) ");
//		int riches = sc.nextInt();
//		
//		// ���ڿ����� �񱳴� equals()
//		boolean isCity = ((isCenter.equals("yes")) 
//				&& (citizen >= 100))
//				|| (riches >= 50);
//		System.out.println("Ư���� ���� : " + isCity);
//		
		
		// Q2. ����ڿ��� �� �� (����)�� �Է��� �޾Ƽ� 
		// �� ������ �ﰢ���� ���� �� �ִ��� Ȯ���ϴ� ���α׷�
		// a, b, c (c�� ���� ũ�ٰ� ����)
		// a + b > c
		
//		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
//		int a = sc.nextInt();
//		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
//		int b = sc.nextInt();
//		System.out.print("����° ���� �Է��Ͻÿ� : ");
//		int c = sc.nextInt();
//		
//		boolean isTriangle = (a + b > c); // true, false
//		String triangleStr = isTriangle ? "�ﰢ�� O" : "�ﰢ�� X";
//		System.out.println(triangleStr);
		
		
		// Q3. ����ڿ��� ����, ����, ���� ���� (����)�� �Է��� �޾Ƽ�
		// �� ������ ����� 70���� �Ѵ��� Ȯ���ϴ� ���α׷�
//		System.out.print("���� ���� �Է� : ");
//		int kor = sc.nextInt();
//		System.out.print("���� ���� �Է� : ");
//		int math = sc.nextInt();
//		System.out.print("���� ���� �Է� : ");
//		int eng = sc.nextInt();
//		
//		// kor + math + eng == 200
//		double avg = (kor + math + eng) / 3.0; 
//		boolean avgChk = avg > 70;
//		System.out.println(avgChk ? "70�� �ʰ�" : "70�� ����");
		
		
		// Q4. ����ڿ��� ���� �ϳ� �Է¹޾� 
		// �ش� ���� Ȧ������ ¦������ �Ǵ��ϴ� ���α׷�
		System.out.print("���� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		
		// Ȧ�� (odd), ¦�� (even)
		boolean isOdd = num % 2 == 1; // 3, 5, 7, 9
//		boolean isEven = num % 2 == 0; // 2, 4, 6, 8
		
		System.out.println(isOdd ? "Ȧ��" : "¦��");
		
	}
}
