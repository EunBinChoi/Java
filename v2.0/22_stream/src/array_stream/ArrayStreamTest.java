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

		// ���� �����Ϸ��� �ϴ� ���Ұ� �������� ��� ..
		// 1) range(start, end): int stream�� ���Ҹ� �����ϴ� �޼ҵ� (static �޼ҵ�)
		// start <= �迭 ���� < end

		// 2) rangeClosed(start, end): int stream�� ���Ҹ� �����ϴ� �޼ҵ� (static �޼ҵ�)
		// start <= �迭 ���� <= end
		IntStream.range(1, 3).forEach(n -> System.out.println(n));
		IntStream.rangeClosed(1, 3).forEach(n -> System.out.println(n));
		
		////////////////////////////////////////////////////////////

		// distinct(): �߰�ó�� �޼ҵ� (�ߺ� ���� ���)
		Arrays.stream(array).distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		// sorted(): �߰�ó�� �޼ҵ� (���� ���)
		int[] array2 = {4, 5, -1, -10, -20};
		
		// �������� ����
		Arrays.stream(array2).sorted().forEach(n -> System.out.println(n));
		System.out.println();
		// �������� ����
		Arrays.stream(array2)
		.map(n -> -n) // �����ϴ� �� ������������ �����ϱ� ���ؼ�
		.sorted()
		.map(n -> -n) // �����·� ����
		.forEach(n -> System.out.println(n));
		
		// cf)
		// a.sort(): a ��ü ���� (��ȯ���� ����)
		// a.sorted(): a�� ���ĵǴ� ���� �ƴϰ� a�� ���纻�� ���� ���纻 ���� ��ȯ (��ȯ�� ����)
		
		List<Member> list = new ArrayList<>();
		list.add(new Member("ȫ�浿", 30));
		list.add(new Member("���ڹ�", 20));
		list.add(new Member("��Ŭ��", 55));
		list.add(new Member("������", 35));
		list.add(new Member("�̱��", 25));
		
		// list�� sort (���� �������� ����)
		list.stream().sorted().forEach(m -> System.out.println(m));
		// Member m1 ~ m5
		// class cast exception: ((Comparable)m1).compareTo((Comparable)m2);
		
		// ��ü�� ���� ���ϴ� ���ο� ������� ���� => Comparator
		// ex) ���� �������� ����
		list.stream()
		.sorted(new Comparator<Member>() { // �͸� ��ü

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2) * -1;
			}
			
		})
		.forEach(m -> System.out.println(m));
		
		// Comparator�� Functional Interface�̱� ������ ���ٽ����� �ۼ� ����
		list.stream()
		.sorted((Member o1, Member o2) -> o1.compareTo(o2) * -1)
		.forEach(m -> System.out.println(m));
		
	}

}
