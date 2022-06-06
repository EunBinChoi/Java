package array_index_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("몇 번째 ? "); // 1 ~
				int n = sc.nextInt(); // mismatch
				
				if(n >= 0 && n < arr.length) {
					System.out.println(arr[n - 1]);
					// arrayindexout
				}
				break;

			} catch(InputMismatchException e) {
				sc.next();
				System.out.println(e);
				
			} catch(ArrayIndexOutOfBoundsException e) {
				// arr[arr.length]에 접근할 때 예외 발생
				System.out.println(e);
				System.out.println("인덱스 오류");
			}
		}
	}

}
