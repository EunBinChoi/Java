package overview;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Thread 클래스를 상속받은 MyThread 클래스 객체 생성
		Thread t1 = new MyThread("A");
		Thread t2 = new MyThread("B");
		t1.start(); // 스레드 시작
		t2.start(); // 스레드 시작
		
		try {
			Thread.sleep(10000); // 메인 스레드가 10초 쉼
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("=========================");
		
		// 2. Runnable 인터페이스를 구현한 
		// MyRunnable 클래스 객체를 인자로 전달
		Thread t3 = new Thread(new MyRunnable("C"));
		Thread t4 = new Thread(new MyRunnable("D"));
		t3.start();
		t4.start();
		
		
	}
}
