package thread_definition_3;

public class ThreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeepTask beepTask = new BeepTask(); 
		// Runnable �������̽��� ������ Ŭ����
		// Thread�� �ƴ� (�۾� ���븸 �ۼ��Ǿ��ִ� Ŭ����)
		Thread thread = new Thread(beepTask);
		thread.start();
		

		for(int i = 0; i < 5; i ++) {
			System.out.println("��!"); // �޽��� ���
			
			try {
				Thread.sleep(500); // 0.5��
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
