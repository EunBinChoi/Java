package synchronized_using_block;

// ���� ��ü
public class GameID {
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {

		synchronized (this) { 
			// this: ��� ��� (���� ��ü�� GameID)
			
			this.item = item;

			try {
				Thread.sleep(2000); // 2�� ����
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

			System.out.println(Thread.currentThread().getName() + ": " + this.item);
		}
	}
}
