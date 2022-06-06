package recursive_function;
import java.util.Scanner;
public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ��� �Լ� (Recursive Function)
		 * : �Լ� ������ �ڱ� �Լ��� ȣ���ϴ� �Լ�
		 * 
		 * ��� ȣ���� �ϴ� �κ�
		 * ��� ȣ���� ���ߴ� �κ�: return
		 * 
		 * */
		//print("hello");
		// �Ǻ���ġ ����
		// fibo(n) = fibo(n - 1) + fibo(n - 2) // for��?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϰ��� �ϴ� �� �Է�: ");
		int n = sc.nextInt();
		
		long start = System.nanoTime();
		int fibo_res = fibo_for(n);
		System.out.println("�����: " + fibo_res);
		long end = System.nanoTime();
		System.out.println("���� �ð�: " + (end - start)) ;

		start = System.nanoTime();
		fibo_res = fibo_recur(n);
		System.out.println("�����: " + fibo_res);
		end = System.nanoTime();
		System.out.println("���� �ð�: " + (end - start));
		
		// 1 x 2 x 3 x... x n = factorial(n)
		// => recursive, for (�Լ�)
		int fact_res = fact_for(5);
		System.out.println("fact ��� : " + fact_res);
		fact_res = fact_recur(5);
		System.out.println("fact ��� : " + fact_res);
	}
	public static void print(String s) {
		System.out.println(s);
		print(s);
	}
	
	public static int fact_for(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i ++) {
			fact *= i;
		}
		return fact;
	}
	public static int fact_recur(int n) {
		if (n <= 1) return 1;
		return n * fact_recur(n - 1);
	}
	public static int fibo_recur(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return fibo_recur(n - 1) + fibo_recur(n - 2);
	}
	// ��: 0 1 2 3 4 5 ..
	// ��: 0 1 1 2 3 5 ..
	//    a b c
	//      a b c
	public static int fibo_for(int n) {
		int a = 0; // 0��
		int b = 1; // 1��
		int c = 0; // �ʱ�ȭ
		for(int i = 2; i <= n; i ++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

}
