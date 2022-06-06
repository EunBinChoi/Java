package for_loop;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while 3가지
		// 1) 초기화 
		// 2) 조건식
		// 3) 증감식
		
		// for(초기화; 조건식; 증감식){
		// 		문장;
		// }
		
//		int i;
//		for(i = 0; i < 5; i ++) {
//			System.out.println("i의 값 = " + i);
//		}
//		System.out.println(i); // 5
//		
//		for(i = 1; i <= 5 ; i ++) {
//			System.out.println("i의 값 = " + i);
//		}
//		System.out.println(i); // 6
//		
//		for(i = 5; i > 0 ; i --) {
//			System.out.println("i의 값 = " + i);
//		}
//		System.out.println(i); // 
		
//		for(;;) {
//			System.out.println("??");
//		}
		// while(true){}와 동일하게 무한루프
		
		// Q1. i == 0 2 4 6 8 10
		for(int i = 0; i < 11; i+=2) { // 0 2 4 6 8 10 (6회)
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < 11; i++) { // 0 ~ 10 (11회)
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// Q2. i == 1 3 5 7 9
		for(int i = 1; i < 10; i+=2) { // 5회
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i < 10; i++) { // 9회
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
//		System.out.println(i); // 11
		System.out.println();
		
		// Q3. i == 1 ~ 10까지 합계 (1 + 2 + 3... + 10)
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.printf("1 ~ 10까지 합계: %d\n", sum);
		System.out.println();
		
		// Q4. (무한루프 문제) 사용자에게 -1 나오기 전까지 
		// 양의 정수를 입력받아 몇 개의 양의 정수가 입력되었는지 
		// 카운팅하는 프로그램
		// ex) 1 3 5 7 -1 => 4
		// ex) 100 200 300 -1 => 3
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for(;;) { // while(true)
			System.out.print("양의 정수 입력 (종료시 -1): ");
			int num = sc.nextInt();
			// 1) cnt++;
			if(num == -1) break;
			else if(num > 0) cnt++; // 2) cnt++;
		}
		System.out.printf("입력한 양의 정수는 %d개", cnt);
		
		// break: 반복문 종료
		// continue: 반복문 다시 시작 (i번째 무시 (skip))
		for(int i = 1; i < 11; i++) {
			if(i % 3 == 0) {
				System.out.println("hello! " + i);
				continue; 
				// i가 3의 배수일 때 반복문 다시 시작
				// 해당 i의 케이스를 무시하겠다 (i를 증가하겠다)
			}
			else {
				System.out.println(i); // 1, 2, 4, 5, 7, 8, 10
			}
			System.out.println("end");
		}
		System.out.println();
		
		// 다음과 같은 continue 문장은 의미가 없음
		// 이유? 이미 출력을 하고 3의 배수를 무시해봤자
		// 이미 실행할 문장을 다 실행했기 때문에 의미가 없음
		for(int i = 1; i < 11; i++) {
			System.out.println(i); 
			
			if(i % 3 == 0) {
				continue; 
			}
		}
		
//		for(int i = 1; i < 11; i++) {
//			if(i % 3 != 0) {
//				System.out.println(i);
//			}
//		}
		
		
		// Q5. 업다운 게임
		// 1 <= answer <= 100 사이에 랜덤값 (Math.random())을 정답으로 지정
		// 사용자가 정답을 추측하는 게임
		// if(answer > guess) UP!
		// else if(answer < guess) DOWN!
		// else 정답! 
		// 시도 횟수도 같이 출력!
		
		// 1. 2500보다 돈이 없으면 메뉴를 고를 수도 없음
		// 2. 만약에 사용자가 선택한 메뉴 금액보다 잔돈이 적으면 구매를 못함
		// 3000원 -> 3 -> 다시 선택 (잔돈) -> 1, 2 -> 구매가능
		
//		while(true) {
//			// 정상적인 데이터가 들어왔는지 확인
//			// 2500보다 작으면 다시 입력
//			// 정상적인 데이터가 들어오면 
//			break;
//		}
//		
//		// 게임 시작
//		while(true) {
//			// 메뉴판 출력
//			// 메뉴 고르기
//			
//			// 메뉴 금액이 잔돈보다 작은지 확인하는 부분
//			// 결제가 가능하면 결제 (잔돈 >= 메뉴 가격)
//			// 결제가 불가능하면 다시 메뉴를 입력받음
//			// 결제를 한 후에도 잔돈이 2500미만이 되면 프로그램 종료 (break, return)
//		}
//		
//		
		
		// Q6. 김밥천국 문제
		// 얼마 가지고 있니? 10000원
		// =====================
		// 1. 김밥 (2500)
		// 2. 라면 (3000)
		// 3. 떡볶이 (4000)
		// 4. 돈까스 (5000)
		// 5. 종료
		// =====================
		
		// 메뉴 주문 번호: 1
		// 김밥 선택하셨습니다.
		// 잔돈은 7500원입니다.
		
		// 메뉴 주문 번호: 2
		// 라면 선택하셨습니다.
		// 잔돈은 4500원입니다.
		
		// 메뉴 주문 번호: 5
		// 종료!
		// 잔돈은 4500원입니다.
		
		// 조건
		// 1) 만약 본인이 가진 돈보다 비싼 메뉴를 골랐을 경우
		// 돈이 부족합니다! 라는 메시지를 출력 -> 다시 메뉴 선택
		// 2) 잔돈이 0이면 종료
		// 3) (추가) 만약 가진 돈이 메뉴 가격의 최솟값보다 작으면 시작할 수 없음 (**)
		// 4) 가진 돈이 유효하지 않은 데이터일 수도 있음 (그럴 경우 다시 입력받게)
		// 5) 1 ~ 5 사이 메뉴를 입력하지 않았을 경우 오류 출력
		
		System.out.print("얼마 가지고 있니? ");
		int change = sc.nextInt();
		while(true) {
			System.out.println("====== menu ======");
			System.out.println("1. 김밥  (2500원)");
			System.out.println("2. 라면  (3000원)");
			System.out.println("3. 떡볶이 (4000원)");
			System.out.println("4. 돈까스 (5000원)");
			System.out.println("5. 종료");
			System.out.println("==================");
			System.out.println();
			System.out.print("메뉴 주문 번호: ");
			int menuChoice = sc.nextInt();
			if(menuChoice == 1) {
				System.out.println("김밥을 선택하셨습니다.");
				if(change >= 2500) {
					change -= 2500;
				}
				else {
					System.out.println("살 수 없습니다..ㅜㅜ");
				}
			}
			else if(menuChoice == 2) {
				if(change >= 3000) {
					change -= 3000;
				}
				else {
					System.out.println("살 수 없습니다..ㅜㅜ");
				}
			}
			else if(menuChoice == 3) {
				if(change >= 4000) {
					change -= 4000;
				}
				else {
					System.out.println("살 수 없습니다..ㅜㅜ");
				}
			}
			else if(menuChoice == 4) {
				if(change >= 5000) {
					change -= 5000;
				}
				else {
					System.out.println("살 수 없습니다..ㅜㅜ");
				}
			}
			else if(menuChoice == 5) {
				System.out.println("종료....");
				break;
			}
			else {
				System.out.println("메뉴를 다시 입력해주세요!");
			} // else 중괄호
		} // while 중괄호
	
	} // main 중괄호

} // class 중괄호
