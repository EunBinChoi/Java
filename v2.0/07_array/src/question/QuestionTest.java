package question;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if

//		int a = 1;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.println("print");
//				
//				if (j == 1) continue;
//				System.out.println("print2");
//				
//			}
//			//
//		}
//		System.out.println("hello world");
//		
//		// return: 메인 함수 종료
//		// break: 반복문 종료 (vs switch case break)
//		// continue
//		
//		
		Scanner sc = new Scanner(System.in);
//		char[] seats = new char[10];
//		int select = 0; // 유저 선택 좌석 변수
//		
//		// seats 배열 모든 원소 'O'로 할당
//		for(int i = 0; i < seats.length; i++) {
//			seats[i] = 'O';
//		}
//		// 좌석 검사 프로그램
//		while(true) {
//			System.out.println(
//					"======== SEATS ========\n"
//					+ "1   2   3   4   5   6   7   8   9   10\n"
//					+ "======================"
//					);
//			for(int i = 0; i < seats.length; i++) {
//				System.out.printf("%c  ",seats[i]);
//			}
//			System.out.println();
//			System.out.println("종료하고자 하면 -1을 입력하세요");
//			System.out.print("좌석을 선택하세요 : ");
//			select = sc.nextInt(); // 좌석 번호 입력
//			// -1 입력시 프로그램종료
//			if(select == -1) {
//				System.out.println("프로그램 종료");
//				return;
//			}
//			// 유효한 좌석번호 검사
//			else if (!((select >= 1) && (select <= 10))) {
//				System.out.println("유효한 좌석번호가 아닙니다");
//				System.out.println("1 ~ 10번 좌석을 입력해주세요");
//				System.out.println();
//				continue;
//			}
//			
//			// 좌석 선택 시 'X'로 변경
//			if(seats[select - 1] == 'O') {
//				seats[select - 1] = 'X';
//				System.out.printf("%d번 좌석 예약되었습니다\n", select);
//				System.out.println();
//			}
//			// 이미 예약된 좌석 선택불가
//			else {
//				System.out.println("이미 예약된 좌석입니다");
//				System.out.println("다시 선택하세요");
//				System.out.println();
//				continue;
//			}
//			int exitCount = 0; // 프로그램 종료 카운트 변수
//			// 프로그램 종료 카운트
//			for(int i = 0; i < seats.length; i++) {
//				if (seats[i] == 'X') {
//					exitCount++;
//				}
//			}
//			// 카운트 달성시 프로그램 종료
//			if(exitCount == 10) {
//				System.out.println(
//						"======== SEATS ========\n"
//						+ "1   2   3   4   5   6   7   8   9   10\n"
//						+ "======================"
//						);
//				for(int i = 0; i < seats.length; i++) {
//					System.out.printf("%c  ",seats[i]);
//				}
//				System.out.println();
//				System.out.println("모든 좌석이 꽉 찼습니다");
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//		}
//		
//		String str = sc.next();
//		char[] strChar = str.toCharArray();

		int ele = 0;
		int chk = 0;
		int tmp = 0;
		System.out.print(">>몇 개의 원소가 있습니까? : ");
		ele = sc.nextInt();
		int elem[] = new int[ele];

		// 입력부
		for (int i = 0; i < ele; i++) {
			System.out.print(">> 원소값을 입력하시오 : ");
			elem[i] = sc.nextInt();
		}
		// 정렬부

		for (int i = 0; i < ele; i++) {
			for (int j = 0; j < ele; j++) {
				
				if (elem[i] < elem[j]) {
					System.out.printf("%d %d\n", elem[i], elem[j]);
					tmp = elem[j];
					elem[j] = elem[i];
					elem[i] = tmp;

				}

			}

		}
		// 출력부
		System.out.println(">>정렬 결과 : ");
		for (int i = 0; i < ele; i++) {

			System.out.print(elem[i] + " ");
		}

	} // 메인 함수 끝
		//

}
