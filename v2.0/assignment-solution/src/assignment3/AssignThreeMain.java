package assignment3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// ��Ű�� �̸�
// com.application.exception
// me.application.exception
// org.application.exception
import application_exception.*;
import assignment2.AssignTwoMain;

public class AssignThreeMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Q1. ���ٿ� ����
		// 1 <= answer <= 100 ���̿� ������ (Math.random())�� �������� ����
		// ����ڰ� ������ �����ϴ� ����
		// if(answer > guess) UP!
		// else if(answer < guess) DOWN!
		// else ����! 
		// �õ� Ƚ���� ���� ���!
		//
		// substring(start, end)
		// int answer = getAnswer(1, 101); // 1 <= < 101 (exclusive)
		// int count = 0;
		// System.out.println(answer);

		// int tries = upDownGame(answer);
		// System.out.println("Tries = " + tries);

		//////////////////////////////////////
		// Q2. ���õ�� ����

		String[] menuName = { "���", "���", "������", "���" };
		int[] menuPrice = { 2500, 3000, 4000, 5000 };
		// �ּұݾ׿� ������ ��ġ�� �ʵ��� �ϱ� ����
		int change = getCurChange(menuPrice);
		if (change == -1)
			return;

		while (true) {
			// 1. �޴��� �����ش�.
			int res = displayMenu(menuName, menuPrice);
			if (res == -1)
				break;

			// 2. �޴��� �����Ѵ�. (���� ������ �޴� ��� ���� ������ ��쿡 ����, �׷��� ������ ���� ����!)
			change = menu(menuName, menuPrice, change);
			if (change == -1)
				break;
		}

		// �� ������ �ִ�? 10000��
		// =====================
		// 1. ��� (2500)
		// 2. ��� (3000)
		// 3. ������ (4000)
		// 4. ��� (5000)
		// 5. ����
		// =====================
		//
		// �޴� �ֹ� ��ȣ: 1
		// ��� �����ϼ̽��ϴ�.
		// �ܵ��� 7500���Դϴ�.
		//
		// �޴� �ֹ� ��ȣ: 2
		// ��� �����ϼ̽��ϴ�.
		// �ܵ��� 4500���Դϴ�.
		//
		// �޴� �ֹ� ��ȣ: 5
		// ����!
		// �ܵ��� 4500���Դϴ�.
		//
		// ����
		// 1) ���� ������ ���� ������ ��� �޴��� ����� ���
		// ���� �����մϴ�! ��� �޽����� ��� -> �ٽ� �޴� ����
		// 2) �ܵ��� 0�̸� ����
		// 3) (�߰�) ���� ���� ���� �޴� ������ �ּڰ����� ������ ������ �� ���� (**)
		// 4) ���� ���� ��ȿ���� ���� �������� ���� ���� (�׷� ��� �ٽ� �Է¹ް�)
		// 5) 1 ~ 5 ���� �޴��� �Է����� �ʾ��� ��� ���� ���
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
		while (true) { // ���࿡ �߸��� �����͸� �Է¹޾��� �� �ٽ� �Է��ϰ� �ϱ� ����
			try {
				System.out.print("Guess Number ? ");
				int guess = sc.nextInt();
				return guess;
			} catch (InputMismatchException e) {
				sc.next(); // ���ۿ� �ִ� ���ڸ� ����
				System.out.println(e);
				System.out.println("[ERROR] Input Number Please...!");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static int upDownGame(int answer) {

		int count = 0;
		while (true) { // up down ������ ���� while��
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
			System.out.println("[ERROR] �޴��� �̻��մϴ�..!");
			return -1; // ������
		}
		return 1; // ����
	}

	public static int displayMenu(String[] menuName, int[] menuPrice) {
		if (checkMenu(menuName, menuPrice) == -1) {
			System.out.println("[ERROR] ��縦 �����ϴ�..!");
			return -1; // ������
		}

		System.out.println("=======================================");

		int i = 0;
		for (i = 0; i < menuName.length; i++) {
			System.out.printf("%d. %5s [%4d��]\n", i + 1, menuName[i], menuPrice[i]);
		}
		System.out.printf("%d.    ����\n", i + 1);
		System.out.println("=======================================");
		return 1; // ����
	}

	public static int getCurChange(int[] menuPrice) {
		while (true) { // ���࿡ �߸��� �����͸� �Է¹޾��� �� �ٽ� �Է��ϰ� �ϱ� ����
			try {
				System.out.print("�󸶸� ������ �ִ� ? ");
				int change = sc.nextInt();
				if (change < 0)
					throw new NegativeNumberException();
				int menuPriceMin = AssignTwoMain.getMinimumInArray(menuPrice);
				// ������ ���� �ݾ��� �����ϱ� ����
				if (change < menuPriceMin)
					throw new InvalidNumberRangeException();
				return change;
			} catch (InputMismatchException e) {
				sc.next(); // ���ۿ� �ִ� ���ڸ� ����
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է����ּ��� !");
			} catch (NegativeNumberException e) {
				System.out.println(e);
				System.out.println("[ERROR] ���� ������ �� �� �����ϴ�...!");
			} catch (InvalidNumberRangeException e) {
				System.out.println("[ERROR] ���� �����մϴ� ..!");
				return -1;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static int getMenuChoice() {
		while (true) {
			try {
				System.out.print("�޴� �ֹ� ��ȣ: ");
				int choice = sc.nextInt();
				if (!(choice >= 1 && choice <= 5))
					throw new InvalidNumberRangeException();
				return choice;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է����ּ��� !");
			} catch (InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] 1 ~ 5 ������ ���ڸ� �Է����ּ��� !");
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
			return -1; // �ǵ����� ����

		if (canBuyMenu(choice, menuPrice, change)) {
			change -= menuPrice[choice - 1];
			System.out.printf("%s�� �����ϼ̽��ϴ�.\n", menuName[choice - 1]);
			System.out.printf("���� �ݾ��� %d���Դϴ�.\n", change);
		} else {
			System.out.printf("%s�� �����ϼ����� ���� �����մϴ�...!\n", menuName[choice - 1]);
			System.out.printf("���� �ܵ��� %d���Դϴ�.\n", change);
		}

		if (isChangeLowerMinPrice(menuPrice, change)) {
			System.out.printf("���� �ܵ� (%d��)�� ���õ������ ���̻� ������ �� �����ϴ�!\n", change);
			return -1; // ���̻� �޴��� �� �� ���� (�޴� �ּҰ����� �� �ܵ��� �� ����...!)
		}
		return change;
	}

	public static boolean isChangeLowerMinPrice(int[] menuPrice, int change) {
		int minPrice = AssignTwoMain.getMinimumInArray(Arrays.copyOfRange(menuPrice, 0, menuPrice.length - 1));
		return change < minPrice;
	}
}
