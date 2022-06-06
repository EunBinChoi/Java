package hash_map;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map �÷��� ����
		Map<String, String> map = new LinkedHashMap<>();
		
		// ��ü ����
		// 1. ������ �����ϴ� �ܾ� 5�� ����
		
		// Ű		��
		// "��",  "ȫ�浿"
		// "o",   "��Ŭ��"
		// "����", "���ڹ�"
		// "��",  "�ڹڹ�"
		// "����", "������"
		
		// 2. ��ü �� ���
		// 3. �ϳ��� �ܾ� ���� ��, �˻�
		// 4. �ϳ��� �ܾ� ���� ��, ����
		
		// 1. ��ü ����
		map.put("��", "ȫ�浿");
		map.put("��", "��Ŭ��");
		map.put("����", "���ڹ�");
		map.put("��", "�ڹڹ�");
		map.put("����", "������");
		
		// 2. ��ü �� ���
		System.out.println("��ü �� : " + map.size());
		
		
		// 3. ��ü �˻�
		System.out.println(map.get("��")); 
		// Ű (�ʼ�)�� ���� �� (�̸�) �˻�
		
		// 4. ��ü ����
		map.remove("��"); 
		// Ű�� Ű-�� �� (Map.Entry (�������̽�))�� ����
		System.out.println("��ü �� : " + map.size());
		
		// ��ü ��� (�ݺ���)
		// 1. .entrySet()
		
		Set<Map.Entry<String, String>> entrySet =
				map.entrySet(); // Map.Entry Set ����
		Iterator<Map.Entry<String, String>> entryIterator =
				entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// 2. .keySet()
		Set<String> keySet = map.keySet(); // Key Set ����
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("��ü �� : " + map.size());
	}

}
