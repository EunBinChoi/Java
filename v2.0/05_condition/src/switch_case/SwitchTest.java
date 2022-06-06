package switch_case;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * a = 3;
		 * 
		 * * switch 변수에 들어갈 수 있는 데이터타입
		 * : 정수, 문자, 문자열 (equals()로 비교)
		 * 
		 * switch(a) {
		 * 	case '1': // a == '1'
		 * 		문장;
		 * 		break; // switch 종료 (vs for break)
		 * 	case '2': // a == '2'
		 * 		문장;
		 * 		break;
		 * 	case '3': // a == '3'
		 * 		문장;
		 * 		break;
		 * 	default: // if문에서 else랑 유사
		 * 		문장;
		 * 		//break; // default에서 생략 가능
		 * } // switch의 끝
		 * 
		 * switch 장점? 		
		 * 1) 코드 간결
		 * 2) == 생략되어있는 걸 알고 시작 -> "가독성" 
		 * 
		 * if(a == 1){
		 * 		문장;
		 * }
		 * else if(a == 2){
		 * 		문장;
		 * }
		 * else if(a == 3){
		 * 		문장;
		 * }
		 * else {
		 * 		문장;
		 * }
		 *  
		 *  
		 *  
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		// Q1. 사용자에게 수를 입력받아 해당 수가 1, 2, 3인지 확인
//		System.out.print("정수를 입력하시오: ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//			case 1:
//				System.out.println("1");
//				break;
//			case 2:
//				System.out.println("2");
//				break;
//			case 3:
//				System.out.println("3");
//				break;
//			default:
//				System.out.println("1, 2, 3 중에 하나만 입력");
//				//break;
//		}
		
		// Q2. 사용자에게 현재 월을 입력받아 해당 월을 문자로 출력
		// 1 -> Jan
		// 2 -> Feb
		// 3 -> Mar
		// 4 -> Apr
		
//		System.out.print("1 ~ 4월 중 하나를 입력하시오: ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//			case 1:
//				System.out.println("Jan");
//				break;
//			case 2:
//				System.out.println("Feb");
//				break;
//			case 3:
//				System.out.println("Mar");
//				break;
//			case 4:
//				System.out.println("Apr");
//				break;
//			default:
//				System.out.println("1 ~ 4월 중에 하나만 입력");
//				break;
//		}
		
		String str = "a";
		switch(str) {
			case "a":
				System.out.println("a");
//				break;
			case "b":
				System.out.println("b");
//				break;
			default: // else
				System.out.println("others");
//				break;
		}
//		
//		float f = 12.34f;
//		switch(f) { // 3.1 <= 3.14 < 3.2
//			case 12.34:
//				System.out.println("a");
//				break;
//			case 45.67:
//				System.out.println("b");
//				break;
//			default:
//				System.out.println("others");
//				break;
//		}
//		
		// 의도적으로 break를 생략하는 경우
		// 사용자에게 월을 입력받아 해당 월의 마지막 일자를 구하는 프로그램
		
//		System.out.print("연도 입력: ");
//		int year = sc.nextInt(); // 2020
//		
//		System.out.print("월 입력: ");
//		int month = sc.nextInt(); // 2
//		
//		if(!(month >= 1 && month <= 12)) {
//			System.out.println("[오류] 입력한 월이 유효하지 않음");
//			return;
//		}
//		
//		int totalDays = 0;
//		
//				
//		switch(month) {
//		// (month == 1) || (month == 3) || (month == 5) 
//		// || (month == 7) ........
//		// ** month == 부분을 switch case문에서는 생략가능 (가독성 ↑)
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			totalDays = 31;
//			break;
//			
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			totalDays = 30;
//			break;
//			
//		case 2:
//			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0))
//			|| (year % 400 == 0);
//			
//			if(isLeapYear) totalDays = 29;
//			else totalDays = 28;
//			
//			break;
//			
//		default:
//			totalDays = -1; // 연산의 오류
//			//break;
//		}
//		
//		System.out.printf("%d년 %d월의 총 일수는 %d일 입니다\n", 
//				year, month, totalDays);
//		
		
		// 현재 예제에서
		// Q1. 사용자에게 연도를 입력받아 윤년검사하고 윤년 -> 29일
		// 									 평년 -> 28일
		// 윤년 검사하는 방법 (둘 중 하나 만족하면 됨)
		// 1) 4의 배수이고 동시에 100의 배수가 아님
		// 2) 400의 배수
		
		// Q2. totalDays를 출력 (+ 연도, 월 같이)
		// 30, 31, 29, 28, -1
		// 2020년 13월의 총 일수는 -1입니다.
		
		
		// Q3. switch문을 이용해서 사용자에게 문자 하나를 입력받아
		// 모음과 자음을 판별하는 프로그램을 작성
		// 모음: a, e, i, o, u
		// 자음: 나머지
		// (사용자의 입력이 대소문자 구분없이 들어와도 가능해야 함)
		// A, a
		
		System.out.print("문자 하나 입력: "); 
		
		
		
//		String userData = sc.next(); // 사용자 입력 데이터 저장
//		char ch = userData.toLowerCase().charAt(0);
//		
		
		char userData = sc.next().charAt(0);
		char ch = userData;
		if(ch >= 'A' && ch <= 'Z') {
			ch += ('a' - 'A');
		}
	
		// 원래 버전
		// char ch = sc.next().toLowerCase().charAt(0);
		
		// 사용자 입력 데이터를 일괄적으로 소문자로 변경
		
		// "A" -> "a" -> 'a'
		// "AbC" -> "abc" -> 'a'
		if(!(ch >= 'a' && ch <= 'z')) { 
			System.out.printf("%s는 모음/자음 "
					+ "판단불가능한 문자입니다!", ch);
			return; // 메인함수 종료 (switch에 도달하지 못함)
		}	
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.printf("%c는 모음입니다.\n", ch);
				break;
				
			default: // 무조건 모음을 제외한 알파벳만 나오나요?
				System.out.printf("%c는 자음입니다.\n", ch);
//				break;
		}
		
	}

}
