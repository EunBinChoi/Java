package thread_yield;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* - yield(): �ٸ� �����忡�� ���� �纸
		 * 
		 * public void run(){
		 * 	while(true){
		 * 		if(work){
		 * 			sysout("�۾� ����")
		 * 		}
		 * 		else {
		 * 			Thread.yield();
		 * 		}
		 * 	}
		 * }
		 * 
		 * ������?
		 * work == true: �۾��� ��
		 * work == false: ���ǹ��� �ݺ�
		 * �ٸ� �����忡�� ���� �纸
		 * ���� ���� ��� ����
		 * >> ��ü ���α׷� ���ɿ� ����
		 * 
		 * >> yield() �޼ҵ带 ȣ���� ������� ���� ��� ����
		 * >> ������ �켱������ ���� �켱������ ������
		 * �ٸ� �����尡 ������ �� �ֵ��� ��
		 * 
		 * 
		 * */
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ta.work = false; // ThreadB�� ����
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ta.work = true; // ThreadA, B ��� ����
		
		ta.stop = true;
		tb.stop = true;
		
	}

}
