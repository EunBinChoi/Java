package overview;

public class MyRunnable implements Runnable {
	String name;
	
	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
	
	
}
