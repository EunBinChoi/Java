package array_review;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
		/*
		 * ������ Ÿ��
		 * - �⺻ Ÿ��: int, double, float, char, boolean ..
		 * - ���� Ÿ��: �迭, String, Ŭ���� ..
		 * 	(�������� �ּҰ��� ��� ����)
		 * 
		 * �迭: "������ �ڷ���"�� ���� �̸����� �����ϰ� ���� ��
		 * cf) String, int, double �׷��� => Ŭ������ ��ü
		 * 
		 * ex) int[] scores = new int[40]; // �迭�� ũ��
		 * 
		 * scores[0] // 0��° ���� ~ scores[39] // 39��° ����
		 * scores (�迭 �̸�): �ּҰ� (scores[0]�� �ּҰ�)
		 * 
		 * scores1, scores2, scores3, scores4, scores5
		 * 
		 * 
		 * */
		
		// 1. 5���� ������ �Է¹޾� �迭�� �����ϰ� 
		// 5���� ���� ����� ���ϴ� ���α׷�
		
		// 2. ���� �߿� �ִ�, �ּڰ��� ���ϴ� ���α׷�
		
		// 3. ���� �߿� top 3�� ���ϴ� ���α׷�
		// (�л��� ���� �߿� ������ ������ ���ٰ� ����)
		
		// 4. 90�� �̻� => 'A'
		//    80�� �̻� => 'B'
		//    70�� �̻� => 'C'
		//    60�� �̻� => 'D'
		//    �̿� ���� =>  'F'
		// �Ǵ��ϴ� ���α׷��� �ۼ��ϰ�
		// A ~ F ������ ���� �л��� ���� �� ������ ����Ͻÿ�.
		
		
	//	final int STUDENT = 5;
//		
//		// 1. new ����ϴ� ���
	//	int[] scores = new int[STUDENT];
//		
//		
//		// 2. �迭�� �������ڸ��� �����͸� �ʱ�ȭ�ϴ� ��� (new ��� x)
//		// {}�� �̿��ϼż� �����͸� �ʱ�ȭ�� �� ����
//		// �����Ͱ� �������ִ� ��� (�Էº��� x)
//		String[] month = {"jan", "feb", "mar"};
//		month[0] = "Jan";
//		
//		// for-each ����
////		for(String str : month) {
////			System.out.println(str);
////		}
//		
		Scanner input = new Scanner(System.in);
////		scores[0] = 10;
////		scores[1] = 20;
////		scores[2] = 30;
////		scores[3] = 40;
////		scores[4] = 50;
////		score
//		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.printf("�л� %d�� ������ �Է��Ͻÿ�: ", i);
//			scores[i] = input.nextInt();
//		}
////		System.out.println(scores[0]);
////		System.out.println(scores[3]);
////		System.out.println(scores[5]);
////		System.out.println(scores[10]); // 0 ~ 9
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//		// scores �������� �հ�, ���
//		int sum = 0;
//		for(int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("�հ� : " + sum);
//		System.out.println("��� : " + (double)sum / scores.length);
//	
//		// �迭�� ���� ����
//		// 1  2  3  4  5
//		// 10 20 30 40 50
//		int grade, total = 0;
//		for(int i = 0; i < STUDENT; i++) {
//			System.out.print("�л��� ������ �Է��Ͻÿ� : ");
//			grade = input.nextInt();
//			total += grade;
//		}
//		//System.out.println(grade);
//		
//		System.out.println("�հ� : " + total);
//		System.out.println("��� : " + (double)total / STUDENT);
//	
		// �ζ� �ڵ� ������
		// 6�� 1 ~ 45
//		int[] lotto = new int[6];
//		// lotto[0] ~ lotto[5]
//		// Math.random() 
//		// Math, Random
//		// Ŭ���� = ������ + �Լ�
//		// Ŭ���� �̸�.�Լ� �̸�
//		// ���� 1
//		for(int i = 0; i < lotto.length; i ++) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//			System.out.println(lotto[i]);
//		}
//		
//		// ���� 2
//		// �����͸� 0 ~ lotto.length-1 �Ҵ����ְ�
//		for(int i = 0; i < lotto.length; i ++) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//		}
//		// �Ѳ����� ���
//		for(int i = 0; i < lotto.length; i ++) {
//			System.out.println(lotto[i]);
//		}
//		
//		// �� ���ҳ��� ����, ������ ����� �迭�� �����ϰ� �̸� ������ּ���!
//		int[] a = {10, 20, 30};
//		int[] b = {30, 40, 50};
//		int[] add = new int[a.length];
//		int[] sub = new int[a.length];
//		
//		for(int i = 0; i < a.length; i ++) {
//			add[i] = a[i] + b[i];
//			sub[i] = a[i] - b[i];
//		}
//		
//		for(int i = 0; i < a.length; i ++) {
//			System.out.printf("add[%d] = %d\n", i, add[i]);
//		}
//		
//		for(int i = 0; i < a.length; i ++) {
//			System.out.printf("sub[%d] = %d\n", i, sub[i]);
//		}
		
		
		// ������ �迭
//		int[][] scores = new int[3][5];
//		Scanner input = new Scanner(System.in);
//		String[] subject = {"����", "����", "��ȸ", "����", "����"};
//		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.printf("=== �л� %d ���� �Է� ===\n", i);
//			
//			for(int j = 0; j < scores[i].length; j++) {
//				System.out.printf("%s ������ ������ �Է��Ͻÿ� : ", 
//						subject[j]);
//				scores[i][j] = input.nextInt();
//			}
//		}
		
		int row, col;
		System.out.print("�� �Է� : ");
		row = input.nextInt();
		
		System.out.print("�� �Է� : ");
		col = input.nextInt();
		
//		int[] arr_1d = new int[row * col];
//		int[][] arr_2d = new int[row][col];
//		
//		for(int i = 0; i < row * col; i ++) {
//			arr_1d[i] = i + 1;
//		}
//		for(int i = 0; i < row * col; i ++) {
//			System.out.println(arr_1d[i]);
//		}
		// arr_1d ���� �̿��ؼ� => arr_2d �ٲ㺸����
		
		
		
		// �� ������ �迭 (arr1, arr2)�� ��
		// 1. arr1.length == arr2.length
		//    arr1[0].length == arr2[0].length
		
		// 2. ������ ���빰�� �����ؾ���
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		// arr1 ������ �ʱ�ȭ
		// ���� ����
		for(int i = 0; i < arr1.length; i++) {
			// ���� ����
			for(int j = 0; j < arr1[i].length; j ++) {
				arr1[i][j] = i + j;
			}
		}
		// arr2 ������ �ʱ�ȭ
		// ���� ����
		for(int i = 0; i < arr2.length; i++) {
			// ���� ����
			for(int j = 0; j < arr2[i].length; j ++) {
				arr2[i][j] = i + j;
			}
		}
		
		// �迭 ��
		System.out.println(arr1 == arr2); 
		// �迭 �̸����� �� (�ּҰ��� ��)
		
		// 1. �迭�� ���빰���� ��
		// �� �迭�� �������� ��
		// boolean compare(int[][] arr1, int[][] arr2)
		
		// ���� ������
		System.out.println(compare(arr1, arr2) ? 
				"�����ϴ�" : "�ٸ��ϴ�");
		
		
		// 2. �� �迭�� ���� (addArray), ���� (subArray)�� �� ��� ����
		// int[][] add(int[][] arr1, int[][] arr2)
		// int[][] sub(int[][] arr1, int[][] arr2)
		
		int[][] resAdd = addArray(arr1, arr2);
		if(resAdd == null) {
			System.out.println("���� �Ұ���!!");
		}
		else {
			for(int i = 0; i < resAdd.length; i ++) {
				for(int j = 0; j < resAdd[i].length; j ++) {
					System.out.printf("resAdd[%d][%d] = %d \n",
							i, j, resAdd[i][j]);
				}
			}
		}
		System.out.println();
		
		
		int[][] resSub = subArray(arr1, arr2);
		if(resSub == null) {
			System.out.println("���� �Ұ���!!");
		}
		else {
			for(int i = 0; i < resSub.length; i ++) {
				for(int j = 0; j < resSub[i].length; j ++) {
					System.out.printf("resSub[%d][%d] = %d \n",
							i, j, resSub[i][j]);
				}
			}
		}
		System.out.println();
		
		
		int[][] resMul = mulArray(arr1, arr2);
		if(resMul == null) {
			System.out.println("���� �Ұ���!!");
		}
		else {
			for(int i = 0; i < resMul.length; i ++) {
				for(int j = 0; j < resMul[i].length; j ++) {
					System.out.printf("resMul[%d][%d] = %d \n",
							i, j, resMul[i][j]);
				}
			}
		}
		
		// 3. �� �迭�� ���� (mulArray)�� ��� ���� (**)
		// int[][] mul(int[][] arr1, int[][] arr2)
		// (2 x 3)(3 x 2) => (2 x 2)
	
	}
	
	// 1. �� ����� ���� ���̿� ���� ���̰� ���� ���ƾ� ��
	// 2. �� ����� ���빰 (���Ұ�)�� ������ Ȯ��
	public static boolean compare(int[][] arr1, int[][] arr2) {
		// ����� ���� ��
		if(arr1.length != arr2.length 
				|| arr1[0].length != arr2[0].length) 
			return false;
		
		// ����� ���빰 ��
		for(int i = 0; i < arr1.length; i ++) { 
			// arr1.length == arr2.length (��)
			for(int j = 0; j < arr1[i].length; j ++) {
				// arr1[i].length == arr2[i].length (���� ����)
				
				// arr1[0].length == arr2[0].length (���� ����)
				// arr1[1].length == arr2[1].length (���� ����)
				// arr1[2].length == arr2[2].length (���� ����)
				if(arr1[i][j] != arr2[i][j]) return false;
			}
		}
		
		return true;
		
	}
	public static int[][] addArray(int[][] arr1, int[][] arr2){
		// ����� ���� ��
		if(arr1.length != arr2.length 
				|| arr1[0].length != arr2[0].length) 
			return null; // ���� �Ұ���
		
		// 3 x 4 3 x 4 ==> 3 x 4
		int[][] resArr = new int[arr1.length][arr1[0].length]; 
		// ������� ?
		for(int i = 0; i < arr1.length; i ++) {
			for(int j = 0; j < arr1[0].length; j ++) {
				resArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return resArr;
	}
	// sub: subtract 
	public static int[][] subArray(int[][] arr1, int[][] arr2){
		// ����� ���� ��
		if(arr1.length != arr2.length 
				|| arr1[0].length != arr2[0].length) 
			return null; // ���� �Ұ���
		
		// 3 x 4 3 x 4 ==> 3 x 4
		int[][] resArr = new int[arr1.length][arr1[0].length]; 
		// ������� ?
		for(int i = 0; i < arr1.length; i ++) {
			for(int j = 0; j < arr1[0].length; j ++) {
				resArr[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		return resArr;
	}
	public static int[][] mulArray(int[][] arr1, int[][] arr2){
		// A�� ���� ���� == B�� ���� ���� ������ ������!
		if(arr1[0].length != arr2.length) 
			return null; // ���� �Ұ���
		
		// (3 x 4) x (4 x 3) -> (3 x 3)
		
		int[][] resArr = new int[arr1.length][arr2[0].length];
		
		// A�� ���� ���̸�ŭ �ݺ� (��� �迭�� ���� ����)
		for(int i = 0; i < arr1.length; i++) {
			
			// B�� ���� ���̸�ŭ �ݺ� (��� �迭�� ���� ����)
			for(int j = 0; j < arr2[0].length ; j++) {
				
				// A�� ���� ���� == B�� ���� ���̸�ŭ �ݺ�
				for(int k = 0; k < arr1[0].length ; k++) {
					resArr[i][j] += (arr1[i][k] * arr2[k][j]); 
				}
			}
		}
		
		return resArr;
	}
}
