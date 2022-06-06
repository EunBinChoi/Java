package queue_test;

import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Student> resQueue = new LinkedList<Student>();
		PriorityQueue<Student> sortedQueue 
		= new PriorityQueue<>();
		
		// �л����� �� ���� 
		// �й� (���п��� + �̸� ��)
		// ���п����� ������ ������� �н��� ���� �� �ִ� ���α׷��� �ۼ�
		// ���п����� ���ٸ� �׳� ��ȣ�� (�̸���)���� ���� �� �ִ� ���α׷��� �ۼ�
		resQueue.offer(new Student(20201));
		resQueue.offer(new Student(20216));
		resQueue.offer(new Student(20183));
		resQueue.offer(new Student(20072));
		
		while(!resQueue.isEmpty()) {
			Student s = resQueue.poll();
			sortedQueue.add(s);
			//System.out.println(s + "�� �н��� �޾ҽ��ϴ� !");
		}
		
		// �й�: ���п��� (4) + �л���ȣ (1)
		// ex) 2007�� ������ 2�� �л�
		// ex) 2018�� ������ 3�� �л�
		while(!sortedQueue.isEmpty()) {
			Student s = sortedQueue.poll();
			String ssno = Integer.toString(s.getSno());
			String year = ssno.substring(0, 4);
			String num = ssno.substring(4, 5);
			
			System.out.printf("�й� (%s) (���п���: %s, �л���ȣ: %s)�� �н��� �޾ҽ��ϴ� !\n", ssno, year, num);
		}
		
	}

}
