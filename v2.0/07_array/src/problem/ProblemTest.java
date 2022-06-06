package problem;

import java.util.Scanner;

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q1.
//		int[] a1 = {1, 2, 3};
//		int[] a2 = {4, 5, 6};
//		int[] add = new int[a1.length];
//		int[] sub = new int[a1.length];
//		
		Scanner sc = new Scanner(System.in);
		char[] seats = new char[10];

		for (int i = 0; i < seats.length; i++) {
			seats[i] = 'O';
		}

		while (true) {

			// 사용자 좌석 번호 입력 (choice)
			System.out.println("====seats===");
			for (int i = 0; i < seats.length; i++) {
				System.out.printf("%d", i + 1);
			}
			System.out.println();
			System.out.println("============");
			for (int i = 0; i < seats.length; i++) {
				System.out.print(seats[i]);
			}
			System.out.println();

			System.out.println("좌석번호 1 ~ 10까지 입력해주세요: ");
			int choice = sc.nextInt();
			if (choice == -1) {
				System.out.println("종료합니다");
			}

			if (seats[choice - 1] == 'O') {
				seats[choice - 1] = 'X';
				System.out.println("예약 완료!");
			} else {
				System.out.println("이미 예약되었습니다!");
			}
		}

	}

}
