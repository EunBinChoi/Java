package arrays_copy;

import java.util.Arrays;

public class ArraysCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �߸��� �迭�� ����
		int[] arr = {30, 40, 50, 60};
		int[] arrCopy = arr;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrCopy));
//		arrCopy[0] = 100;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arrCopy));
		
		// ��Ȯ�� �迭�� ����
//		arrCopy = new int[arr.length];
//		for(int i = 0; i < arrCopy.length; i++) {
//			arrCopy[i] = arr[i];
//		}
//		arrCopy[0] = 100;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arrCopy));
		
		arrCopy = new int[arr.length];
		arrCopy = Arrays.copyOf(arr, arr.length);
		arrCopy = Arrays.copyOfRange(arr, 0, arr.length); // 1 <=   < arr.length
//		arrCopy = 
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		// System.arraycopy(���� �迭, ���� �迭 ���� �ε���, ���� �迭, ���� �迭 ���� �ε���, ���� ����)
	}

}
