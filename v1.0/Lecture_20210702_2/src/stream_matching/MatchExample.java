package stream_matching;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��� ��Ұ� ¦������ Ȯ���ϴ� ���α׷�
		int[] intArr = {2, 4, 6, 8, 10};
		
		boolean res = 
				Arrays.stream(intArr).allMatch(a -> a % 2 == 0);
		System.out.println(res);
		
		
		// 1. �ϳ��� Ȧ���� �ִ��� Ȯ�� (anyMatch())
		res = Arrays.stream(intArr).anyMatch(a -> a % 2 != 0);
		System.out.println(res);
		
		// 2. ��� 20�� ����� �ƴ��� Ȯ�� (noneMatch())
		res = Arrays.stream(intArr).noneMatch(a -> a % 20 == 0);
		System.out.println(res);
		
		
	}

}
