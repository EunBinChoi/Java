package vector;

import java.util.Vector;
import java.util.List;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Fruit> list = new Vector<>();
		
		
		// synchronized �޼ҵ�
		list.add(new Fruit("���", 3000));
		list.add(new Fruit("������", 10000));
		list.add(new Fruit("�丶��", 3000));
		list.add(new Fruit("����", 15000));
		list.add(new Fruit("û����", 5000));
		
		
		// print() �޼ҵ� (for��)
		// print vs print()
		// �ʵ�        �Լ�
		print(list);
		System.out.println();
		// remove(int index)
		// remove(E e)
		list.remove(2);
		print(list);
		System.out.println();
		
		list.remove(0);
		print(list);
		System.out.println();
		
		list.add(0, new Fruit("���", 8000));
		print(list);
		System.out.println();
	}
	
	// List<Fruit> list = new Vector<Fruit>;
	public static void print(List<Fruit> list) {
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(i + " => " + list.get(i)); // Fruit ��ü ���
		}
	}
	
}
