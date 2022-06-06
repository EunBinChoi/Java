package stream_pipelines;

import java.util.*;
import java.util.stream.Stream;


public class PipelinesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sList = Arrays.asList(
				new Student("ȫ�浿", 30),
				new Student("��Ŭ��", 50),
				new Student("���ڹ�", 80)
				);
		
		// �л����� ���� ����� ���
		// 1) �߰� ó��: 
		// (�л� ��ü -> ���� ����) 
		// mapToInt((s)->{s.getScore()})
		
		// �޼ҵ� ���� (Method Reference)
		// : ���ʿ��� �Ű����� �����ϱ� ����
		// mapToInt(Ŭ���� �̸� :: static �޼ҵ��̸�)
		// mapToInt(��ü���� �̸� :: �޼ҵ��̸�)
		
		// 2) ���� ó��: average()
		
		double avg = sList.stream() // ���� ��Ʈ��
				.mapToInt(s -> s.getScore()) // �߰�ó�� ��Ʈ��
				.average() // ����ó�� ��Ʈ��
				.getAsDouble();
		
		System.out.println("��� ���� : " + avg);
	}

}
