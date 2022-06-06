package lambda_with_thread;

public class LambdaThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Thread ���� ���
		// 1. Thread Ŭ������ ��ӹ��� Ŭ���� (MyThread)�� ����
		// MyThread thread = new MyThread();
		
		// 2. Runnable �������̽��� 
		// ������ Ŭ���� (MyRunnable)�� ����
		// MyRunnable runnable = new MyRunnable();
		// Thread thread = new Thread(runnable);
		
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println("hello");
			}
		};
		thread1.run();
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		});
		thread2.run();
		
		// Runnable �������̽��� run()�� ���ǰ� �Ǿ��ִ�
		// �Լ��� �������̽� (Functional Interface) 
		// => ���ٽ����� �ۼ�
		
		// ���ٽ��� �̿��ؼ� �������� �۾� ������ �ۼ��ϰ� 
		// �����带 �����غ�����
		// 1 ~ 10���� ����ϴ� ������
		// 1. Thread ��ü ����� ���
		// 2. Thread ��ü ������ Runnable ��ü�� 
		//    �Ű������� �ִ� ���
		
		// ���ٽ� ��� ����
		Runnable runnable = () -> {
			
			// Runnable �������̽���
			// �Լ��� �������̽��̱� ����
			// (�߻� �޼ҵ尡 ���� �� ���� �� �� ����)
			for(int i = 1 ; i <= 10; i ++) {
				System.out.println(i);
			}
		};
		Thread th1 = new Thread(runnable);
		th1.start();
		
		// �͸� ��ü ��� ����
		Thread th3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1 ; i <= 10; i ++) {
					System.out.println(i);
				}
			}
		});
		th3.start();
		
		// Thread Ŭ������ ����ϴ� ����
		Thread th2 = new Thread(() -> {
			for(int i = 1 ; i <= 10; i ++) {
				System.out.println(i);
			}
		});
		th2.start();
		
		// �͸� ��ü ��� ����
		Thread th4 = new Thread() {
			@Override
			public void run() {
				for(int i = 1 ; i <= 10; i ++) {
					System.out.println(i);
				}
			}
		};
		th4.start();
		
	}

}
