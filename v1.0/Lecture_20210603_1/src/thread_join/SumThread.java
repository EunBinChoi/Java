package thread_join;

public class SumThread extends Thread{
	long sum = 0; 
	// 0���� �ʱ�ȭ�� ������ ����?
	// SumThread t = new SumThread();
	// new �����ڸ� �̿��ؼ� ��ü �����ϸ�
	// 0, null �ʱ�ȭ
	
	
	@Override
	public void run() {
		// 1���� 100���� sum�� �����ϴ� �ڵ�
		for(int i = 1; i <= 10; i ++) {
			sum += i; // sum = sum + i
		}
		System.out.println(sum);
	}
}
