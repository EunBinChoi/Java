import java.util.Scanner;
public class LoopTest {

	public static void main(String[] args) {
		
		// �ڵ��� �ߺ��� ����
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		
//		int i = 0;
//		while (i < 10) {
//			System.out.println("hello");
//			i ++;
//		}
		
		/* �ݺ���: � ������ �ݺ��Ǵ� ����
		 * ex) 30�� ������ �Է¹ް� ���� ��
		 * ex) 1 ~ 45 �ζǰ� 5�� 
		 * 
		 * �ݺ����� �� �ʿ��ϳ�?
		 * - ������ ������ �ϴ� ������ ������ �ݺ��ϰ� ���� ��
		 * 
		 * while, do while, for
		 * 
		 * while (���ǽ�) {
		 * 	���� 1;
		 * }
		 * 
		 * : ���ǽ��� ���� �� ���� ���� 1�� ����ȴ�.
		 * : ���ǽ��� �ѹ��̶� �����̵Ǹ� �ݺ����� ����˴ϴ�.
		 * */
		
//		int i = 0;
//		while (i < 5) {
//			System.out.println("����: " + i); // ���� 1
//			i ++; // i = i + 1
//		}
		//
//		System.out.println(); // ����
//		
//		i = 1; // �ʱ�ȭ
//		while (i <= 5) { // ���ǽ�, i < 6
//			System.out.println("����: " + i); // ���� 1
//			//i ++; // ������, i = i + 1
//		}
//		
//		System.out.println(); // ����
//		
//		i = 5; // �ʱ�ȭ
//		while (i >= 1) { // ���ǽ�, i < 6
//			System.out.println("����: " + i); // ���� 1
//			//i --; // ������, i = i + 1
//		}
		
		/* while������ �ʿ��� 3����
		 * 
		 * 1. �ʱ�ȭ
		 * 2. ���ǽ�
		 * 3. ������
		 * => �������� ������ �Ǹ� ���� ���� (�ݺ�)�� ������ ��
		 * => ���� ����: �׻� ������ ���̵Ǵ� �ݺ���
		 * */
		
		// ���� ����: while(true)
		// ex) �������� ��� �ް� ���� ��
		// ���� ������ �������� �� �ִ� ����: break
		
//		Scanner input = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("���� �Է� (����� -1) : ");
//			int num = input.nextInt(); 
//			
//			if (num == -1) { // �߸��� �Է� (����)
//				break;
//			}
//		}
		
		// while���� �̿��ؼ� ������ ��� ���α׷�
//		int n; // ����� �Էº��� (�ܼ�, 2 ~ 9)
//		int i = 1; // �������� �� (1 ~ 9)
//		Scanner input = new Scanner(System.in);
//		System.out.print("������ �ܼ��� �Է��Ͻÿ� : ");
//		n = input.nextInt();
//		
//		while(i <= 9) {
//			System.out.println(n + "*" + i + "=" + n * i);
//			i ++;
//		}
		
		// 5���� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷�
//		int score;
//		int i; // �ݺ� (iteration) ����
//		int sum = 0;
//		Scanner input = new Scanner(System.in);
//		
//		i = 1;
//		while (i <= 5) {
//			System.out.printf("�л� %d�� ������ �Է��Ͻÿ� : ", i);
//			score = input.nextInt();
//			
//			// �հ踦 ���ϴ� �˰��� (*****)
//			//sum = sum + score;
//			sum += score;
//			
//			i ++;
//		}
//		
//		/* i == 1
//		 * sum = 0 + 10
//		 * 
//		 * i == 2
//		 * sum = (0 + 10) + 20
//		 * 
//		 * i == 3
//		 * sum = ((0 + 10) + 20) + 30
//		 * 
//		 * i == 4
//		 * sum = (((0 + 10) + 20) + 30) + 40
//		 * 
//		 * i == 5
//		 * sum = ((((0 + 10) + 20) + 30) + 40) + 50
//		 * 
//		 * */
//
//
//		System.out.println("������ �հ� : " + sum);
//		System.out.println("������ ��� : " 
//		+ (double)sum / (i - 1));
		
		// ����
		// ����ڿ��� n�� �Է¹޾� n! �����ּ���!
		// n! = 1 x 2 x 3 x .... x n
		
		// 10! = 1 x 2 x 3 x .... x 10
		// 5! = 1 x 2 x 3 x 4 x 5
		
//		int i;
//		int n;
//		int fact;
//		Scanner input = new Scanner(System.in);
//		System.out.print("n�� �Է��Ͻÿ� : ");
//		n = input.nextInt();
//		
//		i = 1;
//		fact = 1;
//		
//		while(i <= n) {
//			fact = fact * i;
//			i++;
//		}
//		
//		/* i == 1
//		 * fact = 1 * 1
//		 * 
//		 * i == 2
//		 * fact = (1 * 1) * 2
//		 * 
//		 * i == 3
//		 * fact = ((1 * 1) * 2) * 3
//		 * 
//		 * i == 4
//		 * fact = (((1 * 1) * 2) * 3) * 4
//		 * 
//		 * i == 5
//		 * fact = ((((1 * 1) * 2) * 3) * 4) * 5
//		 * 
//		 * */
//		
//		System.out.printf("%d! = %d", n, fact);
//		
//		/* i == 0
//		 * 0 < 5 (true)
//		 * ���� 1 ����
//		 * 
//		 * i == 1
//		 * 1 < 5  (true)
//		 * ���� 1 ����
//		 * 
//		 * ...
//		 * 
//		 * i == 4
//		 * 4 < 5 (true)
//		 * ���� 1 ����
//		 * 
//		 * */
//		
////		do {
////			
////		}while();
//		
//		int num = input.nextInt();
//		while(num != -1) {
//			System.out.println("����");
//			num = input.nextInt();
//		}
//		
//		do {
//			num = input.nextInt();
//			System.out.println("����");	
//		}while(num != -1);
//		
//		while(true) {
//			num = input.nextInt();
//			System.out.println("����");
//			if(num == -1) break;
//		}
		
//		
//		int n; // �ܼ�
//		int i; // �������� ��
		Scanner input = new Scanner(System.in);
////		
//		System.out.println("�ܼ��� �Է��Ͻÿ� : ");
//		n = input.nextInt();
//		
//		i = 1;
//		while (i <= 9) {
//			// \n: ����
//			System.out.printf("%d x %d = %2d\n",
//					n, i, n*i);
//			i++;
//		}
	
		// 3 x 1
		// 3 x 2
		// 3 x 3
		// 3 x 4
		// ...
		// 3 x 9
//		
//		final int numOfScore = 5; // ���
//		int score = 0;
//		int sum = 0;
//		int i; // �ݺ� ����
//		
//		i = 1;
//		while(i <= numOfScore) {
//			System.out.println("������ �Է� : ");
//			score = input.nextInt();
//			
//			sum = sum + score;
//			// sum = 0;
//			// sum = 0 + 10; // i == 1
//			// sum = 0 + 10 + 20; // i == 2
//			// sum = 0 + 10 + 20 + 30; // i == 3
//			// sum = 0 + 10 + 20 + 30 + 40; // i == 4
//			// sum = 0 + 10 + 20 + 30 + 40 + 50; // i == 5
//			// sum += score;
//			i++;
//		}
//		
//		System.out.println("sum : " + sum);
//		System.out.println("score : " + score);
//		System.out.println("����ڰ� ���� "
//				+ "ó�� �Է��� ������ : "); 
//		// �����ұ�� ? �Ұ����� ! (�迭 ���)
		
		// 1 + 2 + 3... + n
//		int n;
//		System.out.println("n �Է� : ");
//		n = input.nextInt();
//		
//		int i; // �ݺ� ����
//		int sum = 0; // 1 ~ n ���� ����� ����
//		
//		i = 1;
//		while(i <= n) {
//			sum = sum + i;
//			i ++; 
//		}
//		// sum = 0; (�ݺ��� ���� ��)
//		// i == 1
//		// sum = 0 + 1;
//		// i == 2
//		// sum = 0 + 1 + 2;
//		// i == 3
//		// sum = 0 + 1 + 2 + 3;
//		
//		System.out.println("sum = " + sum);
//		
//		int n;
//		System.out.println("n �Է� : ");
//		n = input.nextInt();
//		
//		int i; // �ݺ� ����
//		int fact = 1; // 1 ~ n ���� ����� ����
//		
//		i = 1;
//		while(i <= n) {
//			fact = fact * i;
//			i ++;
//		}
//		
//		System.out.println("fact = " + fact);
		
		
//		int n;
//		System.out.println("n�� �Է� : ");
//		n = input.nextInt();
//		
//		int a = 0; // 0��
//		int b = 1; // 1��
//		int c = 0;
//		// 0 1 2 3 4 5 6  7  8 ... n
//		// 0 1 1 2 3 5 8 13 21 ... ??
//		// a b c
//		//   a b c
//		//                     a b c
//		
//		int i = 2;
//		while (i <= n) {
//			c = a + b;
//			
//			a = b;
//			b = c;
//			
//			i++;
//		}
//		System.out.println("����� : " + c);
//		
		
		// 5���� ���� �Է¹����鼭  
		// ���� ���� ���� ���� ū ���� ���ϴ� ���α׷�
		
		int min = 0;
		int max = 0;
		
		int i = 0;
		while(i < 5) {
			System.out.print("�� �Է� : ");
			int n = input.nextInt();
			
			// min, max�� ����ڿ��� �Է¹���
			// ���� ó�� (i == 0)�� ���� ����
			// �Է¹��� ���鳢�� ���ϱ� ���ؼ�
			
			if(i == 0) {
				max = n;
				min = n;
			}
			
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
			i ++;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n;
//		System.out.println("n �Է� : ");
		
	}

}
