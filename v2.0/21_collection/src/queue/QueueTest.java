package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Student> queue = new LinkedList<>();
		PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

		// ť�� ���� �߰�
		queue.offer(new Student(20211111));
		queue.offer(new Student(20210000));
		queue.offer(new Student(20212222));
		queue.offer(new Student(20171234));
		queue.offer(new Student(20045555));

		// ť ���� ������ (ť���� ���� X)
		System.out.println(queue.size()); // 3
		Student peekStu = queue.peek();
		System.out.println(peekStu);
		System.out.println(queue.size()); // 3
		System.out.println();

		// ť ���� ������ (ť���� ���� O)
		while (!queue.isEmpty()) {
			System.out.println(queue.size()); // 3
			Student pollStu = queue.poll();
			System.out.println(pollStu);
			System.out.println(queue.size()); // 2
		}
		System.out.println();
		System.out.println("==========================");
		System.out.println();
		
		//////////////////////////////////////////////////
		
		// �켱���� ť�� ���� �߰� (�й��� �������� ���� ���)
		// => implements Comparable
		priorityQueue.offer(new Student(20211111));
		priorityQueue.offer(new Student(20210000));
		priorityQueue.offer(new Student(20212222));
		priorityQueue.offer(new Student(20171234));
		priorityQueue.offer(new Student(20045555));
		
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.size()); // 3
			Student pollStu = priorityQueue.poll();
			System.out.println(pollStu);
			System.out.println(priorityQueue.size()); // 2
		}
	}

}
