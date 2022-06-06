package set_simple_example;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		// �������̽��� ���, �߻� �޼ҵ�
		
		set.add("Java");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript");
		set.add("Java"); // �ߺ� 
		
		int size = set.size();
		System.out.println("��ü�� : " + size);
		
		// �ݺ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			// \t: tab ��ŭ ����
		}
		
		//set.remove(3); 
		// ? �ε��� ������ ��� �ε����� ���� ���� �Ұ�
		set.remove("JavaScript");
		set.remove("HTML");
		
		size = set.size();
		System.out.println("��ü�� : " + size);
		
		// �ݺ���
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			// \t: tab ��ŭ ����
		}
		
		System.out.println(set.contains("HTML"));
		set.clear(); // ��ü ����
		
		// �ݺ���
		size = set.size();
		System.out.println("��ü�� : " + size);
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			// \t: tab ��ŭ ����
		}
		System.out.println(set.isEmpty() ? 
				"�������" : "������� ����");
	}
}
