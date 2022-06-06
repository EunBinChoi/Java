import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {

		/*
		 * �ݺ���: while (**), do while, for (*****)
		 * 
		 * while: �ʱⰪ, ���ǽ�, ������
		 * 
		 * ���� �ݺ�: �׻� ������ ���� �Ǵ� �ݺ��� while(true) {
		 * 
		 * 
		 * } => �ݺ����� ���������� ���: break;
		 * 
		 * do { 
		 * 	���� 
		 * } while(����);
		 * 
		 * 1) �ݺ� ������ �ݺ��� ������ �˻� 
		 * 2) ������ ������ �ѹ��� ����� (���� �� ���� �������)
		 * 
		 */

//		int i = 1;
//		
//		do {
//			System.out.println("i�� �� : " + i);
//			i ++;
//			
//		} while (i < 3);
//		System.out.println(i); // ?
//		
//		System.out.println();
//		
//		i = 10;	
//		do {
//			System.out.println("i�� �� : " + i);
//			i ++;
//			
//		} while (i <= 20);
//		System.out.println(i); // 21

		/*
		 * for ����
		 * 
		 * for(�ʱ�ȭ ; ���ǽ� ; ������){ 
		 * 		����; 
		 * }
		 * 
		 * while 1. �ʱ�ȭ 2. ���ǽ� 3. ������
		 * 
		 */

		int i; // ���� �Լ� �ȿ��� �����Ǽ� ���� �Լ��� ������ �Ҹ�
		
		for(i = 0; i < 5; i ++) {
			System.out.println("i�� �� : " + i);
		}
		System.out.println("����� i�� �� :" + i); // i == 5
		System.out.println();
		
		for(i = 1; i <= 5; i ++) {
			System.out.println("i�� �� : " + i);
		}
		System.out.println("����� i�� �� :" + i); // i == 6
		System.out.println();
//		
//		
//		for(i = 5; i > 0; i --) {
//			System.out.println("i�� �� : " + i);
//		}
//		System.out.println("����� i�� �� :" + i); // i == 0
//		System.out.println();
//		
//		for(i = 5; i >= 1; i --) {
//			System.out.println("i�� �� : " + i);
//		}
//		System.out.println("����� i�� �� :" + i); // i == 0
//		System.out.println();

		// 1. ����ڿ��� n�� �Է¹޾�
		// 1 + 2 + ... + n ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (sigma)
//		int sum = 0;
//		int n;
		Scanner input = new Scanner(System.in);
//		
//		System.out.print("n�� �Է��Ͻÿ� : ");
//		n = input.nextInt();
//		
//		for (int i = 1; i <= n; i ++) {
//			sum = sum + i;
//		}	
//		System.out.println("����� : " + sum);
		// 0 + 1
		// 0 + 1 + 2
		// 0 + 1 + 2 + 3
		// 0 + 1 + 2 + 3 + 4
		// 0 + 1 + 2 + 3 + 4 + 5

		// 2. ����ڿ��� n�� �Է¹޾�
		// 1 x 2 x .... x n ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (factorial)
//		
//		int fact = 1; // ����� ����
//		int n;
//		
//		System.out.print("n�� �Է��Ͻÿ� : ");
//		n = input.nextInt();
//		
//		for (int i = 1; i <= n; i ++) {
//			fact = fact * i;
//			// fact *= i;
//		}
//		System.out.printf("%d! = %d \n", n, fact);
		// format

		// fact = 1 x 1
		// fact = 1 x 1 x 2
		// fact = 1 x 1 x 2 x 3
		// fact = 1 x 1 x 2 x 3 x 4
		// fact = 1 x 1 x 2 x 3 x 4 x 5

		// 3. 1 ~ 10 ������ 3�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �� for�� �ȿ� if��

		// %: ������ ������
		// 3 % 5 == 3
		// 5 % 2 == 1
//		System.out.print("3�� ��� : ");
//		for (int i = 1; i <= 10; i++) {
//			if (i % 3 == 0) {
//				System.out.printf("%d, ", i);
//			}
//		}

		// 4. ����ڿ��� n�� �Է¹޾�
		// �ش� ���� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �� �Ҽ� (prime number): 1�� �ڱ��ڽ����θ� ���������� ��
//		int n;
//		int cnt = 0; // ī��Ʈ ������ �ʱⰪ ���� !!!
//		System.out.print("���� �Է��Ͻÿ� : ");
//		n = input.nextInt();

//		for (int i = 1; i <= n; i ++) {
//			if (n % i == 0) {
//				cnt ++; // cnt = cnt + 1
//				System.out.println("����������� �� : " + i);
//			}
//		}
//		if (cnt == 2) {
//			System.out.println("�Ҽ�");
//		}
//		else {
//			System.out.println("�Ҽ� �ƴ�");
//		}
//		
//		int i;
//		for (i = 2; i < n; i++) {
//			if (n % i == 0) {
//				System.out.println("�Ҽ��� �ƴմϴ�.");
//				break;
//			}
//
//		}
//		System.out.println(i);
//
//		// ���������� for���� ���� (�ѹ��̶� break���� ������ ����)
//		if (i == n) {
//			System.out.println("�Ҽ��Դϴ�.");
//		}

		// 5 => 1 2 3 4 5
		// 1, 5 ==> �Ҽ�
		// 1, 5 �̿��� �ٸ� ���� ���� => �Ҽ� X

		// 4 => 1 2 3 4
		// 1, 2, 4 => �Ҽ� X

		// 7 => 1 2 3 4 5 6 7
		// 1, 7 => �Ҽ�

		// 8 => 1 2 3 4 5 6 7 8
		// 1, 2, 4, 8 => �Ҽ� X

		// 10 => 1 2 3 4 5 6 7 8 9 10

		// 16 => 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

		// 25 => 1 2 3 4 5 ...23 24 25

//		for(int i = 1; i <= 10 ; i ++) {
//			if (i % 3 == 0) {
//				break;
//			}
//		
//			System.out.println(i);
//		}
//		System.out.println("�ݺ��� ��");

		// break: �ݺ��� ����
		// continue: �ݺ��� �ٽ� ����
		// 1 2 3 4 5 6 7 8 9 10
//		for (int i = 1; i <= 10; i++) {
//			if (i % 3 == 0) {
//				continue; // 3, 6, 9 ����
//			}
//
//			System.out.println(i);
//		}
//		System.out.println("�ݺ��� ��");
		
		
		// ���ٿ� ����
		// answer => 1 <= answer  <= 100 ���� Random ������ ���� (Math.random())
		// guess 
		// if (answer > guess) -> "������ ���� �ʹ� �۽��ϴ�"
		// else if (answer < guess) -> "������ ���� �ʹ� Ů�ϴ�"
		
		// answer = 59
		// guess: 50
		// "������ ���� �ʹ� �۽��ϴ� (up)"
		// guess: 60
		// "������ ���� �ʹ� Ů�ϴ� (down)"
		// guess: 53
		// "������ ���� �ʹ� �۽��ϴ� (up)"
		// guess: 56
		// "������ ���� �ʹ� �۽��ϴ� (up)"
		// guess: 59 
		// ���� guess == answer -> "�����մϴ�!", �õ�Ƚ�� = 5
		

		// ���� ����
//		while(true) {
//			
//		}
//		
//		for (;;)
		
		int guess;
		int answer = (int)(Math.random() * 100) + 1;
		int tries = 0; // �õ�Ƚ�� ����
		
//		while(true) {
//			System.out.print("guess? ");
//			guess = input.nextInt();
//			tries ++;
//			
//			if (guess == answer) {
//				System.out.println("�����մϴ�!");
//				System.out.println("�õ� Ƚ�� " + tries);
//				break;
//			}	
//			else if (guess > answer) {
//				System.out.println("Down!");
//				continue;
//			}
//			else {
//				System.out.println("Up!");
//				continue;
//			}
//		}
		
//		do {
//			System.out.print("guess? ");
//			guess = input.nextInt();
//			tries ++;
//			
//			if (guess > answer) {
//				System.out.println("Down!");
//				continue;
//			}
//			else {
//				System.out.println("Up!");
//				continue;
//			}
//			
//		} while(guess != answer);
//		
//		System.out.println("�����մϴ�!");
//		System.out.println("�õ� Ƚ�� " + tries);
		
		
//		
//		while (guess != answer) {
//			System.out.print("guess? ");
//			guess = input.nextInt();
//			tries ++;
//			
//			if (guess > answer) {
//				System.out.println("Down!");
//				continue;
//			}
//			else {
//				System.out.println("Up!");
//				continue;
//			}
//		}
//		System.out.println("�����մϴ�!");
//		System.out.println("�õ� Ƚ�� " + tries);
		
//		int i ;
//		System.out.print("guess? ");
//		guess = input.nextInt();
//		
//		for (i = 1; guess != answer; i ++) {
//			if (guess > answer) {
//				System.out.println("Down!");
//				continue;
//			}
//			else if (guess < answer){
//				System.out.println("Up!");
//				continue;
//			}
//			
//			System.out.print("guess? ");
//			guess = input.nextInt();
//			tries ++;
//		}
//		System.out.println("�����մϴ�!");
//		System.out.println("�õ� Ƚ�� " + (i - 1));
		
		
		/* 
		 * ������ ���
		 * 
		 * �� ������ �ִ�? 10000��
		 * 
		 * ��� ** �޴���
		 * 1. ��� (2500)
		 * 2. ��� (3000)
		 * 3. ������ (4000)
		 * 4. ��� (5000)
		 * 5. ����
		 * 
		 * �԰� ���� �޴���? 1
		 * ����� �����ϼ̽��ϴ�.
		 * �ܵ��� 7500���Դϴ�.
		 * 
		 * �԰� ���� �޴���? 2
		 * ����� �����ϼ̽��ϴ�.
		 * �ܵ��� 4500���Դϴ�.
		 * 
		 * �԰� ���� �޴���? 5
		 * ����!
		 * �ܵ��� 4500���Դϴ�.
		 * 
		 * ����:
		 * 1. ���� ������ ���� ������ ��� �޴��� ����� ���
		 * ���� �����մϴ�! ��� �޽��� ���!
		 * �ٽ� �޴� ���� (continue)
		 * 
		 * 2. �ܵ��� 0���̸� ���� (break)
		 * 
		 * */

	} // main �Լ��� ��

} // class�� ��
