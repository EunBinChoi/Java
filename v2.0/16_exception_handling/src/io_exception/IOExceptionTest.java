package io_exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		try {
//			out = new PrintWriter(
//					new FileWriter("D:\\GoottAcademy-2"
//							+ "\\java-workspace"
//							+ "\\16_exception_handling"
//							+ "\\src"
//							+ "\\io_exception"
//							+ "\\io.txt")); // 절대 경로

			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			out = new PrintWriter(new FileWriter(".\\src\\io_exception\\io.txt")); // 상대 경로
			// IO 관련 클래스는 try~catch 구문을 무조건 작성해줘야 함! 
			
			for (int i = 0; i < arr.length; i++) {
				out.println(i + "번째 원소 : " + arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			out.close();
		}
	}

}
