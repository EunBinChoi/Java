package map_simple_test;


import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// why ?
		// ���� ���� �� ??????
		// 0 - apple
		// 1 - banana
		// 1 - bay
		// 2 - watermelon
		// 3 - pineapple
	
		// asia, africa
		// as - asia
		// af - africa
		
		// key �����ϴ� ���: value�� ��ǥ�ؾ� ��
		
		Map<String, String> map = new HashMap();
		map.put("a", "apple"); // ��ü �߰�
		
		// map���� Ű �ߺ� ���� �Ұ�
		map.put("b", "banana"); // ��ü �߰�
		map.put("b", "bay"); // ��ü �߰�
		String voca = map.get("b"); // ��ü �˻�
		System.out.println(voca);
		map.remove("a"); // ��ü ����
		
		map.put("w", "watermelon");
		map.put("p", "pineapple");
		
		// 1. �ݺ��ڸ� ����ϴ� ���
		// 1-1. keySet()
		// 1-2. key�� �˸� value�� get()
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println("key : " + key + 
					", value : " + value); 
			// Map �÷����� ������ ���� ���� ���� �ȵ�
		}
		
		// 2. entrySet() �޼ҵ�� Map.Entry�� Set �÷����� ��� ���
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> 
		entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key : " + key + 
					", value : " + value);
			// Map �÷����� ������ ���� ���� ���� �ȵ�
		}
	}

}
