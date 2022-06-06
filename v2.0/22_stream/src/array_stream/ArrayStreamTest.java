package array_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import overview.Member;

public class ArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 20, 30, 40, 40, 50, 50 };

		// 만약 생성하려고 하는 원소가 연속적인 경우 ..
		// 1) range(start, end): int stream의 원소를 생성하는 메소드 (static 메소드)
		// start <= 배열 원소 < end

		// 2) rangeClosed(start, end): int stream의 원소를 생성하는 메소드 (static 메소드)
		// start <= 배열 원소 <= end
		IntStream.range(1, 3).forEach(n -> System.out.println(n));
		IntStream.rangeClosed(1, 3).forEach(n -> System.out.println(n));
		
		////////////////////////////////////////////////////////////

		// distinct(): 중간처리 메소드 (중복 제거 기능)
		Arrays.stream(array).distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		// sorted(): 중간처리 메소드 (정렬 기능)
		int[] array2 = {4, 5, -1, -10, -20};
		
		// 오름차순 정렬
		Arrays.stream(array2).sorted().forEach(n -> System.out.println(n));
		System.out.println();
		// 내림차순 정렬
		Arrays.stream(array2)
		.map(n -> -n) // 정렬하는 데 내림차순으로 정렬하기 위해서
		.sorted()
		.map(n -> -n) // 원상태로 복귀
		.forEach(n -> System.out.println(n));
		
		// cf)
		// a.sort(): a 자체 정렬 (반환값이 없음)
		// a.sorted(): a가 정렬되는 것이 아니고 a의 복사본을 만들어서 복사본 정렬 반환 (반환값 존재)
		
		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동", 30));
		list.add(new Member("김자바", 20));
		list.add(new Member("이클립", 55));
		list.add(new Member("이이이", 35));
		list.add(new Member("이길길", 25));
		
		// list를 sort (나이 오름차순 정렬)
		list.stream().sorted().forEach(m -> System.out.println(m));
		// Member m1 ~ m5
		// class cast exception: ((Comparable)m1).compareTo((Comparable)m2);
		
		// 객체가 알지 못하는 새로운 방법으로 정렬 => Comparator
		// ex) 나이 내림차순 정렬
		list.stream()
		.sorted(new Comparator<Member>() { // 익명 객체

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2) * -1;
			}
			
		})
		.forEach(m -> System.out.println(m));
		
		// Comparator는 Functional Interface이기 때문에 람다식으로 작성 가능
		list.stream()
		.sorted((Member o1, Member o2) -> o1.compareTo(o2) * -1)
		.forEach(m -> System.out.println(m));
		
	}

}
