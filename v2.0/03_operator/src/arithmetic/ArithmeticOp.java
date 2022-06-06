package arithmetic;

// 자동 정렬: ctrl + A (전체 블럭 잡기) + ctrl+shift+F (자동 정렬)
public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		/* 대입/할당 연산자 (assignment operator)
		 * : 변수 = 데이터
		 * : 컴퓨터에서 같다는 == 표기
		 * 
		 * 산술 연산자 (+, -, *, /, %)
		 * : x % y: x를 y로 나누었을 때 나머지 값
		 * ex) 3 % 5 == 3
		 * ex) 5 % 3 == 2
		 * ex) 10 % 6 == 4
		 * ex) 2 % 4 == 2
		 * 
		 * when? 배수
		 * x % 2 == 1 (ex) 1, 3, 5, 7, ... x는 홀수)
		 * x % 2 == 0 (ex) 2, 4, 6, 8, ... x는 짝수)
		 * 
		 * x % 5 == 0 (x는 5의 배수)
		 * x % 16 == 0 (x는 16의 배수)
		 * */
		int x = 10;
		int y = 20;
		System.out.println(x + y); // 30
		System.out.println(x - y); // -10
		System.out.println(x * y); // 200
		System.out.println(x / y); // 0.5, 값이 이상 (0)
		System.out.println(x % y); // 10
		//  x          y
		// 정수 사칙연산 정수 ==> 정수
		// 정수 사칙연산 실수 ==> 실수
		// 실수 사칙연산 정수 ==> 실수
		// 실수 사칙연산 실수 ==> 실수
		// * 사칙연산의 결과는 피연산자의 큰 놈을 따라간다!
		
		// float fl = 3.14f;
		// (데이터타입)변수: 형 변환 (type casting)
		System.out.println((double)x / y);
		// 10 -> 10.0
		System.out.println(x / (double)y);
		// 20 -> 20.0
		System.out.println((double)x / (double)y);
		
		// Q1. 온도 변환기 (화씨 온도 -> 섭씨 온도)
		double f = 95;
		double c; // c = 5/9 * (f-32)
		c = (5/9.0) * (f-32); // ?
		System.out.printf("화씨온도 %.2f는 섭씨온도 %.2f입니다\n ", f, c);
		
		// Q2. 
		double total = 7500;
		double pay = 10000;
		double tax; // 전체 상품 총액의 10%
		double change; // 세금을 제외한 잔돈을 출력
		tax = total * 0.1;
		change = pay - (total + tax);
		System.out.printf("잔돈 = %.0f원\n", change);
		
		// Q3.
		int var = 10; 
		
		// "10", "a", "10.23"
		String strVar = "hello" + var; 
		// 연산의 결과는 피연산자 중에서 큰 놈을 따라간다!
		// "hello" + "10" => "hello10"
		// 문자열 + 문자열 ==> 문자열 결합
		
		// strVar 변수에 들어간 데이터 예상해보기 (이유도 생각)
		System.out.println(strVar);
		
		int intVar = 20 + var;
		// intVar 변수에 들어간 데이터 예상해보기 (이유도 생각)
		System.out.println(intVar);
		// +
		// 문자열 + 문자열 ==> 문자열의 결합
		// "hello" + "world" => "helloworld"
	}

}
