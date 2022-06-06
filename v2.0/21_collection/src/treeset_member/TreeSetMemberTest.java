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
		
		// 오름차순 출력
		Iterator<Member> ascendingIterator = treeset.iterator();
		while(ascendingIterator.hasNext()) {
			System.out.println(ascendingIterator.next());
		}
		System.out.println();
		// 내림차순 출력
		Iterator<Member> descendingIterator = treeset.descendingIterator();
		while(descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		
		// NavigableSet 인터페이스 => 컬렉션에 담긴 원소들을 정렬
		// 내림차순 정렬
		NavigableSet<Member> decendingSet = treeset.descendingSet();
		System.out.println(decendingSet);
		
		// 오름차순
		NavigableSet<Member> ascendingSet = decendingSet.descendingSet();
		System.out.println(ascendingSet);
	}

}
