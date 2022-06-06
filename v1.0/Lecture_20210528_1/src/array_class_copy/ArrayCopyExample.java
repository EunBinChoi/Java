package array_class_copy;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		// ��� 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.toString(arr2));
		/*
		 * "[�� 1, �� 2 ...]"
		 * */
		
		// ��� 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(arr1 == arr3);
		System.out.println(arr2 == arr3);
		System.out.println(Arrays.toString(arr3));
		
		/*
		 * Arrays Ŭ������ copyOf(), copyOfRange() �Լ���
		 * ���ο� ������ �Ҵ� (������ �ּҰ� �ٸ�)
		 * 
		 * */
		
		// ��� 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// System.arraycopy
		// (���� �迭, ���� ���� �ε���, Ÿ�� �迭, Ÿ�� �迭 �ε���, ���� ����)
		
		System.out.println(Arrays.toString(arr4));
	}

}
