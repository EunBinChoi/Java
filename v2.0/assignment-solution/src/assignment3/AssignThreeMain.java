package assignment3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// 패키지 이름
// com.application.exception
// me.application.exception
// org.application.exception
import application_exception.*;
import assignment2.AssignTwoMain;

public class AssignThreeMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Q1. 업다운 게임
		// 1 <= answer <= 100 사이에 랜덤값 (Math.random())을 정답으로 지정
		// 사용자가 정답을 추측하는 게임
		// if(answer > guess) UP!
		// else if(answer < guess) DOWN!
		// else 정답! 
		// 시도 횟수도 같이 출력!
		//
		// substring(start, end)
		// int answer = getAnswer(1, 101); // 1 <= < 101 (exclusive)
		// int count = 0;
		// System.out.println(answer);

		// int tries = upDownGame(answer);
		// System.out.println("Tries = " + tries);

		//////////////////////////////////////
		// Q2. 김밥천국 문제

		String[] menuName = { "김밥", "라면", "떡볶이", "돈까스" };
		int[] menuPrice = { 2500, 3000, 4000, 5000 };
		// 최소금액에 영향을 미치지 않도록 하기 위함
		int change = getCurChange(menuPrice);
		if (change == -1)
			return;

		while (true) {
			// 1. 메뉴를 보여준다.
			int res = displayMenu(menuName, menuPrice);
			if (res == -1)
				break;

			// 2. 메뉴를 선택한다. (만약 선택한 메뉴 대비 돈이 부족할 경우에 오류, 그렇지 않으면 정상 결제!)
			change = menu(menuName, menuPrice, change);
			if (change == -1)
				break;
		}

		// 얼마 가지고 있니? 10000원
		// =====================
		// 1. 김밥 (2500)
		// 2. 라면 (3000)
		// 3. 떡볶이 (4000)
		// 4. 돈까스 (5000)
		// 5. 종료
		// =====================
		//
		// 메뉴 주문 번호: 1
		// 김밥 선택하셨습니다.
		// 잔돈은 7500원입니다.
		//
		// 메뉴 주문 번호: 2
		// 라면 선택하셨습니다.
		// 잔돈은 4500원입니다.
		//
		// 메뉴 주문 번호: 5
		// 종료!
		// 잔돈은 4500원입니다.
		//
		// 조건
		// 1) 만약 본인이 가진 돈보다 비싼 메뉴를 골랐을 경우
		// 돈이 부족합니다! 라는 메시지를 출력 -> 다시 메뉴 선택
		// 2) 잔돈이 0이면 종료
		// 3) (추가) 만약 가진 돈이 메뉴 가격의 최솟값보다 작으면 시작할 수 없음 (**)
		// 4) 가진 돈이 유효하지 않은 데이터일 수도 있음 (그럴 경우 다시 입력받게)
		// 5) 1 ~ 5 사이 메뉴를 입력하지 않았을 경우 오류 출력
	}

	public static int getAnswer(int start, int end) {
		// 0.0 <= Math.random() < 1.0
		// 0.0 <= Math.random() * 100 < 100
		// 0 <= (int)(Math.random() * 100) < 100
		// 1 <= (int)(Math.random() * 100) + 1 < 101
		// start <= (int)(Math.random() * (end-start)) + start < end

		return (int) (Math.random() * (end - start)) + start;
	}

	public static int guessNumber() {
		while (true) { // 만약에 잘못된 데이터를 입력받았을 때 다시 입력하게 하기 위함
			try {
				System.out.print("Guess Number ? ");
				int guess = sc.nextInt();
				return guess;
			} catch (InputMismatchException e) {
				sc.next(); // 버퍼에 있는 문자를 지움
				System.out.println(e);
				System.out.println("[ERROR] Input Number Please...!");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static int upDownGame(int answer) {

		int count = 0;
		while (true) { // up down 게임을 위한 while문
			int guess = guessNumber();
			count++;

			if (answer > guess) {
				System.out.println("UP!");
			} else if (answer < guess) {
				System.out.println("DOWN !");
			} else { // answer == guess
				System.out.println("Correct!!!!!!!!!!!");
				// System.out.printf("Tries = %d\n", count);
				return count;
			}

		}
	}

	public static int checkMenu(String[] menuName, int[] menuPrice) {
		if (menuName.length != menuPrice.length) {
			System.out.println("[ERROR] 메뉴가 이상합니다..!");
			return -1; // 비정상
		}
		return 1; // 정상
	}

	public static int displayMenu(String[] menuName, int[] menuPrice) {
		if (checkMenu(menuName, menuPrice) == -1) {
			System.out.println("[ERROR] 장사를 접습니다..!");
			return -1; // 비정상
		}

		System.out.println("=======================================");

		int i = 0;
		for (i = 0; i < menuName.length; i++) {
			System.out.printf("%d. %5s [%4d원]\n", i + 1, menuName[i], menuPrice[i]);
		}
		System.out.printf("%d.    종료\n", i + 1);
		System.out.println("=======================================");
		return 1; // 정상
	}

	public static int getCurChange(int[] menuPrice) {
		while (true) { // 만약에 잘못된 데이터를 입력받았을 때 다시 입력하게 하기 위함
			try {
				System.out.print("얼마를 가지고 있니 ? ");
				int change = sc.nextInt();
				if (change < 0)
					throw new NegativeNumberException();
				int menuPriceMin = AssignTwoMain.getMinimumInArray(menuPrice);
				// 마지막 종료 금액을 제외하기 위함
				if (change < menuPriceMin)
					throw new InvalidNumberRangeException();
				return change;
			} catch (InputMismatchException e) {
				sc.next(); // 버퍼에 있는 문자를 지움
				System.out.println(e);
				System.out.println("[ERROR] 숫자만 입력해주세요 !");
			} catch (NegativeNumberException e) {
				System.out.println(e);
				System.out.println("[ERROR] 돈은 음수가 될 수 없습니다...!");
			} catch (InvalidNumberRangeException e) {
				System.out.println("[ERROR] 돈이 부족합니다 ..!");
				return -1;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static int getMenuChoice() {
		while (true) {
			try {
				System.out.print("메뉴 주문 번호: ");
				int choice = sc.nextInt();
				if (!(choice >= 1 && choice <= 5))
					throw new InvalidNumberRangeException();
				return choice;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] 숫자만 입력해주세요 !");
			} catch (InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] 1 ~ 5 사이의 숫자를 입력해주세요 !");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static boolean canBuyMenu(int choice, int[] menuPrice, int change) {
		return change >= menuPrice[choice - 1];
	}

	public static int menu(String[] menuName, int[] menuPrice, int change) {
		int choice = getMenuChoice();
		if (choice == 5)
			return -1; // 의도적인 종료

		if (canBuyMenu(choice, menuPrice, change)) {
			change -= menuPrice[choice - 1];
			System.out.printf("%s를 선택하셨습니다.\n", menuName[choice - 1]);
			System.out.printf("남은 금액은 %d원입니다.\n", change);
		} else {
			System.out.printf("%s를 선택하셨지만 돈이 부족합니다...!\n", menuName[choice - 1]);
			System.out.printf("현재 잔돈은 %d원입니다.\n", change);
		}

		if (isChangeLowerMinPrice(menuPrice, change)) {
			System.out.printf("현재 잔돈 (%d원)는 김밥천국에서 더이상 구매할 수 없습니다!\n", change);
			return -1; // 더이상 메뉴를 살 수 없음 (메뉴 최소값보다 내 잔돈이 더 작음...!)
		}
		return change;
	}

	public static boolean isChangeLowerMinPrice(int[] menuPrice, int change) {
		int minPrice = AssignTwoMain.getMinimumInArray(Arrays.copyOfRange(menuPrice, 0, menuPrice.length - 1));
		return change < minPrice;
	}
}
