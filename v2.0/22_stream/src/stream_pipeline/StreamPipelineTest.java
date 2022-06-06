package stream_pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import overview.Member;
import stream_pipeline.Student.Gender;
import stream_pipeline.Student.Grade;

public class StreamPipelineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동", 30));
		list.add(new Member("김자바", 20));
		list.add(new Member("이클립", 55));
		list.add(new Member("이이이", 35));
		list.add(new Member("이길길", 25));

		// ex) member 객체들의 평균 나이
		// 중간처리 메소드: 필터링, 매핑, 정렬
		// 최종처리 메소드: 집계 (count, max, min, average, sum)

		double avg = list.stream().mapToInt(mem -> mem.getAge()).average().getAsDouble();
		System.out.println(avg);

		list.stream().filter(m -> m.getAge() <= 30).forEach(m -> System.out.println(m));
		System.out.println();

		// Q1. '이'씨 성을 가진 회원의 평균 나이
		double leeAvg = list.stream()
				.filter(m -> m.getName().charAt(0) == '이')
				.peek(m -> System.out.println(m))
				// 중간처리 메소드가 잘 수행이 되었는지 확인하고 싶을 때
				// 기존 스트림은 건들이지 않고 스트림을 훑어볼 수 있는 기능
				// peek (중간처리 메소드) vs forEach (최종처리 메소드, pop)
				.mapToInt(m -> m.getAge()).average().getAsDouble();

		System.out.println(leeAvg);

		// Q2. '이'씨 성을 가진 회원의 나이 최대값
		int leeMax = list.stream()
				.filter(m -> m.getName().charAt(0) == '이')
				.mapToInt(m -> m.getAge())
				.max().getAsInt();
		System.out.println(leeMax);

		// Q3. '이'씨 성을 가진 회원의 명수
		long leeCnt = list.stream()
				.filter(m -> m.getName().charAt(0) == '이')
				.mapToInt(m -> m.getAge())
				.count();
		System.out.println(leeCnt);

		
		///////////////////////////////////////////////////////////////////////
		// 최종 처리 메소드
		// findFirst
		int first = IntStream
				.range(1, 10)
				.filter(n -> n % 2 == 0)
				.findFirst()
				.getAsInt();
		System.out.println(first);

		// findAny (병렬처리가 아닌 경우, findFirst와 같음)
		int any = IntStream.range(1, 10)
				.filter(n -> n % 2 == 0)
				.findAny()
				.getAsInt();
		System.out.println(any);
		System.out.println();

		// match
		// allMatch(조건식): 모든 요소들이 조건에 만족하는지?
		// anyMatch(조건식): 적어도 하나의 요소가 조건에 만족하는지?
		// noneMatch(조건식): 모든 요소들이 조건에 만족하지 않는지?

		boolean allMatch = IntStream.range(1, 10).allMatch(n -> n <= 10);
		System.out.println(allMatch);

		boolean anyMatch = IntStream.range(1, 10).anyMatch(n -> n % 3 == 0);
		System.out.println(anyMatch);

		boolean noneMatch = IntStream.range(1, 10).noneMatch(n -> n % 20 == 0);
		System.out.println(noneMatch);
		System.out.println();

		// reduce
		// 지원되는 집계 메소드 (sum, average, count, max, min ...)
		// 지원되는 집계 메소드 이외의 나만의 집계 메소드를 만들 수 없을까?
		int reduce = IntStream.rangeClosed(1, 3).reduce((a, b) -> a - b).getAsInt();
		System.out.println(reduce);
		System.out.println();

		// => 1 - 2 - 3 == -4

		/*
		 * a b 
		 * 1 2 -> -1 
		 * -1 3 -> -4
		 */

		List<String> words = Arrays.asList("banana", "apple", "kiwi");
		// Q1. 이중에서 가장 긴 문자열을 반환하는 메소드 (reduce 이용)

		String longestWord = words.stream()
				.reduce((w1, w2) -> (w1.length() > w2.length()) ? w1 : w2)
				.get();
		// w1     w2
		// banana apple => banana
		// banana kiwi  => banana
		System.out.println(longestWord);
		System.out.println();

		// Q2. "banana", "apple", "kiwi" 하나의 문자열로 join 메소드 (reduce 이용)
		String concatWord = words.stream()
				.reduce((w1, w2) -> w1 + " " + w2)
				.get();
		// w1              w2
		// banana          apple => banana apple
		// banana apple    kiwi  => banana apple kiwi
		System.out.println(concatWord);
		System.out.println();

		///////////////////////////////////////////////////////

		// 1) 모두 대문자로 join
		concatWord = words.stream()
				.reduce((w1, w2) -> w1.toUpperCase() + " " + w2.toUpperCase())
				.get();
		System.out.println(concatWord);
		System.out.println();

		concatWord = words.stream()
				.map(m -> m.toUpperCase())
				.reduce((w1, w2) -> w1 + " " + w2)
				.get();
		System.out.println(concatWord);
		System.out.println();

		// 2) 모두 소문자로 join
		concatWord = words.stream()
				.reduce((w1, w2) -> w1.toLowerCase() + " " + w2.toLowerCase())
				.get();
		System.out.println(concatWord);
		System.out.println();

		concatWord = words.stream()
				.map(m -> m.toLowerCase())
				.reduce((w1, w2) -> w1 + " " + w2)
				.get();
		System.out.println(concatWord);
		System.out.println();

		// 3) 첫 문자만 소문자로 하고 나머지 문자는 대문자로 join
		// ex) bANANA aPPLE kIWI
		concatWord = words.stream()
				.map(m -> m.substring(0, 1).toLowerCase() 
						+ m.substring(1, m.length()).toUpperCase())
				.reduce((w1, w2) -> w1 + " " + w2).get();
		System.out.println(concatWord);
		System.out.println();
		
		/////////////////////////////////////////////////////
		
		// collect
		// 중간처리된 요소들을 컬렉션에 수집하는 최종 처리 메소드
	
		// Student class 객체 3명 ArrayList에 추가
		// 홍현희 여성 SENIOR
		// 제이쓴 남성 SENIOR
		// 김이나 여성 JUNIOR
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("홍현희", Gender.FEMALE, Grade.SENIOR));
		stuList.add(new Student("제이쓴", Gender.MALE, Grade.SENIOR));
		stuList.add(new Student("김이나", Gender.FEMALE, Grade.JUNIOR));
		
		// Q1. Grade가 SENIOR인 객체만 필터링해서 결과 저장
		List<Student> seniorStu = stuList.stream()
		.filter(s -> s.getGrade() == Grade.SENIOR)
		.collect(Collectors.toList());
		System.out.println(seniorStu);
		
		// Q2. Gender가 MALE인 객체만 필터링해서 결과 저장
		List<Student> maleStu = stuList.stream()
		.filter(s -> s.getGender() == Gender.MALE)
		.collect(Collectors.toList());
		System.out.println(maleStu);
		
		// Q3. stuList2에 성별이 어떤 게 있는지 저장
		List<Student> stuList2 = new ArrayList<>();
		stuList2.add(new Student("홍현희", Gender.FEMALE, Grade.SENIOR));
		stuList2.add(new Student("김이나", Gender.FEMALE, Grade.JUNIOR));
		Set<Gender> stuGenderSet = stuList2.stream()
		.map(stu -> stu.getGender())
		.collect(Collectors.toSet());
		System.out.println(stuGenderSet);
		
		// Collectors.toList()
		// Collectors.toSet()
		// Collectors.toMap()
		// Collectors.toCollection(HashSet, LinkedList, Vector ....)
	}

}
