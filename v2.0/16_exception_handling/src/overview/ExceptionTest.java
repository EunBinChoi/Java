package overview;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���� (error): �ɰ��� ���� ex) �޸� ����, �޸� ���� => ó�� �Ұ�
// ���� (exception): ����� ���� ex) ������ �ڵ� ����, ����� �Է� ���� => ���� ���� (ó�� ����)
// Exception
// 	- IOException
//  - RuntimeException
//		- ArithmeticException
//		- ArrayIndexOutOfBoundsException
//		- NullPointerException
//      - .....

// ���α׷� ����
// - ������ ���� (compile-time error): ������ �� �� �߻��ϴ� ���� (�����Ϸ��� �����)
// - ��Ÿ�� ���� (runtime error): ������ �� �߻��ϴ� ���� (***)
// - ���� ���� (logical error): ���α׷��Ӱ� �ۼ��� �ǵ��� �ٸ��� ���� 

// ���� ó�� (exception handling)
// => ��? ���α׷��� �ߴ��� ���� ���� (******)
// => ���� �� �߻��ϴ� ���ܿ� ���� ��� �ڵ带 �ۼ�
// => ���� - try-catch��

public class ExceptionTest {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				int x = inputUser();
				int y = inputUser();
				int res = divide(x, y); // �� ���� ������ �Լ�
				break;
			} catch (InputMismatchException e) {
				sc.next(); // ���� ���빰�� �о�� -> ���� ����
				System.out.println(e);
//				e.printStackTrace(); // ���� �޽��� ��� (������ ���� ���)
			} catch (ArithmeticException e) {
				// ArithmeticException e = new ArithmeticException();
				// ���ܵ� �ϳ��� ��ü�̱� ������ e�� ������ ��ü�� �޾���
				System.out.println(e.getMessage()); // ���� �޽��� ���
				// continue;
			} catch (Exception e) {
				// Exception e = new ������ ó������ ���� ���� Ŭ����(); // ������ ����
				System.out.println(e.getMessage());
			} finally { // �ۼ� ������
				System.out.println("���� �߻� ������ ���þ��� ������ ����");
			}
			/*
			 * ���� �߻� O: try - catch - finally 
			 * ���� �߻� X: try - finally
			 */

			System.out.println("���α׷��� �ߴܵɱ��?");
			// try-catch �������� ����ó���� ���ָ� ���α׷� �ߴܵ��� ����
			// ���� ����ó���� ���� ������ ���α׷� �ߴ�
			// break;
		}
	}
	public static int inputUser() throws InputMismatchException {
		return sc.nextInt();
	}
	public static int divide(int x, int y) throws ArithmeticException {
		return x / y;
	}
}
