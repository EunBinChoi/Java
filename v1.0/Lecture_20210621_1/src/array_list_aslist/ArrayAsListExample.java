package array_list_aslist;

import java.util.*;

public class ArrayAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays.asList() => Arrays => List
		List<String> list1 
		= Arrays.asList("ȫ�浿", "ȫ���", "���ڹ�"); // ���� ��ü
		//list1.add("������"); 
		// why ? List Ŭ������ add �Լ��� abstract
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 
		= Arrays.asList(1, 2, 3);  // ���� ��ü
		
		for(int value : list2) {
			System.out.println(value);
		}
		
	}

}
