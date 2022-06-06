package assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

import application_exception.InvalidNumberRangeException;

public class AssignTwoMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Q1. ����ڿ��� ���� �ϳ��� �Է¹޾Ƽ� ���ĺ��� �ƴϸ� ��� �Է��ϴ� ���α׷� 
//		* while(true) �̿�
//		char inputAlpha = inputAlphabet();
//		System.out.println(inputAlpha);
////////////////////////////////////////////////////////////////////////
	
//		Q2. ����ڿ��� ������ �ܼ� (2 ~ 9��)�� �Է¹޾� ������ ��� ���α׷�
//		ex) �������� �ܼ��� �Է��Ͻÿ�: 2
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		.........
//		2 * 9 = 18
//
//		�߰����� 1) ���� ����ڰ� �߸��� �ܼ��� �Է��ϸ� ��� �Է¹ް� �Ͻÿ�.
//		int n = inputMulNumber(); // ������ �ܼ��� �Է¹޴� �Լ�
//		printMultable(n); // �������� �ܼ��� ���� ������ ��� �Լ�
////////////////////////////////////////////////////////////////////////
	
//		Q3. n���� ��ǻ�� ���� (����) (0 ~ 100)�� �Է¹޾� ������ �հ�� ����� ���ϴ� ���α׷�
//		�߰����� 1) ���� ����ڰ� �߸��� ������ �Է��ϸ� ��� �Է¹ް� �Ͻÿ�.
		
//		int sum = 0;
//		int score = 0;
//		int n = inputNumOfStudent();
//		int sum = calcSumOfScores(n);
//		double avg = (double)sum / n;
//		System.out.println("��� ����: " + avg + "��");
////////////////////////////////////////////////////////////////////////
		
		
//		Q4. n���� ���� (����)�� �Է¹޾� �ִ�, �ּڰ��� ���ϴ� ���α׷�
		
		// 1) �迭�� �� ��� (�ִ�, �ּҸ� ����ϱ� ���� 1 ~ n������ ���� ���������� �Է¹���)
//		int min = getMinValue();
//		System.out.println("min : " + min);
//		int max = getMaxValue();
//		System.out.println("max : " + max);
		////////////////////////

		// 1) �迭�� �� ��� (�ִ�, �ּҸ� ����ϱ� ���� 1 ~ n������ ���� �Ѳ����� �Է¹޾� �Լ� ������ �����)
//		printMinMaxValue();
		
		// 2) �迭�� �� ���
		int n = inputNumOfValues();
		int[] numbers = new int[n];
		inputValuesInArray(numbers);

		int min = getMinimumInArray(numbers);
		System.out.println("min : " + min);
		int max = getMaximumInArray(numbers);
		System.out.println("max : " + max);


// cf)		
//		int max = 0;
//		int min = 0;
//		for(int i = 0; i < n; i++) {
//			int num = sc.nextInt();
//			
//			if(i == 0) {
//				max = num;
//				min = num;
//			}
//			else {
//				if(num > max) max = num; // -10 -20 -30
//				if(num < min) min = num; // 10 20 30
//			}
//		}
////////////////////////////////////////////////////////////////////////
//
//		Q5. 1 ~ 10 �߿��� 3�� ����� ����ϴ� ���α׷� (����� �Է� �ʿ� ����)
		
//		long start = System.currentTimeMillis();
//		for(int i = 1; i < 10; i++) { // 10��
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
//		long end = System.currentTimeMillis();
//		System.out.printf("%d (ms)\n", end-start);
//		
//		start = System.currentTimeMillis();
//		for(int i = 3; i < 10; i+=3) { // 3��
//			System.out.println(i);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("%d (ms)\n", end-start);
////////////////////////////////////////////////////////////////////////
	
		
//		Q6. ����ڿ��� ���� �ϳ� (���ĺ�, ����, Ư������ ��� ����)�� �Է¹޾� 
//		'q' ���ڰ� ������ ������ �Է¹��� ���ڸ� �ϳ��� ���ڿ��� �ٲٴ� ���α׷� (while(true) + break ����)
//		ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
//		�߰����� 1) ���ڿ��� �������� �����ϰ� �� �� �������?
//		'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
		
		
		String str = makeString(false); // ������� ���ڸ� ���� (str)
		System.out.println(str);
		
		String str_reversed = makeString(true); // �������� ���ڸ� ���� (str_reversed)
		System.out.println(str_reversed);
		
		
//		String str = "";
//		String str_reverse = "";
//		while(true) {
//			char c = sc.next().charAt(0);
//			if(c == 'q') break;
//			str = str + c; // a ab abc
//			str_reverse = c + str_reverse; // a  ba  cba
// 		}
//		System.out.println(str);
//		System.out.println(str_reverse);
		
		
		// StringBuffer reverse()		
		//String str = "abc";
		//String str_reverse = "";
		
//		for(int i = str.length()-1; i >= 0; i--) {
//			str_reverse += str.charAt(i); 
//		}
		
//		for(int i = 0; i < str.length(); i++) {
//			str_reverse  = str.charAt(i) + str_reverse;
//		}
//		System.out.println(str_reverse);

		
//
//		Q7. ����ڿ��� n�� �Է¹޾� n!�� ���ϴ� ���α׷�
//		(n! = 1 x 2 x 3 x 4 ... n)
//		ex) 5! = 1 x  2  x 3 x 4 x 5 = 120
//		int n = inputPositiveNumber();
//		long res = factorial(n);
//		System.out.println(res);
	}
	
	// reverse: true => �������� ����
	// reverse: false => ������� ����
	public static String makeString(boolean reverse) {
		String res = "";
		
		while(true) {
			String user = sc.next();
			if(user.length() != 1) {
				System.out.println("[ERROR] ���ڰ� �ƴմϴ�.");
				System.out.println("[ERROR] ����ְų� ���ڿ��� �� �ֽ��ϴ�.");
				continue;
			}
			char c = user.charAt(0); // ��Ȯ�� ���ڰ� ����
			
			if(c == 'q') break;
//			if(reverse) res = c + res;
//			else res = res + c;
			res = reverse ? (c + res) : (res + c);
 		}
		return res;
	}
	
	// n > 0 (InvalidNumberRangeException), nextInt()�� ���ڰ� ���� �� ����
	public static int inputPositiveNumber() {
		while(true) {
			try {
				System.out.print("n�� �Է��Ͻÿ�: ");
				int n = sc.nextInt();
				if(n <= 0) throw new InvalidNumberRangeException();
				return n;
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է��Ͻÿ�!");
			} catch(InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] ����� �Է��Ͻÿ�!");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static long factorial(int n) {
		long fact = 1;
		for(int i = 1; i <= n; i++) {
//			fact *= i; 
			fact = fact * i;
		}
		return fact;
	}
	
	
	
	
	public static char inputAlphabet() {
		while(true) {
//			char ch = Character.toLowerCase(sc.next().charAt(0));
//			char ch = sc.next().toLowerCase().charAt(0);
			char originalCh = sc.next().charAt(0); // �Է¹��� ������
			char smallCh = originalCh; // �Է¹��� �����͸� �ϰ������� �ҹ��ڷ� ����
			
			if(smallCh >= 'A' && smallCh <= 'Z') smallCh += ('a' - 'A');
			// ch = (char)(ch + ('a' - 'A'))
			
			// smallCh�� ��� ���ĺ��� �ҹ��� ����Ǿ� ���� (�� ���)
			if(smallCh >= 'a' && smallCh <= 'z') {
				return originalCh; // ����ڿ��� ���� �Է¹��� ������ ��ȯ
			}
			else {
				System.out.println("[ERROR] ���ĺ��� �Է��Ͻÿ�!");
			}
		}
	}
	public static int inputMulNumber() {
		while(true) {
			int n = 0;
			try {
				n = sc.nextInt(); // 10
				checkinvalidMulNumber(n); // 10
				return n;
			} catch(InputMismatchException e) {
				sc.next(); 
				// nextInt()�� ���� �̿��� �ٸ� ���ڸ� ���� �� ���� ������
				// �ٸ� ���ڰ� ������ ���ۿ� �ִ� ���빰�� �����ϱ� ����
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է��Ͻÿ�!");
			} catch(InvalidNumberRangeException e) { // ����� ���� ����
				System.out.println(e);
				System.out.println("[ERROR] 2 ~ 9 ������ ���ڸ� �Է��Ͻÿ�!");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void checkinvalidMulNumber(int n) 
			throws InvalidNumberRangeException {
		if(!(n >= 2 && n <= 9)) 
			throw new InvalidNumberRangeException("InvalidNumberRangeException");
	}
	public static void printMultable(int n) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}

	// InputMismatchException, �л� ���� ������ ���� ���� ��� (0 ~ 100 �̿�)
	public static int inputScore(int stuNum) {
		while(true) {
			int score = 0;
			try {
				System.out.printf("%d�� �л��� ������ �Է��Ͻÿ�: ", stuNum);
				score = sc.nextInt();
				checkInvalidScore(score);
				return score;
			} catch(InputMismatchException e) {
				sc.next(); 
				// nextInt()�� ���� �̿��� �ٸ� ���ڸ� ���� �� ���� ������
				// �ٸ� ���ڰ� ������ ���ۿ� �ִ� ���빰�� �����ϱ� ����
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է��Ͻÿ�!");
			} catch(InvalidNumberRangeException e){
				System.out.println(e);
				System.out.println("[ERROR] 0 ~ 100 ������ ������ �Է��Ͻÿ�!");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void checkInvalidScore(int score) throws InvalidNumberRangeException {
		if(!(score >= 0 && score <= 100))
			throw new InvalidNumberRangeException("InvalidNumberRangeException");
	}

	public static int inputNumOfStudent() {
		while(true) {
			try {
				System.out.print("�� �ο��� �Է��Ͻÿ�: ");
				int n = sc.nextInt();
				if(n <= 0) throw new InvalidNumberRangeException();
				return n;
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է��Ͻÿ�!");
			} catch(InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] 0�� ���ϴ� �ش� ���α׷��� ����� �� �����ϴ�!");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public static int calcSumOfScores(int n) {
//		int score = 0;
		int sum = 0;
		for(int i = 0; i < n; i ++) {
			int score = inputScore(i + 1);
			sum += score;
		}
		return sum;
	}
	public static int inputNumOfValues() {
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� ������ ������ �Է��Ͻÿ�: ");
				int n = sc.nextInt(); 
				if(n <= 0) throw new InvalidNumberRangeException();
				return n;
			} catch(InputMismatchException e) {
				sc.next(); 
				// nextInt()�� ���� �̿��� �ٸ� ���ڸ� ���� �� ���� ������
				// �ٸ� ���ڰ� ������ ���ۿ� �ִ� ���빰�� �����ϱ� ����
				System.out.println(e);
				System.out.println("[ERROR] ���ڸ� �Է��Ͻÿ�!");
			} catch(InvalidNumberRangeException e) { // ����� ���� ����
				System.out.println(e);
				System.out.println("[ERROR] 0 �ʰ��� ���ڸ� �Է��Ͻÿ�!");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static int getMinValue() {
		int n = inputNumOfValues();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d�� ����: ", i+1);
			int num = sc.nextInt();
			if(num < min) min = num; // 10 20 30
		}
		return min;
	}
	public static int getMaxValue() {
		int n = inputNumOfValues();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d�� ����: ", i+1);
			int num = sc.nextInt();
			if(num > max) max = num; // 10 20 30
		}
		return max;
	}
	
	public static void printMinMaxValue() {
		int n = inputNumOfValues();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d�� ����: ", i+1);
			int num = sc.nextInt();
			if(num > max) max = num;
			if(num < min) min = num;
		}
		System.out.printf("min = %d, max = %d", min, max);
	}

	public static void inputValuesInArray(int[] numbers){
		for(int i = 0; i < numbers.length; i++){

			while(true) {
				try {
					System.out.printf("%d�� ����: ", i + 1);
					numbers[i] = sc.nextInt();
					break;
				} catch(InputMismatchException e){
					sc.next();
					System.out.println(e);
					System.out.println("[ERROR] ���ڸ� �Է��Ͻÿ�!");
				} catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e);
					System.out.println("[ERROR] �迭�� ������ �� �ִ� �ε��� ������ ������ϴ�.");
				} catch(Exception e){
					System.out.println(e);
				}
			}
			//
		}
	}

	public static int getMinimumInArray(int[] numbers){
		int min = numbers[0]; // ù��° ���Ұ� �ּҰ��̶�� ����
		for(int i = 1; i < numbers.length; i++){
			if(min > numbers[i]) min = numbers[i];
		}
		return min;
	}

	public static int getMaximumInArray(int[] numbers){
		int max = numbers[0]; // ù��° ���Ұ� �ִ밪�̶�� ����
		for(int i = 1; i < numbers.length; i++){
			if(max < numbers[i]) max = numbers[i];
		}
		return max;
	}

}
