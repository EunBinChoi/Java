package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		// 원소 추가: put()
		map.put("b", "banana");
		map.put("a", "apple");
		map.put("a", "ant"); // 'apple' -> 'ant' (덮어쓰기 됨!)
		
		// 원소 접근
		String value = map.get("b");
		System.out.println(value);
		
		// 원소 삭제
		map.remove("b");
		
		// 크기 확인
		int size = map.size();
		System.out.println(size);
		
		map.put("w", "watermelon");
		map.put("p", "pineapple");
		System.out.println();
		// iterator (반복자)
		// 1. key
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String val = map.get(key);
			System.out.println("key.hashCode: " + key.hashCode());
			System.out.println("val.hashCode: " + val.hashCode());
			System.out.println("key: " + key + ", value: " + val);
			// Map 컬렉션은 원소의 순서가 유지 보장 X
		}
		System.out.println();
		// 2. key-value (entry)
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("key: " + key + ", value: " + val);
			// Map 컬렉션은 원소의 순서가 유지 보장 X
		}
	}

}
