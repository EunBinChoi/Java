import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * switch(����, ����, ���ڿ�) {
		 * 
		 * case ����, ����, ���ڿ�:
		 * 
		 * case ����, ����, ���ڿ�:
		 * 
		 * case ����, ����, ���ڿ�:
		 * 
		 * 
		 * }
		 * 
		 * int a = 1;
		 * switch(a) {
		 * 
		 * case 1:
		 * 	���� 1;
		 * 	break;
		 * 
		 * case 2:
		 * 	���� 2;
		 * 	break;
		 * 
		 * case 3:
		 * 	���� 3;
		 * 	break;
		 * 
		 * default:
		 * 	���� 4;
		 * 	// break; // ������ ����
		 * }
		 *
		 *
		 *switch �� ����
		 *break�� ���: switch ����, �ݺ��� ���� (***)

		 * */
		
//		int num;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("���ڸ� �Է��Ͻÿ� : ");
//		num = input.nextInt();
//		
//		/* switch�� �������
//		 * 1. �Ǽ� X
//		 * 2. == (equals)�� ����� ����
//		 * */
//		
//		switch(num) { 
//
//		case 0:
//			System.out.println("���� 0");
//			break;
//			
//		case 1:
//			System.out.println("���� 1");
//			break;
//			
//		case 2:
//			System.out.println("���� 2");
//			break;
//			
//		default:
//			System.out.println("0, 1, 2�� �ƴ� !!");
//			//break;
//		}
//		System.out.println("switch�� ��");
//		//
		
		// ����ڿ��� jan, feb, mar ==> 1, 2, 3
//		String month;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("���� ���ڿ��� �Է��Ͻÿ� : (jan, feb, mar) ");
//		month = input.next();
//		
//		switch (month) {
//		case "jan":
//			System.out.println("1��");
//			break;
//			
//		case "feb":
//			System.out.println("2��");
//			break;
//			
//		case "mar":
//			System.out.println("3��");
//			break;
//			
//		default:
//			System.out.println("1, 2, 3���� �ƴ�!");
//			break;	
//		}
		
		// ���� �ϳ��� �Է¹޾� ������ ������ �к��ϴ� ���α׷�
		char ch;
		String ch_str;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		ch = input.next().charAt(0);
		// if (ch == 'a' || ch == 'e' || ch == 'i' ||
		// ch == 'o' || ch == 'u')
		
		// ==: switch�� �ۼ��Ͻô� �� �������� ���� ���� ����
		
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + ('a' - 'A'));
		}
		
		switch(ch) {
		case 'a', 'e', 'i', 'o', 'u':
			ch_str = "����";
			break;
		
		default:
			ch_str = "����";
			break;
		}
		System.out.println(ch_str);
		
		
		// ����ڿ��� 1 ~ 12�� ������ ���������� ������ ���� �Է¹޾�
		// �ش� ���� �� �ϼ��� ����ϴ� ���α׷��� �ۼ����ּ���!
		// 1, 3, 5, 7, 8, 10, 12 => 31
		// 4, 6, 9, 11 => 30
		// 2 => 29 (����), 28 (���)
		
		// * ������ �Ǵ��ϴ� ���
		// 1. ������ 4�� ����̰� ���ÿ� 100�� ����� �ƴ�
		// 2. ������ 400�� ���
		
		// ����, ��
		int year, month, days;
		input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		year = input.nextInt();
		
		System.out.print("���� �Է��Ͻÿ� : ");
		month = input.nextInt();
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			days = 31;
			break;
		
		case 4, 6, 9, 11:
			days = 30;
			break;
		
		
		case 2:
			if ((year % 4 == 0) && (year % 100 != 0)
					|| (year % 400 == 0)) { // ����
				days = 29;
			}
			else { // ���
				days = 28;
			}
			break;
			
		default:
			days = -1; // ����
		
		}
		
		if (days == -1) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			System.out.println("1 ~ 12 ������ ���� �Է��Ͻÿ�.");
		}
		else {
			System.out.printf("%d�� �� �ϼ� = %d", month, days);
		}
	}

}
