package arrays_equals;

import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2 }, { 3, 4 } };

		// arr.length == 3
		// arr[0].length == 2

		System.out.println(arr); // �ּҰ�
		System.out.println(arr[0]); // �ּҰ�
		System.out.println(arr[1]); // �ּҰ�
		System.out.println(arr[1][1]); // ���Ұ�

		// ���� ����
//		int[][] arrCopy = Arrays.copyOf(arr, arr.length);
		int[][] arrCopy = new int[arr.length][arr[0].length];
		for (int i = 0; i < arrCopy.length; i++) {
			arrCopy[i] = arr[i];
		}
		System.out.println(arr == arrCopy);
		System.out.println(arr[0] == arrCopy[0]); // true (�ּҰ��� ����)

		// ���� ����
//		int[][] arrCopy2 = Arrays.copyOf(arr, arr.length); // ���� ����
//		for(int i = 0; i < arrCopy2.length; i++) {
//			arrCopy2[i] = Arrays.copyOf(arr[i], arr[i].length); // ���Ұ� ����
//		}

		int[][] arrCopy2 = new int[arr.length][arr[0].length];
		for (int i = 0; i < arrCopy2.length; i++) {
			for (int j = 0; j < arrCopy2[0].length; j++) {
				arrCopy2[i][j] = arr[i][j];
			}
		}
		System.out.println(arr == arrCopy2);
		System.out.println(arr[0] == arrCopy2[0]); // false (�ּҰ��� �ٸ�)

		System.out.println(Arrays.equals(arr, arrCopy)); // ���� ���� (�ּҰ� ����)
		// arr[0] == arrCopy[0]
		// arr[1] == arrCopy[1]
		// arr[2] == arrCopy[2]

		System.out.println(Arrays.deepEquals(arr, arrCopy)); // ���� ���� (���밪 ����)
		// arr[0][0] == arrCopy[0][0]
		// arr[0][1] == arrCopy[0][1]
		// .....
		
		
		////////////////////////////////////////////////////////////////
		System.out.println(Arrays.equals(arr, arrCopy2)); // ���� ���� (�ּҰ� �ٸ�)
		// arr[0] != arrCopy2[0]
		// arr[1] != arrCopy2[1]
		// arr[2] != arrCopy2[2]
		System.out.println(Arrays.deepEquals(arr, arrCopy2)); // ���� ���� (���밪 ����)
		// arr[0][0] == arrCopy2[0][0]
		// arr[0][1] == arrCopy2[0][1]
		// .....

		System.out.println(arr.equals(arrCopy));
		// arr == arrCopy
		System.out.println(arr.equals(arrCopy2));
		// arr == arrCopy2

		///// Arrays fill()
		int[] arrFill = new int[5];
		Arrays.fill(arrFill, 100);
//		for(int i = 0; i < arrFill.length; i++) {
//			arrFill[i] = 100; 
//		}
		System.out.println(Arrays.toString(arrFill));
//		String res = "[";
//		for(int i = 0; i < arrFill.length; i++) {
//			if(i == arrFill.length-1) res += arrFill[i];
//			else res += arrFill[i] + ", ";
//		}
//		res += "]";
//		System.out.println(res);

		///// toString(), sort()
	}

}
