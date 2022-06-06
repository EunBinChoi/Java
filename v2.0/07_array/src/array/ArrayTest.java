package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �迭 (array)
		 * : ������ ������ Ÿ�� (***)�� 
		 * ���� �����ִ� ������ �������� ������ �� �ִ� ����
		 * 
		 * : �ϳ��� ���� �̸����� ���� ���� (�ε����� ����)
		 * 
		 * 
		 * ex) 5�� �л��� ���� 5�� ���� ���� ��� ���ϴ� ��������
		 * 1�� �л��� ���� ����?
		 * */
		
		/*
		 * �⺻ Ÿ��: int, double, float, char, boolean
		 * -> ���� ������ ������ ��ü�� ����
		 * 
		 * ���� Ÿ��: �迭, String, Ŭ���� ....
		 * -> ���� ������ �ּҰ��� ����
		 * -> �޸��� �ּҰ��� �˰� ������ ���Ұ��� ã�� �� ����
		 * ex) scores: ù��° ������ ��ġ (�ּҰ�)
		 * */
		
		
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
//		for(int i = 0; i < scores.length; i++) {
//			System.out.printf("%d�� �л� ���� �Է�: ", i+1);
//			scores[i] = sc.nextInt();
//		}
////		scores[0] = 90;
////		scores[1] = 85;
////		scores[2] = 95;
////		scores[3] = 60;
////		scores[4] = 70;
////		scores[5] = 60; // ArrayIndexOutOfBounds
//		
//		int sum = 0;
//		for(int i = 0; i < scores.length; i++) { // �ε��� ����
//			sum += scores[i];
//		}
//		System.out.println("��� : " 
//		+ (double)sum / scores.length);
//		
//		// Q1. ���� �߿� �ִ�, �ּڰ�
//		
//		// �л� ������ ����
//		int min = scores[0]; // �ּڰ��� scores[0]�̶�� ����
//		int max = scores[0]; // �ִ��� scores[0]�̶�� ����
//		
//		// �л� ��ȣ�� ����
//		int min_index = 0; // �ּ� ������ ���� �л� ��ȣ�� 0�̶�� ����
//		int max_index = 0; // �ִ� ������ ���� �л� ��ȣ�� 0�̶�� ����
//		for(int i = 1; i < scores.length; i++) {
////			score = sc.nextInt();
////			if(i == 0) {
////				min = score;
////				max = score;
////			}
//			
//			if(max < scores[i]) {
//				max = scores[i]; 
//				max_index = i;
//			}
//			if(min > scores[i]) {
//				min = scores[i]; 
//				min_index = i;
//			}
//		}
//		System.out.printf("[���� ����] �л� ��ȣ: %d, ����: %d�Դϴ�.\n", 
//				min_index+1, min);
//		System.out.printf("[�ְ� ����] �л� ��ȣ: %d, ����: %d�Դϴ�.\n", 
//				max_index+1, max);
//		
//		// Q2. ���� �߿� TOP3
//		// 1) TOP3 �л� ��ȣ�� ���� ���
//		// 2) ���� �ݺ������� �ٲ㺸��
//		
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
//		
//		for(int i = 0; i < top.length; i++) {
//			System.out.printf("[ranking %d] "
//					+ "�л���ȣ: %d ����: %d\n", 
//					i+1, top_index[i]+1, top[i]);
//		}
//		
		// Q3. ���� ���
		// 90�� �̻� => 'A'
		// 80�� �̻� ~ 90�� �̸� => 'B'
		// 70�� �̻� ~ 80�� �̸� => 'C'
		// 60�� �̻� ~ 70�� �̸� => 'D'
		// �̿� ���� => 'F'
//		
//		char[] grades = new char[scores.length]; // 5�� �л��� ���� ����
//		for(int i = 0; i < scores.length; i++) {
//			if(scores[i] >= 90) {
//				grades[i] = 'A';
//			}
//			else if(scores[i] >= 80) {
//				grades[i] = 'B';
//			}
//			else if(scores[i] >= 70) {
//				grades[i] = 'C';
//			}
//			else if(scores[i] >= 60) {
//				grades[i] = 'D';
//			}
//			else {
//				grades[i] = 'F';
//			}
//			System.out.printf("[%d��° �л�] ����: %d, ����: %c\n",
//					i+1, scores[i], grades[i]);
//		}
		
//		int score1;
//		int score2;
//		int score3;
//		int score4;
//		// ...score5 (���� 5��)
//		
//		Scanner sc = new Scanner(System.in);
//		int score = 0;  // ���� ����
//		int sum = 0; // 
//		double avg = 0; // �л� 5�� ���� ���� ���
//		for(int i = 0; i < 5; i++) { // �л� 5���� ���鼭
//			System.out.printf("%d��° �л��� ���� �Է�: ", i+1);
//			score = sc.nextInt();
//			sum += score;
//		}
//		avg = sum / 5.0; 
//		System.out.printf("�л��� ����� %f���Դϴ�.\n", i+1, avg);
		
//		System.out.println(score); // 5�� �л��� ���� (������ ������)
//		
		
		
//		int[] scores = new int[5];
		// 5���� ������ ������ �� �ִ� �迭 (�ڹ� ��Ÿ��)
		
		// �迭 �������ڸ��� ������ �ʱ�ȭ�ϴ� ��� (new ��� X)		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		System.out.println(arr1);
		
		// for each (�ε��� ���� �����ϰ� �迭 ���� ������� ���)
		for(int element : arr1) {
			System.out.println(element);
		}
		
		
		////////////////////////////////////////
		// �迭�� ����� �ּҰ� �������� Ȯ��
		System.out.println(arr1 == arr2);
		
		
		// �迭�� �����ϰ� �ִ� ���Ұ� �������� Ȯ��
		// 1) �迭�� ����� ������
		// 2) �迭 ���Ұ��� ��������
		
		boolean isEquals = true;
		if(arr1.length != arr2.length) {
			isEquals = false;
			return;
		}
		
		// arr1.length == arr2.length
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				isEquals = false;
				break;
			}
		}
		System.out.println(isEquals ? 
				"�� �迭�� ���Ұ� ����" : "�� �迭�� ���Ұ� �ٸ�");
		
		
		/////////////////////////////////////////////////
		// �迭 ������ �߸��� ����
		int[] arr1_wrong = {1, 2, 3};
		int[] arr1_wrong_copy;
		arr1_wrong_copy = arr1_wrong;
		System.out.println(arr1_wrong);
		System.out.println(arr1_wrong_copy);
		// arr1 �迭 �̸� ��ü�� ù��° ������ �ּҰ��� ������ ������
		// arr1_copy = arr1 (���� �ּҰ� ����)
		
		arr1_wrong_copy[0] = 10;
		
		for(int i = 0; i < arr1_wrong.length; i++) {
			System.out.print(arr1_wrong[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr1_wrong_copy.length; i++) {
			System.out.print(arr1_wrong_copy[i] + " ");
		}
		System.out.println();
		
		
		// �迭 ������ ��Ȯ�� ����
		int[] arr1_copy = new int[arr1.length]; // ���ο� ���� ����
		
		System.out.println(arr1);
		System.out.println(arr1_copy);
		
		for(int i = 0; i < arr1_copy.length; i++) {
			arr1_copy[i] = arr1[i];
			// �ּҴ� �˷����� �ʰ� �����͸� ����
		}
		
		arr1_copy[0] = 10;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr1_copy.length; i++) {
			System.out.print(arr1_copy[i] + " ");
		}
		
		
		
	}

}





