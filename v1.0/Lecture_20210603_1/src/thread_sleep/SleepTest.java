package thread_sleep;

public class SleepTest {

	public static void main(String[] args) 
	throws InterruptedException {
		// TODO Auto-generated method stub
		// MyThread 객체 두 개 생성
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		
		t1.start();

		Thread.sleep(1000);
		//try {
		
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}
		// 인터럽트 (interrupt)
		// : 스레드가 실행하고 있는 작업을 중지시킴
		t2.start();
	}

}
