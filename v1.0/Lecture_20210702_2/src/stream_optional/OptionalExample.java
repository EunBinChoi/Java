package stream_optional;

import java.util.*;
import java.util.stream.*;


public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		// list�� ��Ұ� �������
		
		// list�� ��Ұ� ������� ��� average() �Լ� ����
//		double avg = list.stream().mapToInt(s -> s.intValue())
//				.average().getAsDouble();
//				// Integer (��ü) ->  int (�����ڷ���)
//		System.out.println(avg);
//		// NoSuchElementException: list�ȿ� ó���� ��Ұ� ����
//		System.out.println("Hello!"); // 
		
		
		// OptionalDouble average()
		// ��Ұ� ���� ��� ����Ʈ �� ������ �� ����
		
		// ��� 1 (isPresent())
		// (OptionalDouble 
		// (isPresent(), ifPresent(), orElse()) -> double) 
		OptionalDouble op1
		= list.stream().mapToInt(s -> s.intValue()).average();
		if(op1.isPresent()) { // OptionalDouble�� isPresent() �� �ִ��� Ȯ��
			System.out.println("��� : " + op1.getAsDouble());
		}
		else {
			System.out.println("��� : 0.0");
		}
		
		// ��� 2 (orElse())
		double avg
		= list.stream().mapToInt(s -> s.intValue())
		.average().orElse(0.0); // ��Ұ��� ���� ��� ����Ʈ �� ����
		System.out.println("��� : " + avg);
		
		// ��� 3 (ifPresent(DoubleConsumer // ��Ҹ� �Һ��ϴ� �ڵ�))
		list.stream().mapToInt(s -> s.intValue())
		.average()
		.ifPresent(a -> System.out.println("��� : " + a));
		// ���� ���� ���� ��� ��ü�� X
		// ���� ���� ���� ��� �Һ� �ڵ带 ���� �Һ���
		
	}

}
