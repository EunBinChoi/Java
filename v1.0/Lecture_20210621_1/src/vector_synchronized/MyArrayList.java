package vector_synchronized;

import java.util.ArrayList;

// Generics (���ʸ�): General (�Ϲ�����, ��������) => ������
public class MyArrayList<E> extends ArrayList<E> {
	int data = 100;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public boolean add(E e) {
		for(int i = 1; i <= 10; i ++) {
			data --;
			System.out.println("[ArrayList] "
					+ Thread.currentThread().getName()
					+ " : " + data);
		}
		return true;
	}
	
}
