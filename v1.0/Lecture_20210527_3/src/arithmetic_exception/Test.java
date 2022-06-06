package arithmetic_exception;


/* ���α׷� ����
 * 
 * ������ ���� (compile-time error)
 * : �������� �� �߻��ϴ� ���� (eclipse���� �����)
 * 
 * ��Ÿ�� ���� (runtime error)
 * : ������ �� �߻��ϴ� ����
 * : ���� (error): �ɰ��� ����
 * : ���� (exception): �ټ� �̾��� ���� (���� ����)
 * 
 * ���� ����
 * : �ǵ��� �ٸ��� �����ϴ� �� (���� ��)
 * : �����ڵ��� �߸� ���� Ȯ�� ����
 *  
 *  
 * ���� ó�� (exception handling)
 * ���� - ���α׷� ���� �� �߻��� �� �ִ� ���� �߻��� ����� �ڵ带 �ۼ�
 * ���� - ���α׷��� �ߴ��� ���� (******)
 * ���� - try-catch��
 *  
 *  // 3 / 0
 *  
 * �ڹ� �ڵ� --> ������ (ctrl + s) --> ���� --> ���� (f11)
 * 
 * RuntimeException: ������ �Ǽ��� �߻��ϴ� ���� (����ó�� ����)
 * Exception: ����ڰ� �� �� �ִ� �Ǽ� (������ ����)�� �߻��ϴ� ����
 * (����ó�� �ʼ�)
 * 
 * ex)
 * 3/0
 * 
 * int[] arr = new int[3]; arr[0] ~ arr[2] 
 * print(arr[3])
 * 
 * */
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("x�� ��: ");
		x = sc.nextInt(); // 3
		
		System.out.print("y�� ��: ");
		y = sc.nextInt(); // 0
		
		try {
			int res = x / y; // ���ܰ� �߻��� �� �ִ� ����
			System.out.println("������ ���: " + res);
		} 
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ� !");
		}
		finally {
			// ���� �߻� ������ ������� ������ ����
			System.out.println("finally ����");
		}
		// ����ó���� (try-catch)�� ������ ���α׷� �߰��� ���ܰ� �߻��ϸ� ���α׷� �ߴ�
		// ����ó���� (try-catch)�� ������ ���α׷� �ߴ� X
		
		
		
		System.out.println("���α׷� �� ...");
	}

}
