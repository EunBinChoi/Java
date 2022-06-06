import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		// 데이터 자료형
		// 기초형: int, double, char, float, boolean ....
		// 참조형: 배열, 스트링, 클래스
		
		// String: 문자열을 담을 수 있는 자료형
		// 'a': 문자 하나 (char)
		// "a": 문자열 (String)
		
		// 0: 정수
		// 0.0: 실수
		
		// a vs 'a' vs "a"
		// 'a': 문자 하나 (데이터, 리터럴)
		// "a": 문자열 (데이터, 리터럴)
		//   a: 변수 (데이터를 담는 공간)
		
		// 왼쪽 (변수) = 오른쪽 (데이터, 리터럴)
		// 1 = a (x)
		// a = 1 (o)
		
		// b = a (o)
		
		// 'abc123' (X)
		// 'abc' (X)
		// '123' (X)
 		
		// "asdasdasbasdasd123"
		// "123"
		// "abc"
		
		// 문자열을 정의하는 방법 (2가지)
		String str1 = "Hello"; // string pool
		String str2 = "Hello"; // string pool
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// 주소값 비교
		System.out.println(str1 == str2); // true
		System.out.println(str3 == str4); // false
		
		// 내용물 비교
		System.out.println(str1.equals(str2)); // true
		System.out.println(str3.equals(str4)); // true
		
		// equals() 함수 내부 구현 
		// (boolean isEquals(String s1, String s2))
		// 1. 두 문자열의 길이가 동일
		// 2. 두 문자열의 내용물이 동일
		
		System.out.println(isEquals(str1, str2) ?
				"같습니다" : "다릅니다");
		System.out.println(isEquals(str3, str4) ?
				"같습니다" : "다릅니다");
		
		
//		String s1 = new String("Hello");
//		String s2 = new String("Hllo");
//		String s3 = "Hello";
//		String s4 = "Hello";
//		
//		// String (참조변수)에서 '=='는 주소값의 비교 
//		// 내용물의 비교 X
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s4);
//		
//		s3 = "Hi";
//		System.out.println(s3 == s4);
//		System.out.println(); // enter
//		
//		// String에서 내용물의 비교는 어떻게 하나요?
//		// equals() 함수 이용
//		System.out.println(s1.equals(s2));
//		System.out.println(s3.equals(s4));
//		
//		
//		
//		
//		// equals 함수
//		// 1. 두 문자열의 길이가 같아야 함
//		// 2. 두 문자열의 문자가 모두 같아야 함
//		
//		
//		
//		boolean check = true;
//		if(s1.length() != s2.length()) {
//			check = false;
//		}
//		else {
//			for(int i = 0; i < s1.length(); i++) {
//				if(s1.charAt(i) != s2.charAt(i)) {
//					check = false;
//					break;
//				}
//			}
//		}
//		System.out.println((check == true)? "같습니다" : "다릅니다");
//		
//		// s1[0] -> s1.charAt(0)
//		// s1 = "Hello";
//		// s1[0] = 'h'; (x)
//		// s1 = "hello";
//		
//		// String: 문자들의 배열
//		char[] str1 = {'H', 'e', 'l', 'l', 'o'};
//		String str2 = new String("Hello");
//		String str3 = "hello";
//		
//		str1[0] = 'h';
//		str2 = "hello";
//		
//		System.out.println(str2 == str3);
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println('\u0000');
		
		// 사용자에게 String를 입력받을 때
//		String str3;
//		Scanner input = new Scanner(System.in);
		
		/*
		 * input.next(): space 포함 X (Hello)
		 * input.nextLine(): space 포함 O (Hello World)
		 * 
		 * Hello World
		 * 
		 * */
//		
//		System.out.println("Hello" + " World");
//		String s1 = "Hello";
//		String s2 = " World";
//		String s3 = s1 + s2;
//		System.out.println(s3);
		// "Hello" + 1 => "Hello" + "1" => "Hello1"
		// 1 + 1.0 => 2.0
//		
//		int x = 20;
//		System.out.println("결과값은 " + x);
//		// 20 --> "20"
//		
//		String s4 = "Hello";
//		// s4.charAt(0) = 'h'; (X)
//		// s4[0] = 'h'; (X)
//		System.out.println(s4.charAt(0));
//		s4 = "hello";
		
		// 참조형
		// == : 주소값 비교
		// equals(): 내용물 비교
		
		// 기본형
		// int a = 1
		// int b = 1
		// a == b: 내용물 비교
		
		// String: 클래스 (데이터 (필드) + 함수)
		
		// ex) "abcd" => length(): 4
		// ex) "abcd".charAt(i): i => 0 ~ 3
		
		// length(): 문자열의 길이 반환
		// charAt(i): 문자열에서 i번째 문자 반환
		
		// 문자열 -> 숫자 (int)
		// Integer.parseInt("123")
		// "123" -> 123
		
		// 기초 자료형: int (4 byte), long (8 byte), 
		//         float, double, boolean, char
		// 랩퍼 클래스 (wrapping class)
		// Integer, Long, Float, Double, Boolean, Character
		
		String str = "test";
		// char charAt(int index): 지정된 인덱스에 문자 반환
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		
		// int compareTo(String str)
		// 두 문자열의 사전적 순서로 문자열을 비교
		// 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1 반환
		System.out.println(str.compareTo("test2"));
		// "a" vs "aa" : -1
		// "a" vs "a1" : -1
		
		
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이 : " + proverb.length());
		
		// 문자열의 결합 (concatenation)
		s1 = proverb + " never bites!";
		s1 = proverb.concat(" never bites!");
		
		// 문자열에는 인덱스를 통해 문자를 접근해서 수정할 수 없음
		String strTest = "test";
		//strTest[0] = 'T';
		strTest = "Test";

		
		// 문자 바꿈 (replace)
		s2 = proverb.replace('b', 'B');
		// replace(바꿀 문자, 대체 문자)
		
		// 부분 문자열 추출 (substring)
		s3 = proverb.substring(2, 5);
		// 인덱스 2 ~ 5-1에 있는 문자열 추출
		
		// 대문자로 변환
		s4 = proverb.toUpperCase();
		
		// 소문자로 변환
		String s5 = proverb.toLowerCase();
		
		// 지정된 인덱스의 문자를 반환
		char ch = proverb.charAt(0);
		
		// 내용물의 비교
		String s6, s7;
		s6 = "Sally";
		s7 = "Saly";
		boolean check = s6.equals(s7);
		// "s".equals("S") // false
		
		s6 = "sally";
		s7 = "SALLY";
		check = s6.equalsIgnoreCase(s7); // 대소문자 무시
		// "s".equalsIgnoreCase("S") // true

		
		
		// 문자열의 길이가 0인지 확인
		String s8 = "";
		boolean isEmp = s8.isEmpty();
		
		// 문자열이 비어있거나 공백문자 (space, enter)인지 아닌지 확인
		String s9 = " ";
		boolean isBl = s9.isBlank();
		
		// 사전식 순서로 문자열 비교
		// 만약 앞에 있으면 -1
		// 같으면 0
		// 뒤에 있으면 1
		String s10 = "abcd";
		String s11 = "abc";
		int comp = s10.compareTo(s11);
		System.out.println(comp);

		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// 문자열 --> 숫자
		
		// 랩퍼 클래스 (wrapper class)
		// int, double, float, char, boolean (기초 자료형)
		// Integer, Double, Float, Character, Boolean (클래스)
		
		// why? 클래스 (데이터 + 함수)
		// 기초 자료형은 함수를 정의할 수 없기 때문에
		// 기초 자료형을 감싸는 (포함하는) 클래스를 만들어
		// 필요한 함수를 정의하기 위해
		
		String s12 = "123";
		int i = Integer.parseInt(s12);
		
		String s13 = "3.14";
		double d = Double.parseDouble(s13);
		
		System.out.println(i);
		System.out.println(d);
		
		// String 배열
		String[] strArr1 = new String[5];
		String[] strArr2 
		= {"국어", "수학", "사회", "과학", "영어"};
		
		System.out.println(strArr2[0]);
		System.out.println(strArr2[3]);
		//System.out.println(strArr2[5]); // 
				
		
	}
	public static boolean isEquals
	(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		//"abcd" "abc"
		
		//
		// "abcd" "abbd"
		// 두 문자열의 길이가 동일
		for(int i = 0; i < s1.length(); i ++) {
			if(s1.charAt(i) != s1.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

}
