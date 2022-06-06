package stream_overview;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList(
				"����", "����", "���ξ���");
		
		// Iterator�� ���� �ݺ� (�ܺ� �ݺ���)
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
		System.out.println();
		
		
		// Stream�� �̿� �ݺ� (���� �ݺ���) => ����
		Stream<String> stream = list.stream();
		// ��Ʈ�� ��ü�� ����
		stream.forEach(name -> System.out.println(name));
		
		
	}

}
