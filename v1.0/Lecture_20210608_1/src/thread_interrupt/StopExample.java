package thread_interrupt;

public class StopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - �������� ������ ���� (stop �÷���)
		// �������� ���� ����: run() ������ �ڵ������� ����
		// stop() �޼ҵ�� �����带 ���ڱ� ����
		// >> �����尡 ��� ���� �ڿ��� �Ҿ����� ���·� ����
		
		// >> stop �÷��� ���
		
		PrintThread2 pt = new PrintThread2();
		pt.start();
		
		try {
			Thread.sleep(1000); // 1��
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		pt.interrupt(); // pt �����尡 ����
	}

}
