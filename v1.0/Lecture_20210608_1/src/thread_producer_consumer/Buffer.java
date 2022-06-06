package thread_producer_consumer;

public class Buffer {
	private String data;

	// �Һ��ڰ� ȣ��
	public synchronized String getData() {
		
		// �Һ��ڰ� �Һ��� data�� ����!
		if(this.data == null) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		//
		String res = data;
		System.out.println("�Һ��ڰ� �Һ��� ������ : " 
				+ res);
		
		data = null;
		notify();
		return res;
	}

	// �����ڰ� ȣ��
	public synchronized void setData(String data) {
		
		// �Һ��ڰ� data�� �Һ����� �ʾ�����
		if(this.data != null) {
			try{
				wait(); // ������ �Ͻ� ����
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		//
		
		this.data = data; // ������ ����
		System.out.println("�����ڰ� ������ ������ : "
				+ data);
		notify(); // �Һ��ڿ��� �˸� (���� ��� ����)
	
	}
	
}
