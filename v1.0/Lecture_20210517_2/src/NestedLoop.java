import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ��ø �ݺ��� (���� �ݺ���, nested loop)
		 * : �ݺ��� �ȿ� �ݺ����� �� �ִ� ����
		 * 
		 * */
		
		
		
		/*
		 * for(){
		 * 	for(){
		 * 	}
		 * }
		 * 
		 * for(){
		 * }
		 * 
		 * for(){
		 * }
		 * 
		 * 
		 * 
		 *  ********
		 *  ********
		 *  ********
		 *  ********
		 *  ********
		 * 
		 * */
		
		// �� ? 40��
//		for(int i = 1; i <= 5 ; i ++) { // ��
//			for(int j = 1; j <= 8; j ++) { // ��
//				System.out.print("*"); // 
//			}
//			System.out.println(); // ����
//		}
//		System.out.println();
//		// ��ø �ݺ����� �����ڵ��� ���϶�� ����
//		for(int i = 1; i <= 40; i ++) {
//			System.out.print("*");
//			if (i % 8 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= 5; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= 5; j ++) {
//				if(i + j > 5) System.out.print("*");
//				else System.out.print(" ");	
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= 5; j ++) {
//				if(j >= 6 - i) System.out.print("*");
//				else System.out.print(" ");	
//			}
//			System.out.println();
//		}
//		
		
		
		// 1. �ϳ��� ���� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ�
//		System.out.print("n �Է� : ");
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int cnt = 0;
//		boolean isPrime = false; // �Ҽ��� �ƴ϶�� ����
		// 20 : 1 ~ 20
		// �Ҽ��� ����� ������ 2�� (1�� �ڱ��ڽ�)
		
		// for���� ������ ���ƺ��� �� (1 ~ n)
//		for(int i = 1; i <= n; i ++) {
//			if(n % i == 0) {
//				cnt ++;
//			}
//		}
//		if(cnt == 2) isPrime = true; // �Ҽ��̸� isPrime true�� ����
//		//else isPrime = false;
//		System.out.println((isPrime) ? "�Ҽ�" : "�Ҽ��ƴ�");
		
		// boolean isPrimeNumber(int n)
		
//		isPrime = true; // �Ҽ���� ����
//		int i;
//		for(i = 2; i < n; i ++) {
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		System.out.println((isPrime) ? "�Ҽ�" : "�Ҽ��ƴ�");
		
		// ���
		// ����� ������ ¦���� ���?
		// 20: 1  2  4 // 5  10   20
		// 33: 1  3 //  11 33
		// 15: 1 // 15
		// 24: 1 2 3 4 // 6 8  12  24 
		// 26: 1 2 //   13  26
		
		// ����� ������ Ȧ���� ���?
		// 25: 1   5 //   25
		// 16: 1  2  4 //  8  16
		// 49: 1   7 //   49
		
		// �����佺�׳׽��� ü
//		isPrime = true; // �Ҽ���� ����
//		for(i = 2; i <= (int)Math.sqrt(n) ; i ++) {
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		System.out.println((isPrime) ? "�Ҽ�" : "�Ҽ��ƴ�");
		
		
		
		//if (i == n) isPrime = true;
		
		// 2. 2 ~ n ���� �Ҽ� ã��
		
		int n;
		int cnt = 0;
		System.out.print("n �Է�: ");
		n = sc.nextInt();
		for(int i = 2; i <= n; i ++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
				cnt ++;
			}
		}
		System.out.println();
		System.out.println("�� ���� : " + cnt);
		
		
		
		
		/*
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * */
		
		// ����ڿ��� n�� �Է¹޾� 1 ~ n���� �Ҽ� ���
		
		
//		for(int i = 0; i < 5; i ++) {
//			System.out.println("********");
//		}
//		
//		for(int i = 0; i < 5; i ++) { // ��
//			for(int j = 0; j < 8; j ++) { // ��
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		/*
//		 * i = 0; j = 0 ~ 7 (8��)
//		 * i = 1; j = 0 ~ 7 (8��)
//		 * i = 2; j = 0 ~ 7 (8��)
//		 * ...
//		 * i = 4; j = 0 ~ 7 (8��)
//		 * */
//	
//		
//		for (int i = 1; i < 41; i ++) { // 1 ~ 40
//			System.out.print("*");
//			if (i % 8 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println();
//		System.out.println();
//		for (int i = 1; i <= 5; i ++) {
//			for (int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		Scanner input = new Scanner(System.in);
//		System.out.print("�л��� ���� �Է��Ͻÿ� : ");
//		int n = input.nextInt();
//		final int numberofscore = 5;
//		int score;
//		int sum;
//		
//		for(int i = 0; i < n; i ++) {
//			sum = 0;
//			System.out.printf("========= �л� %d ���� ==========\n", i + 1);
//			for(int j = 0; j < numberofscore; j ++) {
//				System.out.print("������ �Է��Ͻÿ� : ");
//				score = input.nextInt();
//				sum += score;
//			}
//			System.out.println("�հ� : " + sum);
//			System.out.println("��� : " + (double)sum / numberofscore);
//		}
		
//		int n;
//		System.out.print("�Ǻ��ϰ��� �ϴ� ���� �Է� : ");
//		n = input.nextInt();
//		int i;
//		for(i = 2; i < n; i ++) {
//			if (n % i == 0) {
//				System.out.println("�Ҽ� X");
//				break;
//			}
//		}
//		if(i == n) {
//			System.out.println("�Ҽ� O");
//		}
		
//		int i, j, cnt = 0;
//		for(i = 2; i <= 100; i ++) {
//			for(j = 2; j < i; j ++) {
//				if (i % j == 0) {
//					break;
//				}
//			}
//			if (j == i) {
//				System.out.print(i + " ");
//				cnt ++;
//			}
//		}
//		System.out.println();
//		System.out.println("�Ҽ��� �� �� �ΰ���? " + cnt + "��");
		// 2 ~ 100
		// 2: 
		// 3: 
		// 4: 2 3
		// 5: 2 3 4
		
		
		// 5: 2 3 4 // �Ҽ� o
		// 6: 2 3 4 5 // �Ҽ� X
		
		// ��Ÿ���
//		System.out.println("======= ��Ÿ��� ���� =======");
//		int cnt = 0;
//		// a < b < c
//		for(int a = 1; a < 100; a++) {
//			for(int b = 1; b < 100; b++) {
//				for(int c = 1; c < 100; c++) {
//					if ((a * a + b * b == c * c) && (a < b)) {
//						System.out.printf("%2d %2d %2d \n", a, b, c);
//						cnt ++;
//					}
//				}
//			}
//		}
//		System.out.println("��Ÿ��� �����ϴ� �� = " + cnt);
//		System.out.println("===========================");
//		
//		
//		int n, num, min, max;
//		/*
//		 * ���������� ���� ���� ��: Integer.MIN_VALUE // -2147483648 (-2^31)
//		 * ���������� ���� ū ��:  Integer.MAX_VALUE // 2147483647 (2^31-1)
//		 * */
//		System.out.print("n �Է� : ");
//		n = input.nextInt();
//		max = 0;
//		min = 0;
		
		// ���� ó���� MAX, MIN � ���� ���� ��?
		// MAX = 0
		// -35 -40 -20
		
		// MIN = 0
		// 35 40 50
		
//		for(int i = 0; i < n; i++) {
//			System.out.print("�� �Է� : ");
//			num = input.nextInt();
//			if(i == 0) {
//				min = num;
//				max = num;
//			}
//			if (num < min) {
//				min = num;
//			}
//			if (num > max) {
//				max = num;
//			}
//			
//		}
		
	//	System.out.printf("�ּ� = %d, �ִ� = %d", min, max);
	}
	
	public static boolean isPrimeNumber(int n) {
		boolean isPrime = true; // �Ҽ���� ����
		int i;
		for(i = 2; i < n; i ++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}

}
