package math;

import java.util.Arrays;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math 클래스 안의 대부분의 메소드는 static
		// Math.메소드 이름()
		
		int a = Math.abs(-3); // absolute (절대값)
		System.out.println(a);
		
		double b = Math.abs(-3.14);
		System.out.println(b);
		
		double c = Math.ceil(5.3); // 올림 함수
		System.out.println(c);
		
		double d = Math.floor(5.3); // 내림 함수
		System.out.println(d);
		
		double e = Math.round(5.3); // 반올림
		System.out.println(e);
		
		int f = Math.max(5, 9);
		System.out.println(f);
		System.out.println(5 > 9 ? 5 : 9); // 삼항 연산자
		
		int g = Math.min(5, 9);
		System.out.println(g);
		System.out.println(5 < 9 ? 5 : 9); // 삼항 연산자
		
		System.out.println(Math.max(5, 5.0));
		
		// 0.0 <= Math.random() < 1.0
		
	}
	
}
