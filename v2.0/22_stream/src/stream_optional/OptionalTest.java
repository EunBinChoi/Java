package stream_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		// list ��� �������
		
//		double avg = list.stream()
//		.mapToInt(n -> n.intValue())
//		.average() // OptionalDouble
//		.getAsDouble(); // double
		// NoSuchElementException (OptionalDouble -> double)
		
		// OptionalXXX Ŭ���� (���� ���� ���� �ְ� ���� ���� �ִ� Ŭ����)
		// ���� ���� ���� ��� ����Ʈ ���� ����
		
		// 1) isPresent()
		OptionalDouble opDbl = list.stream()
				.mapToInt(n -> n.intValue()) 
				// Stream<Integer> -> IntStream
				.average();
//		if(opDbl.isPresent()) {
//			System.out.println("��� : " + opDbl.getAsDouble());
//		}
		opDbl.ifPresent(avg -> System.out.println(avg));
		// ���� ���� ���� ���, ���� ���� ���� ��� X
		
		
		// 2) orElse() (����Ʈ �� ����)
		double avg = list.stream()
				.mapToInt(n -> n.intValue())
				.average()
				.orElse(0.0); // ���� ���� �� ����Ʈ ��: 0.0
		System.out.println(avg);

		
	}

}
