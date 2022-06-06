package tree_set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		int score;
		score = scores.last(); // 98
		System.out.println("���� ���� ���� : " + score);
		
		score = scores.first(); // 75
		System.out.println("���� ���� ���� : " + score);
		
		// 1. 95�� �Ʒ� ����
		score = scores.lower(95);
		System.out.println("95�� �Ʒ� ���� : " + score);
		
		// 2. 95�� ���� ����
		score = scores.higher(95);
		System.out.println("95�� ���� ���� : " + score);
	
		// <=
		// 3. 95���̰ų� �ٷ� �Ʒ� ����
		score = scores.floor(95);
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + score);
		
		// >=
		// 4. 95���̰ų� �ٷ� ���� ����
		score = scores.ceiling(95);
		System.out.println("95���̰ų� �ٷ� ���� ���� : " + score);
		System.out.println();
		System.out.println();
		
		// TreeSet�� ���ҵ��� �������� ���
//		int size = scores.size();
//		for(int i = 0; i < scores.size(); i ++) {
//			System.out.println("i ���� �� : " + i);
//			System.out.println("scores.size() ���� �� : " + scores.size());
//			score = scores.pollFirst();
//			System.out.println(score);
//			System.out.println("i ���� �� : " + i);
//			System.out.println("scores.size() ���� �� : " + scores.size());
//			System.out.println();
//		}
		// why ?
		int size = scores.size();
//		for(int i = 0; i < size; i ++) {
//			System.out.println("i ���� �� : " + i);
//			System.out.println("scores.size() ���� �� : " + scores.size());
//			score = scores.pollFirst();
//			System.out.println(score);
//			System.out.println("i ���� �� : " + i);
//			System.out.println("scores.size() ���� �� : " + scores.size());
//			System.out.println();
//		}
//		
//		score = scores.first();
//		System.out.println(score);
//		for(int i = 1; i < size; i ++) {
//			score = scores.higher(score);
//			System.out.println(score);
//		}
		
		// TreeSet ��������� true
		// TreeSet ������������� false
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score);
		}
		
	}

}
