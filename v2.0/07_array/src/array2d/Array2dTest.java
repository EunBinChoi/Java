package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array2dTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ �迭
		// ex) �л� 5�� �����ϰ� �� �л��� ���� (��, ��, ��, ��, ��)���� �����Ѵٰ� ����
		
		int[][] scores = new int[5][5];
//		int[][] scores = {{10, 20, 30}, 
//						{10, 20, 30}, 
//						{10, 20, 30}};
		// ��������� �Է¹ޱ�
		// ���� ����: scores.length
		// ���� ����: scores[i].length
		
		// scores[0].length == scores[1].length == scores[2].length
		// == scores[3].length == scores[4].length
		
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < scores.length; i++) {
////			System.out.printf("�л� %d���� ������ ������� �Է� (�� �� �� �� ��) : ", i+1);
//			for(int j = 0; j < scores[i].length; j++) {
//				scores[i][j] = sc.nextInt();
//			}
//		}
//		// �л� 1 ~ 5��, ���� (��, ��, ��, ��, ��) 
//		
//		// Q1. �л��� ���� ���
//		// 1) scores.length (��)
//		// 2) scores[0].length (��)
//		double[] stuAvg = new double[scores.length];
//		int sum = 0; // �л��� ���� �����ϱ� ���� �ӽ� ����
//		for(int i = 0; i < scores.length; i++) { // �л� ��ȣ ���鼭
//			sum = 0; // sum �ʱ�ȭ
//			for(int j = 0; j < scores[i].length; j++) { // ���� ���鼭
//				sum += scores[i][j];
//			}
//			stuAvg[i] = (double)sum / scores[i].length;
//		}
//		
//		for(int i = 0; i < stuAvg.length; i++) {
//			System.out.printf("%d�� �л� ���: %.2f��\n", i+1, stuAvg[i]);
//		}
//		
//		// Q2. �л� 3���� ����� ���
//		System.out.printf("�л� 3���� �����: %d\n", scores[2][4]);
//		
//		// Q3. ���� �л��� ���
//		// 1) scores.length (��, �л� ��)
//		// 2) scores[0].length (��, ���� ����)
//		double[] courAvg = new double[scores[0].length];
//		for(int j = 0; j < scores[0].length; j++) {
//			sum = 0;
//			for(int i = 0; i < scores.length; i++) {
//				sum += scores[i][j];
//			}
//			courAvg[j] = (double)sum / scores.length;
//		}
//
////		String cour = "���� ���� ��ȸ ���� ����";
//		String[] courName = {"����", "����", "��ȸ", "����", "����"};
//		for(int i = 0; i < courAvg.length; i++) {
//			System.out.printf("%s ���� ���: %.2f��\n", courName[i], courAvg[i]);
//		}
//		
//		// Q4. ���� �ְ� ���� ���� �л� ��ȣ, ���� ���
//		// scores.length: ���� ���� (�л� ��)
//		// scores[0].length: ���� ���� (���� ��)
//		int[] courMax = new int[scores[0].length];
//		// ���� �ְ� ������ ���� �л� ����
//		int[] courMaxIndex = new int[scores[0].length];
//		// ���� �ְ� ������ ���� �л� �ε��� ��ȣ
//		
//		for(int j = 0; j < scores[0].length; j++) { // ������ ���鼭
//			courMax[j] = scores[0][j]; 
//			// j��° ���񿡼� �ִ� ���� ���� (�ʱⰪ: 0��° �л� ���� �ִ� ����)
//			courMaxIndex[j] = 0;
//			// j��° ���񿡼� �ִ� ������ ���� �л� �ε��� ��ȣ ���� (�ʱⰪ: 0��° �л� ����)
//			for(int i = 1; i < scores.length; i++) { // �л��� ���鼭
//				if(courMax[j] < scores[i][j]) {
//					courMax[j] = scores[i][j];
//					courMaxIndex[j] = i;
//				}
//			}
//			System.out.printf("%s ���� ���� �ְ� ����: %d (�л� ��ȣ: %d)\n", 
//					courName[j], courMax[j], courMaxIndex[j]+1);
//		}
		
			
		
		// Q5. �� �迭�� ���Ұ� �������� Ȯ��
//		Arrays.deepEquals(arr1, arr2);
		// 1) �� �迭�� ���°� �������� Ȯ�� (���� ����, ���� ����)
		// 2) �� ����� ���Ұ� �������� Ȯ��
		int[][] arr1 = {{10, 30, 30}, {40, 50, 60}, {70, 80, 90}};
		int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		
		if(arr1.length != arr2.length) return; // ���� ���� �������� Ȯ��
		if(arr1[0].length != arr2[0].length) return; // ���� ���� �������� Ȯ��
		
		boolean isEquals = true; // �� �迭�� ���Ұ� ���ٰ� ����
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
//				if(arr1[i][j] == arr2[i][j]) {
//					isEquals = true;
//				}
//				else {
//					isEquals = false;
//					break;
//				}
				if(arr1[i][j] != arr2[i][j]) {
					isEquals = false;
					break; // ���� �ݺ����� ���� (1������ ����)
				}
			}
			// 1
			if(!isEquals) break; // �ܺ� �ݺ����� ���� (2������ ����)
		}
		System.out.println(isEquals ? "�� ����� �����ϴ�." : "�� ����� �ٸ��ϴ�.");
		// 2
		
		
		// Q6. �� �迭�� ���� ��� �����ϴ� �迭 (addArr)
		if(arr1.length != arr2.length) return; // ���� ���� �������� Ȯ��
		if(arr1[0].length != arr2[0].length) return; // ���� ���� �������� Ȯ��
		
		
		int[][] addArr = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < addArr.length; i++) {
			for(int j = 0; j < addArr[i].length; j++) {
				addArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		// ������ �迭 ���¿� �°� ���
		for(int i = 0; i < addArr.length; i++) {
			for(int j = 0; j < addArr[i].length; j++) {
				System.out.printf("%3d  ", addArr[i][j]); 
			}
			System.out.println(); // ����
		}
		
		// Q7. �� �迭�� ���� ��� �����ϴ� �迭 (subArr)
		if(arr1.length != arr2.length) return; // ���� ���� �������� Ȯ��
		if(arr1[0].length != arr2[0].length) return; // ���� ���� �������� Ȯ��
		
		int[][] subArr = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < subArr.length; i++) {
			for(int j = 0; j < subArr[i].length; j++) {
				subArr[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		// ������ �迭 ���¿� �°� ���
		for(int i = 0; i < subArr.length; i++) {
			for(int j = 0; j < subArr[i].length; j++) {
				System.out.printf("%3d  ", subArr[i][j]); 
			}
			System.out.println(); // ����
		}
		
		// Q8. ����ڿ��� ���� ����, ���� ���̸� �Է¹޾� ������ ���� 1���� �迭�� 2���� �迭�� �ٲ㺸����!
		int row = sc.nextInt(); // 3
		int col = sc.nextInt(); // 3
		int[] arr1d = new int[row * col];
		int[][] arr2d = new int[row][col];
		
		for(int i = 0; i < arr1d.length; i++) {
			arr1d[i] = i * 10;
		}
		for(int i = 0; i < arr1d.length; i++) {
			System.out.printf("%3d  ", arr1d[i]);
		}
		
		// 0 10 20 30 40 50 60 70 80
		System.out.println();
		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[0].length; j++) {
				arr2d[i][j] = arr1d[i * col + j];
			}
		}
		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[0].length; j++) {
				System.out.printf("%3d  ", arr2d[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
