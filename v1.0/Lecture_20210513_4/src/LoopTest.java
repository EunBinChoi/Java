import java.util.Scanner;
public class LoopTest {

	public static void main(String[] args) {
		
		// 코드의 중복이 많음
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		
//		int i = 0;
//		while (i < 10) {
//			System.out.println("hello");
//			i ++;
//		}
		
		/* 반복문: 어떤 문장이 반복되는 구조
		 * ex) 30명 성적을 입력받고 싶을 때
		 * ex) 1 ~ 45 로또값 5번 
		 * 
		 * 반복문이 왜 필요하냐?
		 * - 동일한 수행을 하는 문장을 여러번 반복하고 싶을 때
		 * 
		 * while, do while, for
		 * 
		 * while (조건식) {
		 * 	문장 1;
		 * }
		 * 
		 * : 조건식이 참일 때 동안 문장 1이 실행된다.
		 * : 조건식이 한번이라도 거짓이되면 반복문은 종료됩니다.
		 * */
		
//		int i = 0;
//		while (i < 5) {
//			System.out.println("정수: " + i); // 문장 1
//			i ++; // i = i + 1
//		}
		//
//		System.out.println(); // 엔터
//		
//		i = 1; // 초기화
//		while (i <= 5) { // 조건식, i < 6
//			System.out.println("정수: " + i); // 문장 1
//			//i ++; // 증감식, i = i + 1
//		}
//		
//		System.out.println(); // 엔터
//		
//		i = 5; // 초기화
//		while (i >= 1) { // 조건식, i < 6
//			System.out.println("정수: " + i); // 문장 1
//			//i --; // 증감식, i = i + 1
//		}
		
		/* while문에서 필요한 3가지
		 * 
		 * 1. 초기화
		 * 2. 조건식
		 * 3. 증감식
		 * => 증감식이 빠지게 되면 무한 루프 (반복)에 빠지게 됨
		 * => 무한 루프: 항상 조건이 참이되는 반복문
		 * */
		
		// 무한 루프: while(true)
		// ex) 센서값을 계속 받고 싶을 때
		// 무한 루프를 빠져나올 수 있는 구문: break
		
//		Scanner input = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("숫자 입력 (종료시 -1) : ");
//			int num = input.nextInt(); 
//			
//			if (num == -1) { // 잘못된 입력 (종료)
//				break;
//			}
//		}
		
		// while문을 이용해서 구구단 출력 프로그램
//		int n; // 사용자 입력변수 (단수, 2 ~ 9)
//		int i = 1; // 곱해지는 수 (1 ~ 9)
//		Scanner input = new Scanner(System.in);
//		System.out.print("구구단 단수를 입력하시오 : ");
//		n = input.nextInt();
//		
//		while(i <= 9) {
//			System.out.println(n + "*" + i + "=" + n * i);
//			i ++;
//		}
		
		// 5명의 성적을 입력받아 합계를 구하는 프로그램
//		int score;
//		int i; // 반복 (iteration) 변수
//		int sum = 0;
//		Scanner input = new Scanner(System.in);
//		
//		i = 1;
//		while (i <= 5) {
//			System.out.printf("학생 %d번 성적을 입력하시오 : ", i);
//			score = input.nextInt();
//			
//			// 합계를 구하는 알고리즘 (*****)
//			//sum = sum + score;
//			sum += score;
//			
//			i ++;
//		}
//		
//		/* i == 1
//		 * sum = 0 + 10
//		 * 
//		 * i == 2
//		 * sum = (0 + 10) + 20
//		 * 
//		 * i == 3
//		 * sum = ((0 + 10) + 20) + 30
//		 * 
//		 * i == 4
//		 * sum = (((0 + 10) + 20) + 30) + 40
//		 * 
//		 * i == 5
//		 * sum = ((((0 + 10) + 20) + 30) + 40) + 50
//		 * 
//		 * */
//
//
//		System.out.println("성적의 합계 : " + sum);
//		System.out.println("성적의 평균 : " 
//		+ (double)sum / (i - 1));
		
		// 문제
		// 사용자에게 n을 입력받아 n! 구해주세요!
		// n! = 1 x 2 x 3 x .... x n
		
		// 10! = 1 x 2 x 3 x .... x 10
		// 5! = 1 x 2 x 3 x 4 x 5
		
//		int i;
//		int n;
//		int fact;
//		Scanner input = new Scanner(System.in);
//		System.out.print("n을 입력하시오 : ");
//		n = input.nextInt();
//		
//		i = 1;
//		fact = 1;
//		
//		while(i <= n) {
//			fact = fact * i;
//			i++;
//		}
//		
//		/* i == 1
//		 * fact = 1 * 1
//		 * 
//		 * i == 2
//		 * fact = (1 * 1) * 2
//		 * 
//		 * i == 3
//		 * fact = ((1 * 1) * 2) * 3
//		 * 
//		 * i == 4
//		 * fact = (((1 * 1) * 2) * 3) * 4
//		 * 
//		 * i == 5
//		 * fact = ((((1 * 1) * 2) * 3) * 4) * 5
//		 * 
//		 * */
//		
//		System.out.printf("%d! = %d", n, fact);
//		
//		/* i == 0
//		 * 0 < 5 (true)
//		 * 문장 1 실행
//		 * 
//		 * i == 1
//		 * 1 < 5  (true)
//		 * 문장 1 실행
//		 * 
//		 * ...
//		 * 
//		 * i == 4
//		 * 4 < 5 (true)
//		 * 문장 1 실행
//		 * 
//		 * */
//		
////		do {
////			
////		}while();
//		
//		int num = input.nextInt();
//		while(num != -1) {
//			System.out.println("실행");
//			num = input.nextInt();
//		}
//		
//		do {
//			num = input.nextInt();
//			System.out.println("실행");	
//		}while(num != -1);
//		
//		while(true) {
//			num = input.nextInt();
//			System.out.println("실행");
//			if(num == -1) break;
//		}
		
//		
//		int n; // 단수
//		int i; // 곱해지는 수
		Scanner input = new Scanner(System.in);
////		
//		System.out.println("단수를 입력하시오 : ");
//		n = input.nextInt();
//		
//		i = 1;
//		while (i <= 9) {
//			// \n: 엔터
//			System.out.printf("%d x %d = %2d\n",
//					n, i, n*i);
//			i++;
//		}
	
		// 3 x 1
		// 3 x 2
		// 3 x 3
		// 3 x 4
		// ...
		// 3 x 9
//		
//		final int numOfScore = 5; // 상수
//		int score = 0;
//		int sum = 0;
//		int i; // 반복 변수
//		
//		i = 1;
//		while(i <= numOfScore) {
//			System.out.println("성적을 입력 : ");
//			score = input.nextInt();
//			
//			sum = sum + score;
//			// sum = 0;
//			// sum = 0 + 10; // i == 1
//			// sum = 0 + 10 + 20; // i == 2
//			// sum = 0 + 10 + 20 + 30; // i == 3
//			// sum = 0 + 10 + 20 + 30 + 40; // i == 4
//			// sum = 0 + 10 + 20 + 30 + 40 + 50; // i == 5
//			// sum += score;
//			i++;
//		}
//		
//		System.out.println("sum : " + sum);
//		System.out.println("score : " + score);
//		System.out.println("사용자가 가장 "
//				+ "처음 입력한 데이터 : "); 
//		// 가능할까요 ? 불가능함 ! (배열 사용)
		
		// 1 + 2 + 3... + n
//		int n;
//		System.out.println("n 입력 : ");
//		n = input.nextInt();
//		
//		int i; // 반복 변수
//		int sum = 0; // 1 ~ n 더한 결과를 저장
//		
//		i = 1;
//		while(i <= n) {
//			sum = sum + i;
//			i ++; 
//		}
//		// sum = 0; (반복문 돌기 전)
//		// i == 1
//		// sum = 0 + 1;
//		// i == 2
//		// sum = 0 + 1 + 2;
//		// i == 3
//		// sum = 0 + 1 + 2 + 3;
//		
//		System.out.println("sum = " + sum);
//		
//		int n;
//		System.out.println("n 입력 : ");
//		n = input.nextInt();
//		
//		int i; // 반복 변수
//		int fact = 1; // 1 ~ n 더한 결과를 저장
//		
//		i = 1;
//		while(i <= n) {
//			fact = fact * i;
//			i ++;
//		}
//		
//		System.out.println("fact = " + fact);
		
		
//		int n;
//		System.out.println("n을 입력 : ");
//		n = input.nextInt();
//		
//		int a = 0; // 0항
//		int b = 1; // 1항
//		int c = 0;
//		// 0 1 2 3 4 5 6  7  8 ... n
//		// 0 1 1 2 3 5 8 13 21 ... ??
//		// a b c
//		//   a b c
//		//                     a b c
//		
//		int i = 2;
//		while (i <= n) {
//			c = a + b;
//			
//			a = b;
//			b = c;
//			
//			i++;
//		}
//		System.out.println("결과값 : " + c);
//		
		
		// 5개의 수를 입력받으면서  
		// 가장 작은 수와 가장 큰 수를 구하는 프로그램
		
		int min = 0;
		int max = 0;
		
		int i = 0;
		while(i < 5) {
			System.out.print("수 입력 : ");
			int n = input.nextInt();
			
			// min, max를 사용자에게 입력받은
			// 가장 처음 (i == 0)의 값을 대입
			// 입력받은 값들끼리 비교하기 위해서
			
			if(i == 0) {
				max = n;
				min = n;
			}
			
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
			i ++;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n;
//		System.out.println("n 입력 : ");
		
	}

}
