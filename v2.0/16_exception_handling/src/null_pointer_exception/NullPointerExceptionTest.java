package null_pointer_exception;

import java.util.Scanner;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = null;
		while (true) {
			try {
				System.out.println(str.toString());
				System.out.println(str.equals("hello"));
				break;
			} catch (NullPointerException e) {
				System.out.println(e);
				System.out.print("��ü�� ���ڿ� �Է�: ");
				str = sc.next();
			} catch (Exception e) {
				System.out.println(e);
			}	
		}
		System.out.println("���α׷� ���� ...");
	}

}
