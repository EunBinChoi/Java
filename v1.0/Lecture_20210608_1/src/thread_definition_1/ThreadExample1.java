package thread_definition_1;

import java.awt.Toolkit;
/*������� �Բ� �޽����� ����ϴ� ���α׷�*/
public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
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
