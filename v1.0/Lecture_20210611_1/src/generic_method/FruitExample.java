package generic_method;

import java.util.Comparator;

public class FruitExample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit<String, Integer> fruit1 = 
				new Fruit<>("����", 15000);
		
		Fruit<String, Integer> fruit2 = 
				new Fruit<>("����", 15000);
		boolean res = 
				FruitExample.
				compare(fruit1, fruit2);
		
		System.out.println((res) ? "����" : "�ٸ�");		
//		if(res) {
//			System.out.println("����");
//		}
//		else {
//			System.out.println("�ٸ�");
//		}
		// 1) ��ü 2�� ����
		// <String, Integer>
		// String: ���� �̸�
		// Integer: ���� ����
		
		// 2) �� ��ü�� ������ ���빰�� ������ 
		// Ȯ���ϴ� compare �Լ� 
		// (FruitExample Ŭ������ ���� �޼ҵ�)�� �ۼ�
		// public static <T, P> 
		// boolean compare(Fruit<T, P>p1, Fruit<T, P>p2)
	} // main �Լ� ��

	
	
	public static <T, P> boolean 
	compare(Fruit<T, P>p1, Fruit<T, P>p2) {
		return p1.getName().equals(p2.getName())
		&& p1.getPrice().equals(p2.getPrice());
		// ???????
	}

}
