package thread_wait_notify;

public class SharedObject { // �۾��� ������ ���� ��ü�� ����
	
	public synchronized void methodA() {
		System.out.println("ThreadA�� �۾� ����");
		
		notify(); // �Ͻ����� ������ ThreadB�� ������ ���·� ����
		try{
			wait(); // ThreadA�� �Ͻ����� ���·� ����
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� �۾� ����");
		
		notify(); // �Ͻ����� ������ ThreadA�� ������ ���·� ����
		try{
			wait(); // ThreadB�� �Ͻ����� ���·� ����
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
