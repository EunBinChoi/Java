package synchronized_using_method;

// 공유 객체
public class GameID {
	int item;
	
	public int getItem() {
		return item;
	}
	
	public synchronized void setItem(int item) {
		this.item = item;
		
		try {
			Thread.sleep(2000); // 2초 정지
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(Thread.currentThread().getName()
				+ ": " + this.item);
	}
}
