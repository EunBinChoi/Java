package thread_sleep;

public class SleepTest {

	public static void main(String[] args) 
	throws InterruptedException {
		// TODO Auto-generated method stub
		// MyThread ��ü �� �� ����
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		
		t1.start();

		Thread.sleep(1000);
		//try {
		
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}
		// ���ͷ�Ʈ (interrupt)
		// : �����尡 �����ϰ� �ִ� �۾��� ������Ŵ
		t2.start();
	}

}
