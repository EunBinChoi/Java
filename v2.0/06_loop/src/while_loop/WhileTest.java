package while_loop;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 반복문: 어떤 문장이 반복되는 구조
		 * ex) 30명 성적 입력받고 싶을 때
		 * ex) 1 ~ 45 로또값 6개
		 * 
		 * while, do while, for
		 * 
		 * sysout("hello");
		 * 
		 * while(조건식){
		 * 		문장;
		 * }
		 * : 조건식이 참일 때 동안 문장이 실행된다.
		 * : 조건식이 한번이라도 거짓이되면 반복문은 종료된다.
		 * */
		
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		
//		int i = 0; // 반복문을 위한 임시변수 (반복 횟수 저장)
//		while(i < 5) {
//			System.out.println("hello! " + i);
//			i++; // i = i + 1
//		}
//		//
//		System.out.println("while문 종료시 i = " + i); // 5
//		// i < 5 조건식이 거짓이 되는 순간은 i == 5일 때
//		
		
//		i = 1;
//		while(i <= 5) { // 1 <= 5
//			System.out.println("hello! " + i);
//			i++; // i = i + 1
//			// ++i;
//		}
//		System.out.println("while문 종료시 i = " + i); // 6
		
		/* while
		 * 1) 초기화 (i = 1,  i = 0)
		 * 2) 조건식 (i <= 5, i < 5)
		 * 3) 증감식 (i++, ++i) (**)
		 * * 만약 증감식이 없으면 무한 반복문 (무한 루프)에 빠지게 됨
		 * 
		 * * 무한 반복문 활용
		 * while(true){
		 * 
		 * }
		 * */
		Scanner sc = new Scanner(System.in); 
		// ctrl + shift + o: 필요한 클래스가 자동으로 import
		
		// Q1. 사용자에게 문자 하나를 입력받아서 알파벳이 아니면 계속 입력
		
//		char ch = 0;	
//		
//		while(true) {
//			System.out.print("문자 하나 입력: ");
//			ch = sc.next().toLowerCase().charAt(0); //
//			
//			if(ch >= 'a' && ch <= 'z') break; // 반복문 빠져나감
//			else System.out.println("[경고] 알파벳만 입력!");
//		} // while문의 종료
//		//
//		System.out.println("break에 의해 반복문 빠져나옴 " + ch); //?
		
		// Q2. 사용자에게 구구단 단수 (2 ~ 9단)를 입력받아 
		// 구구단 출력 프로그램
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		
		
		// 1) 사용자가 제대로된 값을 입력할 때까지 계속 받는 방법
		// 2) 잘못 입력했을 경우 바로 종료하는 방법
		
		
		// 1)
//		int n = 0;
//		while(true) {
//			System.out.print("구구단 단수 입력: "); // 2 ~ 9
//			n = sc.nextInt();
//			
//			if(n >= 2 && n <= 9) break;
//			else {
//				System.out.println("[에러] 2 ~ 9 사이의 값 입력해주세요!");
//			}
//		}
//		
//		// 2)
////		if(!(n >= 2 && n <= 9)) {
////			System.out.println("[에러] 단수가 유효하지 않음!");
////			return;
////		}
//		
//		int i = 1;
//		while(i <= 9) {
//			System.out.printf("%d x %d = %d\n", n, i, n*i);
//			i ++;
//		}
		
		// Q3. 5명의 컴퓨터 성적 (정수)을 입력받아 
		// 성적의 합계와 평균을 구하는 프로그램
		// 80, 85, 90, 100, 95
		
		// total: 80 + 85 + 90 + 100 + 95
		
//		int i = 0;
//		int score = 0;
//		int total = 0;
//		
//		while(i < 5) {
//			System.out.printf("%d번째 학생의 성적 입력 : ", i + 1);
//			score = sc.nextInt();
//			
//			total += score;
//			i++;
//		}
//		System.out.println(total); // 학생 성적 총합
//		System.out.printf("평균: %f", total / 5.0); // 학생 성적 평균
		
		// 5 / 2 ==> 2
		// 5 / 2.0 ==> 2.5
		
		/* totalScore = 0;
		 * 
		 * i == 0
		 * score: 95
		 * totalScore = 0 + 95
		 * 
		 * i == 1
		 * score: 85
		 * totalScore = (0 + 95) + 85
		 * 
		 * i == 2
		 * score: 80
		 * totalScore = (0 + 95 + 85) + 80
		 * 
		 * i == 3
		 * score = 60
		 * totalScore = (0 + 95 + 85 + 80) + 60
		 * 
		 * i == 4
		 * score = 50
		 * totalScore = (0 + 95 + 85 + 80 + 60) + 50
		 * 
		 * */
		
		// Q4. 5개의 숫자 (정수)를 입력받아 최댓값, 최솟값을 구하는 프로그램
		// 1) 사용자가 첫번째로 입력한 값을 max, min의 초기값 설정
		// if (i == 0) max = n; min = n
		
		// 2) max: 엄청 작은 값, min: 엄청 큰 값을 넣어서
		// i == 0일 때 무조건 초기화 될 수 있게 만듦
//		int max = Integer.MIN_VALUE; // -2^31 // 최댓값 저장 공간
//		int min = Integer.MAX_VALUE; // 2^31-1 // 최솟값 저장 공간
//		int n = 0; // 사용자 입력 데이터
//		int i = 0; // 반복 횟수
//		
//		while(i < 5) {
//			System.out.print("숫자 입력: ");
//			n = sc.nextInt();
////			if(i == 0) {
////				max = n;
////				min = n;
////			}
//			
////			// 사용자가 가장 처음 데이터를 입력했을 때
//			if(max < n) max = n;
//			//if(min > n) min = n;
//			i++;
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		// Q5. 1 ~ 10 중에서 3의 배수만 출력하는 프로그램
//		int i = 1;
//		
//		while(i < 11) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		int i = 1;
		
		while(i < 11) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		// Q6. 사용자에게 문자 하나 (알파벳, 숫자, 특수문자 모두 가능)를 
		// 입력받아 'q' 문자가 들어오기 전까지 입력받은 문자를 하나의 
		// 문자열로 바꾸는 프로그램 (while(true) + break 문제)
		// ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
		// 추가문제 1) 문자열을 역순으로 저장하게 할 수 있을까요?
		// 'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
		
		// Q7. 사용자에게 n을 입력받아 n! (factorial)을 구하는 프로그램
		// (n! = 1 x 2 x 3 x 4 ... n)
		// ex) 1
		// 1! = 1
		// ex) 3
		// 1 x 2 x 3
		
		
		
	}

}
