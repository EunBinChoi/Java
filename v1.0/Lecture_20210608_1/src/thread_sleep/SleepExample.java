package thread_sleep;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sleep(): �־��� �ð����� �Ͻ� ����
		
		for(int i = 0; i < 10; i ++) {
			System.out.println("ȭ���� !" + (i + 1));
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
