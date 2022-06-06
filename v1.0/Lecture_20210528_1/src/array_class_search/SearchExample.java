package array_class_search;

import java.util.Arrays;
public class SearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �迭 �׸񿡼� Ư�� ���� ��ġ�� �ε����� ��� ���� �迭 �˻�
		 * �迭 �׸��� �˻��Ϸ��� 
		 * 1) Arrays.sort() �������� ����
		 * 2) Arrays.binarySearch()
		 * 
		 * 
		 * */
		
		// int[] �迭 �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("�˻��� �ε��� : " + index);
		System.out.println();
		
		// ���ڿ� �迭 �˻�
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("�˻��� �ε��� : " + index);
		System.out.println();
		
		// ��ü �迭 �˻�
		/*
		 * ����
		 * 1) ������ ���� �л�
		 * 2) id�� ���� �л�
		 * 
		 * m2 -> m1 -> m3
		 * */
		Member m1 = new Member(3, "��浿", 95);
		Member m2 = new Member(2, "�ڵ���", 99);
		Member m3 = new Member(1, "ȫ�μ�", 95);
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		
		System.out.println("=== ���� ��� ===");
		for(int i = 0 ; i < members.length; i ++) {
			System.out.println(members[i]);
		}
		
		index = Arrays.binarySearch(members, m1);
		System.out.println("�˻��� �ε��� : " + index);
		System.out.println();
	}

}
