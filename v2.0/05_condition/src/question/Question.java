package question;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ���� �ڵ�
//		int kor = sc.nextInt();
//		if (kor > 100 || kor < 0) {
//			System.out.println("[����] : ��ȿ���� ���� ����� �Դϴ�");
//			return;
//		}
//		else {
//			int mat = sc.nextInt();
//			if (mat > 100 || mat < 0) {
//				System.out.println("[����] : ��ȿ���� ���� ���м��� �Դϴ�");
//			}
//			else {
//				int eng = sc.nextInt();
//				if (eng > 100 || eng < 0) {
//					System.out.println("[����] : ��ȿ���� ���� ����� �Դϴ�");
//				}
//				else {
//					double avg = (kor + mat + eng) / 3.0;
//					boolean avgChk = avg > 70;
//					
//					if (avgChk) {
//						System.out.println("�հ�");
//					}
//					else {
//						System.out.println("���հ�");
//					}
//				}
//			}
//		}
		
		// ���� �ڵ�
		// ��ȿ���� ���� ������ �˻�
		int kor = sc.nextInt();
		if (kor > 100 || kor < 0) {
			System.out.println("[����] : ��ȿ���� ���� ����� �Դϴ�");
			return; // ���� �Լ� ����
		}
		int mat = sc.nextInt();
		if (mat > 100 || mat < 0) {
			System.out.println("[����] : ��ȿ���� ���� ���м��� �Դϴ�");
			return; // ���� �Լ� ����
		}
		int eng = sc.nextInt();
		if (eng > 100 || eng < 0) {
			System.out.println("[����] : ��ȿ���� ���� ����� �Դϴ�");
			return; // ���� �Լ� ����
		}
		
		/////////////////////////////////////
		double avg = (kor + mat + eng) / 3.0;
		boolean avgChk = avg > 70;
		
		if (avgChk) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
	}

}
