package thread_join;

public class FactThread extends Thread{
	long fact = 1; 
	// 0���� �ʱ�ȭ�� ������ ����?
	// SumThread t = new SumThread();
	// new �����ڸ� �̿��ؼ� ��ü �����ϸ�
	// 0, null �ʱ�ȭ
	
	SumThread s = new SumThread();
	
	@Override
	public void run() {	
		s.start();
		
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 1���� 100���� sum�� �����ϴ� �ڵ�
		for(int i = 1; i <= 10; i ++) {
			fact *= i; // sum = sum + i
			//System.out.println(fact);
		}
		System.out.println(fact);
		
	}

}
