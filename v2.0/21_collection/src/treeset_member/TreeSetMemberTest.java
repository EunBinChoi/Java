package treeset_member;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Member> treeset = new TreeSet<>();
		treeset.add(new Member("a", 30));
		treeset.add(new Member("b", 30));
		treeset.add(new Member("c", 30));
		System.out.println(treeset); 
		// class cast exception ? => Comparable implements!
		
		// �������� ���
		Iterator<Member> ascendingIterator = treeset.iterator();
		while(ascendingIterator.hasNext()) {
			System.out.println(ascendingIterator.next());
		}
		System.out.println();
		// �������� ���
		Iterator<Member> descendingIterator = treeset.descendingIterator();
		while(descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		
		// NavigableSet �������̽� => �÷��ǿ� ��� ���ҵ��� ����
		// �������� ����
		NavigableSet<Member> decendingSet = treeset.descendingSet();
		System.out.println(decendingSet);
		
		// ��������
		NavigableSet<Member> ascendingSet = decendingSet.descendingSet();
		System.out.println(ascendingSet);
	}

}
