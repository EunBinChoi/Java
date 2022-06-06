package function_review;

import java.util.Scanner;

public class FunctionTest {
	// ��ü ������ 3�� Ư¡
	// 1. ĸ��ȭ (���� ����, ���� ������ (public, protected, private), getter && setter)
	// 2, ��� (�θ� - �ڽ�)
	// 3. ������ (������ Ÿ�� (��)�� �پ��ϰ� �ϴ� ����)
	
	// ��ü �ʵ带 ���� �� ����
	
	// ��ü �Լ��� ���� �� ����
	/* - �Լ� ���ǹ�
	 * 
	 * ��ȯ�� �޼ҵ��̸� (�Ű� ����){
	 * 	// �޼ҵ� �ڵ�
	 * }
	 * 
	 * - �Լ��� ����?
	 * 1) ������ ���� (�Լ� �̸��� �� �ۼ�, ��ɺ���)
	 * 	- �̸� �ۼ���:
	 * 	1) �ҹ��� ����, ���վ� ������ �빮�� (ī�� ǥ���)
	 * 	2) ������� �ۼ� (selectNumber(), chooseNum(), addTwoNum())
	 * 
	 * 2) �ߺ��� ���� !!!!!!!!!!! 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� �Է� : ");
		x = sc.nextInt(); 
		
		System.out.print("y�� �Է� : ");
		y = sc.nextInt(); 
		
		// �� �� (����)�� ���ϴ� �Լ�
		// ��ȯ���� �ִ� �Լ�
		int res = add(x, y);
		System.out.println(res);
		
		//System.out.println(add(x, y));
		System.out.println(add(res, 3));
			
		// ��ȯ���� ���� �Լ� (add2 �Լ��� ������� ������ �Ұ���)
		add2(x, y);	
		
		double z = 3.5;
		double h = 4.5;
		double res2 = add(z, h); // double �� ���� ���� => double ��ȯ (add)
	
		double res3 = add(z, h);
		
		
		// �迭�� �����͸� �ٷ� �ʱ�ȭ�ϴ� ���
		int[] arr1 = {1};
		print(arr1);
		
		// �迭�� ������ ���� �Ҵ��� �Ŀ� ���߿� �����͸� �ʱ�ȭ�ϴ� ���
		int[] arr2 = new int[3];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		print(arr2);
		
		// �迭�� �����͸� �ٷ� �ʱ�ȭ�ϴ� ��� (���� ����)
		print(new int[] {1});
		print(new int[] {1, 2, 3});
		
		// �迭�� ������ ���� �Ҵ�
		print(new int[2]); // {0, 0}
		
		print(1);
		print(); // ���ڰ� ���� �͵� ����!!!
		print(1, 2, 3);
		print(1, 2, 3, 4, 5, 6);
		print(new int[] {1, 2, 3, 4, 5, 6, 7});

		

	
	}
	
	/*
	 * �Լ� �ߺ� ���� (overload) vs �Լ� ������ (override)
	 * 
	 * �ߺ� ���� ����
	 * 1) �Լ��̸��� ����
	 * 2) �Ű������� Ÿ��, ����, ������ �ٸ�
	 * 3) ��ȯ���� ������ ��ġ�� ���� (�������)
	 * 
	 * * �Լ� ������ (override)
	 * : ��� ���� (**)���� �θ� ������ �ִ� �Լ��� �ڽ��� ������
	 * : Object - toString
	 * : Customer - toString (������)
	 * 
	 * why? toString �� �������ؾ��ұ��?
	 * >> ������ (�迭, String, Ŭ����)
	 * : �����Ͱ� ����� �ּҰ�
	 * >> ������ (int, double, float, char, boolean)
	 * 
	 * sysout() �Լ����� ȣ��Ǵ� �Լ�
	 * */
	
	/* ���� �Ű�����
	 * print(3), print(3, 5), print(3, 5, 3) ....
	 * */
	
//	public static void print(int[] arr) {
//		// for-each�� (���� for)
//		for(int i : arr) {
//			System.out.println(i);
//		}
//	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void print(int... a) {
		for(int i : a) {
			System.out.println(i);
		}
	}
	
	
	
	// Ÿ���� �ٸ� ���
	public static double add(double a, double b) {
		System.out.println("no generic");
		return a + b;
	}
	public static int add(int a, int b) {
		return a + b;
	}
	// add �Լ��� �Ű������� ���ʸ������� �ٲٱ� (Ÿ�� �Ķ����)
	// Ÿ�� �Ķ���� ��ȯ�� �Լ��̸� (�Ű�����)
	// Number: Integer, Float, Double, Byte, Short, Long ..
	// a: 3, b: 4 ==> 7.0
	public static <T extends Number> double add(T a, T b) {
		System.out.println("generic");
		double x = (double)a; 
		double y = (double)b;
		return x + y;
	}
	
//	public static <T extends Number> void add(T a, T b) {
//		double x = (double)a; 
//		double y = (double)b;
//		System.out.println(x + y);
//	}
	
	
	// ������ �ٸ� ���
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	// ������ �ٸ� ���
	public static double add(double a, int b) {
		return a + b;
	}
	public static double add(int a, double b) {
		return a + b;
	}
	
	
	
	public static void add2(int a, int b) {
		System.out.println(a + b);
	}



}
