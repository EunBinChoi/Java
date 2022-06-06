package stream_overview_with_class;

import java.util.*; // �÷��� ���
import java.util.stream.Stream; // Stream Ŭ����


public class StreamStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 90),
				new Student("��Ŭ��", 90)
				);
				
		// 1. Stream<Student> 
		// �� Student ��ü�� �ݺ��ϴ� ��Ʈ���� ����
		// 2. Student ��ü�� �ʵ� (�̸��� ����)�� ���
		Stream<Student> stream = list.stream();
		stream.forEach((s) -> { 
				System.out.println(s.getName());
				System.out.println(s.getScore());
		});
		// s: list�� ����� �� ��ü (Student ����)
		
	}

}
