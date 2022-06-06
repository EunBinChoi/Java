package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		// ���� �߰�: put()
		map.put("b", "banana");
		map.put("a", "apple");
		map.put("a", "ant"); // 'apple' -> 'ant' (����� ��!)
		
		// ���� ����
		String value = map.get("b");
		System.out.println(value);
		
		// ���� ����
		map.remove("b");
		
		// ũ�� Ȯ��
		int size = map.size();
		System.out.println(size);
		
		map.put("w", "watermelon");
		map.put("p", "pineapple");
		System.out.println();
		// iterator (�ݺ���)
		// 1. key
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String val = map.get(key);
			System.out.println("key.hashCode: " + key.hashCode());
			System.out.println("val.hashCode: " + val.hashCode());
			System.out.println("key: " + key + ", value: " + val);
			// Map �÷����� ������ ������ ���� ���� X
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
			// Map �÷����� ������ ������ ���� ���� X
		}
	}

}
