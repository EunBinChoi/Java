package array_stream;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class ArrayStreamExample {
	static int sum = 0; // ��������, ���� ���� (static)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[]
		String[] strArray = {"ȫ�浿", "ȫ���", 
				"���ڹ�", "ȫ����", "ȫ�浿"};
		// stream ����� forEach�� ���� ��� ���
		Stream<String> strStream1 = Arrays.stream(strArray);
		strStream1.forEach(s -> System.out.println(s));
		System.out.println(); // enter
		
		Stream<String> strStream2 = Arrays.stream(strArray);
		strStream2.filter(n -> n.startsWith("ȫ��"))
		.forEach(n -> System.out.println(n));
		System.out.println();
		// startsWith("ȫ")
		// charAt
		
		// distinct(): �ߺ� ���� �� ���͸�
		Stream<String> strStream3 = Arrays.stream(strArray);
		strStream3.distinct().filter(n -> n.charAt(0) == 'ȫ' 
				&& n.charAt(1) == '��')
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		Stream<String> strStream4 = Arrays.stream(strArray);
		strStream4.distinct().filter(n -> n.startsWith("ȫ��"))
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		
		// int[]
		int[] intArrays = {1, 2, 3, 4, 5};
		// stream ����� forEach�� ���� ��� ���
		IntStream intStream1 = Arrays.stream(intArrays);
		intStream1.forEach(s -> System.out.println(s));
		//int sum = 0; 
		// static���� �Ǿ���ϴ� ���� ..?
		// forEach() �Լ����� �˰� �ϱ� ����
		IntStream intStream2 = Arrays.stream(intArrays);
		intStream2.forEach(s -> sum += s);
		System.out.println("���� : " + sum);

		//IntStream.range(1, 5); // 1 <=    < 5
		//IntStream.rangeClosed(1, 5); // 1 <=     <= 5
		
		IntStream intStream3 = IntStream.rangeClosed(1, 5);
		intStream3.forEach(s -> sum += s);
		System.out.println("���� : " + sum);
		
		
	}

}
