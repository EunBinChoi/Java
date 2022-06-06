package tree_map_sorting;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "��Ŭ��");
		scores.put(75, "���ڹ�");
		scores.put(95, "�ž��");
		scores.put(80, "�����");
		System.out.println("[�⺻ ���] : " + scores);
		System.out.println();
		
		
		// Navigate: �����ϴ�
		// Navigable: ������ �� �ִ� 
		
		// 1. NavigableMap ��������
		System.out.println("[NavigableMap ��������]");
		NavigableMap<Integer, String> decendingMap 
		= scores.descendingMap();
		//System.out.println(decendingMap);
		
		Set<Map.Entry<Integer,  String>> descendingEntrySet 
		= decendingMap.entrySet();
		
		// Set : 98:"��Ŭ��", 95:"�ž��", 87:"ȫ�浿" ...
		
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + "-" 
		+ entry.getValue());
		}
		System.out.println();
		System.out.println();
//		
		
		// 2. NavigableMap ��������
		System.out.println("[NavigableMap ��������]");
		NavigableMap<Integer, String> ascendingMap 
		= decendingMap.descendingMap();
		Set<Map.Entry<Integer,  String>> ascendingEntrySet 
		= ascendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.println(entry.getKey() + "-" 
		+ entry.getValue());
		}
		System.out.println();
		System.out.println();
		
		// 3. NavigableSet ��������
		System.out.println("[NavigableSet ��������]");
		NavigableSet<Integer> decendingKey 
		= scores.descendingKeySet();
		for(int keySet : decendingKey) {
			System.out.println(keySet + "-" + scores.get(keySet));
		}
		System.out.println();
		System.out.println();
		
		// 4. NavigableSet ��������
		System.out.println("[NavigableSet ��������]");
		NavigableSet<Integer> ascendingKey 
		= decendingKey.descendingSet();
		for(int keySet : ascendingKey) {
			System.out.println(keySet + "-" + scores.get(keySet));
		}
//		
	}

}
