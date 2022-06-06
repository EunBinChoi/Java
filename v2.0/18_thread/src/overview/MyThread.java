package overview;

public class MyThread extends Thread {
	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// MyThread가 작업할 내용을 작성
		
		for(int i = 0; i < 100; i++) {
			System.out.println(name + ":" + i);
		}
	}
}
