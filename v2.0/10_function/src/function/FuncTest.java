package function;

public class FuncTest {
	// 메인 함수: 프로그램 실행시 가장 처음으로 호출되는 함수
	// 함수 (function): 프로그램의 기능/동작을 정의해논 공간
	// ex) 문자열 안에서 특정 문자가 몇 개 있는지 확인
	// 'hello' -> 'h', 'l'
	// why?
	// 1) 코드 재사용
	// 2) 코드 독립화 (모듈화)
	// 3) 코드 가독성 (함수 이름을 잘 작성하는 게 중요! => 카멜 표기법, 동사 (기능)+목적어 (countAlpha > alphaCount))
	
	// 함수 이름 작성법
	// 1) 특수문자 불가 (_ 제외)
	// 2) 숫자부터 시작하면 안됨
	// 3) 키워드 사용하면 안됨
	// 4) small 카멜 표기법 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력과 출력은 메인함수에서 하는 게 좋음!
		String str1 = "hello";
		char target1 = 'h';
		int count1 = countAlpha(str1, target1);
		System.out.println(count1);
		
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == target) {
//				count++;
//			}
//		}
		
		target1 = 'l';
		int s = 0;
		count1 = countAlpha(str1, target1);
		// 1) 함수 이름 동일한지
		// 2) 전달되는 데이터 개수, 타입, 순서 (변수 이름 상관없음)
		System.out.println(count1);
		
		str1 = "www";
		target1 = 'w';
		count1 = countAlpha(str1, target1); // 전달인자 (인수) (argument)
		System.out.println(count1);
		
		str1 = "Hello World";
		int[] countCS = countCapSmallLetter(str1);
		System.out.printf("대문자 수: %d, 소문자 수: %d", countCS[0], countCS[1]);
		
		
		
		/////////////////////////////////////////////////////////////////
		int[] arr = {10, 20, 30};
		
		// for-each문
		// 인덱스로 배열 접근하지 않고 배열의 "원소값" 자체가 나옴
		System.out.println();
		for(int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		changeOneElement(arr);  
		// 주소값 전달 (원본 데이터 수정할 수 있음), 반환값이 없는 함수는 받아주는 변수도 필요 없음
		
		for(int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		int value = 10;
		value = changeOneElement2(value); // 데이터 전달 
		System.out.println("main 함수 내부 : " + value); // ?
		
	} // main 함수 끝	
	// 메인 함수에서 호출되는 함수들은 public static으로 정의
	// int: 반환형 (메인함수에게 반환하려고 하는 변수 (count)의 데이터타입 (int))
	public static int countAlpha(String str, char target) { 
		// (String str, char target)
		// 매개변수 (parameter)
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
		return count; // 결과값 (반환값, 메인함수한테 반환하겠다!) (** 오직 하나)
		// 반환을 여러 개 하려면 어떻게 할까요? 변수는 하난데 데이터를 여러 개 들고 있는 친구 ..? (배열!!!!)
	}
	
	public static int[] countCapSmallLetter(String str) {
		int[] count = new int[2];
		// count[0] => 대문자 개수 
		// count[1] => 소문자 개수
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') count[0]++;
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') count[1]++;
		}
		
		return count;
	}
	
	// void: 반환값이 없음
	public static void changeOneElement(int[] arrInFunc) {
		arrInFunc[0] = arrInFunc[0] * 10;
	}
	public static int changeOneElement2(int v) {
		v *= 10;
		System.out.println("changeOneElement2 함수 내부 : " + v);
		return v; // 반환을 해야만 메인함수에서 함수 내에서 변화된 값을 받을 수 있음!
	}
} // class 끝
