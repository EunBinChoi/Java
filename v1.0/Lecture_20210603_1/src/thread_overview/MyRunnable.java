package thread_overview;

public class MyRunnable implements Runnable {
	String name;
	
	public MyRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 10; i >= 0; i --) {
			System.out.print(name + i + " ");
		}
	}

}
