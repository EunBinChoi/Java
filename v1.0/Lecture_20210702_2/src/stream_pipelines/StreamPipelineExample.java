package stream_pipelines;

import java.util.*;
import java.util.stream.*;


public class StreamPipelineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
				new Member("ȫ���", Member.FEMALE, 20),
				new Member("ȫ�浿", Member.MALE, 45),
				new Member("�ڹڹ�", Member.FEMALE, 50),
				new Member("������", Member.MALE, 30)
				
				);
		
		// filter((���ٽ�)), mapToInt(m -> m.getAge()), 
		// average() �Լ��� �̿��ؼ�
		// ���� ȸ���� ���� ��հ��� ���ϴ� ���α׷� �ۼ�	
		double avg = list.stream()
				.filter(m -> m.getGender() == Member.MALE) // ������ ������ ����� ���� (�߰�ó��)
				.mapToInt(m -> m.getAge()) // ��ü -> ��ü�� ���̰����� ���� (�߰�ó��)
				.average().getAsDouble(); // ����ó��
		System.out.println("���� ȸ�� ��� ���� : " + avg + "(��)");
	}

}
