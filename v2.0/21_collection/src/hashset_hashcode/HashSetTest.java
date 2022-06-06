package hashset_hashcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> hashset = new HashSet<>();
		Member m1 = new Member("aaa", 30);
		Member m2 = new Member("abc", 30);
		Member m3 = new Member("bbc", 30);
		
		// m1, m2�� hashCode()�� ���Ƶ� �ٸ� ��ü�� ���� ����! -> equals()�� double check!
		System.out.println(m1.hashCode()); // 'a' + 30 == 127
		System.out.println(m2.hashCode()); // 'a' + 30 == 127
		System.out.println(m1.equals(m2)); // false
		
		// m2, m3�� hashCode()�� �ٸ��� ������ �ٸ� ��ü�� �ٷ� �Ǹ�!
		System.out.println(m3.hashCode()); // 'b' + 30 == 128
		
		
		
		hashset.add(m1);
		hashset.add(m2);
		
		System.out.println(hashset.size());
		
		Iterator<Member> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
