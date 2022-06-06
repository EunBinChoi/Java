package treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<>(); 
		// ���� Ʈ�� ���� ���� (�������� ����) -> �˻� ���� ��� (**)
		// (���� Ʈ��? �ڽ� ��尡 �ִ� 2���� ���� Ʈ��)
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		int score;
		score = scores.last(); // ���� ���� ���� ���
		System.out.println(score);
		
		score = scores.first(); // ���� ���� ���� ���
		System.out.println(score);
		
		score = scores.lower(90); // 90�� �ٷ� �Ʒ� ���� ���
		System.out.println(score);
		
		score = scores.higher(70); // 70�� �ٷ� �� ���� ���
		System.out.println(score);
		
		score = scores.floor(98); 
		// 98���� ������ ������ ������ ������ ���� ���
		// ���� ������ 98�� �ٷ� �Ʒ� ���� ���
		System.out.println(score);
		
		score = scores.ceiling(76);
		// 76���� ������ ������ ������ ������ ���� ���
		// ���� ������ 76�� �ٷ� �� ���� ���
		
		// TreeSet�� ���ҵ��� �������� ���
		// size()
		System.out.println(scores);
		for(int i = 0; i < scores.size(); i++) {
			if(i == 0) score = scores.first();
			else score = scores.higher(score);
			System.out.print(score + " ");
		}
		System.out.println();
		score = scores.pollFirst(); // ���� ���� ���Ҹ� �÷��ǿ��� ����
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		score = scores.pollFirst();
		System.out.println(score);
		System.out.println(scores);
		
		scores.pollLast(); // ���� ū ���Ҹ� �÷��ǿ��� ����
	}

}
