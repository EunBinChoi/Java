package call_by_value_and_ref;

import java.util.Arrays;

public class CallByTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println(arr); // �ּҰ��� ���
		
		// for-each ����
		for(int i : arr) {
			System.out.println(i);
		}
		
		// for��
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		function_call_by_ref(arr); // �ּҰ��� ����
		// 1. �Լ��� ã��
		// 2. a = arr (�ּҰ��� ����)
		// 3. �Լ� ����
		// 4. ��ȯ���� ������ �� ��ȯ
		
		System.out.println(Arrays.toString(arr));
		
		int x = 10;
		int y = 20;
		System.out.println("x : " + x + ", y = " + y);
		function_call_by_value(x, y);
		// 1. �Լ��� ã��
		// 2. a = x, b = y; (������ �� ����)
		// 3. �Լ� ����
		// 4. ��ȯ���� ������ �� ��ȯ
		System.out.println("x : " + x + ", y = " + y);
	}
	// �ּҰ��� ����
	public static void function_call_by_ref(int[] a) {
		a[0] = 10;
	}
	// �����Ͱ��� ����
	// ���������� �ƴ� ��쿡 �����Լ��� ��ȯ�� ���� �˰� �Ϸ��� ?
	// return ���� ��� ��!
	// return a, b; (x)
	public static void function_call_by_value(int a, int b) {
		a = 20;
		b = 10;
	}

}
