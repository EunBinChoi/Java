package thread_interrupt;

public class PrintThread1 extends Thread{
	boolean stop;
	// stop == true�� �Ǹ� ����
	
	// PrintThread1 pt1 = new PrintThread1();
	// pt1.stop�� false�� �ʱ�ȭ
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("PrintThread1 ����");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	
}
