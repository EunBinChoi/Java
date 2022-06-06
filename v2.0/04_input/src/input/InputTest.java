package input;

// 콘솔 (실행화면)을 통해 사용자에게 입력받는 방법
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Scanner: 클래스 (밑그림, 설계 ==> 붕어빵틀)
		// sc: 객체 (object, 사물, 대상 ==> 붕어빵) (실제 사용되는 것)
		
		// Q1. 사용자에게 연도를 입력받아 해당 연도가 윤년 판단하는 프로그램
//		아래의 조건 중 하나만 만족하면 윤년
//		1) 4의 배수이어야하고 100의 배수가 아니어야 함
//		2) 400의 배수는 무조건 윤년이 됨 
		
//		System.out.print("연도를 입력하세요 : "); // 사용자 유도 메시지
//		int year = sc.nextInt();
//		boolean isLeapYear 
//		= ((year % 4 == 0) && (year % 100 != 0)) 
//		|| (year % 400 == 0); // t/f
//		
//		// true, false => "윤년이 맞습니다", "윤년이 아닙니다"
//		String leapYearStr = (isLeapYear) ? "윤년이 맞습니다." : "윤년이 아닙니다.";
//		System.out.println(leapYearStr);
//		System.out.println("윤년 여부: " + isLeapYear);
		
		// Q2. 사용자에게 입력받은 두 개의 실수 (double)를 
		// +, -, *, / (분모가 0인 경우 오류 출력) 프로그램
		// sc.nextDouble()
//		System.out.print("첫번째 수를 입력하세요 : "); // 사용자 유도 메시지
//		double x = sc.nextDouble();
//		System.out.print("두번째 수를 입력하세요 : "); // 사용자 유도 메시지
//		double y = sc.nextDouble();
//		double add = x + y;
//		double sub = x - y;
//		double mul = x * y;
////		double div = x / y;
//		String div = (y == 0) ? "[에러] 0으로 나눌 수 없음!" : x/y + "";
//		System.out.println(add);
//		System.out.println(sub);
//		System.out.println(mul);
//		System.out.println(div);
		/*
		 * Infinity, -Infinity: 무한대
		 * nan (not a number)
		 * 
		 * */
		
		
		// Q3. 사용자에게 "hello world" 문자열을 입력받아보자!
		// sc.next()
//		System.out.print("문자열 입력: ");
//		String s1 = sc.next();
//		System.out.println(s1);
//		String s2 = sc.nextLine();
//		System.out.println(s2);
		
		// 만약 버퍼에 남겨있는 내용물을 삭제하고 싶다면?
//		sc.close(); // 내부적으로 flush() 호출
		

		// next(): 엔터/space 들어오기 전까지
		// nextLine(): 엔터 들어오기 전까지
		// "hello world"
		
		// Q1. char 하나만 저장하고 싶을 때?
//		char ch = sc.next().charAt(0); 
		// 입력된 문자열 중 가장 첫번째를 가지고 옴
		// "abcd" -> 'a'
		// "a" -> 'a'
//		char ch = "hello".charAt(0);
//		System.out.println(ch);
		
		// "a" vs 'a'
		// "a" : 데이터 + 함수 (String)
		// 'a' : 데이터 (char)
		
		// Q1. 도시 (시 -> 특별시) 아래의 조건 중 
		// 하나만 만족하면 특별시가 될 수 있다고 가정
		// 1) 해당 도시가 중심지이고 인구가 100만 이상
		// 2) 부자인 인구 50만 이상
		
		// 입력변수: 중심지인지 아닌지 (boolean), 인구의 수, 부자의 수
//		System.out.print("중심지니? (yes/no) ");
//		String isCenter = sc.next().toLowerCase();
//		// yes (YES, Yes, yEs)
//		// no (NO)
//		System.out.print("인구수는? (만 단위로 입력) ");
//		int citizen = sc.nextInt();
//		
//		System.out.print("부자수는? (만 단위로 입력) ");
//		int riches = sc.nextInt();
//		
//		// 문자열끼리 비교는 equals()
//		boolean isCity = ((isCenter.equals("yes")) 
//				&& (citizen >= 100))
//				|| (riches >= 50);
//		System.out.println("특별시 여부 : " + isCity);
//		
		
		// Q2. 사용자에게 세 변 (정수)을 입력을 받아서 
		// 세 변으로 삼각형을 만들 수 있는지 확인하는 프로그램
		// a, b, c (c가 가장 크다고 가정)
		// a + b > c
		
//		System.out.print("첫번째 변을 입력하시오 : ");
//		int a = sc.nextInt();
//		System.out.print("두번째 변을 입력하시오 : ");
//		int b = sc.nextInt();
//		System.out.print("세번째 변을 입력하시오 : ");
//		int c = sc.nextInt();
//		
//		boolean isTriangle = (a + b > c); // true, false
//		String triangleStr = isTriangle ? "삼각형 O" : "삼각형 X";
//		System.out.println(triangleStr);
		
		
		// Q3. 사용자에게 국어, 수학, 영어 성적 (정수)을 입력을 받아서
		// 세 과목의 평균이 70점이 넘는지 확인하는 프로그램
//		System.out.print("국어 점수 입력 : ");
//		int kor = sc.nextInt();
//		System.out.print("수학 점수 입력 : ");
//		int math = sc.nextInt();
//		System.out.print("영어 점수 입력 : ");
//		int eng = sc.nextInt();
//		
//		// kor + math + eng == 200
//		double avg = (kor + math + eng) / 3.0; 
//		boolean avgChk = avg > 70;
//		System.out.println(avgChk ? "70점 초과" : "70점 이하");
		
		
		// Q4. 사용자에게 수를 하나 입력받아 
		// 해당 수가 홀수인지 짝수인지 판단하는 프로그램
		System.out.print("수를 입력하시오: ");
		int num = sc.nextInt();
		
		// 홀수 (odd), 짝수 (even)
		boolean isOdd = num % 2 == 1; // 3, 5, 7, 9
//		boolean isEven = num % 2 == 0; // 2, 4, 6, 8
		
		System.out.println(isOdd ? "홀수" : "짝수");
		
	}
}
