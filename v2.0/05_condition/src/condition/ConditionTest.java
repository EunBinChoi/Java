package condition;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 두 정수를 입력 (Scanner)
//		System.out.print("첫번째 정수 입력: ");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수 입력: ");
//		int b = sc.nextInt();
//		
//		// a / b (b != 0)
//		
//		// 조건식 (true/false로 판단가능한 식)
//		if(b == 0) { // 블록 (block)
//			System.out.println("계산 불가!");
//			System.out.println("0으로 나눌 수 없습니다!");
//		}
//		else { // b != 0
//			double div = (double)a / b;
//			System.out.println(div);
//		}
//		
//		// Q1. 사용자한테 국어, 수학, 영어 성적받아서 
//		// 평균이 70점 넘으면 "합격"
//		// 70점 넘지 않으면 "불합격" (if-else)
//			// 1) 국어, 수학, 영어 (0 미만, 100 초과는 유효하지 않음)
//		System.out.print("국어 성적: ");
//		int kor = sc.nextInt();
//		// 유효성 검사
//		if((kor < 0 || kor > 100)) {
//			System.out.println("[경고] 국어 성적이 유효하지 않습니다");
//			return; // 프로그램 종료 (메인함수 종료)
//		}
//		
//		System.out.print("수학 성적: ");
//		int math = sc.nextInt();
//		// 유효성 검사
//		if((math < 0 || math > 100)) {
//			System.out.println("[경고] 수학 성적이 유효하지 않습니다");
//			return;
//		}
//		
//		System.out.print("영어 성적: ");
//		int eng = sc.nextInt();
//		// 유효성 검사
//		if((eng < 0 || eng > 100)) {
//			System.out.println("[경고] 영어 성적이 유효하지 않습니다");
//			return;
//		}
//		
		//
//		double avg = (kor + math + eng) / 3.0;
//		
//		if(avg > 70) {
//			System.out.println("합격");
//		}
//		else { // avg <= 70
//			System.out.println("불합격");
//		}
//		
 		
		// Q2. 사용자에게 세 변 (정수)을 입력을 받아서 
		// 세 변으로 삼각형을 만들 수 있는지 확인하는 프로그램
		// a, b, c (c가 가장 크다고 가정)
		// a + b > c
			// 1) a, b, c가 0보다 작을 수 없음
	
//		System.out.print("세 정수를 입력 (ex) 3 4 5) : ");
//		int x = sc.nextInt();
//		if(x < 0) {
//			System.out.println("[에러] 변의 길이는 음수가 될 수 없음");
//			return;
//		}
//		int y = sc.nextInt();
//		if(y < 0) {
//			System.out.println("[에러] 변의 길이는 음수가 될 수 없음");
//			return;
//		}
//		int z = sc.nextInt();
//		if(z < 0) {
//			System.out.println("[에러] 변의 길이는 음수가 될 수 없음");
//			return;
//		}
//		
//		// x, y, z 중 최댓값 찾는 코드
//		int max = x; // x가 최댓값을 갖는다고 가정
//		int left1 = y;
//		int left2 = z;
//		
//		if(y > max) max = y; left1 = x; left2 = z;
//		if(z > max) max = z; left1 = x; left2 = y;
//		///////////////////////////////////////////
//		
//		if(left1 + left2 > max) { // max
//			System.out.println("삼각형 성립조건 만족!");
//		}
//		else {
//			System.out.println("삼각형 성립조건 불만족!");
//		}
		
		
		// 제일 큰 수 : a, b, c
		// a > b && a > c
		// b > a && b > c
		// c > a && c > b
		// Q3. 사용자에게 입력받은 세 정수 중 가장 큰 수를 구하는 프로그램
		/* if(){
		 * }
		 * else{
		 * 		if(){
		 * 		}
		 * 		else(){
		 * 		}
		 * }*/
		
//		System.out.print("세 정수를 입력 (ex) 3 5 6) : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int max = 0;
//		
//		if(a > b) {
//			if(a > c) {
//				max = a;
//			}
//			else { //b < a <= c
//				max = b;
//			}
//		}
//		else { // b >= a
//			if(b > c){ // b >= a && b > c
//				max = b;
//			}
//			else { // c >= b >= a
//				max = c;
//			}
//		}
//		System.out.println(max);
//		
//		///////////////////////
//		
//		if(a > b && a > c) {
//			max = a;
//		}
//		else if(b > a && b > c) { 
//			max = b;
//		}
//		else if(c > a && c > b) {
//			max = c;
//		}
//		
//		System.out.println(max);
//		
//		///////////////////////
//		
//		if(a > b && a > c) {
//			max = a;
//		}
//		if(b > a && b > c) { 
//			max = b;
//		}
//		if(c > a && c > b) {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		////////////////////////////////////////////
		// Q4. 사용자에게 문자 하나 (char)를 입력받아 소문자로 변경
		// 소문자 -> 소문자, 대문자 -> 소문자
		// toLowerCase() 사용 불가
		// 	1) 알파벳 이외의 다른 문자가 들어올 경우 제외
		
//		System.out.print("문자 하나를 입력하시오: ");
//		char ch = sc.next().charAt(0); 
//		// a (97) ~ z, A (65) ~ Z
//		
//		// 유효성 검사
//		if(ch < 'A' || (ch > 'Z' && ch < 'a') || ch > 'z') {
//			System.out.println("[경고] 알파벳이 아닙니다!");
//			return;
//		}
//			
//		if(ch >= 'A' && ch <= 'Z') {
////			ch = (char)(ch + ('a' - 'A'));
//			// 문자끼리 사칙연산은 정수 (아스키코드값)끼리 사칙연산과 동일
//			// ch -> 'A' ~ 'Z'
//			ch += ('a' - 'A');
//			
//		}
//		System.out.println(ch);
		
		
		// Q5. 학점 판단 프로그램
		// 사용자에게 점수를 하나 입력받아
		// (유효하지 않은 데이터 100점 초과, 0점 미만 오류로 출력)
		// 90점 이상이면: 'A'
		// 80 <=    < 90: 'B'
		// 70 <=    < 80: 'C'
		// 60 <=    < 70: 'D'
		// 60점 미만: 'F'
		
//		System.out.print("점수 하나 입력: ");
//		int score = sc.nextInt();
//		
//		if(score > 100 || score < 0) {
//			System.out.println("[오류] 정확한 점수를 입력하세요");
//			return;
//		}
//		
//		char gpa = 0;
//		
//		
//		// 85, 89
//		if(score >= 90) {
//			gpa = 'A';
//		}
//		else if(score >= 80) { // 80 <= score < 90
//			gpa = 'B';
//		}
//		else if(score >= 70) { // 70 <= score < 80
//			gpa = 'C';
//		}
//		else if(score >= 60) { // 60 <= score < 70
//			gpa = 'D';
//		}
//		else { // score < 60
//			gpa = 'F';
//		}
//		
//		
		
		// Q6. 간단한 계산기 (x, y 정수)
		// ex) 3 + 4
		// 연산 (+, -, *, /(0으로 나누는 경우 제외 (오류 출력))
		// int i = Integer.valueOf(s); // String -> int
		
//		System.out.print("계산식을 입력 (ex) 3 + 5) : ");
//		
//		// 3 + 5
//		int x = sc.nextInt(); // 3
//		char op = sc.next().charAt(0); // +
//		// "hello world"
//		// next() (구분자: 스페이스, 엔터) "hello"
//		// vs nextLine() (구분자: 엔터)  "hello world"
//		int y = sc.nextInt(); // 5
//		double res = 0;
//		
//		// +
//		// 연산자 유효성 판단
////		if(!(op == '+' || op == '-' || ..)) {}
//		
//		if(op == '+') {
//			res = x + y;
////			System.out.printf("%d %c %d = %d\n", x, op, y, (int)res);
//		}
//		else if(op == '-') {
//			res = x - y;
////			System.out.printf("%d %c %d = %d\n", x, op, y, (int)res);
//		}
//		else if(op == '*') {
//			res = x * y;
////			System.out.printf("%d %c %d = %d\n", x, op, y, (int)res);
//		}
//		else if(op == '/') {
//			if(y == 0) {
//				System.out.println("[에러] 0으로 나눌 수 없음");
//				return;
//			}
//			
////			else {
//				res = (double)x / y;
////				System.out.printf("%d %c %d = %f\n", x, op, y, res);
////			}
//		}
//		else { // 연산자 유효성 검사
//			System.out.println("[에러] 지원하는 연산자가 아님");
//			return;
//		}
//		System.out.printf("%d %c %d = %f\n", x, op, y, res);
		
		
		// Q7. 사용자한테 문자 (알파벳, 숫자) 하나를 입력받아
		// 해당 문자가 소문자인지, 대문자인지, 숫자인지 판단 프로그램
		// (나머지 경우에 대해서는 특수문자라고 출력)
		
//		System.out.print("문자 입력: "); // 0
//		char ch = sc.next().charAt(0); // "0" -> '0'
//		
//		if(ch >= 'a' && ch <= 'z') {
//			System.out.println("소문자");
//		}
//		else if(ch >= 'A' && ch <= 'Z') {
//			System.out.println("대문자");
//		}
//		else if(ch >= '0' && ch <= '9') {
//			System.out.println("숫자");
//		}
//		else {
//			System.out.println("특수문자");
//		}
		
		
		// Q8. 사용자에게 두 점 (실수)을 입력받아 
		// 해당 점의 사분면 판단 프로그램
		// (원점, X축, Y축 위에 점이 생길 수도 있음)
		
		System.out.print("두 점을 입력 (ex) 3.5 5.5) : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("1 사분면");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2 사분면");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3 사분면");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4 사분면");
		}
		else {
			if(x == 0 && y == 0) {
				System.out.println("원점");
			}
			else if(y == 0) {
				System.out.println("X축 위");
			}
			else if(x == 0) {
				System.out.println("Y축 위");
			}
		}
		
		
		
		
//		int score = 95;
//		char gpa = 0; 
//		// 변수 생성하자마자 초기화 (initialization)하자!
////		String str = "";
//		if(score >= 90) {
//			gpa = 'A';
//		}
//		else if(score >= 80) {
//			gpa = 'B';
//		}
//		else if(score >= 70) {
//			gpa = 'C';
//		}
//		else if(score >= 60) {
//			gpa = 'D';
//		}
//		else {
//			gpa = 'F';
//		}
//		System.out.println(gpa); // 60점 미만
//		
		
//		if(b == 0) System.out.println("계산 불가!");
		
		// 일반적인 문장 (평서문)
		System.out.println("언제 실행될까요?"); // 항상 실행
	}

}
