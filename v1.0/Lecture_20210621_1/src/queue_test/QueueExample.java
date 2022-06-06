package queue_test;

import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Student> resQueue = new LinkedList<Student>();
		PriorityQueue<Student> sortedQueue 
		= new PriorityQueue<>();
		
		// 학생들을 줄 세움 
		// 학번 (입학연도 + 이름 순)
		// 입학연도가 먼저인 사람부터 학식을 받을 수 있는 프로그램을 작성
		// 입학연도가 같다면 그냥 번호순 (이름순)으로 받을 수 있는 프로그램을 작성
		resQueue.offer(new Student(20201));
		resQueue.offer(new Student(20216));
		resQueue.offer(new Student(20183));
		resQueue.offer(new Student(20072));
		
		while(!resQueue.isEmpty()) {
			Student s = resQueue.poll();
			sortedQueue.add(s);
			//System.out.println(s + "가 학식을 받았습니다 !");
		}
		
		// 학번: 입학연도 (4) + 학생번호 (1)
		// ex) 2007년 입학한 2번 학생
		// ex) 2018년 입학한 3번 학생
		while(!sortedQueue.isEmpty()) {
			Student s = sortedQueue.poll();
			String ssno = Integer.toString(s.getSno());
			String year = ssno.substring(0, 4);
			String num = ssno.substring(4, 5);
			
			System.out.printf("학번 (%s) (입학연도: %s, 학생번호: %s)가 학식을 받았습니다 !\n", ssno, year, num);
		}
		
	}

}
