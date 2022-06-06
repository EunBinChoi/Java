package question;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		int a = 0;
//	       int b = 1;
//	       System.out.println("원하는 구구단 단수를 입력해주세요 ex)2 : ");
//	       a = sc.nextInt();
//	       while(a <= 9) {
//	    	   System.out.println("a : " + a);
//	    	   System.out.println("b : " + b);
//	          while (b <= 9) {
//	             System.out.printf("%dX%d=%d\n", a, b, a*b);
//	             b++;
//	          }
//	       }

//		System.out.println("숫자를 입력하세요:");
//		int n = sc.nextInt();
//		int m = 1;
//		int res = 0;
//		while (m < n) { 
//			// m  n
//			// 1 < 5 
//			// 2 < 5  
//			// 3 < 5 
//			// 4 < 5
//			if (n > 0)
//				res = n * (n - m);
//			m++;
//
//		}
//		System.out.println(res);

		int menuChoice = 0;
		int change = 0;

		while (true) {
			System.out.println("얼마 가지고 있니? ");
			change = sc.nextInt();
			if (change < 1) {
				System.out.println("[오류]1원이상 입력하세요");
				continue;
			} else if (change < 2500) {
				System.out.println("[오류]최소주문가능한 금액은 2500원 입니다.");
				continue;
			}

			String m = "김밥";
			String mm = "라면";
			String mmm = "떡볶이";
			String mmmm = "돈까스";
			int kimbabprice = 2500;
			int ramenprice = 3000;
			int ddukprice = 4000;
			int dongasprice = 5500;

			// while (true) {
			System.out.println("====== menu ======");
			System.out.println("1.  김밥  (2500원)");
			System.out.println("2.  라면  (3000원)");
			System.out.println("3.  떡볶이 (4000원)");
			System.out.println("4.  돈까스 (5500원)");
			System.out.println("5.  종료");
			System.out.println("==================");
			System.out.println();
			System.out.print("메뉴 주문 번호: "); // 메뉴선택 받는 곳 1 ~ 5 사이 메뉴를 입력하지 않았을 경우 오류 출력
			menuChoice = sc.nextInt();
			if (menuChoice > 0 && menuChoice < 6)
				break;
			else
				System.out.println("1 ~ 5번 메뉴만 선택 가능합니다.");

			if (menuChoice == 1) {
				System.out.printf("%s을 선택하셨습니다    \n", m);
				System.out.printf("잔돈은 %d원입니다    \n", change - kimbabprice);
			} else if (menuChoice == 2) {
				System.out.printf("%s을 선택하셨습니다    \n", mm);
				System.out.printf("잔돈은 %d원입니다    \n", change - ramenprice);
			} else if (menuChoice == 3) {
				System.out.printf("%s을 선택하셨습니다    \n", mmm);
				System.out.printf("잔돈은 %d원입니다    \n", change - ddukprice);
			} else if (menuChoice == 4) {
				System.out.printf("%s을 선택하셨습니다    \n", mmmm);
				System.out.printf("잔돈은 %d원입니다    \n", change - dongasprice);
			} else if (menuChoice == 5) {
				System.out.println("종료....");
				break;
			} else {
				System.out.println("메뉴를 다시 입력해주세요!");
			}
			//

			// } // 내부 while

			//
		} // 외부 while

	}

}
