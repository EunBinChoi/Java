package thread_overview;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Thread 상속받은 MyThread 클래스
//		MyThread t1 = new MyThread("A");
//		MyThread t2 = new MyThread("B");
//		t1.start(); // 스레드 시작
//		t2.start(); // 스레드 시작
		System.out.println();
		
		// 2. Runnable 인터페이스를 구현한 
		// MyRunnable 클래스를 인자로 전달
		Thread t3 = new Thread(new MyRunnable("A"));
		Thread t4 = new Thread(new MyRunnable("B"));
		t3.start();
		t4.start();
		
	}

}
