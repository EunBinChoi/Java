package overview;

public class MyThread extends Thread {
	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// MyThread�� �۾��� ������ �ۼ�
		
		for(int i = 0; i < 100; i++) {
			System.out.println(name + ":" + i);
		}
	}
}
