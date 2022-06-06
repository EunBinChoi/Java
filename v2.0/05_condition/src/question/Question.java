package question;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 원래 코드
//		int kor = sc.nextInt();
//		if (kor > 100 || kor < 0) {
//			System.out.println("[에러] : 유효하지 않은 국어성적 입니다");
//			return;
//		}
//		else {
//			int mat = sc.nextInt();
//			if (mat > 100 || mat < 0) {
//				System.out.println("[에러] : 유효하지 않은 수학성적 입니다");
//			}
//			else {
//				int eng = sc.nextInt();
//				if (eng > 100 || eng < 0) {
//					System.out.println("[에러] : 유효하지 않은 영어성적 입니다");
//				}
//				else {
//					double avg = (kor + mat + eng) / 3.0;
//					boolean avgChk = avg > 70;
//					
//					if (avgChk) {
//						System.out.println("합격");
//					}
//					else {
//						System.out.println("불합격");
//					}
//				}
//			}
//		}
		
		// 변경 코드
		// 유효하지 않은 데이터 검사
		int kor = sc.nextInt();
		if (kor > 100 || kor < 0) {
			System.out.println("[에러] : 유효하지 않은 국어성적 입니다");
			return; // 메인 함수 종료
		}
		int mat = sc.nextInt();
		if (mat > 100 || mat < 0) {
			System.out.println("[에러] : 유효하지 않은 수학성적 입니다");
			return; // 메인 함수 종료
		}
		int eng = sc.nextInt();
		if (eng > 100 || eng < 0) {
			System.out.println("[에러] : 유효하지 않은 영어성적 입니다");
			return; // 메인 함수 종료
		}
		
		/////////////////////////////////////
		double avg = (kor + mat + eng) / 3.0;
		boolean avgChk = avg > 70;
		
		if (avgChk) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}

}
