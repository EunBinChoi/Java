package stream_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		// list 요소 비어있음
		
//		double avg = list.stream()
//		.mapToInt(n -> n.intValue())
//		.average() // OptionalDouble
//		.getAsDouble(); // double
		// NoSuchElementException (OptionalDouble -> double)
		
		// OptionalXXX 클래스 (값이 있을 수도 있고 없을 수도 있는 클래스)
		// 만약 값이 없을 경우 디폴트 값을 지정
		
		// 1) isPresent()
		OptionalDouble opDbl = list.stream()
				.mapToInt(n -> n.intValue()) 
				// Stream<Integer> -> IntStream
				.average();
//		if(opDbl.isPresent()) {
//			System.out.println("평균 : " + opDbl.getAsDouble());
//		}
		opDbl.ifPresent(avg -> System.out.println(avg));
		// 값이 있을 때만 출력, 값이 없을 때는 출력 X
		
		
		// 2) orElse() (디폴트 값 지정)
		double avg = list.stream()
				.mapToInt(n -> n.intValue())
				.average()
				.orElse(0.0); // 값이 없을 때 디폴트 값: 0.0
		System.out.println(avg);

		
	}

}
