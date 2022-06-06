package treemap_member;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import treeset_member.Member; // Comparable implements

public class TreeMapMemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Member> treemap = new TreeMap<>();
		// 키를 기준으로 오름차순 정렬 (String)
		
		treemap.put("20211234", new Member("a", 20));
		treemap.put("20211333", new Member("b", 20));
		treemap.put("20211444", new Member("c", 21));
		treemap.put("20211111", new Member("d", 21));
		System.out.println(treemap);
		
		// 키를 기준으로 내림차순으로 정렬
		NavigableMap<String, Member> des = treemap.descendingMap();
		System.out.println(des);
		
		// import java.util.Map
		Set<Map.Entry<String, Member>> entrySet = des.entrySet();
		Iterator<Map.Entry<String, Member>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// import java.util.Map.Entry
//		Set<Entry<String, Member>> entrySet = des.entrySet();
	}

}
