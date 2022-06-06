package assignment4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner; // ctrl + shift + o (�ڵ� ����)

import application_exception.InvalidNumberRangeException;
import application_exception.NegativeNumberException;
import assignment2.AssignTwoMain;

public class AssignFourMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q1. �迭 ����, ����
		// int[] a1 = {10, 20, 30};
		// int[] a2 = {10, 20, 30};
		// int[] add = add1dArray(a1, a2);
		// int[] sub = sub1dArray(a1, a2);
		// System.out.println(Arrays.toString(add));
		// System.out.println(Arrays.toString(sub));

		// Q2. ��ȭ�� �¼� ���� ���α׷�
		// int n = inputPositiveNum("�� ���� �¼��� �ֽ��ϱ�? ");
		// char[] seats = new char[n];
		// Arrays.fill(seats, 'O'); // seats�� ��� �¼��� 'O' (���� ���ɻ���) �� �ʱ�ȭ
		//
		// while (true) {
		//
		// // 1. ���� ���� ���¸� �����ش�.
		// dispCurSeatsStatus(seats);
		//
		// // 2. �����Ѵ�.
		// int res = book(seats);
		// if(res == -1) break;
		// }

		// Q3. voting
//		int numOfCands = inputPositiveNum("�� ���� �ĺ��ڰ� �ֽ��ϱ�? ");
//		int[] voting = new int[numOfCands];
//		while (true) {
//			System.out.println("** -1�� ������ ����˴ϴ� .... **");
//			System.out.println();
//			System.out.printf("1 ~ %d���� �ĺ��ڰ� �ֽ��ϴ�....!\n", numOfCands);
//			System.out.print("");
//			int userChoice = chooseNumInRange("�� ��° �ĺ��ڸ� �����Ͻðڽ��ϱ� ? ", 1, numOfCands + 1, -1);
//			if (userChoice == -1) {
//				System.out.println("���α׷� ����˴ϴ�...");
//				break;
//			}
//			voting[userChoice - 1]++;
//			// �ĺ��� ��ȣ: 1 2 3 4 5
//			// �ε��� : 0 1 2 3 4
//			// ��ǥ�� : 0 0 0 0 0
//
//			dispResult("Voting Result", voting);
//		}

		 // Q4. OX ����
//		 System.out.print("OX ���� ä�� : ");
//		 String ox = sc.next().toUpperCase();
//		 // char[] oxCharArr = ox.toCharArray();
//		 int oxScore = 0;
//		 int bonus = 0;
//		 for(int i = 0; i < ox.length(); i++) {
//			 if(ox.charAt(i) == 'O') {
//				bonus++;
//			 }
//			 else {
//				bonus = 0;
//			 }
//				oxScore += bonus;
//		 }
//		 System.out.println("ox ���� ä�� ��� : " + oxScore);

		// Q5. �ֻ��� ������
//		int numOfPlay = inputPositiveNum("�ֻ��� ���� Ƚ�� : ");
//		final int numOfDiceFace = 6;
//		int[] diceFreq = new int[numOfDiceFace];
//		for (int i = 0; i < numOfPlay; i++) {
//			int dice = AssignThreeMain.getAnswer(1, numOfDiceFace + 1);
//			diceFreq[dice - 1]++;
//		}
//		dispResult("Dice Game Result", diceFreq);
		
		// Q6. ���� �ű��
//		int numOfRanking = inputPositiveNum("�� ���� ���� �Է��Ͻðڽ��ϱ�? ");
//		int[] numbers = new int[numOfRanking];
//		int[] ranks = new int[numOfRanking];
//		Arrays.fill(ranks, 1);
//		AssignTwoMain.inputValuesInArray(numbers);
//		
//		ranking(numbers, ranks);
//		dispRankingResult("Ranking Result", numbers, ranks);
		
		// Q7. �������� ���� (bubble sort)
		int numOfSorting = inputPositiveNum("�� ���� ���� �Է��Ͻðڽ��ϱ�? ");
		int[] numbersToSort = new int[numOfSorting];
		AssignTwoMain.inputValuesInArray(numbersToSort);
		
		// 1) ���� �������� �ʰ� ���纻�� ���� ���纻 ���� �� ����
		int[] sorted = sortWithReturn(numbersToSort);
		System.out.println("copy (sorted) : " + Arrays.toString(sorted));
		System.out.println("original (not sorted) : " + Arrays.toString(numbersToSort));
		System.out.println();
		
		// 2) ���� ��ü�� ���� (���� ����)
		sortWithNoReturn(numbersToSort);
		System.out.println("original (sorted) : " + Arrays.toString(numbersToSort));
	}
	
	public static int[] swap(int... arg) {
		int temp = arg[0];
		arg[0] = arg[1];
		arg[1] = temp;
		
		return arg;
	}
	public static void sortWithNoReturn(int[] numbersToSort) {	
		for(int i = numbersToSort.length-1; i > 0; i--) { // copy.length-1 ~ 1 : copy.length-1
			for(int j = 0; j < i; j++) {
				if(numbersToSort[j] > numbersToSort[j+1]) {
					int[] swapRes = swap(numbersToSort[j], numbersToSort[j+1]);
					numbersToSort[j] = swapRes[0];
					numbersToSort[j+1] = swapRes[1];
					
//					int temp = numbersToSort[j];
//					numbersToSort[j] = numbersToSort[j+1];
//					numbersToSort[j+1] = temp;
				}
			}
		}
	}
	public static int[] sortWithReturn(int[] numbersToSort) {
		int[] copy = Arrays.copyOf(numbersToSort, numbersToSort.length);
		sortWithNoReturn(copy);
		return copy;
	}
	
	
	public static void ranking(final int[] numbers, final int[] ranks) {
		// numbers: 5 4 -1 0 2
		// ranks:   5 4  1 2 3
		if(numbers.length != ranks.length) return;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) ranks[i]++;
			}
		}	
	}
	
	public static void dispRankingResult
	(final String str, final int[] numbers, final int[] ranks) {
		if(numbers.length != ranks.length) return;
		System.out.printf("================== %s ===================\n", str);
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("\tnum: %5d\t=>\torder: %5d\n", numbers[i], ranks[i]);
		}
		System.out.println("=====================================================");
	}

	public static void dispResult(final String str, final int[] freq) {
		System.out.printf("============ %s =============\n", str);
		for (int i = 0; i < freq.length; i++) {
			System.out.printf("\t%d\t\t%d\n", i + 1, freq[i]);
		}
		System.out.println("========================================");
	}

	public static int book(final char[] seats) {
		if (isAllSeatsBooked(seats)) {
			System.out.println("��� �¼��� ����Ǿ����ϴ�!");
			return -1;
		}

		int userChoice = chooseNumInRange("�¼� ��ȣ �����Ͻÿ� : ", 1, seats.length + 1, -1); //
		if (userChoice == -1) {
			System.out.println("���α׷� ���� ���� ....");
			return -1;
		}

		bookSeat(userChoice, seats);
		// ���� �Ұ����� ���
		// 1. �̹� ������ ������ ���� ���
		// 2. ��� �¼��� ��á�� ��� (���α׷� ����)

		return 1;
	}

	public static boolean isAllSeatsBooked(final char[] seats) {
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 'O')
				return false;
		}
		return true;
	}

	public static void bookSeat(final int userChoice, final char[] seats) {
		if (seats[userChoice - 1] == 'O') {
			seats[userChoice - 1] = 'X';
			System.out.println("���� �����մϴ�!");
		} else {
			System.out.println("���� �Ұ����մϴ�! �ٸ� �¼��� �̿����ּ���!");
		}
	}
	public static int chooseNum(final String str){
		return chooseNumInRange(str, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}
	public static int chooseNumInRange(final String str, final int start, final int end, final int exit) {
		while (true) {
			try {
				System.out.print(str);
				int choice = sc.nextInt();
				if (!((choice >= start && choice < end) || choice == exit))
					throw new InvalidNumberRangeException();
				return choice;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] ������ �Է��Ͻÿ�!");
			} catch (InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] ������ ������ϴ�!");
			} catch (Exception e) {
				System.out.println();
			}
		}
	}

	private static String makeDashed(final int length) {
		String doubleDashed = "";
		for (int i = 0; i < length * 4; i++) {
			doubleDashed += "=";
		}
		return doubleDashed;
	}

	private static String makeSeatsStr(final int length) {
		String seatsStr = "";
		for (int i = 0; i < length * 2 - 6; i++) {
			seatsStr += "=";
		}
		seatsStr += "  S E A T S  "; // 13ĭ
		for (int i = 0; i < length * 2 - 7; i++) {
			seatsStr += "=";
		}
		return seatsStr;
	}

	public static void dispCurSeatsStatus(final char[] seats) {
		System.out.println(makeSeatsStr(seats.length));
		for (int i = 0; i < seats.length; i++) {
			System.out.printf("%4d", i + 1);
		}
		System.out.println();
		System.out.println(makeDashed(seats.length));
		for (int i = 0; i < seats.length; i++) {
			System.out.printf("%4c", seats[i]);
		}
		System.out.println();
	}

	public static int inputPositiveNum(String msg) {
		while (true) {
			try {
				System.out.print(msg);
				int n = sc.nextInt();
				if (n < 0)
					throw new NegativeNumberException();
				return n;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է����ּ��� !");
			} catch (NegativeNumberException e) {
				System.out.println(e);
				System.out.println("[ERROR] 0���� ���� �� �����ϴ� !");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static int[] add1dArray(int[] a, int[] b) {
		if (a.length != b.length)
			return null;

		int[] add = new int[a.length];
		for (int i = 0; i < add.length; i++) {
			add[i] = a[i] + b[i];
		}
		return add;
	}

	public static int[] sub1dArray(int[] a, int[] b) {
		if (a.length != b.length)
			return null;

		int[] sub = new int[a.length];
		for (int i = 0; i < sub.length; i++) {
			sub[i] = a[i] - b[i];
		}
		return sub;
	}
}
