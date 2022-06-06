package sms;

import java.util.Scanner;

public class SMSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];
		// 5���� ������ ������ �� �ִ� �迭 (�ڹ� ��Ÿ��)
		// ���⼭ ���ȣ�� scores��� ������ �Ϲ� int�� ������ �ƴϰ�
		// int[]�� ���� (int�� �����͸� ������ ������ �� �ִ� �迭)
		
//		int scores[] = new int[5]; 
		// C��� ��Ÿ�� �迭 ����
		
		// new int[5]: �޸� ���� (��)�� int�� �Ҵ��� �� �ִ� 5ĭ�� ����
		// new�� �迭�� ���Ұ� ������ ���� �ʱ�ȭ ��
		// - int: 0
		// - double/float: 0.0/0.0f
		// - boolean: false
		// - char: null
		
		// �迭���� �� ���Ҹ� �����ϴ� ���
		// �ε��� (index): ������ ���� (0������ ����)
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%d�� �л� ���� �Է�: ", i+1);
			scores[i] = sc.nextInt();
		}
//		scores[0] = 90;
//		scores[1] = 85;
//		scores[2] = 95;
//		scores[3] = 60;
//		scores[4] = 70;
//		scores[5] = 60; // ArrayIndexOutOfBounds
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { // �ε��� ����
			sum += scores[i];
		}
		System.out.println("��� : " 
		+ (double)sum / scores.length);
		
		// Q1. ���� �߿� �ִ�, �ּڰ�
		
		// �л� ������ ����
		int min = scores[0]; // �ּڰ��� scores[0]�̶�� ����
		int max = scores[0]; // �ִ��� scores[0]�̶�� ����
		
		// �л� ��ȣ�� ����
		int min_index = 0; // �ּ� ������ ���� �л� ��ȣ�� 0�̶�� ����
		int max_index = 0; // �ִ� ������ ���� �л� ��ȣ�� 0�̶�� ����
		for(int i = 1; i < scores.length; i++) {
//			score = sc.nextInt();
//			if(i == 0) {
//				min = score;
//				max = score;
//			}
			
			if(max < scores[i]) {
				max = scores[i]; 
				max_index = i;
			}
			if(min > scores[i]) {
				min = scores[i]; 
				min_index = i;
			}
		}
		System.out.printf("[���� ����] �л� ��ȣ: %d, ����: %d�Դϴ�.\n", 
				min_index+1, min);
		System.out.printf("[�ְ� ����] �л� ��ȣ: %d, ����: %d�Դϴ�.\n", 
				max_index+1, max);
		
		// Q2. ���� �߿� TOP3
		// 1) TOP3 �л� ��ȣ�� ���� ���
		// 2) ���� �ݺ������� �ٲ㺸��
		
		// 1)
//		int[] top = new int[3]; // 0: top1, 1: top2, 2: top3
//		int[] top_index = new int[3];
//		top[0] = max; // top1�� ����
//		top[1] = min; // top2�� ����
//		top[2] = min; // top3�� ����
//		top_index[0] = max_index; // top1�� ������ ���� �л� ��ȣ
//		top_index[1] = min_index; // top2�� �л� ��ȣ
//		top_index[2] = min_index; // top3�� �л� ��ȣ
//		
//		// top2
//		for(int i = 0; i < scores.length; i++) {
//			if(top[1] < scores[i] && scores[i] != top[0]) {
//				top[1] = scores[i];
//				top_index[1] = i;
//			}
//		}
//		
//		// top3
//		for(int i = 0; i < scores.length; i++) {
//			if(top[2] < scores[i] 
//					&& scores[i] != top[0] 
//							&& scores[i] != top[1]) {
//				top[2] = scores[i];
//				top_index[2] = i;
//			}
//		}	
		
		// 2)
		int[] top = new int[scores.length];
		int[] top_index = new int[scores.length];
		int[] scores_copy = new int[scores.length]; 
		
		for(int i = 0; i < top.length; i++) {
			scores_copy[i] = scores[i];
		}
		
		for(int i = 0; i < top.length; i++) {
			// ù��° �л��� ������ ���� Ŭ ���̶�� ����
			top[i] = scores_copy[0]; // top ����
			top_index[i] = 0; // top �л� ��ȣ
			
			// ������ �л� �����̶� �񱳸� �ϸ鼭
			// ù��° �л����� �� ū ���� ������
			// top�� ������Ʈ
			for(int j = 1; j < scores_copy.length; j++) {
				if(top[i] < scores_copy[j]) {
					top[i] = scores_copy[j];
					top_index[i] = j;
				}
			}
			scores_copy[top_index[i]] = -1;
		}
		
		for(int i = 0; i < scores_copy.length; i++) {
			System.out.print(scores_copy[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < top.length; i++) {
			System.out.printf("[ranking %d] "
					+ "�л���ȣ: %d ����: %d\n", 
					i+1, top_index[i]+1, top[i]);
		}
		
//		 Q3. ���� ���
//		 90�� �̻� => 'A'
//		 80�� �̻� ~ 90�� �̸� => 'B'
//		 70�� �̻� ~ 80�� �̸� => 'C'
//		 60�� �̻� ~ 70�� �̸� => 'D'
//		 �̿� ���� => 'F'
		
		char[] grades = new char[scores.length]; // 5�� �л��� ���� ����
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 90) {
				grades[i] = 'A';
			}
			else if(scores[i] >= 80) {
				grades[i] = 'B';
			}
			else if(scores[i] >= 70) {
				grades[i] = 'C';
			}
			else if(scores[i] >= 60) {
				grades[i] = 'D';
			}
			else {
				grades[i] = 'F';
			}
			System.out.printf("[%d��° �л�] ����: %d, ����: %c\n",
					i+1, scores[i], grades[i]);
		}
	}

}
