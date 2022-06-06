package synchronized_block;

public class GameID {
	String id;

	public String getId() {
		return id;
	}

//	public synchronized void setId(String id) {
//		System.out.println("������ ���̵� : " + Thread.currentThread().getName() + " : " + this.id);
//		this.id = id;
//		
//		try {
//			Thread.sleep(2000);
//		} catch(InterruptedException e) {
//			System.out.println(e);
//		}
//		System.out.println("������ ���̵� : " + Thread.currentThread().getName() + " : " + this.id);
//	}
	
	public void setId(String id) {
		
		synchronized (this) {
			System.out.println("������ ���̵� : " + Thread.currentThread().getName() + " : " + this.id);
			this.id = id;
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("������ ���̵� : " + Thread.currentThread().getName() + " : " + this.id);
		}
		
	}
}
