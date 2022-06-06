package thread_state;

public class StatePrintThread extends Thread{
	private Thread targetThread; // ���¸� ������ ������
	
	public StatePrintThread(Thread target) {
		targetThread = target;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("������ ���� : " + state);
			
			// ��ü ���� ������ ���, ���� ��� ���·� ����
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			
			// ���� ������ ���, while�� ����
			if (state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500); // 0.5�� ����
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
