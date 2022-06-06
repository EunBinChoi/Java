package stream_aggregate;

import java.util.Arrays;
import java.util.stream.*;

public class AggregateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5};
		
		// 1. 2�� ��� ���� (filter(), count())
		// long count()
		IntStream intStream = Arrays.stream(arr);
		long count = intStream.filter(m -> m % 2 == 0).count();
		System.out.println("2�� ��� ���� : " + count + "��");
		
		
		// 2. Ȧ���� �� (filter(), sum())
		// long sum()
		intStream = Arrays.stream(arr);
		long sum = intStream.filter(m -> m % 2 != 0).sum();
		System.out.println("ȫ���� �� : " + sum);
		
		
		// 3. Ȧ���� ��� (filter(), average())
		// OptionalXXX average()
		// average().getAsDouble()
		intStream = Arrays.stream(arr);
		double avg = intStream.filter(m -> m % 2 != 0)
				.average()
				.getAsDouble();
		System.out.println("Ȧ���� ��� : " + avg);
		
		// 4. �ִ� (max(), getAsInt())
		intStream = Arrays.stream(arr);
		int max = intStream.max().getAsInt();
		System.out.println("�ִ� : " + max);
		
		// 5. �ּڰ� (min(), getAsInt())
		intStream = Arrays.stream(arr);
		int min = intStream.min().getAsInt();
		System.out.println("�ּڰ� : " + min);
		
		// 6. ù��° ¦�� (filter(), findFirst(), getAsInt())
		intStream = Arrays.stream(arr);
		int first = intStream.filter(n -> n % 2 == 0)
				.findFirst().getAsInt();
		System.out.println("ù��° ¦�� : " + first);
		
	}

}
