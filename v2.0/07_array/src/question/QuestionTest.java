package question;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if

//		int a = 1;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.println("print");
//				
//				if (j == 1) continue;
//				System.out.println("print2");
//				
//			}
//			//
//		}
//		System.out.println("hello world");
//		
//		// return: ���� �Լ� ����
//		// break: �ݺ��� ���� (vs switch case break)
//		// continue
//		
//		
		Scanner sc = new Scanner(System.in);
//		char[] seats = new char[10];
//		int select = 0; // ���� ���� �¼� ����
//		
//		// seats �迭 ��� ���� 'O'�� �Ҵ�
//		for(int i = 0; i < seats.length; i++) {
//			seats[i] = 'O';
//		}
//		// �¼� �˻� ���α׷�
//		while(true) {
//			System.out.println(
//					"======== SEATS ========\n"
//					+ "1   2   3   4   5   6   7   8   9   10\n"
//					+ "======================"
//					);
//			for(int i = 0; i < seats.length; i++) {
//				System.out.printf("%c  ",seats[i]);
//			}
//			System.out.println();
//			System.out.println("�����ϰ��� �ϸ� -1�� �Է��ϼ���");
//			System.out.print("�¼��� �����ϼ��� : ");
//			select = sc.nextInt(); // �¼� ��ȣ �Է�
//			// -1 �Է½� ���α׷�����
//			if(select == -1) {
//				System.out.println("���α׷� ����");
//				return;
//			}
//			// ��ȿ�� �¼���ȣ �˻�
//			else if (!((select >= 1) && (select <= 10))) {
//				System.out.println("��ȿ�� �¼���ȣ�� �ƴմϴ�");
//				System.out.println("1 ~ 10�� �¼��� �Է����ּ���");
//				System.out.println();
//				continue;
//			}
//			
//			// �¼� ���� �� 'X'�� ����
//			if(seats[select - 1] == 'O') {
//				seats[select - 1] = 'X';
//				System.out.printf("%d�� �¼� ����Ǿ����ϴ�\n", select);
//				System.out.println();
//			}
//			// �̹� ����� �¼� ���úҰ�
//			else {
//				System.out.println("�̹� ����� �¼��Դϴ�");
//				System.out.println("�ٽ� �����ϼ���");
//				System.out.println();
//				continue;
//			}
//			int exitCount = 0; // ���α׷� ���� ī��Ʈ ����
//			// ���α׷� ���� ī��Ʈ
//			for(int i = 0; i < seats.length; i++) {
//				if (seats[i] == 'X') {
//					exitCount++;
//				}
//			}
//			// ī��Ʈ �޼��� ���α׷� ����
//			if(exitCount == 10) {
//				System.out.println(
//						"======== SEATS ========\n"
//						+ "1   2   3   4   5   6   7   8   9   10\n"
//						+ "======================"
//						);
//				for(int i = 0; i < seats.length; i++) {
//					System.out.printf("%c  ",seats[i]);
//				}
//				System.out.println();
//				System.out.println("��� �¼��� �� á���ϴ�");
//				System.out.println("���α׷� ����");
//				break;
//			}
//			
//		}
//		
//		String str = sc.next();
//		char[] strChar = str.toCharArray();

		int ele = 0;
		int chk = 0;
		int tmp = 0;
		System.out.print(">>�� ���� ���Ұ� �ֽ��ϱ�? : ");
		ele = sc.nextInt();
		int elem[] = new int[ele];

		// �Էº�
		for (int i = 0; i < ele; i++) {
			System.out.print(">> ���Ұ��� �Է��Ͻÿ� : ");
			elem[i] = sc.nextInt();
		}
		// ���ĺ�

		for (int i = 0; i < ele; i++) {
			for (int j = 0; j < ele; j++) {
				
				if (elem[i] < elem[j]) {
					System.out.printf("%d %d\n", elem[i], elem[j]);
					tmp = elem[j];
					elem[j] = elem[i];
					elem[i] = tmp;

				}

			}

		}
		// ��º�
		System.out.println(">>���� ��� : ");
		for (int i = 0; i < ele; i++) {

			System.out.print(elem[i] + " ");
		}

	} // ���� �Լ� ��
		//

}
