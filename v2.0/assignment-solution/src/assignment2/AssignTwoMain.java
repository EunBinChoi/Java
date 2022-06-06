package assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

import application_exception.InvalidNumberRangeException;

public class AssignTwoMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Q1. 사용자에게 문자 하나를 입력받아서 알파벳이 아니면 계속 입력하는 프로그램 
//		* while(true) 이용
//		char inputAlpha = inputAlphabet();
//		System.out.println(inputAlpha);
////////////////////////////////////////////////////////////////////////
	
//		Q2. 사용자에게 구구단 단수 (2 ~ 9단)를 입력받아 구구단 출력 프로그램
//		ex) 구구단의 단수를 입력하시오: 2
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		.........
//		2 * 9 = 18
//
//		추가문제 1) 만약 사용자가 잘못된 단수를 입력하면 계속 입력받게 하시오.
//		int n = inputMulNumber(); // 구구단 단수를 입력받는 함수
//		printMultable(n); // 구구단의 단수를 통해 구구단 출력 함수
////////////////////////////////////////////////////////////////////////
	
//		Q3. n명의 컴퓨터 성적 (정수) (0 ~ 100)을 입력받아 성적의 합계와 평균을 구하는 프로그램
//		추가문제 1) 만약 사용자가 잘못된 성적을 입력하면 계속 입력받게 하시오.
		
//		int sum = 0;
//		int score = 0;
//		int n = inputNumOfStudent();
//		int sum = calcSumOfScores(n);
//		double avg = (double)sum / n;
//		System.out.println("평균 성적: " + avg + "점");
////////////////////////////////////////////////////////////////////////
		
		
//		Q4. n개의 숫자 (정수)를 입력받아 최댓값, 최솟값을 구하는 프로그램
		
		// 1) 배열을 모를 경우 (최대, 최소를 계산하기 위한 1 ~ n까지의 수를 독립적으로 입력받음)
//		int min = getMinValue();
//		System.out.println("min : " + min);
//		int max = getMaxValue();
//		System.out.println("max : " + max);
		////////////////////////

		// 1) 배열을 모를 경우 (최대, 최소를 계산하기 위한 1 ~ n까지의 수를 한꺼번에 입력받아 함수 내에서 출력함)
//		printMinMaxValue();
		
		// 2) 배열을 알 경우
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
//		Q5. 1 ~ 10 중에서 3의 배수만 출력하는 프로그램 (사용자 입력 필요 없음)
		
//		long start = System.currentTimeMillis();
//		for(int i = 1; i < 10; i++) { // 10번
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
//		long end = System.currentTimeMillis();
//		System.out.printf("%d (ms)\n", end-start);
//		
//		start = System.currentTimeMillis();
//		for(int i = 3; i < 10; i+=3) { // 3번
//			System.out.println(i);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("%d (ms)\n", end-start);
////////////////////////////////////////////////////////////////////////
	
		
//		Q6. 사용자에게 문자 하나 (알파벳, 숫자, 특수문자 모두 가능)를 입력받아 
//		'q' 문자가 들어오기 전까지 입력받은 문자를 하나의 문자열로 바꾸는 프로그램 (while(true) + break 문제)
//		ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
//		추가문제 1) 문자열을 역순으로 저장하게 할 수 있을까요?
//		'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
		
		
		String str = makeString(false); // 순서대로 문자를 저장 (str)
		System.out.println(str);
		
		String str_reversed = makeString(true); // 역순으로 문자를 저장 (str_reversed)
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
//		Q7. 사용자에게 n을 입력받아 n!을 구하는 프로그램
//		(n! = 1 x 2 x 3 x 4 ... n)
//		ex) 5! = 1 x  2  x 3 x 4 x 5 = 120
//		int n = inputPositiveNumber();
//		long res = factorial(n);
//		System.out.println(res);
	}
	
	// reverse: true => 역순으로 저장
	// reverse: false => 순서대로 저장
	public static String makeString(boolean reverse) {
		String res = "";
		
		while(true) {
			String user = sc.next();
			if(user.length() != 1) {
				System.out.println("[ERROR] 문자가 아닙니다.");
				System.out.println("[ERROR] 비어있거나 문자열일 수 있습니다.");
				continue;
			}
			char c = user.charAt(0); // 정확한 문자가 들어옴
			
			if(c == 'q') break;
//			if(reverse) res = c + res;
//			else res = res + c;
			res = reverse ? (c + res) : (res + c);
 		}
		return res;
	}
	
	// n > 0 (InvalidNumberRangeException), nextInt()에 문자가 들어올 수 있음
	public static int inputPositiveNumber() {
		while(true) {
			try {
				System.out.print("n을 입력하시오: ");
				int n = sc.nextInt();
				if(n <= 0) throw new InvalidNumberRangeException();
				return n;
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] 숫자를 입력하시오!");
			} catch(InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] 양수를 입력하시오!");
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
			char originalCh = sc.next().charAt(0); // 입력받은 데이터
			char smallCh = originalCh; // 입력받은 데이터를 일괄적으로 소문자로 변경
			
			if(smallCh >= 'A' && smallCh <= 'Z') smallCh += ('a' - 'A');
			// ch = (char)(ch + ('a' - 'A'))
			
			// smallCh의 모든 알파벳은 소문자 변경되어 있음 (비교 대상)
			if(smallCh >= 'a' && smallCh <= 'z') {
				return originalCh; // 사용자에게 실제 입력받은 데이터 반환
			}
			else {
				System.out.println("[ERROR] 알파벳만 입력하시오!");
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
				// nextInt()는 숫자 이외의 다른 문자를 받을 수 없기 때문에
				// 다른 문자가 들어오면 버퍼에 있는 내용물을 삭제하기 위함
				System.out.println(e);
				System.out.println("[ERROR] 숫자를 입력하시오!");
			} catch(InvalidNumberRangeException e) { // 사용자 정의 예외
				System.out.println(e);
				System.out.println("[ERROR] 2 ~ 9 사이의 숫자를 입력하시오!");
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

	// InputMismatchException, 학생 성적 범위가 맞지 않을 경우 (0 ~ 100 이외)
	public static int inputScore(int stuNum) {
		while(true) {
			int score = 0;
			try {
				System.out.printf("%d번 학생의 성적을 입력하시오: ", stuNum);
				score = sc.nextInt();
				checkInvalidScore(score);
				return score;
			} catch(InputMismatchException e) {
				sc.next(); 
				// nextInt()는 숫자 이외의 다른 문자를 받을 수 없기 때문에
				// 다른 문자가 들어오면 버퍼에 있는 내용물을 삭제하기 위함
				System.out.println(e);
				System.out.println("[ERROR] 숫자를 입력하시오!");
			} catch(InvalidNumberRangeException e){
				System.out.println(e);
				System.out.println("[ERROR] 0 ~ 100 사이의 점수를 입력하시오!");
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
				System.out.print("총 인원을 입력하시오: ");
				int n = sc.nextInt();
				if(n <= 0) throw new InvalidNumberRangeException();
				return n;
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println(e);
				System.out.println("[ERROR] 숫자를 입력하시오!");
			} catch(InvalidNumberRangeException e) {
				System.out.println(e);
				System.out.println("[ERROR] 0명 이하는 해당 프로그램을 사용할 수 없습니다!");
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
				System.out.print("비교하고자 하는 숫자의 개수를 입력하시오: ");
				int n = sc.nextInt(); 
				if(n <= 0) throw new InvalidNumberRangeException();
				return n;
			} catch(InputMismatchException e) {
				sc.next(); 
				// nextInt()는 숫자 이외의 다른 문자를 받을 수 없기 때문에
				// 다른 문자가 들어오면 버퍼에 있는 내용물을 삭제하기 위함
				System.out.println(e);
				System.out.println("[ERROR] 숫자를 입력하시오!");
			} catch(InvalidNumberRangeException e) { // 사용자 정의 예외
				System.out.println(e);
				System.out.println("[ERROR] 0 초과의 숫자를 입력하시오!");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static int getMinValue() {
		int n = inputNumOfValues();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d번 숫자: ", i+1);
			int num = sc.nextInt();
			if(num < min) min = num; // 10 20 30
		}
		return min;
	}
	public static int getMaxValue() {
		int n = inputNumOfValues();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d번 숫자: ", i+1);
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
			System.out.printf("%d번 숫자: ", i+1);
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
					System.out.printf("%d번 숫자: ", i + 1);
					numbers[i] = sc.nextInt();
					break;
				} catch(InputMismatchException e){
					sc.next();
					System.out.println(e);
					System.out.println("[ERROR] 숫자를 입력하시오!");
				} catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e);
					System.out.println("[ERROR] 배열에 접근할 수 있는 인덱스 범위가 벗어났습니다.");
				} catch(Exception e){
					System.out.println(e);
				}
			}
			//
		}
	}

	public static int getMinimumInArray(int[] numbers){
		int min = numbers[0]; // 첫번째 원소가 최소값이라고 가정
		for(int i = 1; i < numbers.length; i++){
			if(min > numbers[i]) min = numbers[i];
		}
		return min;
	}

	public static int getMaximumInArray(int[] numbers){
		int max = numbers[0]; // 첫번째 원소가 최대값이라고 가정
		for(int i = 1; i < numbers.length; i++){
			if(max < numbers[i]) max = numbers[i];
		}
		return max;
	}

}
