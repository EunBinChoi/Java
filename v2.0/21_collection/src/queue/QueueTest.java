package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Student> queue = new LinkedList<>();
		PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

		// 큐에 원소 추가
		queue.offer(new Student(20211111));
		queue.offer(new Student(20210000));
		queue.offer(new Student(20212222));
		queue.offer(new Student(20171234));
		queue.offer(new Student(20045555));

		// 큐 원소 가져옴 (큐에서 제거 X)
		System.out.println(queue.size()); // 3
		Student peekStu = queue.peek();
		System.out.println(peekStu);
		System.out.println(queue.size()); // 3
		System.out.println();

		// 큐 원소 가져옴 (큐에서 제거 O)
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
		
		// 우선순위 큐에 원소 추가 (학번이 높을수록 먼저 출력)
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
