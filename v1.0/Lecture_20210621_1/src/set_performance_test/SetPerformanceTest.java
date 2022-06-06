package set_performance_test;

import java.util.*;

public class SetPerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> sHashSet = new HashSet<>();
		Set<String> sTreeSet = new TreeSet<>();
		Set<String> sLinkedHashSet = new LinkedHashSet<>();
		
		Set<Integer> iHashSet = new HashSet<>();
		Set<Integer> iTreeSet = new TreeSet<>();
		Set<Integer> iLinkedHashSet = new LinkedHashSet<>();
	
		// 1. �ߺ��� ���Ҹ� ���� ���
		System.out.println("[Duplicate Test]");
		duplicateTest(iHashSet);
		duplicateTest(iTreeSet);
		duplicateTest(iLinkedHashSet);
		System.out.println();
		
		// 2. ���� ���� ����
		System.out.println("[Sort Test]");
		sortTest(iHashSet);
		sortTest(iTreeSet);
		sortTest(iLinkedHashSet);
		System.out.println();
		
		// 3. ���� ����
		System.out.println("[Add Test]");
		addTest(sHashSet);
		addTest(sTreeSet);
		addTest(sLinkedHashSet);
		System.out.println();
		
		// 4. ���� �˻�
		System.out.println("[Search Test]");
		searchTest(sHashSet);
		searchTest(sTreeSet);
		searchTest(sLinkedHashSet);
		System.out.println();
		
		// 5. ���� ����
		System.out.println("[Remove Test]");
		removeTest(sHashSet);
		removeTest(sTreeSet);
		removeTest(sLinkedHashSet);
		System.out.println();
	
	}
	// 1. �Ű����� �� ���ϱ�
	public static void duplicateTest(Set<Integer> set) {
		int[] arr = {10, 10, 20, 20, 30, 30};
		for(int i : arr) {
			set.add(i);
		}
		System.out.println(set.getClass().getName() 
				+ ": " + set.toString());
	}
	
	public static void sortTest(Set<Integer> set) {
		int[] arr = {10, 20, 30, 40, 50, 80, 70, 60};
		for(int i : arr) {
			set.add(i);
		}
		System.out.println(set.getClass().getName() 
				+ ": " + set.toString());
	}
	
	public static void addTest(Set<String> set) {
		int size = 1000000;
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < size; i ++) {
			set.add("DATA" + i);
		}
		endTime = System.nanoTime();
		System.out.println(set.getClass().getName() 
				+ " ���� �߰� ���� �ӵ�: " 
				+ (endTime - startTime) + "ns");
	}
	public static void searchTest(Set<String> set) {
		int size = 1000000;
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < size; i ++) {
			set.contains("DATA" + i); // �˻�
		}
		endTime = System.nanoTime();
		System.out.println(set.getClass().getName() 
				+ " ���� �˻� ���� �ӵ�: " 
				+ (endTime - startTime) + "ns");
	}
	public static void removeTest(Set<String> set) {
		int size = 1000000;
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < size; i ++) {
			set.remove("DATA" + i);
		}
		endTime = System.nanoTime();
		System.out.println(set.getClass().getName() 
				+ " ���� ���� ���� �ӵ�: " 
				+ (endTime - startTime) + "ns");
	}
	
	// searchTest (contains())
	// removeTest (remove())

}
