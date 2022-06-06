package stream_mapping;

import java.util.*; // �÷��� ������ ��
import java.util.stream.*; // ��Ʈ�� ������ ��

public class MappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = {1, 2, 3, 4, 5};
		// 1) int -> double
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream() 
		// int -> double ��� ��ȯ�ؼ� DoubleStream ���� (����)
		.forEach(d -> System.out.println(d));
		System.out.println();
		
		// 2)
		// boxing (int -> Integer)
		intStream = Arrays.stream(intArray);
		intStream.boxed() 
		// int -> Integer �ڽ��ؼ� ��Ʈ�� (Stream<Integer>) ���� (����)
		.forEach(d -> System.out.println(d));
		// �ּҰ� ������ �ʴ� ������ Integer Ŭ������ toString() ����
		
	}

}
