package vector_synchronized;

import java.util.Vector;

// Generics (���ʸ�): General (�Ϲ�����, ��������) => ������
public class MyVector<E> extends Vector<E> {
	int data = 100;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public synchronized boolean add(E e) {
		for(int i = 1; i <= 10; i ++) {
			data --;
			System.out.println("[  Vector ] "
					+ Thread.currentThread().getName()
					+ " : " + data);
		}
		return true;
	}
	
}
