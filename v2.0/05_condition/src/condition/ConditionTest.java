package condition;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ����ڿ��� �� ������ �Է� (Scanner)
//		System.out.print("ù��° ���� �Է�: ");
//		int a = sc.nextInt();
//		System.out.print("�ι�° ���� �Է�: ");
//		int b = sc.nextInt();
//		
//		// a / b (b != 0)
//		
//		// ���ǽ� (true/false�� �Ǵܰ����� ��)
//		if(b == 0) { // ��� (block)
//			System.out.println("��� �Ұ�!");
//			System.out.println("0���� ���� �� �����ϴ�!");
//		}
//		else { // b != 0
//			double div = (double)a / b;
//			System.out.println(div);
//		}
//		
//		// Q1. ��������� ����, ����, ���� �����޾Ƽ� 
//		// ����� 70�� ������ "�հ�"
//		// 70�� ���� ������ "���հ�" (if-else)
//			// 1) ����, ����, ���� (0 �̸�, 100 �ʰ��� ��ȿ���� ����)
//		System.out.print("���� ����: ");
//		int kor = sc.nextInt();
//		// ��ȿ�� �˻�
//		if((kor < 0 || kor > 100)) {
//			System.out.println("[���] ���� ������ ��ȿ���� �ʽ��ϴ�");
//			return; // ���α׷� ���� (�����Լ� ����)
//		}
//		
//		System.out.print("���� ����: ");
//		int math = sc.nextInt();
//		// ��ȿ�� �˻�
//		if((math < 0 || math > 100)) {
//			System.out.println("[���] ���� ������ ��ȿ���� �ʽ��ϴ�");
//			return;
//		}
//		
//		System.out.print("���� ����: ");
//		int eng = sc.nextInt();
//		// ��ȿ�� �˻�
//		if((eng < 0 || eng > 100)) {
//			System.out.println("[���] ���� ������ ��ȿ���� �ʽ��ϴ�");
//			return;
//		}
//		
		//
//		double avg = (kor + math + eng) / 3.0;
//		
//		if(avg > 70) {
//			System.out.println("�հ�");
//		}
//		else { // avg <= 70
//			System.out.println("���հ�");
//		}
//		
 		
		// Q2. ����ڿ��� �� �� (����)�� �Է��� �޾Ƽ� 
		// �� ������ �ﰢ���� ���� �� �ִ��� Ȯ���ϴ� ���α׷�
		// a, b, c (c�� ���� ũ�ٰ� ����)
		// a + b > c
			// 1) a, b, c�� 0���� ���� �� ����
	
//		System.out.print("�� ������ �Է� (ex) 3 4 5) : ");
//		int x = sc.nextInt();
//		if(x < 0) {
//			System.out.println("[����] ���� ���̴� ������ �� �� ����");
//			return;
//		}
//		int y = sc.nextInt();
//		if(y < 0) {
//			System.out.println("[����] ���� ���̴� ������ �� �� ����");
//			return;
//		}
//		int z = sc.nextInt();
//		if(z < 0) {
//			System.out.println("[����] ���� ���̴� ������ �� �� ����");
//			return;
//		}
//		
//		// x, y, z �� �ִ� ã�� �ڵ�
//		int max = x; // x�� �ִ��� ���´ٰ� ����
//		int left1 = y;
//		int left2 = z;
//		
//		if(y > max) max = y; left1 = x; left2 = z;
//		if(z > max) max = z; left1 = x; left2 = y;
//		///////////////////////////////////////////
//		
//		if(left1 + left2 > max) { // max
//			System.out.println("�ﰢ�� �������� ����!");
//		}
//		else {
//			System.out.println("�ﰢ�� �������� �Ҹ���!");
//		}
		
		
		// ���� ū �� : a, b, c
		// a > b && a > c
		// b > a && b > c
		// c > a && c > b
		// Q3. ����ڿ��� �Է¹��� �� ���� �� ���� ū ���� ���ϴ� ���α׷�
		/* if(){
		 * }
		 * else{
		 * 		if(){
		 * 		}
		 * 		else(){
		 * 		}
		 * }*/
		
//		System.out.print("�� ������ �Է� (ex) 3 5 6) : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int max = 0;
//		
//		if(a > b) {
//			if(a > c) {
//				max = a;
//			}
//			else { //b < a <= c
//				max = b;
//			}
//		}
//		else { // b >= a
//			if(b > c){ // b >= a && b > c
//				max = b;
//			}
//			else { // c >= b >= a
//				max = c;
//			}
//		}
//		System.out.println(max);
//		
//		///////////////////////
//		
//		if(a > b && a > c) {
//			max = a;
//		}
//		else if(b > a && b > c) { 
//			max = b;
//		}
//		else if(c > a && c > b) {
//			max = c;
//		}
//		
//		System.out.println(max);
//		
//		///////////////////////
//		
//		if(a > b && a > c) {
//			max = a;
//		}
//		if(b > a && b > c) { 
//			max = b;
//		}
//		if(c > a && c > b) {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		////////////////////////////////////////////
		// Q4. ����ڿ��� ���� �ϳ� (char)�� �Է¹޾� �ҹ��ڷ� ����
		// �ҹ��� -> �ҹ���, �빮�� -> �ҹ���
		// toLowerCase() ��� �Ұ�
		// 	1) ���ĺ� �̿��� �ٸ� ���ڰ� ���� ��� ����
		
//		System.out.print("���� �ϳ��� �Է��Ͻÿ�: ");
//		char ch = sc.next().charAt(0); 
//		// a (97) ~ z, A (65) ~ Z
//		
//		// ��ȿ�� �˻�
//		if(ch < 'A' || (ch > 'Z' && ch < 'a') || ch > 'z') {
//			System.out.println("[���] ���ĺ��� �ƴմϴ�!");
//			return;
//		}
//			
//		if(ch >= 'A' && ch <= 'Z') {
////			ch = (char)(ch + ('a' - 'A'));
//			// ���ڳ��� ��Ģ������ ���� (�ƽ�Ű�ڵ尪)���� ��Ģ����� ����
//			// ch -> 'A' ~ 'Z'
//			ch += ('a' - 'A');
//			
//		}
//		System.out.println(ch);
		
		
		// Q5. ���� �Ǵ� ���α׷�
		// ����ڿ��� ������ �ϳ� �Է¹޾�
		// (��ȿ���� ���� ������ 100�� �ʰ�, 0�� �̸� ������ ���)
		// 90�� �̻��̸�: 'A'
		// 80 <=    < 90: 'B'
		// 70 <=    < 80: 'C'
		// 60 <=    < 70: 'D'
		// 60�� �̸�: 'F'
		
//		System.out.print("���� �ϳ� �Է�: ");
//		int score = sc.nextInt();
//		
//		if(score > 100 || score < 0) {
//			System.out.println("[����] ��Ȯ�� ������ �Է��ϼ���");
//			return;
//		}
//		
//		char gpa = 0;
//		
//		
//		// 85, 89
//		if(score >= 90) {
//			gpa = 'A';
//		}
//		else if(score >= 80) { // 80 <= score < 90
//			gpa = 'B';
//		}
//		else if(score >= 70) { // 70 <= score < 80
//			gpa = 'C';
//		}
//		else if(score >= 60) { // 60 <= score < 70
//			gpa = 'D';
//		}
//		else { // score < 60
//			gpa = 'F';
//		}
//		
//		
		
		// Q6. ������ ���� (x, y ����)
		// ex) 3 + 4
		// ���� (+, -, *, /(0���� ������ ��� ���� (���� ���))
		// int i = Integer.valueOf(s); // String -> int
		
//		System.out.print("������ �Է� (ex) 3 + 5) : ");
//		
//		// 3 + 5
//		int x = sc.nextInt(); // 3
//		char op = sc.next().charAt(0); // +
//		// "hello world"
//		// next() (������: �����̽�, ����) "hello"
//		// vs nextLine() (������: ����)  "hello world"
//		int y = sc.nextInt(); // 5
//		double res = 0;
//		
//		// +
//		// ������ ��ȿ�� �Ǵ�
////		if(!(op == '+' || op == '-' || ..)) {}
//		
//		if(op == '+') {
//			res = x + y;
////			System.out.printf("%d %c %d = %d\n", x, op, y, (int)res);
//		}
//		else if(op == '-') {
//			res = x - y;
////			System.out.printf("%d %c %d = %d\n", x, op, y, (int)res);
//		}
//		else if(op == '*') {
//			res = x * y;
////			System.out.printf("%d %c %d = %d\n", x, op, y, (int)res);
//		}
//		else if(op == '/') {
//			if(y == 0) {
//				System.out.println("[����] 0���� ���� �� ����");
//				return;
//			}
//			
////			else {
//				res = (double)x / y;
////				System.out.printf("%d %c %d = %f\n", x, op, y, res);
////			}
//		}
//		else { // ������ ��ȿ�� �˻�
//			System.out.println("[����] �����ϴ� �����ڰ� �ƴ�");
//			return;
//		}
//		System.out.printf("%d %c %d = %f\n", x, op, y, res);
		
		
		// Q7. ��������� ���� (���ĺ�, ����) �ϳ��� �Է¹޾�
		// �ش� ���ڰ� �ҹ�������, �빮������, �������� �Ǵ� ���α׷�
		// (������ ��쿡 ���ؼ��� Ư�����ڶ�� ���)
		
//		System.out.print("���� �Է�: "); // 0
//		char ch = sc.next().charAt(0); // "0" -> '0'
//		
//		if(ch >= 'a' && ch <= 'z') {
//			System.out.println("�ҹ���");
//		}
//		else if(ch >= 'A' && ch <= 'Z') {
//			System.out.println("�빮��");
//		}
//		else if(ch >= '0' && ch <= '9') {
//			System.out.println("����");
//		}
//		else {
//			System.out.println("Ư������");
//		}
		
		
		// Q8. ����ڿ��� �� �� (�Ǽ�)�� �Է¹޾� 
		// �ش� ���� ��и� �Ǵ� ���α׷�
		// (����, X��, Y�� ���� ���� ���� ���� ����)
		
		System.out.print("�� ���� �Է� (ex) 3.5 5.5) : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("1 ��и�");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2 ��и�");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3 ��и�");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4 ��и�");
		}
		else {
			if(x == 0 && y == 0) {
				System.out.println("����");
			}
			else if(y == 0) {
				System.out.println("X�� ��");
			}
			else if(x == 0) {
				System.out.println("Y�� ��");
			}
		}
		
		
		
		
//		int score = 95;
//		char gpa = 0; 
//		// ���� �������ڸ��� �ʱ�ȭ (initialization)����!
////		String str = "";
//		if(score >= 90) {
//			gpa = 'A';
//		}
//		else if(score >= 80) {
//			gpa = 'B';
//		}
//		else if(score >= 70) {
//			gpa = 'C';
//		}
//		else if(score >= 60) {
//			gpa = 'D';
//		}
//		else {
//			gpa = 'F';
//		}
//		System.out.println(gpa); // 60�� �̸�
//		
		
//		if(b == 0) System.out.println("��� �Ұ�!");
		
		// �Ϲ����� ���� (�򼭹�)
		System.out.println("���� ����ɱ��?"); // �׻� ����
	}

}
