package assignment1;

public class AssignOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Q1. 윤년 검사 프로그램
		 * int year = 2021;
		 * 
		 * 아래의 조건 중 하나만 만족하면 윤년
		 * 1) 4의 배수이어야하고 100의 배수가 아니어야 함
		 * 2) 400의 배수는 무조건 윤년이 됨  
		 */
		
		int year = 2020;
		boolean isLeapYear 
		= ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		System.out.println(isLeapYear ? "윤년" : "평년");
		
		
		/* Q2. 양수 음수 판단 프로그램
		 * int num = -100;
		 * 
		 * 해당 수가 0보다 크면 "양수"를 출력
		 *         0보다 작으면 "음수"를 출력
		 *         0이면 "0"을 출력 (**)
		 */
		// 1) (조건식) ? 참일 때 결과 : 거짓일 때 결과
		// 2) (조건식) ? 참일 때 결과 : 거짓일 때 결과
		
		int num = 0;
		boolean isZero = (num == 0);
		boolean isPositive = (num > 0);
		System.out.println(isZero ? "0" : (isPositive ? "양수" : "음수"));
		
		
		
		 /* Q3. 나누기
		 * int a = -1;
		 * int b = 0;
		 * 
		 * a/b의 연산이 가능하면 연산 결과를 출력
		 * a/b의 연산이 불가능하면 "연산 불가능합니다"를 출력
		 * 
		 * (* 나눗셈에서 분모는 0이 될 수 없습니다!)
		 * (* int -> String, 
		 * String s = Integer.toString(i);
		 * int i = 3;
		 * String s = Integer.toString(i); // "3"
		 * 3 -> "3"
		 * */
		
		int a = -1;
		int b = 2;
		
		boolean isbZero = (b == 0);
		System.out.println(isbZero ? 
				"연산 불가능" : "연산 결과 : " + ((double)a / b));
		
	}

}
