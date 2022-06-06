package not_synchronized;

public class GameID {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		
		// ����� ���̵� �����ͺ��̽��� �����ؼ� �����Ϸ��� �ð��� �� �ɸ�...!
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.id);
	}
}
