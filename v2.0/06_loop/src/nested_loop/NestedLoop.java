package nested_loop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 중첩 반복문 (이중 반복문, nested loop)
		 * : 반복문 안에 반복문이 들어가있는 구조
		 * */
		
		/* while(){
		 * 	while(){
		 * 	}
		 * }
		 * 
		 * for(){
		 * 	for(){
		 * 	}
		 * }
		 * 
		 * ***
		 * ***
		 * ***
		 * 
		 * */
		
		for(int i = 0; i < 3; i++) {
			System.out.println("***");
		}
		
		for(int i = 0; i < 3; i++) { // 1
			for(int j = 0; j < 3; j++) { // 2
				System.out.print("*");
			} // 3
			System.out.println();	
		} // 4
		// 외부 for문: i (1 ~ 4)
		// 내부 for문: j (2 ~ 3)
		// i와 j는 혼용해서 사용하지 않을 것!
		
		for(int i = 0; i < 9; i++) {
			System.out.print("*");
			if((i + 1) % 3 == 0) System.out.println();
			
			// *********
			// 012345678
		}
		
		// Q1.
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; i >= j; j++) {
				//if() {
					System.out.print("*");
				//}
			}
			System.out.println();
		}
		
		
		// Q2.
		// 총 5명의 5개의 과목 성적 (국, 수, 사, 과, 영)
		// 출력)
		// 1번째 학생의 성적 입력: 50 40 90 80 85
		// 1번째 학생의 평균은 69점입니다.
		// 2번째 학생의 성적 입력: 50 40 90 80 85
		// 2번째 학생의 평균은 69점입니다.
		// 3번째 학생의 성적 입력: 50 40 90 80 85
		// 3번째 학생의 평균은 69점입니다.
		// 4번째 학생의 성적 입력: 50 40 90 80 85
		// 4번째 학생의 평균은 69점입니다.
		// 5번째 학생의 성적 입력: 50 40 90 80 85
		// 5번째 학생의 평균은 69점입니다.
		Scanner sc = new Scanner(System.in);
//		int score = 0;  // 성적 입력변수 (25번 받음)
//		int sum = 0; // 학생 1명에 대한 과목 5개의 합계
//		double avg = 0; // 학생 1명에 대한 과목 5개의 평균
//		for(int i = 0; i < 5; i++) { // 학생 5명을 돌면서
//			sum = 0; // 초기화 (***) (i==1 학생의 성적 입력, i==0 학생의 성적 제거)
//			System.out.printf("%d번째 학생의 성적 입력: ", i+1);
//			
//			for(int j = 0; j < 5; j++) { // 성적 5개 입력받음 (50 60 70 80 90)
//				score = sc.nextInt();
//				sum += score;
//			}
//			avg = sum / 5.0; // 5는 과목수
//			System.out.printf("%d번째 학생의 평균은 %f점입니다.\n", i+1, avg);
//		}
		
		
		// Q3. 문자열의 팰린드롬 (palindrome, 회문)
		// 어떤 문자열을 순차적으로 읽어도 역순으로 읽어도 동일한 문자열을 회문이라고 합니다.
		// 예를 들어, mom은 순차적으로 읽어도 mom, 역순으로 읽어도 mom으로 회문이 맞습니다.
		// 예를 들어, ab a는 회문이 아닙니다.
		// 예를 들어, aba는 회문입니다.
		// 입력된 문자열이 팰린드롬인지 아닌지 판별하는 프로그램을 작성하시오.
		// (문자열의 길이는 s.length(), s.charAt(2))
		
//		String s = ""; // 문자열 초기화
//		System.out.print("문자열 입력: ");
//		s = sc.nextLine(); // ab a
//		int p1 = 0;
//		int p2 = s.length()-1;
//		boolean isPalin = true; // 해당 문자열이 팰린드롬인지 아닌지 저장
//		
//		int i;
//		for(i = 0; i < s.length()/2; i++) {
//			// pointer1: s.charAt(i)
//			// pointer2: s.charAt(s.length()-1-i)
//			// p1, p2 위치에 있는 모든 문자가 같아야함
////			if(s.charAt(p1) == s.charAt(p2)) {
////				isPalin = true;
////			}
////			else { // 하나라도 다른 놈이 나오면 break!
////				isPalin = false;
////				break;
////			}
//			
//			// 팰린드롬이라고 가정한 후에
//			// p1, p2 위치에 있는 문자 중에 하나라도 다른 놈이 나오면 ..? (***)
//			if(s.charAt(p1) != s.charAt(p2)) {
//				isPalin = false;
//				break;
//			}
//			
//			System.out.println(s.charAt(i));
//			// abba (0 ~ 3 (문자열의 길이-1))
//			// pointer1: 0                     1
//			// pointer2: 전체 문자열의 길이-1       전체 문자열의 길이-2
//			p1++;
//			p2--;
//		}
//		System.out.println(i); 
//		System.out.println((isPalin) ? "팰린드롬입니다." : "팰린드롬이 아닙니다.");
//		
		// Q3-1. 사용자에게 문자열 두 개를 입력받아 두 문자열이 같은지 확인하는 equals()
		// "abc" "abcd"
		// "abc" "acc"
		// == (int, boolean, char)
		// equals() (String, 대소문자 구분 O)
		// equalsIgnoreCase() (대소문자 구분 X)
		
		// 1. 문자열의 길이 같아야 함 (aaa, aaaa)
		// 2. 문자열을 구성하고 있는 모든 문자가 같아야 함
		
//		String s1 = sc.next();
//		String s2 = sc.next();
//		
//		if(s1.length() != s2.length()) {
//			System.out.println("두 문자열이 다릅니다.");
//			return;
//		}
//		
//		boolean isEquals = true;
//		// s1.length() == s2.length()
//		for(int i = 0; i < s1.length(); i++) {
//			if(s1.charAt(i) != s2.charAt(i)) {
//				isEquals = false;
//				break;
//			}
//		}
//		System.out.println(isEquals ? "두 문자열이 같습니다." : "두 문자열이 다릅니다.");
//		
		
		// Q4. 피타고라스 만족하는 삼각형 구하기
		// 1 <= a, b, c <= 100 (a, b, c는 변의 길이 (c가 가장 크다고 가정))
		// 피타고라스 공식: a * a + b * b == c * c을 
		// 만족하는 삼각형 변의 길이 쌍을 출력하시오.
		// 총 몇 개의 삼각형이 피타고라스에 만족하는지도 확인해보세요!
		
		// 추가 1) 변의 길이 중복 허용 -> 104개
		//     2)        중복 제거 -> 52개
		// a, b, c
		// 3, 4, 5  
		// 4, 3, 5
		
		int cnt = 0;
		
		// 100 * 100 * 100 = 10^6
		// a < b < c
		// 3   3 ~
		for(int a = 1; a < 101; a++) {
			for(int b = a; b < 101; b++) {
				for(int c = b; c < 101; c++) {
					if(a*a + b*b == c*c) {
						cnt++;
						System.out.printf("(%3d %3d %3d)\n", a, b, c);
					}
				}
			}
		}
		System.out.println("총 개수: " + cnt);
		
		
		
	}

}
