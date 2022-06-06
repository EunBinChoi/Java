import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 중첩 반복문 (이중 반복문, nested loop)
		 * : 반복문 안에 반복문이 들어가 있는 구조
		 * 
		 * */
		
		
		
		/*
		 * for(){
		 * 	for(){
		 * 	}
		 * }
		 * 
		 * for(){
		 * }
		 * 
		 * for(){
		 * }
		 * 
		 * 
		 * 
		 *  ********
		 *  ********
		 *  ********
		 *  ********
		 *  ********
		 * 
		 * */
		
		// 총 ? 40번
//		for(int i = 1; i <= 5 ; i ++) { // 행
//			for(int j = 1; j <= 8; j ++) { // 열
//				System.out.print("*"); // 
//			}
//			System.out.println(); // 엔터
//		}
//		System.out.println();
//		// 중첩 반복문은 개발자들이 편하라고 만듦
//		for(int i = 1; i <= 40; i ++) {
//			System.out.print("*");
//			if (i % 8 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= 5; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= 5; j ++) {
//				if(i + j > 5) System.out.print("*");
//				else System.out.print(" ");	
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 1; i <= 5; i ++) {
//			for(int j = 1; j <= 5; j ++) {
//				if(j >= 6 - i) System.out.print("*");
//				else System.out.print(" ");	
//			}
//			System.out.println();
//		}
//		
		
		
		// 1. 하나의 수를 입력받아 소수인지 아닌지 판별하는 코드
//		System.out.print("n 입력 : ");
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int cnt = 0;
//		boolean isPrime = false; // 소수가 아니라고 가정
		// 20 : 1 ~ 20
		// 소수는 약수의 개수가 2개 (1과 자기자신)
		
		// for문을 끝까지 돌아봐야 앎 (1 ~ n)
//		for(int i = 1; i <= n; i ++) {
//			if(n % i == 0) {
//				cnt ++;
//			}
//		}
//		if(cnt == 2) isPrime = true; // 소수이면 isPrime true로 설정
//		//else isPrime = false;
//		System.out.println((isPrime) ? "소수" : "소수아님");
		
		// boolean isPrimeNumber(int n)
		
//		isPrime = true; // 소수라고 가정
//		int i;
//		for(i = 2; i < n; i ++) {
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		System.out.println((isPrime) ? "소수" : "소수아님");
		
		// 약수
		// 약수의 개수가 짝수인 경우?
		// 20: 1  2  4 // 5  10   20
		// 33: 1  3 //  11 33
		// 15: 1 // 15
		// 24: 1 2 3 4 // 6 8  12  24 
		// 26: 1 2 //   13  26
		
		// 약수의 개수가 홀수인 경우?
		// 25: 1   5 //   25
		// 16: 1  2  4 //  8  16
		// 49: 1   7 //   49
		
		// 에라토스테네스의 체
//		isPrime = true; // 소수라고 가정
//		for(i = 2; i <= (int)Math.sqrt(n) ; i ++) {
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		System.out.println((isPrime) ? "소수" : "소수아님");
		
		
		
		//if (i == n) isPrime = true;
		
		// 2. 2 ~ n 까지 소수 찾기
		
		int n;
		int cnt = 0;
		System.out.print("n 입력: ");
		n = sc.nextInt();
		for(int i = 2; i <= n; i ++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
				cnt ++;
			}
		}
		System.out.println();
		System.out.println("총 개수 : " + cnt);
		
		
		
		
		/*
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * */
		
		// 사용자에게 n을 입력받아 1 ~ n까지 소수 출력
		
		
//		for(int i = 0; i < 5; i ++) {
//			System.out.println("********");
//		}
//		
//		for(int i = 0; i < 5; i ++) { // 행
//			for(int j = 0; j < 8; j ++) { // 열
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		/*
//		 * i = 0; j = 0 ~ 7 (8번)
//		 * i = 1; j = 0 ~ 7 (8번)
//		 * i = 2; j = 0 ~ 7 (8번)
//		 * ...
//		 * i = 4; j = 0 ~ 7 (8번)
//		 * */
//	
//		
//		for (int i = 1; i < 41; i ++) { // 1 ~ 40
//			System.out.print("*");
//			if (i % 8 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println();
//		System.out.println();
//		for (int i = 1; i <= 5; i ++) {
//			for (int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		Scanner input = new Scanner(System.in);
//		System.out.print("학생의 수를 입력하시오 : ");
//		int n = input.nextInt();
//		final int numberofscore = 5;
//		int score;
//		int sum;
//		
//		for(int i = 0; i < n; i ++) {
//			sum = 0;
//			System.out.printf("========= 학생 %d 정보 ==========\n", i + 1);
//			for(int j = 0; j < numberofscore; j ++) {
//				System.out.print("성적을 입력하시오 : ");
//				score = input.nextInt();
//				sum += score;
//			}
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + (double)sum / numberofscore);
//		}
		
//		int n;
//		System.out.print("판별하고자 하는 수를 입력 : ");
//		n = input.nextInt();
//		int i;
//		for(i = 2; i < n; i ++) {
//			if (n % i == 0) {
//				System.out.println("소수 X");
//				break;
//			}
//		}
//		if(i == n) {
//			System.out.println("소수 O");
//		}
		
//		int i, j, cnt = 0;
//		for(i = 2; i <= 100; i ++) {
//			for(j = 2; j < i; j ++) {
//				if (i % j == 0) {
//					break;
//				}
//			}
//			if (j == i) {
//				System.out.print(i + " ");
//				cnt ++;
//			}
//		}
//		System.out.println();
//		System.out.println("소수는 몇 개 인가요? " + cnt + "개");
		// 2 ~ 100
		// 2: 
		// 3: 
		// 4: 2 3
		// 5: 2 3 4
		
		
		// 5: 2 3 4 // 소수 o
		// 6: 2 3 4 5 // 소수 X
		
		// 피타고라스
//		System.out.println("======= 피타고라스 문제 =======");
//		int cnt = 0;
//		// a < b < c
//		for(int a = 1; a < 100; a++) {
//			for(int b = 1; b < 100; b++) {
//				for(int c = 1; c < 100; c++) {
//					if ((a * a + b * b == c * c) && (a < b)) {
//						System.out.printf("%2d %2d %2d \n", a, b, c);
//						cnt ++;
//					}
//				}
//			}
//		}
//		System.out.println("피타고라스 만족하는 수 = " + cnt);
//		System.out.println("===========================");
//		
//		
//		int n, num, min, max;
//		/*
//		 * 정수값에서 제일 작은 값: Integer.MIN_VALUE // -2147483648 (-2^31)
//		 * 정수값에서 제일 큰 값:  Integer.MAX_VALUE // 2147483647 (2^31-1)
//		 * */
//		System.out.print("n 입력 : ");
//		n = input.nextInt();
//		max = 0;
//		min = 0;
		
		// 가장 처음에 MAX, MIN 어떤 값을 넣을 지?
		// MAX = 0
		// -35 -40 -20
		
		// MIN = 0
		// 35 40 50
		
//		for(int i = 0; i < n; i++) {
//			System.out.print("수 입력 : ");
//			num = input.nextInt();
//			if(i == 0) {
//				min = num;
//				max = num;
//			}
//			if (num < min) {
//				min = num;
//			}
//			if (num > max) {
//				max = num;
//			}
//			
//		}
		
	//	System.out.printf("최소 = %d, 최대 = %d", min, max);
	}
	
	public static boolean isPrimeNumber(int n) {
		boolean isPrime = true; // 소수라고 가정
		int i;
		for(i = 2; i < n; i ++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}

}
