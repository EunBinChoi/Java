package math;

import java.util.Arrays;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math Ŭ���� ���� ��κ��� �޼ҵ�� static
		// Math.�޼ҵ� �̸�()
		
		int a = Math.abs(-3); // absolute (���밪)
		System.out.println(a);
		
		double b = Math.abs(-3.14);
		System.out.println(b);
		
		double c = Math.ceil(5.3); // �ø� �Լ�
		System.out.println(c);
		
		double d = Math.floor(5.3); // ���� �Լ�
		System.out.println(d);
		
		double e = Math.round(5.3); // �ݿø�
		System.out.println(e);
		
		int f = Math.max(5, 9);
		System.out.println(f);
		System.out.println(5 > 9 ? 5 : 9); // ���� ������
		
		int g = Math.min(5, 9);
		System.out.println(g);
		System.out.println(5 < 9 ? 5 : 9); // ���� ������
		
		System.out.println(Math.max(5, 5.0));
		
		// 0.0 <= Math.random() < 1.0
		
	}
	
}
