package overview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		// 만약 외부 반복자를 이용해서 홀수만 뽑고 출력
		for(int i = 0; i < list.size(); i++) {
			int ele = Integer.parseInt(list.get(i));
			if(ele % 2 == 1) {
				System.out.println(ele);
			}
		}
		
		// 스트림을 이용해서 홀수만 뽑고 출력 (함수형 프로그래밍)
		list.stream()
		.mapToInt(ele -> Integer.valueOf(ele)) // String -> int
		.filter(ele -> ele % 2 == 1)
		.forEach(s -> System.out.println(s));
		
		list.stream()
		.map(ele -> Integer.parseInt(ele)) // String -> Integer
		.filter(ele -> ele % 2 == 1)
		.forEach(s -> System.out.println(s));
		
		///////////////////////////////////////////////////////
		
		// 외부 반복자
		for(int i = 0; i < list.size(); i++) {
			String ele = list.get(i);
			System.out.println(ele);
		}
		
		// 외부 반복자 (for-each) 
		for(String ele : list) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		
		// 내부 반복자 (스트림)
		// 컬렉션의 원소들을 물의 흐름으로 간주하는 것
		// 컬렉션의 원소들을 시냇물에 던져놓음
		// 물에 흐름에 따라 원소들이 알아서 출력되는 형태
//		Stream<String> stream 
//		= list.stream();
		
		list.stream().forEach(ele -> System.out.println(ele));
		
		// 컬렉션에 원소들이 객체인 경우
		List<Member> list2 = new ArrayList<>();
		list2.add(new Member("홍길동", 30));
		list2.add(new Member("김자바", 30));
		list2.add(new Member("이클립", 30));
		
//		Stream<Member> stream2 = list2.stream();
		list2.stream().forEach(mem -> System.out.println(mem));
		
		// 객체들의 이름 성 출력 (홍, 김, 이)
		// 기존의 stream2은 사용하지 못함 
		// (이미 객체를 다 출력하기 위해서 한번 흘려버렸기 때문에)
//		stream2 = list2.stream(); // 다시 스트림 생성
//		stream2
		list2.stream().forEach(mem -> System.out.println(mem.getName().charAt(0)));
	
		// stream은 일회성 특징이 있기 때문에
		// stream을 만들자마자 소비해버릴 수도 있음
		list2
		.stream()
		.forEach(mem -> System.out.println(mem.getName().charAt(0)));
		
		// mem 매개변수에 member 객체가 아니라 
		// String (member.name)이 들어올 순 없을까?
		List<String> names = new ArrayList<>();
		
		list2
		.stream()
		.forEach(mem -> names.add(mem.getName()));
		
		names
		.stream()
		.forEach(name -> System.out.println(name.charAt(0)));
		
		// list.stream().a().b().forEach(); // function chaining
		// a(), b(): 중간 처리 메소드
		// forEach(): 최종 처리 메소드
	}

}
