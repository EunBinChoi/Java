package stream_sorted;

import java.util.*;
import java.util.stream.*;

public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ����� ���
		int[] intArray = {5, 3, 2, 1, 4};
		IntStream intStream = Arrays.stream(intArray);
		intStream.sorted() // �������� ����
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// String ����� ���
		String[] strArray = {"a", "ab", "aa", "abc"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.sorted() // �������� ���� (���� ����)
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println();
		
		// ��ü ����� ���
		// ��ü ���� (sorted() �Լ� �̿�)
		// ������ ũ�� (��ü ������) �� Arrays -> List�� �����ϰ� ���� ��
		List<Student> sList = Arrays.asList(
				new Student("ȫ�浿", 30),
				new Student("ȫ���", 10),
				new Student("��Ŭ��", 20)
				);
		
		// 1. ���̸� �������� sorted() (��������)
		sList.stream()
		.sorted() // Comparable �������̽��� Student ����
		.forEach(s -> System.out.println(s)); // toString()
		System.out.println();
		
		
		// 2-1. �̸��� �������� sorted(Comparator<T>)
		// class NameOrderComparator implements Comparator<Student>
		sList.stream()
		.sorted(new Comparator<Student>() { // ������ Ŭ���� ���� �ٷ� ����
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		}) // Comparable �������̽��� Student ����
		.forEach(s -> System.out.println(s)); // toString()
		System.out.println();
		
		// 2-2.
		sList.stream()
		// Functional Interface (�Լ��� �������̽�)
		.sorted((Student o1, Student o2) 
				-> o1.name.compareTo(o2.name)) // ������ Ŭ���� ���� �ٷ� ���� (���ٽ�)
		.forEach(s -> System.out.println(s)); // toString()
		System.out.println();
		
		
		// 2-3.
		sList.stream()
		.sorted(new NameOrderComparator()) // Ŭ���� ��ü ���� (�͸� ��ü) ���
		.forEach(s -> System.out.println(s)); // toString()
		
		System.out.println();
		
		
		// 2-4.
		NameOrderComparator newOrder 
		= new NameOrderComparator(); // ��ü ����
		sList.stream()
		.sorted(newOrder) // ��ü ����
		.forEach(s -> System.out.println(s)); // toString()
		
	}

}
