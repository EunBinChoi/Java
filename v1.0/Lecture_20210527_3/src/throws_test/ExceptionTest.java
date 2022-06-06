package throws_test;

/*
 * Runtime Exception:
 * 
 * ArithmeticException: 0���� ���� �� �߻�
 * NullPointerException: null ��ü�� ������ �� �߻�
 * 
 * ClassCastException: Ŭ���� ����ȯ�� �߸����� �� �߻�
 * (Comparable, Comparator)
 * 
 * NegativeArraySizeException: �迭�� ũ�Ⱑ ������ ��쿡 �߻�
 * OutOfMemoryException: �޸� ������ �� �߻�
 * NoClassDefFoundException: ���ϴ� Ŭ������ ã�� ������ ��쿡 �߻�
 * ArrayIndexOutOfBoundsException: �迭 �ε����� �߸��� ��쿡 �߻�
 * */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			calculator();
			sumArray(); // static void sumArray(int[] arr)
		}
		catch(InputMismatchException e) {
			System.out.println("MisMatch Exception ..");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("���α׷� ���� ...");
		}
		
		
	} // main �Լ�
	
	// Exception e = new ArithmeticException(); // ������
	static void calculator() throws ArithmeticException, InputMismatchException{
		// InputMismatchException
		System.out.print("a �� �Է�: ");
		int x = input.nextInt(); // 3.0
		
		System.out.print("b �� �Է�: ");
		int y = input.nextInt();
		
//		try {
			System.out.println("��� = " + x / y);
//		}catch(ArithmeticException e) {
//			System.out.println("���� �߻� !");
//		}
	}
	
	static double sumArray() throws ArrayIndexOutOfBoundsException{
		
		int[] c = {10, 20, 30, 40, 50};
		int sum = 0;
		
		// 
		for(int i = 0; i < c.length; i ++) {
			sum += c[i];
		}
		return sum;
	}
	

}
