package thread_stop;

public class StopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - �������� ������ ���� (stop �÷���)
		// �������� ���� ����: run() ������ �ڵ������� ����
		// stop() �޼ҵ�� �����带 ���ڱ� ����
		// >> �����尡 ��� ���� �ڿ��� �Ҿ����� ���·� ����
		
		// >> stop �÷��� ���
		
		PrintThread1 pt = new PrintThread1();
		pt.start();
		
		try {
			Thread.sleep(1000); // 1��
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		pt.setStop(true); // pt �����尡 ����
	}

}
