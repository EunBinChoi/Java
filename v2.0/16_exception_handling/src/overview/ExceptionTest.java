package overview;

import java.util.InputMismatchException;
import java.util.Scanner;

// 에러 (error): 심각한 오류 ex) 메모리 부족, 메모리 누수 => 처리 불가
// 예외 (exception): 경미한 오류 ex) 개발자 코드 오류, 사용자 입력 오류 => 수습 가능 (처리 가능)
// Exception
// 	- IOException
//  - RuntimeException
//		- ArithmeticException
//		- ArrayIndexOutOfBoundsException
//		- NullPointerException
//      - .....

// 프로그램 오류
// - 컴파일 오류 (compile-time error): 컴파일 할 때 발생하는 에러 (컴파일러가 잡아줌)
// - 런타임 오류 (runtime error): 실행할 때 발생하는 에러 (***)
// - 논리적 오류 (logical error): 프로그래머가 작성한 의도와 다르게 동작 

// 예외 처리 (exception handling)
// => 왜? 프로그램의 중단을 막기 위해 (******)
// => 실행 시 발생하는 예외에 대한 대비 코드를 작성
// => 구문 - try-catch문

public class ExceptionTest {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				int x = inputUser();
				int y = inputUser();
				int res = divide(x, y); // 두 수를 나누는 함수
				break;
			} catch (InputMismatchException e) {
				sc.next(); // 버퍼 내용물을 읽어옴 -> 버퍼 삭제
				System.out.println(e);
//				e.printStackTrace(); // 오류 메시지 출력 (디테일 정보 출력)
			} catch (ArithmeticException e) {
				// ArithmeticException e = new ArithmeticException();
				// 예외도 하나의 객체이기 때문에 e는 생성된 객체를 받아줌
				System.out.println(e.getMessage()); // 오류 메시지 출력
				// continue;
			} catch (Exception e) {
				// Exception e = new 위에서 처리하지 못한 예외 클래스(); // 다형성 개념
				System.out.println(e.getMessage());
			} finally { // 작성 선택적
				System.out.println("예외 발생 유무와 관련없이 무조건 실행");
			}
			/*
			 * 예외 발생 O: try - catch - finally 
			 * 예외 발생 X: try - finally
			 */

			System.out.println("프로그램이 중단될까요?");
			// try-catch 구문으로 예외처리를 해주면 프로그램 중단되지 않음
			// 만약 예외처리를 하지 않으면 프로그램 중단
			// break;
		}
	}
	public static int inputUser() throws InputMismatchException {
		return sc.nextInt();
	}
	public static int divide(int x, int y) throws ArithmeticException {
		return x / y;
	}
}
