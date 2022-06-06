package overview;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Thread Ŭ������ ��ӹ��� MyThread Ŭ���� ��ü ����
		Thread t1 = new MyThread("A");
		Thread t2 = new MyThread("B");
		t1.start(); // ������ ����
		t2.start(); // ������ ����
		
		try {
			Thread.sleep(10000); // ���� �����尡 10�� ��
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("=========================");
		
		// 2. Runnable �������̽��� ������ 
		// MyRunnable Ŭ���� ��ü�� ���ڷ� ����
		Thread t3 = new Thread(new MyRunnable("C"));
		Thread t4 = new Thread(new MyRunnable("D"));
		t3.start();
		t4.start();
		
		
	}
}
