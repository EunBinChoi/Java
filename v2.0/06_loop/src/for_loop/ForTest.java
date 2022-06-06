package for_loop;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while 3����
		// 1) �ʱ�ȭ 
		// 2) ���ǽ�
		// 3) ������
		
		// for(�ʱ�ȭ; ���ǽ�; ������){
		// 		����;
		// }
		
//		int i;
//		for(i = 0; i < 5; i ++) {
//			System.out.println("i�� �� = " + i);
//		}
//		System.out.println(i); // 5
//		
//		for(i = 1; i <= 5 ; i ++) {
//			System.out.println("i�� �� = " + i);
//		}
//		System.out.println(i); // 6
//		
//		for(i = 5; i > 0 ; i --) {
//			System.out.println("i�� �� = " + i);
//		}
//		System.out.println(i); // 
		
//		for(;;) {
//			System.out.println("??");
//		}
		// while(true){}�� �����ϰ� ���ѷ���
		
		// Q1. i == 0 2 4 6 8 10
		for(int i = 0; i < 11; i+=2) { // 0 2 4 6 8 10 (6ȸ)
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < 11; i++) { // 0 ~ 10 (11ȸ)
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// Q2. i == 1 3 5 7 9
		for(int i = 1; i < 10; i+=2) { // 5ȸ
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i < 10; i++) { // 9ȸ
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
//		System.out.println(i); // 11
		System.out.println();
		
		// Q3. i == 1 ~ 10���� �հ� (1 + 2 + 3... + 10)
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.printf("1 ~ 10���� �հ�: %d\n", sum);
		System.out.println();
		
		// Q4. (���ѷ��� ����) ����ڿ��� -1 ������ ������ 
		// ���� ������ �Է¹޾� �� ���� ���� ������ �ԷµǾ����� 
		// ī�����ϴ� ���α׷�
		// ex) 1 3 5 7 -1 => 4
		// ex) 100 200 300 -1 => 3
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for(;;) { // while(true)
			System.out.print("���� ���� �Է� (����� -1): ");
			int num = sc.nextInt();
			// 1) cnt++;
			if(num == -1) break;
			else if(num > 0) cnt++; // 2) cnt++;
		}
		System.out.printf("�Է��� ���� ������ %d��", cnt);
		
		// break: �ݺ��� ����
		// continue: �ݺ��� �ٽ� ���� (i��° ���� (skip))
		for(int i = 1; i < 11; i++) {
			if(i % 3 == 0) {
				System.out.println("hello! " + i);
				continue; 
				// i�� 3�� ����� �� �ݺ��� �ٽ� ����
				// �ش� i�� ���̽��� �����ϰڴ� (i�� �����ϰڴ�)
			}
			else {
				System.out.println(i); // 1, 2, 4, 5, 7, 8, 10
			}
			System.out.println("end");
		}
		System.out.println();
		
		// ������ ���� continue ������ �ǹ̰� ����
		// ����? �̹� ����� �ϰ� 3�� ����� �����غ���
		// �̹� ������ ������ �� �����߱� ������ �ǹ̰� ����
		for(int i = 1; i < 11; i++) {
			System.out.println(i); 
			
			if(i % 3 == 0) {
				continue; 
			}
		}
		
//		for(int i = 1; i < 11; i++) {
//			if(i % 3 != 0) {
//				System.out.println(i);
//			}
//		}
		
		
		// Q5. ���ٿ� ����
		// 1 <= answer <= 100 ���̿� ������ (Math.random())�� �������� ����
		// ����ڰ� ������ �����ϴ� ����
		// if(answer > guess) UP!
		// else if(answer < guess) DOWN!
		// else ����! 
		// �õ� Ƚ���� ���� ���!
		
		// 1. 2500���� ���� ������ �޴��� �� ���� ����
		// 2. ���࿡ ����ڰ� ������ �޴� �ݾ׺��� �ܵ��� ������ ���Ÿ� ����
		// 3000�� -> 3 -> �ٽ� ���� (�ܵ�) -> 1, 2 -> ���Ű���
		
//		while(true) {
//			// �������� �����Ͱ� ���Դ��� Ȯ��
//			// 2500���� ������ �ٽ� �Է�
//			// �������� �����Ͱ� ������ 
//			break;
//		}
//		
//		// ���� ����
//		while(true) {
//			// �޴��� ���
//			// �޴� ����
//			
//			// �޴� �ݾ��� �ܵ����� ������ Ȯ���ϴ� �κ�
//			// ������ �����ϸ� ���� (�ܵ� >= �޴� ����)
//			// ������ �Ұ����ϸ� �ٽ� �޴��� �Է¹���
//			// ������ �� �Ŀ��� �ܵ��� 2500�̸��� �Ǹ� ���α׷� ���� (break, return)
//		}
//		
//		
		
		// Q6. ���õ�� ����
		// �� ������ �ִ�? 10000��
		// =====================
		// 1. ��� (2500)
		// 2. ��� (3000)
		// 3. ������ (4000)
		// 4. ��� (5000)
		// 5. ����
		// =====================
		
		// �޴� �ֹ� ��ȣ: 1
		// ��� �����ϼ̽��ϴ�.
		// �ܵ��� 7500���Դϴ�.
		
		// �޴� �ֹ� ��ȣ: 2
		// ��� �����ϼ̽��ϴ�.
		// �ܵ��� 4500���Դϴ�.
		
		// �޴� �ֹ� ��ȣ: 5
		// ����!
		// �ܵ��� 4500���Դϴ�.
		
		// ����
		// 1) ���� ������ ���� ������ ��� �޴��� ����� ���
		// ���� �����մϴ�! ��� �޽����� ��� -> �ٽ� �޴� ����
		// 2) �ܵ��� 0�̸� ����
		// 3) (�߰�) ���� ���� ���� �޴� ������ �ּڰ����� ������ ������ �� ���� (**)
		// 4) ���� ���� ��ȿ���� ���� �������� ���� ���� (�׷� ��� �ٽ� �Է¹ް�)
		// 5) 1 ~ 5 ���� �޴��� �Է����� �ʾ��� ��� ���� ���
		
		System.out.print("�� ������ �ִ�? ");
		int change = sc.nextInt();
		while(true) {
			System.out.println("====== menu ======");
			System.out.println("1. ���  (2500��)");
			System.out.println("2. ���  (3000��)");
			System.out.println("3. ������ (4000��)");
			System.out.println("4. ��� (5000��)");
			System.out.println("5. ����");
			System.out.println("==================");
			System.out.println();
			System.out.print("�޴� �ֹ� ��ȣ: ");
			int menuChoice = sc.nextInt();
			if(menuChoice == 1) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				if(change >= 2500) {
					change -= 2500;
				}
				else {
					System.out.println("�� �� �����ϴ�..�̤�");
				}
			}
			else if(menuChoice == 2) {
				if(change >= 3000) {
					change -= 3000;
				}
				else {
					System.out.println("�� �� �����ϴ�..�̤�");
				}
			}
			else if(menuChoice == 3) {
				if(change >= 4000) {
					change -= 4000;
				}
				else {
					System.out.println("�� �� �����ϴ�..�̤�");
				}
			}
			else if(menuChoice == 4) {
				if(change >= 5000) {
					change -= 5000;
				}
				else {
					System.out.println("�� �� �����ϴ�..�̤�");
				}
			}
			else if(menuChoice == 5) {
				System.out.println("����....");
				break;
			}
			else {
				System.out.println("�޴��� �ٽ� �Է����ּ���!");
			} // else �߰�ȣ
		} // while �߰�ȣ
	
	} // main �߰�ȣ

} // class �߰�ȣ
