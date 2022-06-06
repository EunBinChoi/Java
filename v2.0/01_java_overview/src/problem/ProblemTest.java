package problem;

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술 연산자 (+, -, *, /)
		// Q1. 원의 둘레, 넓이 계산하는 프로그램
		// 원의 둘레: 2 * PI * 반지름
		// 원의 넓이: PI * 반지름 * 반지름
		int r = 3;
		final double PI = 3.141592; // ?
		// 원의 둘레: peri (double)
		// 원의 넓이: area (double)
		
		double peri = 2 * PI * r;
		double area = PI * r * r;
		System.out.println("원의 둘레: " + peri);
		System.out.println("원의 넓이: " + area);
		
		// 1) 18.84 -> "18.84" (자동 형변환)
		// 2) "원의 둘레: " + "18.84"
		// ---------------------------------------
		// print(), println(), printf() (print format)
		// printf() (enter를 포함하지 않음)
		// 정수 (10진수): %d (decimal)
		// 정수 (8진수): %o (octal)
		// 정수 (16진수): %x (hexa..)
		// 실수 (float, double): %f
		// 문자 (char): %c
		// 문자열 (String): %s
		
		System.out.printf("원의 둘레: %.2f\n", peri);
		System.out.printf("원의 넓이: %.2f\n", area);
		
		// 언제 사용하는지?
		int month = 1; // 1 ~ 12 (최대 2글자)
		int day = 1; // 1 ~ 31 (최대 2글자)
		System.out.printf("month = %-2d, day = %-2d\n", month, day);
		month = 12;
		day = 31;
		System.out.printf("month = %-2d, day = %-2d\n", month, day);
		
		
		// + 연산
		// 문자열 + 문자열: 문자열 결합
		System.out.println("원의 둘레: " + "123"); 
		// 숫자 + 숫자: 숫자 덧셈
		System.out.println(234 + 123);
		
		
		// Q2. boolean b = true를 int로 형변환하는 코드 작성
//		boolean b = true;
//		System.out.println((int)b); // 왜 안되는지 생각
//		// boolean -> int 형 변환이 안됨 (java의 특징)
		// false: 0
		// true: 1
		
//		
		// Q3. 아래의 코드가 오류가 나는 이유를 설명하시오.
		// 오류가 없을 경우에는 왜 오류가 안 나는지도 생각해보세요!
		float f = (float)0.12; // 0.12f
		// double -> float
		int i = (int)2.1; // 2.1 -> 2 (명시적 형변환)
		// double -> int
		
		char c = 'a';
//		boolean bl = (boolean)1; // 1 -> true로 변경 불가!
		// 1 -> true
		// 0 -> false
		
		double d = 1; // 1 -> 1.0 (자동 형변환)
		// int -> double
		double dd = 1.2f; // 1.2f -> 1.2 (자동 형변환)
		// float -> double
//		
		// Q4. x, y 변수를 이용하여 
		// x, y에 담긴 값의 위치를 바꾸는 코드 작성
		// swap (switch)
		int x = 10;
		int y = 20;
		
		System.out.println(x); // 10
		System.out.println(y); // 20
		// 여기에 코드 작성
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println(x); // 예상 결과값: 20
		System.out.println(y); // 예상 결과값: 10
		
		// Q5. 다음 문장의 실행 결과를 확인하고 이유를 생각해보세요!
		int xx = 65;
		System.out.printf("%.2f\n", (float)xx); 
		System.out.printf("%c\n", xx); // 65에 대한 아스키코드 출력
		//		
		char chh = 'a';
		System.out.printf("%d\n", (int)chh); 
		// 문자 'a'에 대한 아스키코드 값 출력
//		
		char chch = 97; // 'a'
		System.out.printf("%d\n", (int)chch);
		System.out.printf("%c\n", chch);
		
	}

}
