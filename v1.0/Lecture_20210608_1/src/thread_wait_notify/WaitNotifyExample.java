package thread_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - ������ �� ���� (wait(), notify())
		 * : �� ���� �����带 ����� ���ɾư��鼭 �����ϴ� ���
		 * : ThreadA, ThreadB
		 * : ThreadA�� �۾��� ������ ThreadB �Ͻ� �������� Ǯ���� (���� ���)
		 * : ThreadA �Ͻ� ���� ����
		 * * ���� ��ü�� ���� �Ӱ� ������ ����� ��
		 * 
		 * */
		
		SharedObject obj = new SharedObject();
		
		ThreadA ta = new ThreadA(obj);
		ThreadB tb = new ThreadB(obj);
		
		ta.start();
		tb.start();
		
		
	}

}
