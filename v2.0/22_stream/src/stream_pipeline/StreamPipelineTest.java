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
		list.add(new Member("ȫ�浿", 30));
		list.add(new Member("���ڹ�", 20));
		list.add(new Member("��Ŭ��", 55));
		list.add(new Member("������", 35));
		list.add(new Member("�̱��", 25));

		// ex) member ��ü���� ��� ����
		// �߰�ó�� �޼ҵ�: ���͸�, ����, ����
		// ����ó�� �޼ҵ�: ���� (count, max, min, average, sum)

		double avg = list.stream().mapToInt(mem -> mem.getAge()).average().getAsDouble();
		System.out.println(avg);

		list.stream().filter(m -> m.getAge() <= 30).forEach(m -> System.out.println(m));
		System.out.println();

		// Q1. '��'�� ���� ���� ȸ���� ��� ����
		double leeAvg = list.stream()
				.filter(m -> m.getName().charAt(0) == '��')
				.peek(m -> System.out.println(m))
				// �߰�ó�� �޼ҵ尡 �� ������ �Ǿ����� Ȯ���ϰ� ���� ��
				// ���� ��Ʈ���� �ǵ����� �ʰ� ��Ʈ���� �Ⱦ �� �ִ� ���
				// peek (�߰�ó�� �޼ҵ�) vs forEach (����ó�� �޼ҵ�, pop)
				.mapToInt(m -> m.getAge()).average().getAsDouble();

		System.out.println(leeAvg);

		// Q2. '��'�� ���� ���� ȸ���� ���� �ִ밪
		int leeMax = list.stream()
				.filter(m -> m.getName().charAt(0) == '��')
				.mapToInt(m -> m.getAge())
				.max().getAsInt();
		System.out.println(leeMax);

		// Q3. '��'�� ���� ���� ȸ���� ���
		long leeCnt = list.stream()
				.filter(m -> m.getName().charAt(0) == '��')
				.mapToInt(m -> m.getAge())
				.count();
		System.out.println(leeCnt);

		
		///////////////////////////////////////////////////////////////////////
		// ���� ó�� �޼ҵ�
		// findFirst
		int first = IntStream
				.range(1, 10)
				.filter(n -> n % 2 == 0)
				.findFirst()
				.getAsInt();
		System.out.println(first);

		// findAny (����ó���� �ƴ� ���, findFirst�� ����)
		int any = IntStream.range(1, 10)
				.filter(n -> n % 2 == 0)
				.findAny()
				.getAsInt();
		System.out.println(any);
		System.out.println();

		// match
		// allMatch(���ǽ�): ��� ��ҵ��� ���ǿ� �����ϴ���?
		// anyMatch(���ǽ�): ��� �ϳ��� ��Ұ� ���ǿ� �����ϴ���?
		// noneMatch(���ǽ�): ��� ��ҵ��� ���ǿ� �������� �ʴ���?

		boolean allMatch = IntStream.range(1, 10).allMatch(n -> n <= 10);
		System.out.println(allMatch);

		boolean anyMatch = IntStream.range(1, 10).anyMatch(n -> n % 3 == 0);
		System.out.println(anyMatch);

		boolean noneMatch = IntStream.range(1, 10).noneMatch(n -> n % 20 == 0);
		System.out.println(noneMatch);
		System.out.println();

		// reduce
		// �����Ǵ� ���� �޼ҵ� (sum, average, count, max, min ...)
		// �����Ǵ� ���� �޼ҵ� �̿��� ������ ���� �޼ҵ带 ���� �� ������?
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
		// Q1. ���߿��� ���� �� ���ڿ��� ��ȯ�ϴ� �޼ҵ� (reduce �̿�)

		String longestWord = words.stream()
				.reduce((w1, w2) -> (w1.length() > w2.length()) ? w1 : w2)
				.get();
		// w1     w2
		// banana apple => banana
		// banana kiwi  => banana
		System.out.println(longestWord);
		System.out.println();

		// Q2. "banana", "apple", "kiwi" �ϳ��� ���ڿ��� join �޼ҵ� (reduce �̿�)
		String concatWord = words.stream()
				.reduce((w1, w2) -> w1 + " " + w2)
				.get();
		// w1              w2
		// banana          apple => banana apple
		// banana apple    kiwi  => banana apple kiwi
		System.out.println(concatWord);
		System.out.println();

		///////////////////////////////////////////////////////

		// 1) ��� �빮�ڷ� join
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

		// 2) ��� �ҹ��ڷ� join
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

		// 3) ù ���ڸ� �ҹ��ڷ� �ϰ� ������ ���ڴ� �빮�ڷ� join
		// ex) bANANA aPPLE kIWI
		concatWord = words.stream()
				.map(m -> m.substring(0, 1).toLowerCase() 
						+ m.substring(1, m.length()).toUpperCase())
				.reduce((w1, w2) -> w1 + " " + w2).get();
		System.out.println(concatWord);
		System.out.println();
		
		/////////////////////////////////////////////////////
		
		// collect
		// �߰�ó���� ��ҵ��� �÷��ǿ� �����ϴ� ���� ó�� �޼ҵ�
	
		// Student class ��ü 3�� ArrayList�� �߰�
		// ȫ���� ���� SENIOR
		// ���̾� ���� SENIOR
		// ���̳� ���� JUNIOR
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("ȫ����", Gender.FEMALE, Grade.SENIOR));
		stuList.add(new Student("���̾�", Gender.MALE, Grade.SENIOR));
		stuList.add(new Student("���̳�", Gender.FEMALE, Grade.JUNIOR));
		
		// Q1. Grade�� SENIOR�� ��ü�� ���͸��ؼ� ��� ����
		List<Student> seniorStu = stuList.stream()
		.filter(s -> s.getGrade() == Grade.SENIOR)
		.collect(Collectors.toList());
		System.out.println(seniorStu);
		
		// Q2. Gender�� MALE�� ��ü�� ���͸��ؼ� ��� ����
		List<Student> maleStu = stuList.stream()
		.filter(s -> s.getGender() == Gender.MALE)
		.collect(Collectors.toList());
		System.out.println(maleStu);
		
		// Q3. stuList2�� ������ � �� �ִ��� ����
		List<Student> stuList2 = new ArrayList<>();
		stuList2.add(new Student("ȫ����", Gender.FEMALE, Grade.SENIOR));
		stuList2.add(new Student("���̳�", Gender.FEMALE, Grade.JUNIOR));
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
