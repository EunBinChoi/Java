package thread_overview;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Thread ��ӹ��� MyThread Ŭ����
//		MyThread t1 = new MyThread("A");
//		MyThread t2 = new MyThread("B");
//		t1.start(); // ������ ����
//		t2.start(); // ������ ����
		System.out.println();
		
		// 2. Runnable �������̽��� ������ 
		// MyRunnable Ŭ������ ���ڷ� ����
		Thread t3 = new Thread(new MyRunnable("A"));
		Thread t4 = new Thread(new MyRunnable("B"));
		t3.start();
		t4.start();
		
	}

}
