import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		/*
		 * ��: 0 1 2 3 4 5 6 7... n
		 * ��: 0 1 1 2 3 5 8 13  
		 *    a b c
		 *      a b c
		 *        a b c
		 *          a b c
		 *            a b c
		 * */	
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		int n;
		Scanner input = new Scanner(System.in);
//		System.out.print("n�� �Է��Ͻÿ� : ");
//		n = input.nextInt();
//		
//		for(int i = 2; i <= n; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		if (n == 0) {
//			c = 0;
//		}
//		else if (n == 1) {
//			c = 1;
//		}
//		System.out.printf("%d�� => %d", n, c);
		
		// PI = 3.1415927 .....
		// PI = 3.14 ......
		// ���� ����
		
		int loop_count;
		double denominator = 1; // �и�
		double numerator = 4; // ����
		double sum = 0; 
		System.out.print("�ݺ� Ƚ���� �Է��Ͻÿ� : ");
		loop_count = input.nextInt();
		
		while(loop_count > 0) {
			sum += numerator / denominator;
			// sum = sum + numerator / denominator;
			denominator += 2;
			// denominator = denominator + 2;
			numerator *= -1;
			// numerator = numerator * -1;
			loop_count --;
		}
		System.out.println("PI = " + sum);
	}

}
