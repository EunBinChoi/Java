package switch_case;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * a = 3;
		 * 
		 * * switch ������ �� �� �ִ� ������Ÿ��
		 * : ����, ����, ���ڿ� (equals()�� ��)
		 * 
		 * switch(a) {
		 * 	case '1': // a == '1'
		 * 		����;
		 * 		break; // switch ���� (vs for break)
		 * 	case '2': // a == '2'
		 * 		����;
		 * 		break;
		 * 	case '3': // a == '3'
		 * 		����;
		 * 		break;
		 * 	default: // if������ else�� ����
		 * 		����;
		 * 		//break; // default���� ���� ����
		 * } // switch�� ��
		 * 
		 * switch ����? 		
		 * 1) �ڵ� ����
		 * 2) == �����Ǿ��ִ� �� �˰� ���� -> "������" 
		 * 
		 * if(a == 1){
		 * 		����;
		 * }
		 * else if(a == 2){
		 * 		����;
		 * }
		 * else if(a == 3){
		 * 		����;
		 * }
		 * else {
		 * 		����;
		 * }
		 *  
		 *  
		 *  
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		// Q1. ����ڿ��� ���� �Է¹޾� �ش� ���� 1, 2, 3���� Ȯ��
//		System.out.print("������ �Է��Ͻÿ�: ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//			case 1:
//				System.out.println("1");
//				break;
//			case 2:
//				System.out.println("2");
//				break;
//			case 3:
//				System.out.println("3");
//				break;
//			default:
//				System.out.println("1, 2, 3 �߿� �ϳ��� �Է�");
//				//break;
//		}
		
		// Q2. ����ڿ��� ���� ���� �Է¹޾� �ش� ���� ���ڷ� ���
		// 1 -> Jan
		// 2 -> Feb
		// 3 -> Mar
		// 4 -> Apr
		
//		System.out.print("1 ~ 4�� �� �ϳ��� �Է��Ͻÿ�: ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//			case 1:
//				System.out.println("Jan");
//				break;
//			case 2:
//				System.out.println("Feb");
//				break;
//			case 3:
//				System.out.println("Mar");
//				break;
//			case 4:
//				System.out.println("Apr");
//				break;
//			default:
//				System.out.println("1 ~ 4�� �߿� �ϳ��� �Է�");
//				break;
//		}
		
		String str = "a";
		switch(str) {
			case "a":
				System.out.println("a");
//				break;
			case "b":
				System.out.println("b");
//				break;
			default: // else
				System.out.println("others");
//				break;
		}
//		
//		float f = 12.34f;
//		switch(f) { // 3.1 <= 3.14 < 3.2
//			case 12.34:
//				System.out.println("a");
//				break;
//			case 45.67:
//				System.out.println("b");
//				break;
//			default:
//				System.out.println("others");
//				break;
//		}
//		
		// �ǵ������� break�� �����ϴ� ���
		// ����ڿ��� ���� �Է¹޾� �ش� ���� ������ ���ڸ� ���ϴ� ���α׷�
		
//		System.out.print("���� �Է�: ");
//		int year = sc.nextInt(); // 2020
//		
//		System.out.print("�� �Է�: ");
//		int month = sc.nextInt(); // 2
//		
//		if(!(month >= 1 && month <= 12)) {
//			System.out.println("[����] �Է��� ���� ��ȿ���� ����");
//			return;
//		}
//		
//		int totalDays = 0;
//		
//				
//		switch(month) {
//		// (month == 1) || (month == 3) || (month == 5) 
//		// || (month == 7) ........
//		// ** month == �κ��� switch case�������� �������� (������ ��)
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			totalDays = 31;
//			break;
//			
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			totalDays = 30;
//			break;
//			
//		case 2:
//			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0))
//			|| (year % 400 == 0);
//			
//			if(isLeapYear) totalDays = 29;
//			else totalDays = 28;
//			
//			break;
//			
//		default:
//			totalDays = -1; // ������ ����
//			//break;
//		}
//		
//		System.out.printf("%d�� %d���� �� �ϼ��� %d�� �Դϴ�\n", 
//				year, month, totalDays);
//		
		
		// ���� ��������
		// Q1. ����ڿ��� ������ �Է¹޾� ����˻��ϰ� ���� -> 29��
		// 									 ��� -> 28��
		// ���� �˻��ϴ� ��� (�� �� �ϳ� �����ϸ� ��)
		// 1) 4�� ����̰� ���ÿ� 100�� ����� �ƴ�
		// 2) 400�� ���
		
		// Q2. totalDays�� ��� (+ ����, �� ����)
		// 30, 31, 29, 28, -1
		// 2020�� 13���� �� �ϼ��� -1�Դϴ�.
		
		
		// Q3. switch���� �̿��ؼ� ����ڿ��� ���� �ϳ��� �Է¹޾�
		// ������ ������ �Ǻ��ϴ� ���α׷��� �ۼ�
		// ����: a, e, i, o, u
		// ����: ������
		// (������� �Է��� ��ҹ��� ���о��� ���͵� �����ؾ� ��)
		// A, a
		
		System.out.print("���� �ϳ� �Է�: "); 
		
		
		
//		String userData = sc.next(); // ����� �Է� ������ ����
//		char ch = userData.toLowerCase().charAt(0);
//		
		
		char userData = sc.next().charAt(0);
		char ch = userData;
		if(ch >= 'A' && ch <= 'Z') {
			ch += ('a' - 'A');
		}
	
		// ���� ����
		// char ch = sc.next().toLowerCase().charAt(0);
		
		// ����� �Է� �����͸� �ϰ������� �ҹ��ڷ� ����
		
		// "A" -> "a" -> 'a'
		// "AbC" -> "abc" -> 'a'
		if(!(ch >= 'a' && ch <= 'z')) { 
			System.out.printf("%s�� ����/���� "
					+ "�ǴܺҰ����� �����Դϴ�!", ch);
			return; // �����Լ� ���� (switch�� �������� ����)
		}	
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.printf("%c�� �����Դϴ�.\n", ch);
				break;
				
			default: // ������ ������ ������ ���ĺ��� ��������?
				System.out.printf("%c�� �����Դϴ�.\n", ch);
//				break;
		}
		
	}

}
