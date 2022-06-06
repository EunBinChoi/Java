package overview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		// ���� �ܺ� �ݺ��ڸ� �̿��ؼ� Ȧ���� �̰� ���
		for(int i = 0; i < list.size(); i++) {
			int ele = Integer.parseInt(list.get(i));
			if(ele % 2 == 1) {
				System.out.println(ele);
			}
		}
		
		// ��Ʈ���� �̿��ؼ� Ȧ���� �̰� ��� (�Լ��� ���α׷���)
		list.stream()
		.mapToInt(ele -> Integer.valueOf(ele)) // String -> int
		.filter(ele -> ele % 2 == 1)
		.forEach(s -> System.out.println(s));
		
		list.stream()
		.map(ele -> Integer.parseInt(ele)) // String -> Integer
		.filter(ele -> ele % 2 == 1)
		.forEach(s -> System.out.println(s));
		
		///////////////////////////////////////////////////////
		
		// �ܺ� �ݺ���
		for(int i = 0; i < list.size(); i++) {
			String ele = list.get(i);
			System.out.println(ele);
		}
		
		// �ܺ� �ݺ��� (for-each) 
		for(String ele : list) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		
		// ���� �ݺ��� (��Ʈ��)
		// �÷����� ���ҵ��� ���� �帧���� �����ϴ� ��
		// �÷����� ���ҵ��� �ó����� ��������
		// ���� �帧�� ���� ���ҵ��� �˾Ƽ� ��µǴ� ����
//		Stream<String> stream 
//		= list.stream();
		
		list.stream().forEach(ele -> System.out.println(ele));
		
		// �÷��ǿ� ���ҵ��� ��ü�� ���
		List<Member> list2 = new ArrayList<>();
		list2.add(new Member("ȫ�浿", 30));
		list2.add(new Member("���ڹ�", 30));
		list2.add(new Member("��Ŭ��", 30));
		
//		Stream<Member> stream2 = list2.stream();
		list2.stream().forEach(mem -> System.out.println(mem));
		
		// ��ü���� �̸� �� ��� (ȫ, ��, ��)
		// ������ stream2�� ������� ���� 
		// (�̹� ��ü�� �� ����ϱ� ���ؼ� �ѹ� ������ȱ� ������)
//		stream2 = list2.stream(); // �ٽ� ��Ʈ�� ����
//		stream2
		list2.stream().forEach(mem -> System.out.println(mem.getName().charAt(0)));
	
		// stream�� ��ȸ�� Ư¡�� �ֱ� ������
		// stream�� �����ڸ��� �Һ��ع��� ���� ����
		list2
		.stream()
		.forEach(mem -> System.out.println(mem.getName().charAt(0)));
		
		// mem �Ű������� member ��ü�� �ƴ϶� 
		// String (member.name)�� ���� �� ������?
		List<String> names = new ArrayList<>();
		
		list2
		.stream()
		.forEach(mem -> names.add(mem.getName()));
		
		names
		.stream()
		.forEach(name -> System.out.println(name.charAt(0)));
		
		// list.stream().a().b().forEach(); // function chaining
		// a(), b(): �߰� ó�� �޼ҵ�
		// forEach(): ���� ó�� �޼ҵ�
	}

}
