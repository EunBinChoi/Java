package thread_overview;

public class MyThread extends Thread {
	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.print(name + i + " ");
		}
	}
}
