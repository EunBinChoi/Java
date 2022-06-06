package thread_interrupt;

public class PrintThread2 extends Thread {
	
	/* interrupt()
	 * ���� ��� �Ǵ� ���� ���� >> ���� �߻����� ����
	 * �̷��� �Ͻ� ���� ���� >> ���� �߻� 
	 * (InterruptedException)
	 * 
	 * >> �����尡 �Ͻ� ���� ���°� ���� ������
	 * interrupt() �޼ҵ�� ȣ���� �� ����!
	 * 
	 * */
	
	public void run() {
		try {
			int i = 1;
			while(true) {
				System.out.println("���� �� ..");
				Thread.sleep(1);
				if (i == 10000) {
					break;
				}
				i ++;
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
