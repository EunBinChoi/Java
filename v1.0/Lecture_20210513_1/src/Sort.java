import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		// 3���� ���ڸ� �޾Ƽ� ũ�� ������ ���� (��������)�ϴ� ���α׷��� �ۼ�
		// (if, if-else, if, else if, else ���)
		
		// �˰��� (algorithm): ������ �ذ��ϴ� ���
		
//		int a, b, c;
//		int min = 0, mid = 0, max = 0;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("���ڸ� �Է��Ͻÿ� : ");
//		a = input.nextInt();
//		
//		System.out.print("���ڸ� �Է��Ͻÿ� : ");
//		b = input.nextInt();
//		
//		System.out.print("���ڸ� �Է��Ͻÿ� : ");
//		c = input.nextInt();
//		
//		// 1) 
//		// a b c
//		// a c b
//		// b c a
//		// b a c
//		// c a b
//		// c b a
//		
////		if (a > b) {
////			if (a > c) {
////				
////			}
////		}
//
//		if (a > b && a > c) {
//			max = a;
//			if (b > c) {
//				mid = b;
//				min = c;
//			}
//			// b <= c
//			else {
//				mid = c;
//				min = b;
//			}
//		}
//		else if (b > a && b > c) {
//			max = b;
//			if (a > c) {
//				mid = a;
//				min = c;
//			}
//			// a <= c
//			else {
//				mid = c;
//				min = a;
//			}
//		}
//		else if (c > a && c > b) {
//			max = c;
//			if (a > b) {
//				mid = a;
//				min = b;
//			}
//			// a <= b
//			else {
//				mid = b;
//				min = a;
//			}
//			
//		}
//
//		
//		System.out.printf("���� ��� (��������) : %d %d %d", min, mid, max);
//		
		// 2) ���� �˰��� (���� ����)
		// a  b  c
		// 30 20 10
		// -----------
		
		int a, b, c, temp;
		int min = 0, mid = 0, max = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		a = input.nextInt();
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		b = input.nextInt();
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		c = input.nextInt();
		
		// a  b  c
		// 30 20 10
		// 20 30 10
		// 20 10 // 30
		
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println("���� : " + 
		a + " " + b + " " + c );
		
		// 
		
		// b  a  c
		// 20 30 10
		
		// b  c  a
		// 20 10 30
		
		// c   b  a
		// 10 20 30
		
		// 30 20 10 15
		// 20 30 10 15
		// 20 10 30 15
		// 20 10 15 30
		
		// 10 20 15 30
		// 10 15 20 30
		
		// swap (switch)
//		int a = 10;
//		int b = 20;
//		int tmp; 
//		
//		System.out.println("���� �� : a = " + a + " b = " + b);
//		tmp = a; // tmp: 10
//		a = b;   // a: 20
//		b = tmp; // b: tmp
//		
//		System.out.println("���� �� : a = " + a + " b = " + b);
//		

		
		
		
		
	}

}
