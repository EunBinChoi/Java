package question;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		int a = 0;
//	       int b = 1;
//	       System.out.println("���ϴ� ������ �ܼ��� �Է����ּ��� ex)2 : ");
//	       a = sc.nextInt();
//	       while(a <= 9) {
//	    	   System.out.println("a : " + a);
//	    	   System.out.println("b : " + b);
//	          while (b <= 9) {
//	             System.out.printf("%dX%d=%d\n", a, b, a*b);
//	             b++;
//	          }
//	       }

//		System.out.println("���ڸ� �Է��ϼ���:");
//		int n = sc.nextInt();
//		int m = 1;
//		int res = 0;
//		while (m < n) { 
//			// m  n
//			// 1 < 5 
//			// 2 < 5  
//			// 3 < 5 
//			// 4 < 5
//			if (n > 0)
//				res = n * (n - m);
//			m++;
//
//		}
//		System.out.println(res);

		int menuChoice = 0;
		int change = 0;

		while (true) {
			System.out.println("�� ������ �ִ�? ");
			change = sc.nextInt();
			if (change < 1) {
				System.out.println("[����]1���̻� �Է��ϼ���");
				continue;
			} else if (change < 2500) {
				System.out.println("[����]�ּ��ֹ������� �ݾ��� 2500�� �Դϴ�.");
				continue;
			}

			String m = "���";
			String mm = "���";
			String mmm = "������";
			String mmmm = "���";
			int kimbabprice = 2500;
			int ramenprice = 3000;
			int ddukprice = 4000;
			int dongasprice = 5500;

			// while (true) {
			System.out.println("====== menu ======");
			System.out.println("1.  ���  (2500��)");
			System.out.println("2.  ���  (3000��)");
			System.out.println("3.  ������ (4000��)");
			System.out.println("4.  ��� (5500��)");
			System.out.println("5.  ����");
			System.out.println("==================");
			System.out.println();
			System.out.print("�޴� �ֹ� ��ȣ: "); // �޴����� �޴� �� 1 ~ 5 ���� �޴��� �Է����� �ʾ��� ��� ���� ���
			menuChoice = sc.nextInt();
			if (menuChoice > 0 && menuChoice < 6)
				break;
			else
				System.out.println("1 ~ 5�� �޴��� ���� �����մϴ�.");

			if (menuChoice == 1) {
				System.out.printf("%s�� �����ϼ̽��ϴ�    \n", m);
				System.out.printf("�ܵ��� %d���Դϴ�    \n", change - kimbabprice);
			} else if (menuChoice == 2) {
				System.out.printf("%s�� �����ϼ̽��ϴ�    \n", mm);
				System.out.printf("�ܵ��� %d���Դϴ�    \n", change - ramenprice);
			} else if (menuChoice == 3) {
				System.out.printf("%s�� �����ϼ̽��ϴ�    \n", mmm);
				System.out.printf("�ܵ��� %d���Դϴ�    \n", change - ddukprice);
			} else if (menuChoice == 4) {
				System.out.printf("%s�� �����ϼ̽��ϴ�    \n", mmmm);
				System.out.printf("�ܵ��� %d���Դϴ�    \n", change - dongasprice);
			} else if (menuChoice == 5) {
				System.out.println("����....");
				break;
			} else {
				System.out.println("�޴��� �ٽ� �Է����ּ���!");
			}
			//

			// } // ���� while

			//
		} // �ܺ� while

	}

}
