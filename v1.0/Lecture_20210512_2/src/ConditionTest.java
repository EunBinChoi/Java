import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
		
		if (score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) { // 80 <= score < 90
			System.out.println("B");
		}
		else { // score < 80
			System.out.println("���հ� !");
		}
		
		if (score >= 90) {
			System.out.println("A");
		}
		if (score >= 80 && score < 90) { // 80 <= score < 90
			System.out.println("B");
		}
		if (score < 80) { // score < 80
			System.out.println("���հ� !");
		}
		
		
		
		
//		
//		// ���ǹ�: ������ 70�� �̻��̸� Pass�ϴ� ���α׷�
//		int score;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("���� ������ ..? ");
//		score = input.nextInt();
//		
//		// ������ ���̸�
//		if (score >= 70) { // ��� (block)
//			System.out.println("�հ��Դϴ� !");
//			System.out.println("�����մϴ� !");
//		}
//		
//		// ������ �����̸�
//		else {
//			System.out.println("���հ��Դϴ� !");
//		}
//		
//		// ��� ���� (/)
//		// 3 / 0 => ���Ѵ�
//		
//		int x, y;
//		System.out.print("x�� �Է��Ͻÿ� : ");
//		x = input.nextInt();
//		
//		System.out.printf("y�� �Է��Ͻÿ� : ");
//		y = input.nextInt();
//		
//		// 0 / 0 == 
//		// 3 / 0 == 
//		// 0 / 3 == 0
//		
//		if (y == 0) {
//			System.out.println("[���] ���� �� ���� !!");
//		}
//		// y != 0
//		else {
//			System.out.println("x / y = " + x / (double)y);
//			System.out.printf("x / y = %-10.2f", x / (double)y);
//			// printf: ���� �״�� ����ض�
//			// 10: ����
//			// .2: �Ҽ��� �ڿ� 2���� �����޶�
//			// -: ���� ����
//			// +: ������ ���� (���� ����)
//		}
//		
//		// if��, if-else��, if, else if, else��
//		
//		// 90 ~ 100: A����
//		// 80 ~ 89: B����
//		// 70 ~ 79: C����
//		// 60 ~ 69: D����
//		// 60 �̸�: F����
//		
//		int grade;
//		Scanner input = new Scanner(System.in);
//
//		// 0 ~ 100
//		// 0 ~ 100 �̿��� ���ڴ� �������� ��ȿ���� ���� ������
//		System.out.print("����� ������ �Է��Ͻÿ� : ");
//		grade = input.nextInt();
//
//		// if���� ��ø
//		/*
//		 * if () { if ()
//		 * 
//		 * }
//		 * 
//		 */
//
//		// 0 <= grade <= 100
//		if (grade >= 0 && grade <= 100) {
//			if (grade >= 90) {
//				System.out.println("A ����");
//			}
//			// System.out.println("�򼭹��Դϴ� ..!");
//			// ���ǹ� �߰��� �򼭹��� ���� �� ����
//
//			// grade < 90
//			else if (grade >= 80) {
//				System.out.println("B ����");
//			}
//			// grade < 80
//			else if (grade >= 70) {
//				System.out.println("C ����");
//			}
//			// grade < 70
//			else if (grade >= 60) {
//				System.out.println("D ����");
//			}
//			// grade < 60
//			else {
//				System.out.println("F ����");
//			}
//		}
//		// System.out.println("�򼭹��Դϴ� ..!");
//		// ���ǹ� �߰��� �򼭹��� ���� �� ����
//
//		// grade < 0 || grade > 100
//		else {
//			System.out.println("[���] ��ȿ���� ���� �����Դϴ�.");
//		}

		// ���� 0 ~ 100�� ����..

		// 1. �ҵ漼 ��� ���α׷�
		/*
		 * 1000: 9% => 9/100 
		 * 1001 ~ 4000: 18% => 18/100 
		 * 4001 ~ 8000: 27% => 27/100 
		 * 8000 �ʰ�: 36% => 36/100
		 * 
		 * �ҵ漼�� ����Ͻÿ�.
		 * 
		 */
//		int income; // ����
//		double tax; // ����
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("������ �Է��Ͻÿ� (����) : ");
//		income = input.nextInt();
//		
//		if (income <= 1000) {
//			tax = 0.09;
//		}
//		// income > 1000
//		else if(income <= 4000) {
//			tax = 0.18;
//		}
//		// income > 4000
//		else if(income <= 8000) {
//			tax = 0.27;
//		}
//		else {
//			tax = 0.36;
//		}
//		
//		System.out.println("�ҵ漼�� " + (income * tax) + "���� �Դϴ�.");

		// 2. ���� x�� �Է¹޾� �Լ��� f(x)�� ���غ��ÿ�. (if-else)
		// f(x) = 0 if x <= 0
		// f(x) = x * x + 4 * x + 5 else
		
//		int x, fx;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("x�� ���� �Է��Ͻÿ� : ");
//		x = input.nextInt();
//		
//		if (x <= 0) {
//			fx = 0;
//		}
//		else {
//			fx = x * x + 4 * x + 5;
//		}
//		System.out.printf("f(%d) = %d \n", x, fx);

		// 3. Ȧ¦ �Ǻ���
		// � ������ �Է¹޾� �ش� ���� Ȧ������ ¦������ 
		// �Ǵ��ϴ� ���α׷��� �ۼ�
		
		// ¦��: 2�� �������� �� �������� 0
		// Ȧ��: ¦�� �̿��� ��
		
//		int num;
//		System.out.print("���ڸ� �Է��Ͻÿ� : ");
//		num = input.nextInt();
//		
//		if (num != 0) {
//			if (num % 2 == 0) {
//				System.out.println("¦��");
//			}
//			else {
//				System.out.println("Ȧ��");
//			}
//		}
//		else {
//			System.out.println("���� 0 �Դϴ�.");
//		}
		
		// ������ ���� �ǽ�
		// x, y, ������ (+, -, *, /)
		
//		int x, y;
//		char op;
//		int res;
//		double res_div;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("x�� ���� �Է��Ͻÿ� : ");
//		x = input.nextInt();
//		
//		System.out.print("y�� ���� �Է��Ͻÿ� : ");
//		y = input.nextInt();
//		
//		System.out.print("������ (+, -, *, /) �Է��Ͻÿ� : "); // +
//		op = input.next().charAt(0);
//		// charAt(0): ���ڿ� �߿��� ù��° ���� �ϳ��� ��� ��
//		// "+" -> '+'
//		
//		System.out.println(op);
//		
//		if (op == '+') {
//			res = x + y;
//			System.out.printf("%d %c %d == %d", x, op, y, res);
//		}
//		else if (op == '-') {
//			res = x - y;
//			System.out.printf("%d %c %d == %d", x, op, y, res);
//		}
//		else if (op == '*') {
//			res = x * y;
//			System.out.printf("%d %c %d == %d", x, op, y, res);
//		}
//		else if (op == '/') { // x / y
//			if (y == 0) {
//				System.out.println("y == 0�̶� ���� �� �����ϴ� !!");
//			}
//			else {
//				res_div = x / (double)y;
//				System.out.printf("%d %c %d == %f", x, op, y, res_div);
//			}
//		}
//		else { // ^
//			System.out.println("�����ڰ� �����ϴ� !");
//		}
//		
		//System.out.printf("%d %c %d == %d", x, op, y, res);
		
		
		
		// �ϳ��� ���ڸ� �Է¹޾� ������ ������ �����ϴ� ���α׷��� �ۼ�
		// char ch = input.next().charAt(0)
		// * �ҹ���, �빮�� ��� �����ϰ� ������ּ��� !
		
		// ����: a(A), e(E), i(I), o(O), u(U)
		// ����: ���� ������ ��� ����
		
//		char ch;
//		Scanner input = new Scanner(System.in);
//		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
//		ch = input.next().charAt(0);
//		// �ƽ�Ű�ڵ� (ascii code)
//		// 'a' : 97
//		// 'A' : 65
//		
//		// �ڹ� (������) --> �����Ϸ� --> ��ǻ�� ��� (����, 2����, 010101)
//		// 'a', 'b'
//		
//		// ���� --> ������ --> �ѱ���
//		// ch : A (65) ~ Z (90) (�빮��)
//		// ch : a (97) ~ z (122) (�ҹ���)
//		
//	
//		// �빮�ڸ� �ҹ��ڷ� �ٲ��ִ� �κ�
//		if (ch >= 'A' && ch <= 'Z') {
//			ch = (char)(ch + ('a' - 'A'));
//			// ch: 'C': 67
//			//     'c': 67 + 32
//		}
//		
//		if (ch == 'a' || ch == 'e' || ch == 'i' ||
//				ch == 'o' || ch == 'u') {
//			System.out.println("����");
//		}
//		
//		else {
//			System.out.println("����");
//		}
//		
		
		// �ϳ��� ���ڸ� �Է¹޾� �ҹ������� �빮������ �����ϴ� ���α׷��� �ۼ�
		// char ch = input.next().charAt(0)
		// ch >= 'a' && ch <= 'z'
		// ch >= 'A' && ch <= 'Z'
		// �ҹ���, �빮�� (����), ����
		
		char ch;
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		
		ch = input.next().charAt(0);
		// 9 -> '9'
		// a -> 'a'
		// E -> 'E'
		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ���");
		}
		else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮��");
		}
		else if (ch >= '0' && ch <= '9') {
			System.out.println("����");
		}
//		else {
//			System.out.println("���ĺ��� �ƴ�");
//		}
		
		
		
		
		
		
		
	}

}
