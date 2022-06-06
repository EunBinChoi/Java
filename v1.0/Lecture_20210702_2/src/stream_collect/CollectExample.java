package stream_collect;

import java.util.*; // Collection
import java.util.stream.*; // Stream


public class CollectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> m = Arrays.asList(
				new Member("ȫ�浿", Member.Gender.MALE, 
						Member.City.Pusan , 30),
				new Member("ȫ���", Member.Gender.FEMALE, 
						Member.City.Seoul , 25),
				new Member("�ڹڹ�", Member.Gender.MALE, 
						Member.City.Seoul , 40),
				new Member("��Ŭ��", Member.Gender.MALE, 
						Member.City.Seoul , 45),
				new Member("���ڹ�", Member.Gender.FEMALE, 
						Member.City.Pusan , 35)
				);
		
		// ���� ȸ���� ��� List ���� (collect())
		List<Member> maleList = m.stream()
				.filter(s -> s.getGender() == Member.Gender.MALE)
				.collect(Collectors.toList());
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		// ���� ȸ���� ��� Set ���� (collect())
		Set<Member> femaleList = m.stream()
				.filter(s -> s.getGender() == Member.Gender.FEMALE)
				.collect(Collectors.toSet());
		
		femaleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		// ���￡ ��� �ִ� ���� ȸ���� ��� Set ���� (collect())
		Set<Member> femaleList2 = m.stream()
				.filter(s -> s.getGender() == Member.Gender.FEMALE)
				.filter(s -> s.getCity() == Member.City.Seoul)
				.collect(Collectors.toSet());
		
		femaleList2.stream()
		.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		// ���̰� 30�̻��� ���� ȸ���� ��� Set ���� (collect())
		Set<Member> femaleList3 = m.stream()
				.filter(s -> s.getGender() == Member.Gender.FEMALE)
				.filter(s -> s.getAge() >= 30)
				.collect(Collectors.toSet());
		femaleList3.stream()
		.forEach(s -> System.out.println(s.getName()));
		System.out.println();
	}

}
