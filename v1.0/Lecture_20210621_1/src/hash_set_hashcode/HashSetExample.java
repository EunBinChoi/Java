package hash_set_hashcode;

import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		// �Ұ����� ���� ?
		// Set �������̽� �߻�޼ҵ� -> ��ü ���� �Ұ���
		
		set.add(new Member("ȫ�浿", 40)); // 1
		set.add(new Member("ȫ�浿", 40)); // 2
		
		// 1�� ��ü == 2�� ��ü: �ٸ� (�ּҰ�)
		// 1�� ��ü.equals(2�� ��ü): ���� (���빰)
		// set�� ����� ��ü �� ? 1��
		System.out.println(set.size());
	}

}
