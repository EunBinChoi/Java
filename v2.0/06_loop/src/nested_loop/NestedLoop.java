package nested_loop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ��ø �ݺ��� (���� �ݺ���, nested loop)
		 * : �ݺ��� �ȿ� �ݺ����� ���ִ� ����
		 * */
		
		/* while(){
		 * 	while(){
		 * 	}
		 * }
		 * 
		 * for(){
		 * 	for(){
		 * 	}
		 * }
		 * 
		 * ***
		 * ***
		 * ***
		 * 
		 * */
		
		for(int i = 0; i < 3; i++) {
			System.out.println("***");
		}
		
		for(int i = 0; i < 3; i++) { // 1
			for(int j = 0; j < 3; j++) { // 2
				System.out.print("*");
			} // 3
			System.out.println();	
		} // 4
		// �ܺ� for��: i (1 ~ 4)
		// ���� for��: j (2 ~ 3)
		// i�� j�� ȥ���ؼ� ������� ���� ��!
		
		for(int i = 0; i < 9; i++) {
			System.out.print("*");
			if((i + 1) % 3 == 0) System.out.println();
			
			// *********
			// 012345678
		}
		
		// Q1.
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; i >= j; j++) {
				//if() {
					System.out.print("*");
				//}
			}
			System.out.println();
		}
		
		
		// Q2.
		// �� 5���� 5���� ���� ���� (��, ��, ��, ��, ��)
		// ���)
		// 1��° �л��� ���� �Է�: 50 40 90 80 85
		// 1��° �л��� ����� 69���Դϴ�.
		// 2��° �л��� ���� �Է�: 50 40 90 80 85
		// 2��° �л��� ����� 69���Դϴ�.
		// 3��° �л��� ���� �Է�: 50 40 90 80 85
		// 3��° �л��� ����� 69���Դϴ�.
		// 4��° �л��� ���� �Է�: 50 40 90 80 85
		// 4��° �л��� ����� 69���Դϴ�.
		// 5��° �л��� ���� �Է�: 50 40 90 80 85
		// 5��° �л��� ����� 69���Դϴ�.
		Scanner sc = new Scanner(System.in);
//		int score = 0;  // ���� �Էº��� (25�� ����)
//		int sum = 0; // �л� 1�� ���� ���� 5���� �հ�
//		double avg = 0; // �л� 1�� ���� ���� 5���� ���
//		for(int i = 0; i < 5; i++) { // �л� 5���� ���鼭
//			sum = 0; // �ʱ�ȭ (***) (i==1 �л��� ���� �Է�, i==0 �л��� ���� ����)
//			System.out.printf("%d��° �л��� ���� �Է�: ", i+1);
//			
//			for(int j = 0; j < 5; j++) { // ���� 5�� �Է¹��� (50 60 70 80 90)
//				score = sc.nextInt();
//				sum += score;
//			}
//			avg = sum / 5.0; // 5�� �����
//			System.out.printf("%d��° �л��� ����� %f���Դϴ�.\n", i+1, avg);
//		}
		
		
		// Q3. ���ڿ��� �Ӹ���� (palindrome, ȸ��)
		// � ���ڿ��� ���������� �о �������� �о ������ ���ڿ��� ȸ���̶�� �մϴ�.
		// ���� ���, mom�� ���������� �о mom, �������� �о mom���� ȸ���� �½��ϴ�.
		// ���� ���, ab a�� ȸ���� �ƴմϴ�.
		// ���� ���, aba�� ȸ���Դϴ�.
		// �Էµ� ���ڿ��� �Ӹ�������� �ƴ��� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (���ڿ��� ���̴� s.length(), s.charAt(2))
		
//		String s = ""; // ���ڿ� �ʱ�ȭ
//		System.out.print("���ڿ� �Է�: ");
//		s = sc.nextLine(); // ab a
//		int p1 = 0;
//		int p2 = s.length()-1;
//		boolean isPalin = true; // �ش� ���ڿ��� �Ӹ�������� �ƴ��� ����
//		
//		int i;
//		for(i = 0; i < s.length()/2; i++) {
//			// pointer1: s.charAt(i)
//			// pointer2: s.charAt(s.length()-1-i)
//			// p1, p2 ��ġ�� �ִ� ��� ���ڰ� ���ƾ���
////			if(s.charAt(p1) == s.charAt(p2)) {
////				isPalin = true;
////			}
////			else { // �ϳ��� �ٸ� ���� ������ break!
////				isPalin = false;
////				break;
////			}
//			
//			// �Ӹ�����̶�� ������ �Ŀ�
//			// p1, p2 ��ġ�� �ִ� ���� �߿� �ϳ��� �ٸ� ���� ������ ..? (***)
//			if(s.charAt(p1) != s.charAt(p2)) {
//				isPalin = false;
//				break;
//			}
//			
//			System.out.println(s.charAt(i));
//			// abba (0 ~ 3 (���ڿ��� ����-1))
//			// pointer1: 0                     1
//			// pointer2: ��ü ���ڿ��� ����-1       ��ü ���ڿ��� ����-2
//			p1++;
//			p2--;
//		}
//		System.out.println(i); 
//		System.out.println((isPalin) ? "�Ӹ�����Դϴ�." : "�Ӹ������ �ƴմϴ�.");
//		
		// Q3-1. ����ڿ��� ���ڿ� �� ���� �Է¹޾� �� ���ڿ��� ������ Ȯ���ϴ� equals()
		// "abc" "abcd"
		// "abc" "acc"
		// == (int, boolean, char)
		// equals() (String, ��ҹ��� ���� O)
		// equalsIgnoreCase() (��ҹ��� ���� X)
		
		// 1. ���ڿ��� ���� ���ƾ� �� (aaa, aaaa)
		// 2. ���ڿ��� �����ϰ� �ִ� ��� ���ڰ� ���ƾ� ��
		
//		String s1 = sc.next();
//		String s2 = sc.next();
//		
//		if(s1.length() != s2.length()) {
//			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
//			return;
//		}
//		
//		boolean isEquals = true;
//		// s1.length() == s2.length()
//		for(int i = 0; i < s1.length(); i++) {
//			if(s1.charAt(i) != s2.charAt(i)) {
//				isEquals = false;
//				break;
//			}
//		}
//		System.out.println(isEquals ? "�� ���ڿ��� �����ϴ�." : "�� ���ڿ��� �ٸ��ϴ�.");
//		
		
		// Q4. ��Ÿ��� �����ϴ� �ﰢ�� ���ϱ�
		// 1 <= a, b, c <= 100 (a, b, c�� ���� ���� (c�� ���� ũ�ٰ� ����))
		// ��Ÿ��� ����: a * a + b * b == c * c�� 
		// �����ϴ� �ﰢ�� ���� ���� ���� ����Ͻÿ�.
		// �� �� ���� �ﰢ���� ��Ÿ��󽺿� �����ϴ����� Ȯ���غ�����!
		
		// �߰� 1) ���� ���� �ߺ� ��� -> 104��
		//     2)        �ߺ� ���� -> 52��
		// a, b, c
		// 3, 4, 5  
		// 4, 3, 5
		
		int cnt = 0;
		
		// 100 * 100 * 100 = 10^6
		// a < b < c
		// 3   3 ~
		for(int a = 1; a < 101; a++) {
			for(int b = a; b < 101; b++) {
				for(int c = b; c < 101; c++) {
					if(a*a + b*b == c*c) {
						cnt++;
						System.out.printf("(%3d %3d %3d)\n", a, b, c);
					}
				}
			}
		}
		System.out.println("�� ����: " + cnt);
		
		
		
	}

}
