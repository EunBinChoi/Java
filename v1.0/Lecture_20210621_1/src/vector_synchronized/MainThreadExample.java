package vector_synchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector<String> list1 = new MyVector<>();
		// Vector: ��� �Լ����� synchronized
		MyArrayList<String> list2 = new MyArrayList<>();
		// ArrayList: �Ϲ� �Լ�
		
		// 4����
		// 1. Thread�� �͸�ü�� ����� ���
		// 2. Runnable�� �͸�ü�� ���� �Ű������� �����ϴ� ���
		// 3. ���ٽ� (Runnable)
		// 4. ���ٽ� (Thread)
		
		// 1.
		Thread th1 = new Thread() {
			public void run() {
				list1.add("th1");
				System.out.println();
			}
		};
		// 2.
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				list1.add("th2");
				System.out.println();
			}
		});
		// 4.
		Thread th3 = new Thread(() -> {
			// public void run() �� �ᵵ ������ ���� ?
			// Runnable �������̽��� �Լ��� �������̽�
			list2.add("th3");
			System.out.println();
		});
		// 3. 
		Runnable runnable = () -> {
			// public void run() �� �ᵵ ������ ���� ?
			// Runnable �������̽��� �Լ��� �������̽�
			list2.add("th4");
			System.out.println();
		};
		Thread th4 = new Thread(runnable);
	
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
	

}
