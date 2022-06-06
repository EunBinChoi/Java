package array_list;

import java.util.*; // java.util ��Ű�� �ؿ� �ִ� ��� Ŭ������ ������ ��

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("��ü �� : " + list.size());
		System.out.println();
		
		list.add("JAVA"); // String ��ü ���� (�� ��������)
		list.add("ArrayList");
		list.add("Hello");
		// {"JAVA" ,"ArrayList", "Hello"};
		// {"JAVA" ,"ArrayList", "Collection", "Hello"};
		// {"JAVA" ,"ArrayList", "Collection", "Hello", "List"};
		list.add(2, "Collection"); // �ش� �ε����� ��ü ����
		list.add("List");
		print1(list);
		
		System.out.println();
		System.out.println("��ü �� : " + list.size());
		System.out.println();
		
		list.remove(2); // 2�� ��ü ����
		print1(list);
		System.out.println();
		
		System.out.println(list.get(2)); // 2�� ��ü ��ȯ
		System.out.println();
		
		list.remove("List");
		print1(list);
		
		
		// list�� ���ִ� ��ü ��� �Լ�
		// print1(ArrayList<String> li), print2(ArrayList<String> li)
		// print1: for�� (li.get(i))
		// print2: for-each����
		
		// ������ ���Ҹ� String[] arr = new String[10];
		String[] arr = new String[10];
		arr[0] = "JAVA";
		arr[1] = "ArrayList";
		arr[2] = "Hello";
		arr[2] = "Collection";
		arr[3] = "List";
		
		// add(String value, String[]) 
		// : �� ���� �߰�
		// add(int index, String value, String[]) 
		// : index�� �־��� ��ü �߰�
		// set(int index, String value, String[]) 
		// : index ��ġ�� ��ü ����
		// remove(int index, String[])
		// : index ��ġ�� ��ü ����
		// remove(String value, String[])
		// : �־��� ��ü ����
		// get(int index, String[])
		// : index ��ġ�� ��ü ��ȯ
	}
	
	// ������ !?!?!?!? (������, polymorphism)
	// 1) List<String>: ArrayList, Vector, LinkedList
	// List<String> li = new ArrayList<>();
	// List<String> li = new Vector<>();
	// List<String> li = new LinkedList<>();
	
	// class ArrayList implements List;
	// class Vector implements List;
	// class LinkedList implements List;
	// 2) ArrayList<String>
	
	
	public static void print1(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(i + " : " + list.get(i));
		}
	}
	public static void print2(ArrayList<String> list) {
		for(String str : list) {
			System.out.println(str);
		}
	}
}
